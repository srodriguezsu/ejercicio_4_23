import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SolucionarEcuacion extends JFrame{
    private JSpinner inA;
    private JSpinner inB;
    private JSpinner inC;
    private JButton btnSolcuionar;
    protected JPanel contentPane;

    public SolucionarEcuacion() {

    btnSolcuionar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            int a = (int) inA.getValue();
            int b = (int) inB.getValue();
            int c = (int) inC.getValue();
            EcuacionSegundoGrado ecuacion = new EcuacionSegundoGrado(a,b,c);
            SolucionX v = new SolucionX();

            v.setSize(600,350);
            v.setContentPane(v.contentPane);
            v.X1.setText(String.valueOf(ecuacion.getX1()));
            v.X2.setText(String.valueOf(ecuacion.getX2()));
            v.setVisible(true);

        }
    });
}
}
