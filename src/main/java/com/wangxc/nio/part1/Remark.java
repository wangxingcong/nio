package com.wangxc.nio.part1;

import java.nio.IntBuffer;

/**
 * @author Wang
 */
public class Remark {
    public static void main(String[] args) {
        IntBuffer buffer = IntBuffer.wrap(new int[]{1, 2, 3, 4});
        System.out.println("buffer.capacity() = " + buffer.capacity());
        buffer.put(1);
        buffer.put(2);
        System.out.println("buffer.position() = " + buffer.position());
        buffer.mark();
        buffer.put(3);
        System.out.println("buffer.position() = " + buffer.position());
        buffer.reset();
        System.out.println("buffer.position() = " + buffer.position());
    }
}
