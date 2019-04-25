package com.wangxc.nio.part1;

import org.junit.Test;

import java.nio.ByteBuffer;

/**
 * @author Wang
 */
public class NioTest {

    @Test
    public void test() {
        ByteBuffer buffer = ByteBuffer.allocateDirect(1);
        System.out.println("buffer.isReadOnly() = " + buffer.isReadOnly());
        System.out.println("buffer.isDirect() = " + buffer.isDirect());
        System.out.println("buffer.getClass().getName() = " + buffer.getClass().getName());
    }

}
