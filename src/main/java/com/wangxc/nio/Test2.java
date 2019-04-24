package com.wangxc.nio;

import java.nio.Buffer;
import java.nio.ByteBuffer;

/**
 * @author Wang
 */
public class Test2 {

    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.wrap(new byte[]{1, 2, 3, 4, 5});
        System.out.println("buffer.capacity() = " + buffer.capacity());
        System.out.println("buffer.limit() = " + buffer.limit());
        Buffer limit = buffer.limit(2);
    }
}
