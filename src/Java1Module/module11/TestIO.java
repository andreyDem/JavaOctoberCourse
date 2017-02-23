package Java1Module.module11;

import java.io.UnsupportedEncodingException;

public class TestIO {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println("A".getBytes("UTF-8").length);
        System.out.println("AA".getBytes("UTF-8").length);
    }
}
