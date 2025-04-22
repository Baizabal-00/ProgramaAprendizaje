package minijuegoslectogo.controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import minijuegoslectogo.controladores.Minijuegos.VocalesBasico;
import minijuegoslectogo.vistas.VistaMenuMinijuegos;
import minijuegoslectogo.vistas.VistaMiniVocales;

public class CtrlVistaMiniVocales implements ActionListener {

    private VistaMiniVocales objVista;
    private VocalesBasico objBasico;
    private String actual, ptn;
    private int ptnInt, c=1;
    private boolean verifyInit, verify, verify2, basic = true;
    private CtrlAudios ctrlAudi;
    private VistaMenuMinijuegos objVMJ;
    private ColocadorImagenes objCI;

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
            if(c == 1){
            objCI.setImage(objVista.labelInicio, "src/minijuegoslectogo/assets/imagenes/vocales/ReIniciar.png");
            c=2;
            }
            objVista.labelPuntuacion.setText("00");
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
            objVista.dispose();

        }

        if (verifyInit == true) {
            if (verify == true) {
                if (basic == true) {
                    actual = objBasico.inicializador();
                } else {

                }
            }
            if (verify && verify2 == true) {
                objBasico.puntuacion();
            }

        }

    }

    

    public void verificarBasic(String letra) {
        if (basic == true) {
            if (letra == actual) {
                verify = true;
                verify2 = true;
            } else {
                verify = true;
                objVista.labelPuntuacion.setText("00");
            }
        } else {

        }

    }

}
