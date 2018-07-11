package test;

import java.util.Date;

public class NumberFormatException {
    public static void main(String[] args) {
        System.out.println(new Date(new Long("1528089247872")));
        System.out.println(new Date());
    }
}
