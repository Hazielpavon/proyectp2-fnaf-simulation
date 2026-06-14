package proyectoprogra2;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RelojEtc extends Thread {

    private JLabel jlabel1;
    private JTextField jTextField2;
    private boolean vali = true;
    private int hora = 12;

    public RelojEtc(JLabel jlabel1, JTextField jTextField2) {
        this.jlabel1 = jlabel1;
        this.jTextField2 = jTextField2;
    }

    public RelojEtc() {
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public JLabel getJlabel1() {
        return jlabel1;
    }

    public void setJlabel1(JLabel jlabel1) {
        this.jlabel1 = jlabel1;
    }

    public boolean valii(boolean vali) {
        if (hora == 7) {
            vali = false;
        }
        return vali;
    }

    @Override
    public void run() {
        while (valii(vali)) {

            jlabel1.setForeground(Color.WHITE);
            jlabel1.setText(hora + " AM");

            try {
                Thread.sleep(60000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            hora = (hora % 12) + 1;
        }
        
        
    }
}
