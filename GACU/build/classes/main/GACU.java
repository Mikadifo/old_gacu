package main;


import ventanas.registro.MenuRegistro;

public class GACU {

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuRegistro().setVisible(true);
            }
        });
    }
    
}
