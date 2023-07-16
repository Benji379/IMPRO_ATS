package com.formato.procesos;

import com.ventanas.generales.panel_Bienvenida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HoraActual implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        Date hora = new Date();
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss a");
        Calendar hoy = Calendar.getInstance();
        panel_Bienvenida.txtHora.setText(String.format(format.format(hora), hoy));
    }

}
