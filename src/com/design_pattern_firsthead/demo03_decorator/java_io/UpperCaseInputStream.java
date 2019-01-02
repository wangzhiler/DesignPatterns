package com.design_pattern_firsthead.demo03_decorator.java_io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 实现将小写的全部改写成大写
 */
public class UpperCaseInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected UpperCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c = super.read();
        return c == -1 ? c : Character.toUpperCase((char) (c));
    }

    public int read(byte[] b, int offset, int len) throws IOException {
        int result = super.read(b, offset, len);
        for(int i=0; i<result; i++) {
            b[i] = (byte) Character.toUpperCase((char) (b[i]));
        }
        return result;
    }
}
