package minijuegoslectogo.controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import minijuegoslectogo.controladores.Minijuegos.ImagenesYPalabras;
import minijuegoslectogo.vistas.VistaMenuMinijuegos;
import minijuegoslectogo.vistas.VistaMiniImagenesYPalabra;

public class CtrlVistaImagenesYPalabras implements ActionListener {

    private ColocadorImagenes colocador;
    private VistaMiniImagenesYPalabra objVistaIYP;
    private ImagenesYPalabras objMiniIYP;
    private ArrayList palabras;
    private VistaMenuMinijuegos objVMJ;
    private boolean basic = false, verify, verify2, verifyInit;
    private ThreadAudios objTh;
    private CtrlAudios objAudi;
    private Timer timer;
    private int tiempoRestante;

    public CtrlVistaImagenesYPalabras(VistaMiniImagenesYPalabra objVistaIYP) {
        this.objVistaIYP = objVistaIYP;
        objVistaIYP.btnOpcionA.addActionListener(this);
        objVistaIYP.btnOpcionB.addActionListener(this);
        objVistaIYP.btnOpcionC.addActionListener(this);
        objVistaIYP.btnOpcionD.addActionListener(this);
        objVistaIYP.btnSalir.addActionListener(this);
        objVistaIYP.btnIniciar.addActionListener(this);
        objVistaIYP.btnRepetirSonido.addActionListener(this);
        objVistaIYP.btnAyuda.addActionListener(this);
        colocador = new ColocadorImagenes();
        objMiniIYP = new ImagenesYPalabras();
        objMiniIYP.setObjIYP(objVistaIYP);
        palabras = new ArrayList();
        objAudi = new CtrlAudios();
        objTh = new ThreadAudios();
        objTh.setCtrlAudio(objAudi);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == objVistaIYP.btnAyuda){
            objVistaIYP.btnAyuda.setEnabled(false);
            objAudi.reproducirAudio_mp3("src/minijuegoslectogo/assets/sonidos/ImagenesYpalabras.mp3");
            objVistaIYP.btnAyuda.setEnabled(true);
        }
        
        
        if(e.getSource() == objVistaIYP.btnRepetirSonido){
            
        }

        verify = false;
        verify2 = false;

        if (e.getSource() == objVistaIYP.btnIniciar) {
            basic=true;
            verify = true;
            verifyInit = true;
            objVistaIYP.labelPuntuacion.setText("00");
            iniciarCronometro();
            objVistaIYP.btnIniciar.setEnabled(false);
        }

        if (e.getSource().equals(objVistaIYP.btnOpcionA)) {
                verificarBasic(objVistaIYP.btnOpcionA.getText());
            
        }

        if (e.getSource() == objVistaIYP.btnOpcionB) {
                verificarBasic(objVistaIYP.btnOpcionB.getText());
            
        }

        if (e.getSource() == objVistaIYP.btnOpcionC) {
                verificarBasic(objVistaIYP.btnOpcionC.getText());
            
        }

        if (e.getSource() == objVistaIYP.btnOpcionD) {
                verificarBasic(objVistaIYP.btnOpcionD.getText());
            
        }

        if (e.getSource() == objVistaIYP.btnSalir) {
            objVMJ = new VistaMenuMinijuegos();
            objVMJ.setVisible(true);
            objVMJ.setLocation(500, 30);
            objVistaIYP.dispose();
            timer.stop();
        }
        
        if(basic == true){
        objMiniIYP.colocarImagenes();
        palabras.clear();
        palabras = objMiniIYP.getPalabras();
        }
        if (verify && verify2 == true) {
            objMiniIYP.puntuacion();
        }
    }

    public void verificarBasic(String palabra) {
        if (basic == true) {
            if (palabra.equals(objMiniIYP.getPalabraActual())) {
                verify = true;
                verify2 = true;
                objTh.reproducirSonidoAsync("coin");
            } else {
                verify = true;
                objVistaIYP.labelPuntuacion.setText("00");
                objTh.reproducirSonidoAsync("wind");
            }
        }

    }
    
    public void iniciarCronometro() {
        tiempoRestante = 60;
        objVistaIYP.cronometroLabel.setText(String.valueOf(tiempoRestante));

        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tiempoRestante--;
                objVistaIYP.cronometroLabel.setText(String.valueOf(tiempoRestante));

                if (tiempoRestante <= 0) {
                    timer.stop();

                    String puntaje = objVistaIYP.labelPuntuacion.getText();
                    JOptionPane.showMessageDialog(objVistaIYP, "¡Tiempo agotado!\nTu puntuación fue: " + puntaje);

                    objVMJ = new VistaMenuMinijuegos();
                    objVMJ.setVisible(true);
                    objVMJ.setLocation(500, 30);
                    objVistaIYP.dispose();
                }
            }
        });

        timer.start();
    }

}
