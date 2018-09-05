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
 * @author Usuario
 */
public class ControladorInformes implements ActionListener {

    private VistaInformes registro;

    public ControladorInformes(VistaInformes r) {
        registro = r;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == registro.getBtmIngreso()) {

        } else if (ae.getSource() == registro.getBtmGasto()) {

        } else if (ae.getSource() == registro.getBtmContra()) {

        } else if (ae.getSource() == registro.getBtmRegresar()) {

        }
    }

}
