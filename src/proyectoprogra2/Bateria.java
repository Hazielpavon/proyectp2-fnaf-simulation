/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra2;

import java.applet.AudioClip;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javazoom.jl.player.Player;

public class Bateria extends Thread {

    private JLabel jlabel1;
    private int cont = 0;
    private int batte = 2;
    private boolean dif;
    private int night;
    private boolean specialNight;
    private int bats;
    private boolean battdrain;
    private JLabel background;
    private JLabel gameloss;
    private JLabel jumpscare;
    private JLabel Lobbyapagado;
    private JDialog NewGame;
    private JLabel estatica;
    private boolean perdio;
    private ArrayList<JLabel> lsta = new ArrayList();
    private ArrayList<JButton> lista = new ArrayList();
    private Player p;
    private Player jump;
    private Player batdone;
    private boolean continuegame;
    
    

    public Bateria(JLabel gameloss, JLabel jumpscare, JLabel background) {
        this.gameloss = gameloss;
        this.jumpscare = jumpscare;
        this.background = background;
    }

    public Bateria() {
    }

    public boolean isContinuegame() {
        return continuegame;
    }

    public void setContinuegame(boolean continuegame) {
        this.continuegame = continuegame;
    }

    public Player getJump() {
        return jump;
    }

    public void setJump(Player jump) {
        this.jump = jump;
    }

    public Player getBatdone() {
        return batdone;
    }

    public void setBatdone(Player batdone) {
        this.batdone = batdone;
    }

    public Player getP() {
        return p;
    }

    public void setP(Player p) {
        this.p = p;
    }

    public ArrayList<JButton> getLista() {
        return lista;
    }

    public void setLista(ArrayList<JButton> lista) {
        this.lista = lista;
    }

    public JLabel getEstatica() {
        return estatica;
    }

    public void setEstatica(JLabel estatica) {
        this.estatica = estatica;
    }

    public JDialog getNewGame() {
        return NewGame;
    }

    public boolean isPerdio() {
        return perdio;
    }

    public void setPerdio(boolean perdio) {
        this.perdio = perdio = false;
    }

    public void setNewGame(JDialog NewGame) {
        this.NewGame = NewGame;
    }

    public void setLsta(ArrayList<JLabel> lsta) {
        this.lsta = lsta;
    }

    public JLabel getLobbyapagado() {
        return Lobbyapagado;
    }

    public void setLobbyapagado(JLabel Lobbyapagado) {
        this.Lobbyapagado = Lobbyapagado;
    }

    public ArrayList<JLabel> getLsta() {
        return lsta;
    }

    public boolean isSpecialNight() {
        return specialNight;
    }

    public void setSpecialNight(boolean specialNight) {
        this.specialNight = specialNight;
    }

    public boolean isBattdrain() {
        return battdrain;
    }

    public void setBattdrain(boolean battdrain) {
        this.battdrain = battdrain;
    }

    public int getNight() {
        return night;
    }

    public void setNight(int night) {
        this.night = night;
    }

    public boolean isDif() {

        return dif;
    }

    public int getBatte() {
        return batte;
    }

    public void setBatte(int batte) {
        this.batte = batte;
    }

    public void setDif(boolean dif) {
        this.dif = dif;
    }

    public JLabel getJlabel1() {
        return jlabel1;
    }

    public void setJlabel1(JLabel jlabel1) {
        this.jlabel1 = jlabel1;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public int getBats() {
        return bats;
    }

    public void setBats(int bats) {
        this.bats = bats;
    }

    public JLabel getBackground() {
        return background;
    }

    public void setBackground(JLabel background) {
        this.background = background;
    }

    public JLabel getGameloss() {
        return gameloss;
    }

    public void setGameloss(JLabel gameloss) {
        this.gameloss = gameloss;
    }

    public JLabel getJumpscare() {
        return jumpscare;
    }

    public void setJumpscare(JLabel jumpscare) {
        this.jumpscare = jumpscare;
    }

    @Override
    public void run() {
        while (!perdio) {

            if (night == 1) {
                vali();
                jlabel1.setForeground(Color.white);
                jlabel1.setText(Integer.toString(batte) + " %");
                try {
                    Thread.sleep(6000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (night == 2) {
                vali();
                jlabel1.setForeground(Color.white);
                jlabel1.setText(Integer.toString(batte) + " %");
                try {
                    Thread.sleep(5000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (night == 3) {
                vali();
                jlabel1.setForeground(Color.white);
                jlabel1.setText(Integer.toString(batte) + " %");
                try {
                    Thread.sleep(4000);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else if (night == 4) {
                vali();

                jlabel1.setForeground(Color.white);
                jlabel1.setText(Integer.toString(batte) + " %");

                try {
                    Thread.sleep(4000);
                } catch (Exception e) {
                    e.printStackTrace();

                }

            } else if (specialNight) {
                if (battdrain) {
                    if (cont == 1) {
                        batte = batte - 1;
                    } else if (cont == 2) {
                        batte = batte - 2;
                    } else if (cont == 3) {
                        batte = batte - 3;
                    } else if (cont == 4) {
                        batte = batte - 4;
                    } else if (cont == 5) {
                        batte = batte - 5;
                    }

                    jlabel1.setForeground(Color.white);
                    jlabel1.setText(Integer.toString(batte) + " %");

                    try {
                        Thread.sleep(bats);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    jlabel1.setForeground(Color.white);
                    jlabel1.setText(Integer.toString(batte) + " %");
                }
            }
            if (batte < 0 || batte == 0) {

                for (JLabel label : lsta) {
                    label.setVisible(false);
                }
                for (JButton buton : lista) {
                    buton.setVisible(false);
                }
                try {
                    background.setIcon(Lobbyapagado.getIcon());
                    batdone.play();
                    Thread.sleep(3000);
                } catch (Exception e) {
                } finally {
                    try {
                        batdone.close();
                        background.setIcon(gameloss.getIcon());
                        p.play();
                        Thread.sleep(350);

                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {

                        try {
                            p.close();
                            background.setIcon(Lobbyapagado.getIcon());
                            Thread.sleep(6000);
                        } catch (Exception e) {
                        } finally {
                            try {
                                background.setIcon(jumpscare.getIcon());
                                Thread.sleep(400);
                                background.setIcon(estatica.getIcon());
                                jump.play();
                            } catch (Exception e) {
                                e.printStackTrace();
                            } finally {
                                try {
                                    background.setIcon(estatica.getIcon());
                                    Thread.sleep(5000);
                                } catch (Exception e) {
                                    e.printStackTrace();

                                } finally {
                                    NewGame.show(false);
                                    perdio = true;
                                }
                            }
                        }
                    }

                }
            }
        }
    }

    public void vali() {
        if (dif) {
            if (cont == 0) {
                batte = batte - 1;
            } else if (cont == 1) {
                batte = batte - 1;
            } else if (cont == 2) {
                batte = batte - 2;
            } else if (cont == 3) {
                batte = batte - 3;
            } else if (cont == 4) {
                batte = batte - 4;
            } else if (cont == 5) {
                batte = batte - 5;
            } else if (batte < 0) {
                batte = 0;
            }

        } else {
            if (cont == 1) {
                batte = batte - 1;
            } else if (cont == 2) {
                batte = batte - 2;
            } else if (cont == 3) {
                batte = batte - 3;
            } else if (cont == 4) {
                batte = batte - 4;
            } else if (cont == 5) {
                batte = batte - 5;
            } else if (batte < 0) {
                batte = 0;
            }
        }
    }

}
