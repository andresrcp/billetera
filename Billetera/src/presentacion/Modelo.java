/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.awt.Color;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import logica.Cuenta;

/**
 *
 * @author X550Z
 */
public class Modelo {
    
    private boolean inOut;

    private ControlVPrincipal controlInicio;
    private ControladorContra controlGvsI;
    private ControladorHistorial controlHis;
    private ControladorInfGasto controlInfG;
    private ControladorInfIngreso controlInfI;
    private ControladorInformes controlInfos;
    private ControladorVCuentas controlVeCuenta;
    private ControlAddIngres controlVAddIng;
    private ControlAddEgres controlVAddEgre;
    private ControladorEgresos controlVEgre;
    private ControladorIngresos controlVIng;
    private VentanaPrincipal vprincipal;
    private VistaContra vContra;
    private VistaCuentas vCuentas;
    private VistaHistorial vHistorial;
    private VistaInfGasto vInfGastos;
    private VistaInfIngreso vInfIngresos;
    private VistaInformes vInfo;
    private Egresos vEgreso;
    private Ingresos vIngresos;
    private IngresarIngresos vAddIngres;
    private IngresarEgresos vAddEgres;
    private ArrayList<Cuenta> listaCuentas;

    public ControlAddEgres getControlAddEgres() {
        if (controlVAddEgre == null) {
            controlVAddEgre = new ControlAddEgres(vAddEgres);
        }
        return controlVAddEgre;
    }

    public ControlAddIngres getControlAddIngres() {
        if (controlVAddIng == null) {
            controlVAddIng = new ControlAddIngres(vAddIngres);
        }
        return controlVAddIng;
    }

    public ControladorEgresos getControladorEgresos() {
        if (controlVEgre == null) {
            controlVEgre = new ControladorEgresos(vEgreso);
        }
        return controlVEgre;
    }

    public ControladorIngresos getControladorIngresos() {
        if (controlVIng == null) {
            controlVIng = new ControladorIngresos(vIngresos);
        }
        return controlVIng;
    }

    public ControlVPrincipal getControlInicio() {
        if (controlInicio == null) {
            controlInicio = new ControlVPrincipal(vprincipal);
        }
        return controlInicio;
    }

    public ControladorContra getControlGvsI() {
        if (controlGvsI == null) {
            controlGvsI = new ControladorContra(vContra);
        }
        return controlGvsI;
    }

    public ControladorHistorial getControlHis() {
        if (controlHis == null) {
            controlHis = new ControladorHistorial(vHistorial);
        }
        return controlHis;
    }

    public ControladorInfGasto getControlInfG() {
        if (controlInfG == null) {
            controlInfG = new ControladorInfGasto(vInfGastos);
        }
        return controlInfG;
    }

    public ControladorInfIngreso getControlInfI() {
        if (controlInfI == null) {
            controlInfI = new ControladorInfIngreso(vInfIngresos);
        }
        return controlInfI;
    }

    public ControladorInformes getControlInfos() {
        if (controlInfos == null) {
            controlInfos = new ControladorInformes(vInfo);
        }
        return controlInfos;
    }

    public ControladorVCuentas getControlVeCuenta() {
        if (controlVeCuenta == null) {
            controlVeCuenta = new ControladorVCuentas(vCuentas);
        }
        return controlVeCuenta;
    }

    public VentanaPrincipal getVprincipal() {
        if (vprincipal == null) {
            vprincipal = new VentanaPrincipal(this);
        }
        return vprincipal;
    }

    public VistaContra getvContra() {
        if (vContra == null) {
            vContra = new VistaContra(this);
        }
        return vContra;
    }

    public VistaCuentas getvCuentas() {
        if (vCuentas == null) {
            vCuentas = new VistaCuentas(this);
        }
        return vCuentas;
    }

    public VistaHistorial getvHistorial() {
        if (vHistorial == null) {
            vHistorial = new VistaHistorial(this);
        }
        return vHistorial;
    }

