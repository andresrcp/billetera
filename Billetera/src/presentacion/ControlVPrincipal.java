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
public class ControlVPrincipal implements ActionListener {

    private VentanaPrincipal ventanaIni;

    public ControlVPrincipal(VentanaPrincipal ventana) {
        ventanaIni = ventana;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Modelo nuevoModelo = ventanaIni.getModelo();
        nuevoModelo.eventoVPrincipal(ae);
    }

}
