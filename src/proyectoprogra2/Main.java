package proyectoprogra2;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.monitor.Monitor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Main extends javax.swing.JFrame {

    private boolean continuar = false;
    private ArrayList<String> datos = new ArrayList();
    private int night = 0;
    private boolean RightdoorClosed = false;
    private boolean LeftdoorClosed = false;
    private boolean RightLighton = false;
    private boolean LeftLighton = false;
    private boolean monitorOpen = false;
    private boolean Nightmare = false;
    private Bateria b = new Bateria();
    private ArrayList<JLabel> jLabelsList = new ArrayList<>();
    private ArrayList<JButton> botonList = new ArrayList<>();
    private boolean newgamepressed = false;

    public Main() {
        initComponents();
        Ds_Extra.show(false);
        Ds_Extra2.show(false);
        Ds_Extra3.show(false);
        jLabel2.show(false);
        jLabel6.show(false);
        jLabel11.setVisible(false);
        jLabel13.setVisible(false);
        jLabel12.setVisible(false);
        jLabel15.show(false);
        jLabel17.setVisible(false);
        jLabel21.show(false);
        jLabel24.show(false);
        jLabel25.show(false);
        jLabel26.show(false);
        jLabel27.show(false);
        jLabel28.show(false);
        jLabel29.show(false);
        jLabel30.show(false);
        jLabel23.show(false);
        jLabel31.show(false);
        jLabel42.show(false);
        jLabel44.show(false);
        jLabel45.show(false);
        jLabel59.show(false);
        jLabel60.show(false);

        jTextField3.setBackground(new java.awt.Color(0, 0, 0, 1));

        jTextField1.setBackground(new java.awt.Color(0, 0, 0, 1));

        jTextField4.setBackground(new java.awt.Color(0, 0, 0, 1));

        jTextField9.setBackground(new java.awt.Color(0, 0, 0, 1));

        jTextField5.setBackground(new java.awt.Color(0, 0, 0, 1));

        jTextField7.setBackground(new java.awt.Color(0, 0, 0, 1));

        LOGIN.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        LOGIN.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {

                System.exit(0);
            }
        });

        LOGIN.pack();
        LOGIN.setModal(true);
        LOGIN.setLocationRelativeTo(this);
        LOGIN.setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NewGame = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Cam1A = new javax.swing.JButton();
        Cam7 = new javax.swing.JButton();
        Cam6 = new javax.swing.JButton();
        Cam4A = new javax.swing.JButton();
        Cam4B = new javax.swing.JButton();
        Cam2A = new javax.swing.JButton();
        Cam2B = new javax.swing.JButton();
        Cam3 = new javax.swing.JButton();
        Cam1C = new javax.swing.JButton();
        Cam1B = new javax.swing.JButton();
        Cam5 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        LOGIN = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        Ds_Extra2 = new javax.swing.JTextField();
        Ds_Extra3 = new javax.swing.JTextField();
        Ds_Extra = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();

        NewGame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel54.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(204, 204, 204));
        jPanel3.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 160, 40));

        jLabel46.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(204, 204, 204));
        jLabel46.setText("Usage:");
        jPanel3.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 80, 40));
        jPanel3.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 620, 100, 40));

        jLabel47.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(204, 204, 204));
        jLabel47.setText("Power left: ");
        jPanel3.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 160, 40));

        jLabel44.setBackground(new java.awt.Color(0, 0, 0));
        jLabel44.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(204, 204, 204));
        jLabel44.setText("Audio Only");
        jLabel44.setOpaque(true);
        jPanel3.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 140, 40));

        jLabel45.setBackground(new java.awt.Color(0, 0, 0));
        jLabel45.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(204, 204, 204));
        jLabel45.setText("-Camera Disabled-");
        jLabel45.setOpaque(true);
        jPanel3.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 230, 40));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RedBlinkingball.gif"))); // NOI18N
        jPanel3.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 50, 50));

        jLabel31.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 204, 204));
        jLabel31.setText("Show Stage");
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 320, 220, 40));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CAMARAS.png"))); // NOI18N
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 280, 230));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Org.png"))); // NOI18N
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 680, 440));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AmbosprendidosIzq.png"))); // NOI18N
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 90, 240));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ABRIIRRR.gif"))); // NOI18N
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 720, 500));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AmboPrendidoder.png"))); // NOI18N
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 280, -1, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PC Computer - Five Nights at Freddys - Buttons.png"))); // NOI18N
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 290, 100, 180));

        jLabel18.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 110, 120, 40));

        jLabel19.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 70, 120, 40));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PuertaIzquierdaBotonApagado.png"))); // NOI18N
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 300, 100, 160));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PuertaDerechaPuertaEncendida.png"))); // NOI18N
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 270, 100, 220));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ezgif-4-807c3586c6.gif"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 220, 550));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puertacerrder (1).gif"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 70, 200, 560));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Kitchen.jpg"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 610, 440, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ezgif-4-6ac0f3ab68.gif"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 190, 510));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BottonDerechoApagado.png"))); // NOI18N
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 90, 210));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotoderechoEncendidoLapuerta.png"))); // NOI18N
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 240, 100, 280));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LuzEncendidabIzqu.png"))); // NOI18N
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 260, 90, 220));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wqtbx5bl97311_2.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1290, 650));

        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 300, 60, 60));

        jButton1.setText("jButton1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 60, 70));

        jButton3.setText("jButton3");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 60, 80));

        jButton4.setText("jButton4");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 380, 60, 70));

        Cam1A.setText("jButton5");
        Cam1A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cam1AMouseClicked(evt);
            }
        });
        jPanel3.add(Cam1A, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 363, 40, 20));

        Cam7.setText("jButton5");
        Cam7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cam7MouseClicked(evt);
            }
        });
        jPanel3.add(Cam7, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 405, 40, 30));

        Cam6.setText("jButton5");
        Cam6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cam6MouseClicked(evt);
            }
        });
        jPanel3.add(Cam6, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 495, 40, 20));

        Cam4A.setText("jButton5");
        Cam4A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cam4AMouseClicked(evt);
            }
        });
        jPanel3.add(Cam4A, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 513, 40, 30));

        Cam4B.setText("jButton5");
        Cam4B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cam4BMouseClicked(evt);
            }
        });
        jPanel3.add(Cam4B, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 542, 40, -1));

        Cam2A.setText("jButton5");
        Cam2A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cam2AMouseClicked(evt);
            }
        });
        jPanel3.add(Cam2A, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 513, 40, 20));

        Cam2B.setText("jButton5");
        Cam2B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cam2BMouseClicked(evt);
            }
        });
        jPanel3.add(Cam2B, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 543, 40, 20));

        Cam3.setText("jButton5");
        Cam3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cam3MouseClicked(evt);
            }
        });
        jPanel3.add(Cam3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 503, 40, 30));

        Cam1C.setText("jButton5");
        Cam1C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cam1CMouseClicked(evt);
            }
        });
        jPanel3.add(Cam1C, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 445, 40, 20));

        Cam1B.setText("jButton6");
        Cam1B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cam1BMouseClicked(evt);
            }
        });
        jPanel3.add(Cam1B, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 390, 50, 30));

        Cam5.setText("jButton5");
        Cam5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cam5MouseClicked(evt);
            }
        });
        jPanel3.add(Cam5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 413, 40, 20));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ezgif-4-807c3586c6.gif"))); // NOI18N
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 220, 550));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puertacerrder (1).gif"))); // NOI18N
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 70, 200, 560));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ABRIIRRR.gif"))); // NOI18N
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 720, 500));

        NewGame.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 690));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puertaizcerrada.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        NewGame.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puertaizqrabrir.gif"))); // NOI18N
        jLabel5.setText("jLabel5");
        NewGame.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puertadercerrada.gif"))); // NOI18N
        jLabel7.setText("jLabel7");
        NewGame.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puertaderabrir.gif"))); // NOI18N
        jLabel8.setText("jLabel8");
        NewGame.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenDelMonitor.gif"))); // NOI18N
        jLabel12.setText("jLabel12");
        NewGame.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Monicerrar.gif"))); // NOI18N
        jLabel13.setText("jLabel13");
        NewGame.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LuzEncendidaC.jpg"))); // NOI18N
        jLabel20.setText("jLabel20");
        NewGame.getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LuzEncendidaIzq.jpg"))); // NOI18N
        jLabel22.setText("jLabel22");
        NewGame.getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dinning 1b.png"))); // NOI18N
        jLabel32.setText("jLabel32");
        NewGame.getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Org.png"))); // NOI18N
        jLabel33.setText("jLabel33");
        NewGame.getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cam5 Backstage.png"))); // NOI18N
        jLabel34.setText("jLabel34");
        NewGame.getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cam1c PirateCave.png"))); // NOI18N
        jLabel35.setText("jLabel35");
        NewGame.getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cam3Supply Closet.png"))); // NOI18N
        jLabel36.setText("jLabel36");
        NewGame.getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Westhall.png"))); // NOI18N
        jLabel37.setText("jLabel37");
        NewGame.getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WesthallCorner.png"))); // NOI18N
        jLabel38.setText("jLabel38");
        NewGame.getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EastHall 4A.png"))); // NOI18N
        jLabel39.setText("jLabel39");
        NewGame.getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EastHallCorner 4b.png"))); // NOI18N
        jLabel40.setText("jLabel40");
        NewGame.getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Restrooms7.png"))); // NOI18N
        jLabel41.setText("jLabel41");
        NewGame.getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Static.gif"))); // NOI18N
        jLabel43.setText("jLabel43");
        NewGame.getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Battery1.jpg"))); // NOI18N
        NewGame.getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/battery2_1.jpg"))); // NOI18N
        jLabel50.setText("jLabel50");
        NewGame.getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, -1));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Battery3.jpg"))); // NOI18N
        NewGame.getContentPane().add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/battery4.jpg"))); // NOI18N
        NewGame.getContentPane().add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Battery5.jpg"))); // NOI18N
        NewGame.getContentPane().add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ezgif-4-1c20b798eb (1).gif"))); // NOI18N
        NewGame.getContentPane().add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 690));

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ezgif-4-2216556413 (1).gif"))); // NOI18N
        NewGame.getContentPane().add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 690));

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Opera Captura de pantalla_2023-12-03_150239_FinalGifGameLoss.gif_1.png"))); // NOI18N
        jLabel61.setText("jLabel61");
        NewGame.getContentPane().add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 690));

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4ZWZrH (1).gif"))); // NOI18N
        NewGame.getContentPane().add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, -1));

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wqtbx5bl97311_2.png"))); // NOI18N
        NewGame.getContentPane().add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        LOGIN.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel58.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(153, 153, 153));
        jLabel58.setText("Seleccionar Usuario");
        jPanel2.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 200, 40));

        jLabel57.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(153, 153, 153));
        jLabel57.setText("Nombre: ");
        jPanel2.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 80, 30));

        jLabel56.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(153, 153, 153));
        jLabel56.setText("Crear Usuario");
        jPanel2.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, 40));

        jTextField6.setBackground(new java.awt.Color(0, 0, 0));
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
        });
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 160, 30));

        jComboBox1.setBackground(new java.awt.Color(0, 0, 0));
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 250, -1));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Ingresar");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, -1, -1));

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MENUF.gif"))); // NOI18N
        jLabel55.setText("jLabel55");
        jPanel2.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 702, -1));

        LOGIN.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 703, 510));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel64.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jPanel1.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 80, 30));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("At");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 146, 50));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(0, 0, 0));
        jTextField2.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("Five ");
        jTextField2.setBorder(null);
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 146, 44));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(0, 0, 0));
        jTextField3.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setText("Nights");
        jTextField3.setBorder(null);
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 146, 44));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(0, 0, 0));
        jTextField4.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setText("Freddy's");
        jTextField4.setBorder(null);
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 146, 44));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(0, 0, 0));
        jTextField5.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setText("Continue");
        jTextField5.setBorder(null);
        jTextField5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField5MouseExited(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, 44));

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(0, 0, 0));
        jTextField9.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));
        jTextField9.setText("New Game");
        jTextField9.setBorder(null);
        jTextField9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField9MouseExited(evt);
            }
        });
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, 44));

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(0, 0, 0));
        jTextField7.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setText("Costume Night");
        jTextField7.setBorder(null);
        jTextField7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField7MouseExited(evt);
            }
        });
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 260, 44));

        Ds_Extra2.setEditable(false);
        Ds_Extra2.setBackground(new java.awt.Color(0, 0, 0));
        Ds_Extra2.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        Ds_Extra2.setForeground(new java.awt.Color(255, 255, 255));
        Ds_Extra2.setText("       <<");
        Ds_Extra2.setBorder(null);
        jPanel1.add(Ds_Extra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 150, 44));

        Ds_Extra3.setEditable(false);
        Ds_Extra3.setBackground(new java.awt.Color(0, 0, 0));
        Ds_Extra3.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        Ds_Extra3.setForeground(new java.awt.Color(255, 255, 255));
        Ds_Extra3.setText(" <<");
        Ds_Extra3.setBorder(null);
        jPanel1.add(Ds_Extra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 540, 146, 44));

        Ds_Extra.setEditable(false);
        Ds_Extra.setBackground(new java.awt.Color(0, 0, 0));
        Ds_Extra.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        Ds_Extra.setForeground(new java.awt.Color(255, 255, 255));
        Ds_Extra.setText("       <<");
        Ds_Extra.setBorder(null);
        Ds_Extra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Ds_ExtraMouseEntered(evt);
            }
        });
        jPanel1.add(Ds_Extra, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 150, 44));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ezgif-3-5dfb267f23.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1130, 700));

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(0, 0, 0));
        jTextField8.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.setText("Nights");
        jTextField8.setBorder(null);
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 146, 44));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 989, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Ds_ExtraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ds_ExtraMouseEntered


    }//GEN-LAST:event_Ds_ExtraMouseEntered

    private void jTextField9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField9MouseEntered

        Ds_Extra.setVisible(true);
        Ds_Extra.setBackground(new java.awt.Color(0, 0, 0, 1));

    }//GEN-LAST:event_jTextField9MouseEntered

    private void jTextField9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField9MouseExited
        Ds_Extra.setVisible(false);
    }//GEN-LAST:event_jTextField9MouseExited

    private void jTextField5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseEntered
        Ds_Extra2.setVisible(true);
        Ds_Extra2.setBackground(new java.awt.Color(0, 0, 0, 1));

        if (b.isPerdio()) {
            jLabel64.setFont(jTextField8.getFont());
            jLabel64.setForeground(Color.white);
            jLabel64.setText("Night " + b.getNight());
        } else if (!b.isPerdio() && night > 0) {
            jLabel64.setFont(jTextField8.getFont());
            jLabel64.setForeground(Color.white);
            jLabel64.setText("Night " + b.getNight() + 1);
        } else {
            jLabel64.setText("");
        }

    }//GEN-LAST:event_jTextField5MouseEntered

    private void jTextField5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseExited
        Ds_Extra2.setVisible(false);
    }//GEN-LAST:event_jTextField5MouseExited

    private void jTextField7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField7MouseEntered
        Ds_Extra3.setVisible(true);
        Ds_Extra3.setBackground(new java.awt.Color(0, 0, 0, 1));
    }//GEN-LAST:event_jTextField7MouseEntered

    private void jTextField7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField7MouseExited
        Ds_Extra3.setVisible(false);
    }//GEN-LAST:event_jTextField7MouseExited

    private void jTextField9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField9MouseClicked

        if (!newgamepressed) {
            newgamepressed = true;
            if (b != null && b.isAlive()) {
                b.interrupt();
            }

            Object[] options = {"Easy", "Nightmare"};
            int result = JOptionPane.showOptionDialog(this, "Ingrese una Opcion para la dificultad", "Seleccionar Dificultad", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            if (result == 1) {
                Nightmare = true;
            } else {
                Nightmare = false;
            }

            RelojEtc r = new RelojEtc(jLabel18, jTextField2);

            b = new Bateria();
            b.setDif(Nightmare);

            b.setJlabel1(jLabel54);

            b.setBackground(jLabel4);
            b.setGameloss(jLabel59);
            b.setJumpscare(jLabel60);
            b.setLobbyapagado(jLabel61);
            b.setEstatica(jLabel62);

            b.setNewGame(NewGame);

            b.start();

            r.start();

            night = 0;

            night++;

            b.setNight(night);

            jLabel19.setForeground(Color.WHITE);
            jLabel19.setFont(jTextField2.getFont());
            jLabel19.setText("Night: " + Integer.toString(night));

            jLabelsList.add(jLabel2);
            jLabelsList.add(jLabel3);
            jLabelsList.add(jLabel5);
            jLabelsList.add(jLabel6);
            jLabelsList.add(jLabel7);
            jLabelsList.add(jLabel8);
            jLabelsList.add(jLabel9);
            jLabelsList.add(jLabel10);
            jLabelsList.add(jLabel11);
            jLabelsList.add(jLabel12);
            jLabelsList.add(jLabel13);
            jLabelsList.add(jLabel14);
            jLabelsList.add(jLabel15);
            jLabelsList.add(jLabel16);
            jLabelsList.add(jLabel17);
            jLabelsList.add(jLabel18);
            jLabelsList.add(jLabel19);
            jLabelsList.add(jLabel20);
            jLabelsList.add(jLabel21);
            jLabelsList.add(jLabel22);
            jLabelsList.add(jLabel23);
            jLabelsList.add(jLabel24);
            jLabelsList.add(jLabel25);
            jLabelsList.add(jLabel26);
            jLabelsList.add(jLabel27);
            jLabelsList.add(jLabel28);
            jLabelsList.add(jLabel29);
            jLabelsList.add(jLabel30);
            jLabelsList.add(jLabel31);
            jLabelsList.add(jLabel32);
            jLabelsList.add(jLabel33);
            jLabelsList.add(jLabel34);
            jLabelsList.add(jLabel35);
            jLabelsList.add(jLabel36);
            jLabelsList.add(jLabel37);
            jLabelsList.add(jLabel38);
            jLabelsList.add(jLabel39);
            jLabelsList.add(jLabel40);
            jLabelsList.add(jLabel41);
            jLabelsList.add(jLabel42);
            jLabelsList.add(jLabel43);
            jLabelsList.add(jLabel44);
            jLabelsList.add(jLabel45);
            jLabelsList.add(jLabel46);
            jLabelsList.add(jLabel47);
            jLabelsList.add(jLabel48);
            jLabelsList.add(jLabel49);
            jLabelsList.add(jLabel50);
            jLabelsList.add(jLabel51);
            jLabelsList.add(jLabel52);
            jLabelsList.add(jLabel53);
            jLabelsList.add(jLabel54);
            jLabelsList.add(jLabel55);

            botonList.add(jButton1);
            botonList.add(jButton2);
            botonList.add(jButton3);
            botonList.add(jButton4);

            botonList.add(Cam1A);
            botonList.add(Cam1B);
            botonList.add(Cam1C);
            botonList.add(Cam2A);
            botonList.add(Cam2B);
            botonList.add(Cam4A);
            botonList.add(Cam4B);
            botonList.add(Cam3);
            botonList.add(Cam5);
            botonList.add(Cam6);
            botonList.add(Cam7);

            b.setLista(botonList);
            b.setLsta(jLabelsList);

            try {
                //Esta es para el music box
                FileInputStream direccion1 = new FileInputStream("C:/Users/Administrador/Downloads/PropyectoP2-master/PropyectoP2-master/src/proyectoprogra2/fnaf-1-music-box.mp3");
                Player p = new Player(direccion1);
                b.setP(p);
                // esta es para los jumpscares generales 
                FileInputStream direccion2 = new FileInputStream("C:/Users/Administrador/Downloads/PropyectoP2-master/PropyectoP2-master/src/proyectoprogra2/five-nights-at-freddys-full-scream-sound_2.mp3");
                Player p2 = new Player(direccion2);
                b.setJump(p2);
                // esta es para cuando se va la luz 
                FileInputStream direccion3 = new FileInputStream("C:/Users/Administrador/Downloads/PropyectoP2-master/PropyectoP2-master/src/proyectoprogra2/powerdown.mp3");
                Player p3 = new Player(direccion3);
                b.setBatdone(p3);

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JavaLayerException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }

            NewGame.pack();
            NewGame.setModal(true);
            NewGame.setLocationRelativeTo(this);
            NewGame.setVisible(true);

        } else {
            System.out.println("En el else");
            jLabel4.setIcon(jLabel63.getIcon());
            jLabel4.show(true);
            jLabel2.show(false);
            jLabel6.show(false);
            jLabel10.show(true);
            jLabel14.show(true);
            jLabel16.show(true);
            jLabel9.show(true);
            jLabel47.show(true);
            jLabel46.show(true);
            jLabel48.show(true);
            jLabel19.show(true);
            jLabel18.show(true);
            jLabel54.show(true);

            for (JButton buton : botonList) {
                buton.setVisible(true);
            }
            if (b != null && b.isAlive()) {
                b.interrupt();
            }

            Object[] options = {"Easy", "Nightmare"};
            int result = JOptionPane.showOptionDialog(this, "Ingrese una Opcion para la dificultad", "Seleccionar Dificultad", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            if (result == 1) {
                Nightmare = true;
            } else {
                Nightmare = false;
            }

            RelojEtc r = new RelojEtc(jLabel18, jTextField2);

            b = new Bateria();
            b.setDif(Nightmare);

            b.setJlabel1(jLabel54);

            b.setBackground(jLabel4);
            b.setGameloss(jLabel59);
            b.setJumpscare(jLabel60);
            b.setLobbyapagado(jLabel61);
            b.setEstatica(jLabel62);

            b.setNewGame(NewGame);

            b.start();

            r.start();

            night = 0;

            night++;

            b.setNight(night);

            jLabel19.setForeground(Color.WHITE);
            jLabel19.setFont(jTextField2.getFont());
            jLabel19.setText("Night: " + Integer.toString(night));

            jLabelsList.add(jLabel2);
            jLabelsList.add(jLabel3);
            jLabelsList.add(jLabel5);
            jLabelsList.add(jLabel6);
            jLabelsList.add(jLabel7);
            jLabelsList.add(jLabel8);
            jLabelsList.add(jLabel9);
            jLabelsList.add(jLabel10);
            jLabelsList.add(jLabel11);
            jLabelsList.add(jLabel12);
            jLabelsList.add(jLabel13);
            jLabelsList.add(jLabel14);
            jLabelsList.add(jLabel15);
            jLabelsList.add(jLabel16);
            jLabelsList.add(jLabel17);
            jLabelsList.add(jLabel18);
            jLabelsList.add(jLabel19);
            jLabelsList.add(jLabel20);
            jLabelsList.add(jLabel21);
            jLabelsList.add(jLabel22);
            jLabelsList.add(jLabel23);
            jLabelsList.add(jLabel24);
            jLabelsList.add(jLabel25);
            jLabelsList.add(jLabel26);
            jLabelsList.add(jLabel27);
            jLabelsList.add(jLabel28);
            jLabelsList.add(jLabel29);
            jLabelsList.add(jLabel30);
            jLabelsList.add(jLabel31);
            jLabelsList.add(jLabel32);
            jLabelsList.add(jLabel33);
            jLabelsList.add(jLabel34);
            jLabelsList.add(jLabel35);
            jLabelsList.add(jLabel36);
            jLabelsList.add(jLabel37);
            jLabelsList.add(jLabel38);
            jLabelsList.add(jLabel39);
            jLabelsList.add(jLabel40);
            jLabelsList.add(jLabel41);
            jLabelsList.add(jLabel42);
            jLabelsList.add(jLabel43);
            jLabelsList.add(jLabel44);
            jLabelsList.add(jLabel45);
            jLabelsList.add(jLabel46);
            jLabelsList.add(jLabel47);
            jLabelsList.add(jLabel48);
            jLabelsList.add(jLabel49);
            jLabelsList.add(jLabel50);
            jLabelsList.add(jLabel51);
            jLabelsList.add(jLabel52);
            jLabelsList.add(jLabel53);
            jLabelsList.add(jLabel54);
            jLabelsList.add(jLabel55);

            botonList.add(jButton1);
            botonList.add(jButton2);
            botonList.add(jButton3);
            botonList.add(jButton4);

            botonList.add(Cam1A);
            botonList.add(Cam1B);
            botonList.add(Cam1C);
            botonList.add(Cam2A);
            botonList.add(Cam2B);
            botonList.add(Cam4A);
            botonList.add(Cam4B);
            botonList.add(Cam3);
            botonList.add(Cam5);
            botonList.add(Cam6);
            botonList.add(Cam7);

            b.setLista(botonList);
            b.setLsta(jLabelsList);

            try {
                //Esta es para el music box
                FileInputStream direccion1 = new FileInputStream("C:/Users/Administrador/Downloads/PropyectoP2-master/PropyectoP2-master/src/proyectoprogra2/fnaf-1-music-box.mp3");
                Player p = new Player(direccion1);
                b.setP(p);
                // esta es para los jumpscares generales 
                FileInputStream direccion2 = new FileInputStream("C:/Users/Administrador/Downloads/PropyectoP2-master/PropyectoP2-master/src/proyectoprogra2/five-nights-at-freddys-full-scream-sound_2.mp3");
                Player p2 = new Player(direccion2);
                b.setJump(p2);
                // esta es para cuando se va la luz 
                FileInputStream direccion3 = new FileInputStream("C:/Users/Administrador/Downloads/PropyectoP2-master/PropyectoP2-master/src/proyectoprogra2/powerdown.mp3");
                Player p3 = new Player(direccion3);
                b.setBatdone(p3);

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JavaLayerException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }

            NewGame.pack();
            NewGame.setModal(true);
            NewGame.setLocationRelativeTo(this);
            NewGame.setVisible(true);
        }

    }//GEN-LAST:event_jTextField9MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        AdministrarPuertas ap = new AdministrarPuertas(jLabel2, jLabel3, jLabel5, jLabel28, cont, null, null, null, null);

        if (!b.isPerdio() || continuar) {
            if (!monitorOpen) {

                if (cont % 2 != 0) {

                    RightdoorClosed = true;
                    if (LeftLighton) {
                        jLabel14.setVisible(false);
                        jLabel15.setVisible(false);
                        jLabel25.setVisible(true);
                    } else {
                        jLabel14.setVisible(false);
                        jLabel15.setVisible(true);
                        jLabel25.setVisible(false);
                    }
                    ap.setPderecha(true);
                    ap.start();

                } else {

                    ap.start();

                    RightdoorClosed = false;
                    jLabel14.show(true);
                    jLabel25.setVisible(false);
                    jLabel15.setVisible(false);

                }

                cont++;
            } else {
                System.out.println("PlaySound");
            }

        } else {
            System.out.println("PlaySound");
        }
        bate();
        b.setCont(bate());
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

        AdministrarPuertas ap = new AdministrarPuertas(jLabel6, jLabel7, jLabel8, jLabel29, cont2, null, null, null, null);
        if (!b.isPerdio() || continuar) {
            if (!monitorOpen) {
                if (cont2 % 2 != 0) {
                    LeftdoorClosed = true;

                    if (RightLighton) {
                        jLabel16.setVisible(false);
                        jLabel17.setVisible(false);
                        jLabel26.setVisible(true);
                    } else {
                        jLabel16.setVisible(false);
                        jLabel17.setVisible(true);
                        jLabel26.setVisible(false);
                    }
                    ap.start();
                } else {
                    ap.setPizquierda(true);
                    ap.start();
                    LeftdoorClosed = false;
                    jLabel16.setVisible(true);
                    jLabel26.setVisible(false);
                    jLabel17.setVisible(false);
                }

                cont2++;

            } else {
                System.out.println("PlaySound");
            }

        } else {
            System.out.println("PlaySound");
        }
        bate();
        b.setCont(bate());
    }//GEN-LAST:event_jButton2MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked

        jLabel23.setIcon(jLabel33.getIcon());

        AdministrarPuertas ap = new AdministrarPuertas(jLabel11, jLabel12, jLabel13, jLabel30, cont3, jLabel27, jLabel23, jLabel31, jLabel42);

        if (!b.isPerdio() || continuar) {
            if (cont3 % 2 != 0) {
                ap.setIsopened(true);
                ap.start();
                monitorOpen = true;

            } else if (cont3 % 2 == 0) {
                monitorOpen = false;
                ap.start();
                jLabel11.setVisible(true);
                jLabel27.show(false);
                jLabel23.show(false);
                jLabel31.show(false);
                jLabel42.show(false);
                jLabel44.show(false);
                jLabel45.show(false);

            }
        } else {
            System.out.println("Playsound");
        }
        cont3++;
        bate();
        b.setCont(bate());
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked

        if (!b.isPerdio() || continuar) {
            if (!monitorOpen) {
                if (!RightdoorClosed) {
                    if (cont4 % 2 != 0) {
                        jLabel14.show(false);
                        jLabel21.show(true);
                        jLabel2.setIcon(jLabel20.getIcon());
                        jLabel2.show(true);

                        LeftLighton = true;
                    } else {
                        jLabel14.show(true);
                        jLabel21.show(false);
                        jLabel2.show(false);
                        LeftLighton = false;

                    }
                } else {
                    System.out.println("PlaySound");
                }
            } else {
                System.out.println("Playsound");
            }
        } else {
            System.out.println("Playsound");
        }
        cont4++;

        bate();
        b.setCont(bate());
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        if (!b.isPerdio() || continuar) {
            if (!monitorOpen) {
                if (!LeftdoorClosed) {
                    if (cont5 % 2 != 0) {
                        RightLighton = true;
                        jLabel16.show(false);
                        jLabel24.show(true);
                        jLabel6.setIcon(jLabel22.getIcon());
                        jLabel6.show(true);
                    } else {
                        RightLighton = false;
                        jLabel16.show(true);
                        jLabel24.show(false);
                        jLabel6.show(false);
                    }

                } else {
                    System.out.println("PlaySound2");
                }
            } else {
                System.out.println("PlaySound");
            }
        } else {
            System.out.println("PlaySound");
        }

        cont5++;

        bate();
        b.setCont(bate());
    }//GEN-LAST:event_jButton4MouseClicked

    private void Cam1AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cam1AMouseClicked
        jLabel44.show(false);
        jLabel45.show(false);
        String p = "Show Stage";
        cam(p, jLabel33);

    }//GEN-LAST:event_Cam1AMouseClicked

    private void Cam1BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cam1BMouseClicked
        jLabel44.show(false);
        jLabel45.show(false);
        String p = "Dinning Area";
        cam(p, jLabel32);


    }//GEN-LAST:event_Cam1BMouseClicked

    private void Cam5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cam5MouseClicked
        jLabel44.show(false);
        jLabel45.show(false);
        String p = "BackStage";
        cam(p, jLabel34);

    }//GEN-LAST:event_Cam5MouseClicked

    private void Cam1CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cam1CMouseClicked
        jLabel44.show(false);
        jLabel45.show(false);
        String p = "Pirates Cave";
        cam(p, jLabel35);


    }//GEN-LAST:event_Cam1CMouseClicked

    private void Cam3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cam3MouseClicked
        jLabel44.show(false);
        jLabel45.show(false);
        String p = "Supply Closet";
        cam(p, jLabel36);


    }//GEN-LAST:event_Cam3MouseClicked

    private void Cam2AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cam2AMouseClicked
        jLabel44.show(false);
        jLabel45.show(false);
        String p = "West Hall";
        cam(p, jLabel37);


    }//GEN-LAST:event_Cam2AMouseClicked

    private void Cam2BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cam2BMouseClicked
        jLabel44.show(false);
        jLabel45.show(false);
        String p = "W. Hall Corner";
        cam(p, jLabel38);

    }//GEN-LAST:event_Cam2BMouseClicked

    private void Cam4AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cam4AMouseClicked
        jLabel44.show(false);
        jLabel45.show(false);
        String p = "East Hall";
        cam(p, jLabel39);

    }//GEN-LAST:event_Cam4AMouseClicked

    private void Cam4BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cam4BMouseClicked
        jLabel44.show(false);
        jLabel45.show(false);
        String p = "E.Hall Corner";
        cam(p, jLabel40);


    }//GEN-LAST:event_Cam4BMouseClicked

    private void Cam7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cam7MouseClicked
        jLabel44.show(false);
        jLabel45.show(false);
        String p = "Restrooms";
        cam(p, jLabel41);

    }//GEN-LAST:event_Cam7MouseClicked

    private void Cam6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cam6MouseClicked
        String p = "Kitchen";
        cam(p, jLabel43);
        jLabel44.show(true);
        jLabel45.show(true);

    }//GEN-LAST:event_Cam6MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        LOGIN.setVisible(false);
    }//GEN-LAST:event_jButton5MouseClicked

    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
        boolean existe = false;

        if (evt.getKeyCode() == evt.VK_ENTER) {
            try {
                String nombre = jTextField6.getText();

                for (int i = 0; i < datos.size(); i++) {
                    if (nombre.equalsIgnoreCase(datos.get(i))) {
                        JOptionPane.showMessageDialog(LOGIN, "Ingrese un nombre de Usuario que no Exista");
                        existe = true;
                        break;
                    }
                }

                if (!existe) {
                    datos.add(nombre);

                    DefaultComboBoxModel modelo = (DefaultComboBoxModel) jComboBox1.getModel();
                    modelo.addElement(nombre);
                    jComboBox1.setModel(modelo);
                    jTextField6.setText("");
                }

            } catch (Exception e) {

            }
        }


    }//GEN-LAST:event_jTextField6KeyPressed

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked

        Bateria b2 = new Bateria();
        continuar = true;
        jLabelsList.add(jLabel2);
        jLabelsList.add(jLabel3);
        jLabelsList.add(jLabel5);
        jLabelsList.add(jLabel6);
        jLabelsList.add(jLabel7);
        jLabelsList.add(jLabel8);
        jLabelsList.add(jLabel9);
        jLabelsList.add(jLabel10);
        jLabelsList.add(jLabel11);
        jLabelsList.add(jLabel12);
        jLabelsList.add(jLabel13);
        jLabelsList.add(jLabel14);
        jLabelsList.add(jLabel15);
        jLabelsList.add(jLabel16);
        jLabelsList.add(jLabel17);
        jLabelsList.add(jLabel18);
        jLabelsList.add(jLabel19);
        jLabelsList.add(jLabel20);
        jLabelsList.add(jLabel21);
        jLabelsList.add(jLabel22);
        jLabelsList.add(jLabel23);
        jLabelsList.add(jLabel24);
        jLabelsList.add(jLabel25);
        jLabelsList.add(jLabel26);
        jLabelsList.add(jLabel27);
        jLabelsList.add(jLabel28);
        jLabelsList.add(jLabel29);
        jLabelsList.add(jLabel30);
        jLabelsList.add(jLabel31);
        jLabelsList.add(jLabel32);
        jLabelsList.add(jLabel33);
        jLabelsList.add(jLabel34);
        jLabelsList.add(jLabel35);
        jLabelsList.add(jLabel36);
        jLabelsList.add(jLabel37);
        jLabelsList.add(jLabel38);
        jLabelsList.add(jLabel39);
        jLabelsList.add(jLabel40);
        jLabelsList.add(jLabel41);
        jLabelsList.add(jLabel42);
        jLabelsList.add(jLabel43);
        jLabelsList.add(jLabel44);
        jLabelsList.add(jLabel45);
        jLabelsList.add(jLabel46);
        jLabelsList.add(jLabel47);
        jLabelsList.add(jLabel48);
        jLabelsList.add(jLabel49);
        jLabelsList.add(jLabel50);
        jLabelsList.add(jLabel51);
        jLabelsList.add(jLabel52);
        jLabelsList.add(jLabel53);
        jLabelsList.add(jLabel54);
        jLabelsList.add(jLabel55);

        botonList.add(jButton1);
        botonList.add(jButton2);
        botonList.add(jButton3);
        botonList.add(jButton4);

        botonList.add(Cam1A);
        botonList.add(Cam1B);
        botonList.add(Cam1C);
        botonList.add(Cam2A);
        botonList.add(Cam2B);
        botonList.add(Cam4A);
        botonList.add(Cam4B);
        botonList.add(Cam3);
        botonList.add(Cam5);
        botonList.add(Cam6);
        botonList.add(Cam7);

        b2.setLista(botonList);
        b2.setLsta(jLabelsList);

        if (night != 0) {
            if (b2.isPerdio()) {

                b2.setPerdio(false);

                RelojEtc r = new RelojEtc(jLabel18, jTextField2);

                b2.setDif(b2.isDif());
                r.setHora(11);
                night = b2.getNight();
                b2.setBatte(5);

                jLabel54.setText(Integer.toString(b2.getBatte()));

                b2.setJlabel1(jLabel54);
                b2.setDif(Nightmare);
                b2.setJlabel1(jLabel54);
                b2.setBackground(jLabel4);

                b2.setGameloss(jLabel59);
                b2.setJumpscare(jLabel60);
                b2.setLobbyapagado(jLabel61);
                b2.setEstatica(jLabel62);
                b2.setNewGame(NewGame);

                r.start();

                jLabel19.setForeground(Color.WHITE);
                jLabel19.setFont(jTextField2.getFont());
                jLabel19.setText("Night: " + Integer.toString(night));

                jLabel4.setIcon(jLabel63.getIcon());
                jLabel4.show(true);
                jLabel2.show(false);
                jLabel6.show(false);
                jLabel10.show(true);
                jLabel14.show(true);
                jLabel16.show(true);
                jLabel9.show(true);
                jLabel47.show(true);
                jLabel46.show(true);
                jLabel48.show(true);
                jLabel19.show(true);
                jLabel18.show(true);
                jLabel54.show(true);

                for (JButton buton : botonList) {
                    buton.setVisible(true);
                }
                try {
                    //Esta es para el music box
                    FileInputStream direccion1 = new FileInputStream("C:/Users/Administrador/Downloads/PropyectoP2-master/PropyectoP2-master/src/proyectoprogra2/fnaf-1-music-box.mp3");
                    Player p = new Player(direccion1);
                    b2.setP(p);
                    // esta es para los jumpscares generales 
                    FileInputStream direccion2 = new FileInputStream("C:/Users/Administrador/Downloads/PropyectoP2-master/PropyectoP2-master/src/proyectoprogra2/five-nights-at-freddys-full-scream-sound_2.mp3");
                    Player p2 = new Player(direccion2);
                    b2.setJump(p2);
                    // esta es para cuando se va la luz 
                    FileInputStream direccion3 = new FileInputStream("C:/Users/Administrador/Downloads/PropyectoP2-master/PropyectoP2-master/src/proyectoprogra2/powerdown.mp3");
                    Player p3 = new Player(direccion3);
                    b2.setBatdone(p3);

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Main.class
                            .getName()).log(Level.SEVERE, null, ex);

                } catch (JavaLayerException ex) {
                    Logger.getLogger(Main.class
                            .getName()).log(Level.SEVERE, null, ex);
                }

                NewGame.pack();
                NewGame.setModal(true);
                NewGame.setLocationRelativeTo(this);
                NewGame.setVisible(true);
            } else {

                b2.setPerdio(false);
                RelojEtc r = new RelojEtc(jLabel18, jTextField2);

                b2.setDif(b2.isDif());
                r.setHora(12);
                night = b2.getNight() + 1;

                b2.setBatte(5);

                jLabel54.setText(Integer.toString(b2.getBatte()));

                b2.setJlabel1(jLabel54);
                b2.setDif(Nightmare);
                b2.setJlabel1(jLabel54);
                b2.setBackground(jLabel4);
                b2.setNight(night);

                b2.setGameloss(jLabel59);
                b2.setJumpscare(jLabel60);
                b2.setLobbyapagado(jLabel61);
                b2.setEstatica(jLabel62);
                b2.setNewGame(NewGame);

                r.start();

                jLabel19.setForeground(Color.WHITE);
                jLabel19.setFont(jTextField2.getFont());
                jLabel19.setText("Night: " + Integer.toString(night));

                jLabel4.setIcon(jLabel63.getIcon());
                jLabel4.show(true);
                jLabel2.show(false);
                jLabel6.show(false);
                jLabel10.show(true);
                jLabel14.show(true);
                jLabel16.show(true);
                jLabel9.show(true);
                jLabel47.show(true);
                jLabel46.show(true);
                jLabel48.show(true);
                jLabel19.show(true);
                jLabel18.show(true);
                jLabel54.show(true);

                for (JButton buton : botonList) {
                    buton.setVisible(true);
                }
                try {
                    //Esta es para el music box
                    FileInputStream direccion1 = new FileInputStream("C:/Users/Administrador/Downloads/PropyectoP2-master/PropyectoP2-master/src/proyectoprogra2/fnaf-1-music-box.mp3");
                    Player p = new Player(direccion1);
                    b2.setP(p);
                    // esta es para los jumpscares generales 
                    FileInputStream direccion2 = new FileInputStream("C:/Users/Administrador/Downloads/PropyectoP2-master/PropyectoP2-master/src/proyectoprogra2/five-nights-at-freddys-full-scream-sound_2.mp3");
                    Player p2 = new Player(direccion2);
                    b2.setJump(p2);
                    // esta es para cuando se va la luz 
                    FileInputStream direccion3 = new FileInputStream("C:/Users/Administrador/Downloads/PropyectoP2-master/PropyectoP2-master/src/proyectoprogra2/powerdown.mp3");
                    Player p3 = new Player(direccion3);
                    b2.setBatdone(p3);

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Main.class
                            .getName()).log(Level.SEVERE, null, ex);

                } catch (JavaLayerException ex) {
                    Logger.getLogger(Main.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
                b.stop();
                b2.start();
                NewGame.pack();
                NewGame.setModal(true);
                NewGame.setLocationRelativeTo(this);
                NewGame.setVisible(true);
            }

        }

    }//GEN-LAST:event_jTextField5MouseClicked

    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    public void cam(String x, JLabel k) {
        if (monitorOpen) {
            jLabel31.setText(x);
            jLabel23.setIcon(k.getIcon());
            jLabel23.show(true);
        }
    }

    public int bate() {

        int contv = 0;

        if (monitorOpen) {
            contv++;
        }
        if (RightdoorClosed) {
            contv++;
        }
        if (LeftdoorClosed) {
            contv++;
        }
        if (RightLighton) {
            contv++;
        }
        if (LeftLighton) {
            contv++;
        }

        if (contv == 1) {
            jLabel48.setIcon(jLabel49.getIcon());
        } else if (contv == 2) {
            jLabel48.setIcon(jLabel50.getIcon());
        } else if (contv == 3) {
            jLabel48.setIcon(jLabel51.getIcon());
        } else if (contv == 4) {
            jLabel48.setIcon(jLabel52.getIcon());
        } else if (contv == 5) {
            jLabel48.setIcon(jLabel53.getIcon());
        } else {
            jLabel48.setIcon(null);
        }

        return contv;
    }

    private int cont = 1;
    private int cont3 = 1;
    private int cont2 = 1;
    private int cont4 = 1;
    private int cont5 = 1;
    private int cont6 = 0;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cam1A;
    private javax.swing.JButton Cam1B;
    private javax.swing.JButton Cam1C;
    private javax.swing.JButton Cam2A;
    private javax.swing.JButton Cam2B;
    private javax.swing.JButton Cam3;
    private javax.swing.JButton Cam4A;
    private javax.swing.JButton Cam4B;
    private javax.swing.JButton Cam5;
    private javax.swing.JButton Cam6;
    private javax.swing.JButton Cam7;
    private javax.swing.JTextField Ds_Extra;
    private javax.swing.JTextField Ds_Extra2;
    private javax.swing.JTextField Ds_Extra3;
    private javax.swing.JDialog LOGIN;
    private javax.swing.JDialog NewGame;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
