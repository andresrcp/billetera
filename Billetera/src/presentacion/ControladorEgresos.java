/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author X550Z
 */
public class ControladorEgresos implements ActionListener {

    private Egresos vEgresos;
    private String categoriasIngre[] = {"Ahorros personales", "Arrendamientos y cánones", "Salario", "Trabajo a tiempo parcial"};
    private String categoriasEgre[] = {"Transporte", "Diario", "Hogar", "Salud", "Otros"};

    public ControladorEgresos(Egresos v) {
        vEgresos = v;
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        Modelo m = vEgresos.getModelo();
        m.agregarIngres();
    }

}
