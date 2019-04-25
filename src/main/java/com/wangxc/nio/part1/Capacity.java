package com.wangxc.nio.part1;

import java.nio.ByteBuffer;

/**
 * @author Wang
 */
public class Capacity {
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[]{1, 2, 3});

        System.out.println("byteBuffer.getClass().getName() = " + byteBuffer.getClass().getName());
        System.out.println("byteBuffer.capacity() = " + byteBuffer.capacity());
        System.out.println("byteBuffer.limit() = " + byteBuffer.limit());
    }
}
