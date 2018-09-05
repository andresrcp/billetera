/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author X550Z
 */
public class ControlAddEgres implements ActionListener {

    private IngresarEgresos vAddEgres;

    public ControlAddEgres(IngresarEgresos v) {
        vAddEgres = v;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Modelo m = vAddEgres.getModelo();
        m.add();
    }

}
