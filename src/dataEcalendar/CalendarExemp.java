/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataEcalendar;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author caiqu
 */
public class CalendarExemp {

    public static void main(String[] args) {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf1.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        int minutes = cal.get(Calendar.MINUTE);
        int month = cal.get(Calendar.MONTH);

        System.out.println(minutes);
        System.out.println(month + 1);

//        cal.add(Calendar.HOUR_OF_DAY, 4); acrescentar 4h
//        d = cal.getTime();
        System.out.println(sdf1.format(d));
    }
}
