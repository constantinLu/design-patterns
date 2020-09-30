package _03Decorator.challange;

import _03Decorator.challange.decorator.LowerCaseInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {

    public static void main(String[] args) throws IOException {

        int c;
        InputStream in = null;
        try {
            in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream( "/resources/test.txt")));

            while ((c = in.read()) >= 0) {
                System.out.print((char)c);

            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