    public VistaInfGasto getvInfGastos() {
        if (vInfGastos == null) {
            vInfGastos = new VistaInfGasto(this);
        }
        return vInfGastos;
    }

    public VistaInfIngreso getvInfIngresos() {
        if (vInfIngresos == null) {
            vInfIngresos = new VistaInfIngreso(this);
        }
        return vInfIngresos;
    }

    public VistaInformes getvInfo() {
        if (vInfo == null) {
            vInfo = new VistaInformes(this);
        }
        return vInfo;
    }

    public Egresos getvEgreso() {
        if (vEgreso == null) {
            vEgreso = new Egresos(this);
        }
        return vEgreso;
    }

    public Ingresos getvIngresos() {
        if (vIngresos == null) {
            vIngresos = new Ingresos(this);
        }
        return vIngresos;
    }

    public IngresarIngresos getvAddIngres() {
        if (vAddIngres == null) {
            vAddIngres = new IngresarIngresos(this);
        }
        return vAddIngres;
    }

    public IngresarEgresos getvAddEgres() {
        if (vAddEgres == null) {
            vAddEgres = new IngresarEgresos(this);
        }
        return vAddEgres;
    }

    public ArrayList<Cuenta> getListaCuentas() {
        if (listaCuentas == null) {
            listaCuentas = new ArrayList<Cuenta>();
        }
        return listaCuentas;
    }

    public void iniciar() {
        getVprincipal().setVisible(true);
    }

    //accion de los botones
    //segun el comando de los botones se oculta la ventana principal y se muestra la ventana elegida
    public void eventoVPrincipal(ActionEvent e) {

        switch (e.getActionCommand()) {
            case "bntCuenta":
                this.getVprincipal().setVisible(false);
                this.getvCuentas().setVisible(true);
                break;
            case "btnGastos":
                this.inOut=false;
                this.getVprincipal().setVisible(false);
                this.tipoVentana(inOut);
                this.getvEgreso().setVisible(true);
                break;
            case "btnIngresos":
                this.inOut=true;
                this.getVprincipal().setVisible(false);
                this.tipoVentana(inOut);
                this.getvEgreso().setVisible(true);
                break;
            case "btnHistorial":
                this.getVprincipal().setVisible(false);
                this.getvHistorial().setVisible(true);
                break;
            case "btnInfo":
                this.getVprincipal().setVisible(false);
                this.getvInfo().setVisible(true);
                break;
        }
    }
    public void tipoVentana(boolean a){
        if(a){
            this.getvEgreso().getEgresos().setForeground(Color.green);
            this.getvEgreso().getEgresos().setText("Ingresos");
        }else{
            this.getvEgreso().getEgresos().setText("Gastos");
            this.getvEgreso().getEgresos().setForeground(Color.RED);
        }
    }

    public void agregar(boolean a) {
        if(a){
            this.getvAddIngres().getTitulo().setText("Ingresos");
            this.getvAddIngres().getTitulo().setForeground(Color.green);
        }else{
            this.getvAddIngres().getTitulo().setText("Gastos");
            this.getvAddIngres().getTitulo().setForeground(Color.RED);
        }
        this.getvEgreso().setTipo(a);
        this.getvEgreso().setVisible(false);
        this.getvAddIngres().setVisible(true);
    }

    public void agregarIngres() {
        if(getvEgreso().getTipo()){
            this.getvAddIngres().getTitulo().setText("Adicionar Ingresos");
            this.getvAddIngres().getTitulo().setForeground(Color.GREEN);
        }else{
            this.getvAddIngres().getTitulo().setText("Adicionar Gastos");
            this.getvAddIngres().getTitulo().setForeground(Color.RED);
        }
        this.getvIngresos().setVisible(false);
        this.getvAddIngres().setVisible(true);
    }

    public void add() {

    }

}
