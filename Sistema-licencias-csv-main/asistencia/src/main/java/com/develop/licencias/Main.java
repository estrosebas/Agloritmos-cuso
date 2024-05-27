/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.develop.licencias;

import Formulario.*;

//import Datos.*;
import Entidad.*;
import TAD_Establecimiento.CargadorEstablecimientos;
import TAD_Establecimiento.ListaEnlazadaImplEstablecimiento;
import java.sql.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author estrosebas
 */
public class Main {

    public static void main(String[] args) {

       
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                iniciarInterfazGrafica();
            }
        });
    }

    private static void iniciarInterfazGrafica() {
        //menuunitario menu = new menuunitario();
        BusquedaLicencias loger = new BusquedaLicencias();
        loger.setVisible(true);
    }
}
