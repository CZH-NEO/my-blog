package test;

import java.sql.Timestamp;
import java.util.Date;

public class TimeStampTest {
    public static void main(String[] args) {
        Timestamp ts=new Timestamp(132);
        System.out.println(ts);
        System.out.println(ts.getTime());
        Date date =new Date();
        date.setTime(ts.getTime());
        System.out.println(date);
        ts.setTime(date.getTime());
        System.out.println(ts);

    }
}
