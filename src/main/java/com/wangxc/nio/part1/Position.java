package com.wangxc.nio.part1;

import java.nio.IntBuffer;

/**
 * @author Wang
 */
public class Position {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        IntBuffer buffer = IntBuffer.wrap(ints);
        System.out.println("buffer.capacity() = " + buffer.capacity());
        System.out.println("buffer.limit() = " + buffer.limit());
        System.out.println("buffer.position() = " + buffer.position());
        buffer.position(3);
        buffer.limit(7);
        buffer.put(99);
        for (int anInt : ints) {
            System.out.println("anInt = " + anInt);
        }
    }
}
