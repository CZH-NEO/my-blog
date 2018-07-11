package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.regex.Pattern;

public class TypeConverter {
    public static LocalDate getLocalDateFromTimeString(String source) {
        LocalDate localDate= LocalDate.parse(source, DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm"));
        return localDate;
    }
    public static LocalDate getLocalDateFromString(String source) {
        LocalDate localDate= LocalDate.parse(source, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        return localDate;
    }
    public static String getStringFromLocalDate(LocalDate ld) {
        String string= ld.toString();
        return string;
    }
    public static Date getDateFromLocalDate(LocalDate ld) {
        ZoneId zoneId=ZoneId.systemDefault();
        ZonedDateTime zdt=ld.atStartOfDay(zoneId);
        return Date.from(zdt.toInstant());
    }
    public static LocalDate getLocalDateFromDate(Date date) {
        Instant instant=date.toInstant();
        ZoneId zoneId=ZoneId.systemDefault();
        LocalDate localDate=instant.atZone(zoneId).toLocalDate();
        return localDate;
    }
    public static Date getDateFromString( String source) {
        try {
            return getDateFomat(source).parse(source);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    public static String getStringFromDate(Date date) {

//		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String string = df.format(date);
        return string;
    }
    public static String getTimeStringFromDate(Date date) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        String string = df.format(date);
        return string;
    }
    public static Date getDateFromTimeString( String source) {
        try {
            return getDateFomat(source).parse(source);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    public static SimpleDateFormat getDateFomat(String source) {
        SimpleDateFormat sdf=new SimpleDateFormat();
        if(Pattern.matches("^\\d{4}-\\d{2}-\\d{2}$", source))
            sdf=new SimpleDateFormat("yyyy-MM-dd");
        else if(Pattern.matches("^\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}$", source))
            sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm");
        else if(Pattern.matches("^\\d{4}/\\d{2}/\\d{2}$", source))
            sdf=new SimpleDateFormat("yyyy/MM/dd");
        else if(Pattern.matches("^\\d{4}_\\d{2}_\\d{2}$", source))
            sdf=new SimpleDateFormat("yyyy_MM_dd");
        else if(Pattern.matches("^\\d{4}\\d{2}\\d{2}$", source))
            sdf=new SimpleDateFormat("yyyyMMdd");
        return sdf;
    }
}
