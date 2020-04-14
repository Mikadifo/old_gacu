package main;

public class GACU {

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaCarga().setVisible(true);
            }
        });
    }
}
