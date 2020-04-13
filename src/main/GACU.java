package main;

import baseDatos.BaseDefault;
import ventanas.registro.MenuRegistro;

public class GACU {
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                BaseDefault basePorDefecto = new BaseDefault();
                //MENU
                basePorDefecto.guardarCategorias();
                basePorDefecto.cargarImagenes();
                //MENU
                new MenuRegistro().setVisible(true);
            }
        });
    }   
}
