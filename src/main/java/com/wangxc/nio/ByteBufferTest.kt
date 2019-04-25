package com.wangxc.nio

import org.junit.Test
import java.nio.ByteBuffer
import java.nio.ByteBuffer.allocateDirect
import java.nio.IntBuffer
import java.util.*

/**
 * @author Wang
 */
class ByteBufferTest {
    @Test
    fun test() {
        val allocate = ByteBuffer.allocate(100)
        val direct = allocateDirect(200)
        println("allocate.isDirect = ${allocate.isDirect}")
        println("direct.isDirect = ${direct.isDirect}")
        println("allocate.hasArray() = ${allocate.hasArray()}")
        println("direct.hasArray() = ${direct.hasArray()}")
        println("direct.javaClass.name = ${direct.javaClass.name}")
        println("allocate.javaClass.name = ${allocate.javaClass.name}")

        val intBuffer = IntBuffer.allocate(10)
        println("intBuffer.capacity() = ${intBuffer.capacity()}")
    }

    @Test
    fun test2() {
        val direct = allocateDirect(Int.MAX_VALUE)
        val bytes = byteArrayOf(1)
        for (i in 0 until Int.MAX_VALUE) {
            direct.put(bytes)
        }
        println("put end")
    }

    @Test
    fun test3() {
        val start = System.currentTimeMillis()
        val allocate = allocateDirect(190000000)
        val bytes = byteArrayOf(1)
        for (i in 0 until 190000000) {
            allocate.put(bytes)
        }
        println("start - System.currentTimeMillis() = ${System.currentTimeMillis() - start}")
    }

    @Test
    fun test5() {
        val wrap = ByteBuffer.wrap(ByteArray(10))
        println("wrap = ${wrap}")
        val buffer = ByteBuffer.wrap(ByteArray(10), 2, 6)
        println("buffer = ${buffer}")
    }

    @Test
    fun test6() {
        val buffer = ByteBuffer.allocate(10)
        println(buffer)
        buffer.put(1)
        println(buffer)
        buffer.put(2)
        println(buffer)
        buffer.put(3)
        println(buffer)
        buffer.rewind()
        println("buffer.get() = ${buffer.get()}")
        println(buffer)
        println("buffer.get() = ${buffer.get()}")
        println(buffer)
        println("buffer.get() = ${buffer.get()}")
        println(buffer)
        println("Arrays.toString(buffer.array()) = ${Arrays.toString(buffer.array())}")
    }

    @Test
    fun test7() {
        val wrap = ByteBuffer.wrap(byteArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
        val byteArray = ByteArray(10)
        val get = wrap.get(byteArray, 2, 3)
        println(Arrays.toString(byteArray))
    }

    @Test
    fun put() {
        val allocate = ByteBuffer.allocate(10)
        val arrayOf = byteArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
        allocate.put(arrayOf, 2, 6)
        val string = Arrays.toString(allocate.array())
        print(string)
    }

    @Test
    fun test8() {
        val bytes = byteArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
        val allocate = ByteBuffer.allocate(10)
        var getArrayIndex = 0
        while (getArrayIndex < bytes.size) {
            val readLength = Math.min(allocate.remaining(), bytes.size - getArrayIndex)
            allocate.put(bytes, getArrayIndex, readLength)
            getArrayIndex += readLength
            allocate.flip()
            for (i in 0 until readLength) {
                println("allocate.get() = ${allocate.get()}")
            }
            println("=====")
            allocate.clear()
        }
    }

    @Test
    fun test9() {
        val allocate = ByteBuffer.allocate(10)
        val put = allocate.put(2, 1)
        println(put)
        val get = allocate.get(2)
        print(get)
        println(put)
    }

    @Test
    fun test10() {
        val wrap = ByteBuffer.wrap(byteArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8))
        val buffer = ByteBuffer.wrap(byteArrayOf(11, 22, 33, 44))
        wrap.position(2)
        val put = wrap.put(buffer)
        println(wrap)
        println(buffer)
    }

    @Test
    fun test11() {
        val allocate = ByteBuffer.allocate(100)
        val putChar = allocate.putChar('a')
        println("allocate.position() = ${allocate.position()}")
        allocate.putDouble(0.1)
        println("allocate.position() = ${allocate.position()}")
        allocate.putFloat(0.2F)
        println("allocate.position() = ${allocate.position()}")
        allocate.putInt(1)
        println("allocate.position() = ${allocate.position()}")
        allocate.putLong(2L)
        println("allocate.position() = ${allocate.position()}")
        allocate.putShort(2)
        println("allocate.position() = ${allocate.position()}")
        allocate.putLong(30, 2L)
        println("allocate = ${allocate}")
    }

    @Test
    fun slice() {
        val wrap = ByteBuffer.wrap(byteArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 9))
        wrap.position(5)
        val slice = wrap.slice()
        wrap.put(3, 99)
        println(wrap)
        println(wrap.array())
        println(slice.array())
        println(Arrays.toString(wrap.array()))
        println(slice)
        println(Arrays.toString(slice.array()))
    }
}
