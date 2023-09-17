import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        SolucionarEcuacion v = new SolucionarEcuacion();
        v.setContentPane(v.contentPane);
        v.setVisible(true);
        v.setSize(1000,500);
        v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}