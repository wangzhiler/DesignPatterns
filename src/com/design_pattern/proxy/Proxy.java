package com.design_pattern.proxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class Proxy {

    //用于产生新的代理类
    public static Object newProxyInstance(Class intface, InvocationHandler h) throws Exception{
        String methodString = "";
        String rt = "\r\n";

        Method[] methods = com.design_pattern.proxy.Movable.class.getMethods();

        /*
        for (Method m : methods) {
            methodString += "    @Override\n" +
                    "    public void " + m.getName() + "() {\n" +
                    "        long start = System.currentTimeMillis();\n" +
                    "        t." + m.getName() + "();\n" +
                    "        long end = System.currentTimeMillis();\n" +
                    "        System.out.println(\"time: \" + (end - start));\n" +
                    "    }\n";
        }
*/

        for (Method m : methods) {
            methodString += "    @Override\n" +
                    "    public void " + m.getName() + "() {\n" +
                    "        Method md=null;" +
                    "        try{\n" +
                    "            md=" + intface.getName() + ".class.getMethod(\"" + m.getName() + "\");\n" +
                    "        } catch (Exception e) {\n" +
                    "            e.printStackTrace();\n" +
                    "        }\n" +
                    "        h.invoke(this, md);\n" +
                    "    }\n";
        }


        String src = "package com.design_pattern.proxy.compiler;\n" +
                "\n" +
                "import com.design_pattern.proxy.InvocationHandler;\n" +
                "import com.design_pattern.proxy.Movable;\n" +
                "import java.lang.reflect.Method;\n" +
                "\n" +
                "public class TankTimeProxy implements " + intface.getName() + " {\n" +
//                "    Movable t;\n" +
                "    com.design_pattern.proxy.InvocationHandler h;\n" +
                "\n" +
                "    public TankTimeProxy(InvocationHandler h) {\n" +
                "        this.h = h;\n" +
                "    }\n" +
                "\n" +
                methodString +
                "}";

        String fileName = System.getProperty("user.dir") + "/src/com/design_pattern/proxy/compiler/TankTimeProxy.java";
        File f = new File(fileName);
        FileWriter fw = new FileWriter(f);
        fw.write(src);
        fw.flush();
        fw.close();

        //compile
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        System.out.println(compiler.getClass().getName());  //com.sun.tools.javac.api.JavacTool
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
        Iterable units = fileManager.getJavaFileObjects(fileName);
        JavaCompiler.CompilationTask t = compiler.getTask(null, fileManager, null, null, null, units);
        t.call();
        fileManager.close();

        //load into memory and create an instance
        //必须保证class文件在classpath里
        URL[] urls = new URL[]{new URL("file:/" + System.getProperty("user.dir") + "/src")};
        URLClassLoader ul = new URLClassLoader(urls);
        Class c = ul.loadClass("com.design_pattern.proxy.compiler.TankTimeProxy");
        System.out.println(c); //class com.design_pattern.proxy.compiler.TankTimeProxy

        //new instance 会调用参数为空的构造对象
        Constructor constructor = c.getConstructor(InvocationHandler.class);
        Object m =  constructor.newInstance(new Tank());
//        m.move();


        return m;
    }
}
