/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author Administrador
 */
public class AdministrarPuertas extends Thread {

    private final JLabel jLabel1;
    private final JLabel jLabel2;
    private final JLabel jLabel3;
    private final JLabel jLabel4;
    private final JLabel jLabel5;
    private final JLabel jLabel6;
    private final JLabel jLabel7;
    private final JLabel jLabel8;
    private int cont;
    private boolean bottonpres;
    private boolean isopened;
    private boolean pizquierda;
    private boolean pderecha;
    private Player puerta;
    private String puertaFilePath = "C:/Users/Administrador/Downloads/PropyectoP2-master/PropyectoP2-master/src/proyectoprogra2/door-slamming-fnaf-1-sound-effects.mp3";

    public AdministrarPuertas(JLabel jLabel1, JLabel jLabel2, JLabel jLabel3, JLabel jLabel4, int cont, JLabel jLabel5, JLabel jLabel6, JLabel jLabel7, JLabel jLabel8) {
        this.jLabel1 = jLabel1;
        this.jLabel2 = jLabel2;
        this.jLabel3 = jLabel3;
        this.jLabel4 = jLabel4;
        this.jLabel5 = jLabel5;
        this.jLabel6 = jLabel6;
        this.jLabel7 = jLabel7;
        this.jLabel8 = jLabel8;
        this.cont = cont;
        this.bottonpres = true;
    }

    public Player getPuerta() {
        return puerta;
    }

    public boolean isPizquierda() {
        return pizquierda;
    }

    public void setPizquierda(boolean pizquierda) {
        this.pizquierda = pizquierda;
    }

    public boolean isPderecha() {
        return pderecha;
    }

    public void setPderecha(boolean pderecha) {
        this.pderecha = pderecha;
    }

    public void setPuerta(Player jump) {
        this.puerta = jump;
    }

    public void setBottonpres(boolean bottonpres) {
        this.bottonpres = bottonpres;
    }

    public boolean isIsopened() {
        return isopened;
    }

    public void setIsopened(boolean isopened) {
        this.isopened = isopened;
    }

    @Override
    public void run() {
        while (bottonpres) {
            if (cont % 2 != 0) {
                jLabel1.setIcon(jLabel4.getIcon());
                jLabel1.setVisible(true);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                jLabel1.setIcon(jLabel2.getIcon());
                jLabel1.setVisible(true);

                if (!isopened) {
                    meto(puertaFilePath);
                }

                if (isopened) {
                    jLabel5.show(true);
                    jLabel6.show(true);
                    jLabel7.setText("Show Stage");
                    jLabel7.show(true);
                    jLabel8.show(true);
                }
            } else if (cont % 2 == 0) {
                jLabel1.setIcon(jLabel3.getIcon());
                jLabel1.setVisible(true);

                try {
                    Thread.sleep(500);

                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                jLabel1.setVisible(false);

                if (pizquierda && pderecha) {
                    meto(puertaFilePath);
                }else {
                    
                }
            }

            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            bottonpres = false;
        }
    }

    public void meto(String puertaFilePath) {
        try {
            FileInputStream direccion = new FileInputStream(puertaFilePath);
            Player p = new Player(direccion);
            p.play();

            while (!p.isComplete()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }

        } catch (FileNotFoundException | JavaLayerException ex) {
            Logger.getLogger(AdministrarPuertas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
