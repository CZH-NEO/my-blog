package test;

import java.net.URL;

public class ClassPathTest {

    public static void main(String[] args) {
//        this.getClass().getResource("");
       URL url= ClassLoader.getSystemResource("");
        System.out.println(url);
    }

}
