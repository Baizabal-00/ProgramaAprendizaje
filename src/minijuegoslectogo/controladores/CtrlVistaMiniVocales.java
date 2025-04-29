package minijuegoslectogo.controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import minijuegoslectogo.controladores.Minijuegos.VocalesBasico;
import minijuegoslectogo.vistas.VistaMenuMinijuegos;
import minijuegoslectogo.vistas.VistaMiniVocales;

public class CtrlVistaMiniVocales implements ActionListener {

    private VistaMiniVocales objVista;
    private VocalesBasico objBasico;
    private String actual, ptn;
    private int ptnInt, c = 1;
    private boolean verifyInit, verify, verify2, basic = true;
    private CtrlAudios ctrlAudi;
    private VistaMenuMinijuegos objVMJ;
    private ColocadorImagenes objCI;
    private Timer timer;
    private int tiempoRestante = 30;
    private ThreadAudios audiTh;

    public CtrlVistaMiniVocales(VistaMiniVocales objVista) {
        this.objVista = objVista;
        objVista.btnLetraA.addActionListener(this);
        objVista.btnLetraE.addActionListener(this);
        objVista.btnLetraI.addActionListener(this);
        objVista.btnLetraO.addActionListener(this);
        objVista.btnLetraU.addActionListener(this);
        objVista.btnIniciar.addActionListener(this);
        objVista.btnRepetir.addActionListener(this);
        objVista.btnSalir.addActionListener(this);
        objBasico = new VocalesBasico();
        objBasico.setObjVista(objVista);
        ctrlAudi = new CtrlAudios();
        objCI = new ColocadorImagenes();
        audiTh = new ThreadAudios();
        audiTh.setCtrlAudio(ctrlAudi);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        verify = false;
        verify2 = false;

        if (e.getSource() == objVista.btnRepetir) {
            ctrlAudi.reproducirAudio_mp3("src/minijuegoslectogo/assets/sonidos/" + actual + ".mp3");
        }

        if (e.getSource() == objVista.btnIniciar) {
            verify = true;
            verifyInit = true;
            if (c == 1) {
                c = 2;
            }   
            iniciarCronometro();
            objVista.btnIniciar.setEnabled(false);
        }

        if (e.getSource() == objVista.btnLetraA) {
            verificarBasic("A");

        }

        if (e.getSource() == objVista.btnLetraE) {
            verificarBasic("E");

        }

        if (e.getSource() == objVista.btnLetraI) {
            verificarBasic("I");
        }

        if (e.getSource() == objVista.btnLetraO) {
            verificarBasic("O");
        }

        if (e.getSource() == objVista.btnLetraU) {
            verificarBasic("U");
        }

        if (e.getSource() == objVista.btnSalir) {
            objVMJ = new VistaMenuMinijuegos();
            objVMJ.setVisible(true);
            objVMJ.setLocation(500, 30);
            if(c==2){
            timer.stop();
            }
            objVista.dispose();

        }

        if (verifyInit == true) {
            if (verify == true) {
                if (basic == true) {
                    actual = objBasico.inicializador();
                }
            }
            if (verify == true && verify2 == true) {
                objBasico.puntuacion();

            }

        }

    }

    public void verificarBasic(String letra) {
        if (basic == true) {
            if (letra == actual) {
                audiTh.reproducirSonidoAsync("coin");
                verify = true;
                verify2 = true;
            } else {
                audiTh.reproducirSonidoAsync("wind");
                verify = true;
                objVista.labelPuntuacion.setText("00");
            }
        } else {

        }

    }
    
    public void iniciarCronometro() {
    tiempoRestante = 30;
    objVista.cronometroLabel.setText(String.valueOf(tiempoRestante));

    timer = new Timer(1000, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            tiempoRestante--;
            objVista.cronometroLabel.setText(String.valueOf(tiempoRestante));

            if (tiempoRestante <= 0) {
                timer.stop();

                // Desactivar botones
                objVista.btnLetraA.setEnabled(false);
                objVista.btnLetraE.setEnabled(false);
                objVista.btnLetraI.setEnabled(false);
                objVista.btnLetraO.setEnabled(false);
                objVista.btnLetraU.setEnabled(false);
                objVista.btnIniciar.setEnabled(false);
                objVista.btnRepetir.setEnabled(false);

               
                String puntaje = objVista.labelPuntuacion.getText(); 
                JOptionPane.showMessageDialog(objVista, "¡Tiempo agotado!\nTu puntuación fue: " + puntaje);

                
                objVMJ = new VistaMenuMinijuegos();
                objVMJ.setVisible(true);
                objVMJ.setLocation(500, 30);
                objVista.dispose();
            }
        }
    });

    timer.start();
}

}
