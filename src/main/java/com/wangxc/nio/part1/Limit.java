package com.wangxc.nio.part1;

import java.nio.IntBuffer;

/**
 * @author Wang
 */
public class Limit {

    public static void main(String[] args) {
        IntBuffer buffer = IntBuffer.wrap(new int[]{1, 2, 3, 4, 5});
        System.out.println("buffer.capacity() = " + buffer.capacity());
        System.out.println("buffer.limit() = " + buffer.limit());
        buffer.limit(2);
        buffer.put(0, 1);
        buffer.put(1, 2);
        //此处是limit的位置 会抛出异常
        buffer.put(2, 3);
        buffer.put(3, 4);
        buffer.put(4, 5);
    }
}
