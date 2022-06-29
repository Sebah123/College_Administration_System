package gui;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fechapro {

    Calendar fecha = new GregorianCalendar();

    String anio = Integer.toString(fecha.get(Calendar.YEAR));
    String mes = Integer.toString(fecha.get(Calendar.MONTH));
    String dia = Integer.toString(fecha.get(Calendar.DATE));

    String fechacomp = anio + "-" + mes + "-" + dia;

    String hora = Integer.toString(fecha.get(Calendar.HOUR_OF_DAY));
    String min = Integer.toString(fecha.get(Calendar.MINUTE));

    String horacomp = hora + ":" + min;

}
