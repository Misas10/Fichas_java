package classes_essenciais.atividade_a;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Teste2Calendar {
    public static void main(String[] args) {
        GregorianCalendar Gc = new GregorianCalendar();

        int dias_que_faltam;

        if((Calendar.YEAR % 400 == 0) || ((Calendar.YEAR % 4 == 0) && (Calendar.YEAR % 100 != 0))){
            dias_que_faltam = (366 - Gc.get(Calendar.DAY_OF_YEAR));
        }else {
            dias_que_faltam = (365 - Gc.get(Calendar.DAY_OF_YEAR));
        }

        System.out.println("Faltam " + dias_que_faltam +" dias para o final do ano");
        System.out.println("Faltam " + (dias_que_faltam*24) +" horas para o final do ano");

    }
}
