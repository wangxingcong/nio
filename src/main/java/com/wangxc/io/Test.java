package com.wangxc.io;

import java.io.*;

/**
 * @author Wang
 */
public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src\\main\\java\\com\\wangxc\\io\\io.md");
        FileInputStream fileInputStream = new FileInputStream(file);
        new FileReader(file);
        System.out.println("file.exists() = " + file.exists());
    }
}
