package minijuegoslectogo.controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import minijuegoslectogo.controladores.Minijuegos.ImagenesYPalabras;
import minijuegoslectogo.vistas.VistaMenuMinijuegos;
import minijuegoslectogo.vistas.VistaMiniImagenesYPalabras;

public class CtrlVistaImagenesYPalabras implements ActionListener {

    private ColocadorImagenes colocador;
    private VistaMiniImagenesYPalabras objVistaIYP;
    private ImagenesYPalabras objMiniIYP;
    private ArrayList palabras;
    private VistaMenuMinijuegos objVMJ;
    private boolean basic = true, verify, verify2, verifyInit;

    public CtrlVistaImagenesYPalabras(VistaMiniImagenesYPalabras objVistaIYP) {
        this.objVistaIYP = objVistaIYP;
        objVistaIYP.btnOpcionA.addActionListener(this);
        objVistaIYP.btnOpcionB.addActionListener(this);
        objVistaIYP.btnOpcionC.addActionListener(this);
        objVistaIYP.btnOpcionD.addActionListener(this);
        objVistaIYP.btnSalir.addActionListener(this);
        objVistaIYP.btnIniciar.addActionListener(this);
        colocador = new ColocadorImagenes();
        objMiniIYP = new ImagenesYPalabras();
        objMiniIYP.setObjIYP(objVistaIYP);
        palabras = new ArrayList();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        verify = false;
        verify2 = false;

        if (e.getSource() == objVistaIYP.btnIniciar) {
            verify = true;
            verifyInit = true;
            objVistaIYP.labelPuntuacion.setText("00");
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
        }

        objMiniIYP.colocarImagenes();
        palabras.clear();
        palabras = objMiniIYP.getPalabras();
        if (verify && verify2 == true) {
            objMiniIYP.puntuacion();
        }
    }

    public void verificarBasic(String palabra) {
        if (basic == true) {
            if (palabra.equals(objMiniIYP.getPalabraActual())) {
                verify = true;
                verify2 = true;
            } else {
                verify = true;
                objVistaIYP.labelPuntuacion.setText("00");
            }
        }

    }

}
