package com.design_pattern.proxy.compiler;

import com.design_pattern.proxy.Movable;
import com.design_pattern.proxy.Tank;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLClassLoader;

public class Test1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        String src = "package com.design_pattern.proxy.compiler;\n" +
                "\n" +
                "import com.design_pattern.proxy.Movable;\n" +
                "\n" +
                "public class TankTimeProxy implements Movable {\n" +
                "    Movable t;\n" +
                "\n" +
                "    public TankTimeProxy(Movable t) {\n" +
                "        this.t = t;\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void move() {\n" +
                "        long start = System.currentTimeMillis();\n" +
                "        t.move();\n" +
                "        long end = System.currentTimeMillis();\n" +
                "        System.out.println(\"time: \" + (end - start));\n" +
                "    }\n" +
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
        Constructor constructor = c.getConstructor(Movable.class);
        Movable m = (Movable) constructor.newInstance(new Tank());
        m.move();
    }
}
