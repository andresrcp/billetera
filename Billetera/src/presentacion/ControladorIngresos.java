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
public class ControladorIngresos implements ActionListener {

    private Ingresos vIngresos;

    public ControladorIngresos(Ingresos v) {
        vIngresos = v;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("gastos")){
        Modelo modelo = vIngresos.getModelo();
        modelo.agregar(true);
        }else if(ae.getActionCommand().equals("ingresos")){
            
        }
    }

}
