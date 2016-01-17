package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // SimpleDateFormat dateFormat = new SimpleDateFormat("Gyyyy年中第D天");
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY年MM月DD日");
        String str = dateFormat.format(new Date());
        System.out.println(str);

        String str2 = "2014##03##2";
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("YYYY##MM##DD");
        try {
            System.out.println((dateFormat2.parse(str2)).toString());
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } // 2015年09月258日

    }

}
