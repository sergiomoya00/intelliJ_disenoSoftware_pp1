package logicaControlador;

import GUICliente.*;
import logicaNegocios.*;
import logicaOperacionesx.Consultas.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorUsuario implements ActionListener {
    public MenuPrincipal homePage;
    public MenuOpciones menuOpciones;
    private RegistrarCliente registrarCliente;
    private RegistrarCuenta registrarCuenta;
    private Persona persona;
    private ConsultasCuentas consultasCuentas;
    private ListaClientes listaClientes;
    private ListaPersonas listaPersonas;
    private cambioPIN cambiarPIN;


    public ControladorUsuario(MenuPrincipal menuPrincipal){
        this.homePage = menuPrincipal;
        this.registrarCliente = null;
        this.menuOpciones = null;
        this.registrarCuenta = null;
        this.homePage.btnMenu.addActionListener(this);
        this.homePage.btnRegistrarse.addActionListener(this);
        consultasCuentas.CargarCuentas();
        cargarUsuarios();
        cargarTotalComisiones();
    }
    @Override
    public void actionPerformed(ActionEvent e){
        switch (e.getActionCommand()){
            case "Menu de Opciones":
                iniciarMenu();
                break;
            case "Registrarse":
                registro();
                break;
            case "":
                break;
            case "":
                break;
        }
    }

    private void iniciarMenu(){
        this.menuOpciones.setVisible(true);
        this.homePage.setVisible(false);
        menuOpciones = new MenuOpciones();
        this.menuOpciones.btnregistrarCuenta.addActionListener(this);
        this.menuOpciones.btnactualizarPIN.addActionListener(this);
        this.menuOpciones.btnConsultas.addActionListener(this);
        this.menuOpciones.btnDeposito.addActionListener(this);
        this.menuOpciones.btnEstatus.addActionListener(this);
        this.menuOpciones.btnTransferencia.addActionListener(this);
        this.menuOpciones.btnRetiro.addActionListener(this);
        this.menuOpciones.btnRegresar.addActionListener(this);
    }

    private void registro(){

    }
}
