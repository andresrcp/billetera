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
public class ControladorVCuentas implements ActionListener{
    
    private VistaCuentas ventCuentas;
    
    public ControladorVCuentas(VistaCuentas v){
        ventCuentas = v;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Modelo modelo = ventCuentas.getModelo();
        
    }
    
    
    
}
