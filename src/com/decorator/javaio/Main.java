package com.decorator.javaio;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Working Directory = " + System.getProperty("user.dir"));

        InputStream input = new FileInputStream("src/com/decorator/javaio/input.txt");
        input = new BufferedInputStream(input);
        input = new LowerCaseInputStream(input);
        input = new LineNumberInputStream(input);

        int data = input.read();
        while(data != -1) {
            //System.out.println("Line number ["+((LineNumberInputStream)input).getLineNumber()+"]: " + (char)data);
            System.out.print((char)data);
            data = input.read();
        }

        input.close();
    }
}
