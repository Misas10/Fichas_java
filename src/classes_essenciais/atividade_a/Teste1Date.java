package classes_essenciais.atividade_a;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Teste1Date {
    public static void main(String[] args) {
        Date d = new Date();

        System.out.println(d.getHours() + ":" + d.getMinutes());

        GregorianCalendar Gc = new GregorianCalendar();

        // Gragorian Calendar
        System.out.println(Gc.getTime());

        // Calendar
        System.out.println(Gc.get(Calendar.HOUR_OF_DAY) + ":" + Gc.get(Calendar.MINUTE));

    }
}
