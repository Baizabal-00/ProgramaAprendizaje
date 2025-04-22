package minijuegoslectogo.controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import minijuegoslectogo.controladores.Minijuegos.AbecedarioBasico;
import minijuegoslectogo.vistas.VistaMenuMinijuegos;
import minijuegoslectogo.vistas.VistaMiniAbecedario;
import minijuegoslectogo.vistas.VistaMiniVocales;

public class CtrlVistaMiniAbecedario implements ActionListener {

    private VistaMiniAbecedario objVista;
    private AbecedarioBasico objBasico;
    private String actual, ptn;
    private int ptnInt;
    private boolean verifyInit, verify, verify2, basic = true;
    private CtrlAudios ctrlAudi;
    private VistaMenuMinijuegos objVMJ;

    public CtrlVistaMiniAbecedario(VistaMiniAbecedario objVista) {
        this.objVista = objVista;
        objVista.btnA.addActionListener(this);
        objVista.btnB.addActionListener(this);
        objVista.btnC.addActionListener(this);
        objVista.btnD.addActionListener(this);
        objVista.btnE.addActionListener(this);
        objVista.btnF.addActionListener(this);
        objVista.btnG.addActionListener(this);
        objVista.btnH.addActionListener(this);
        objVista.btnI.addActionListener(this);
        objVista.btnJ.addActionListener(this);
        objVista.btnK.addActionListener(this);
        objVista.btnL.addActionListener(this);
        objVista.btnM.addActionListener(this);
        objVista.btnN.addActionListener(this);
        objVista.btnÑ.addActionListener(this);
        objVista.btnO.addActionListener(this);
        objVista.btnP.addActionListener(this);
        objVista.btnQ.addActionListener(this);
        objVista.btnR.addActionListener(this);
        objVista.btnS.addActionListener(this);
        objVista.btnT.addActionListener(this);
        objVista.btnU.addActionListener(this);
        objVista.btnV.addActionListener(this);
        objVista.btnW.addActionListener(this);
        objVista.btnX.addActionListener(this);
        objVista.btnY.addActionListener(this);
        objVista.btnZ.addActionListener(this);
        objVista.btnSalir.addActionListener(this);
        objVista.btnReiniciar.addActionListener(this);
        objVista.btnRepetir.addActionListener(this);
        objBasico = new AbecedarioBasico();
        objBasico.setObjVista(objVista);
        ctrlAudi = new CtrlAudios();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        verify = false;
        verify2 = false;

        if (e.getSource() == objVista.btnRepetir) {
            ctrlAudi.reproducirAudio_mp3("src/minijuegoslectogo/assets/sonidos/" + actual + ".mp3");
        }

        if (e.getSource() == objVista.btnReiniciar) {
            verify = true;
            verifyInit = true;
            objVista.labelPuntuacion.setText("00");
        }
        
        if(e.getSource() == objVista.btnA){
            verificar("A");
        }
        
        if(e.getSource() == objVista.btnB){
            verificar("B");
        }
        
        if(e.getSource() == objVista.btnC){
            verificar("C");
        }
        
        if(e.getSource() == objVista.btnD){
            verificar("D");
        }
        
        if(e.getSource() == objVista.btnE){
            verificar("E");
        }
        
        if(e.getSource() == objVista.btnF){
            verificar("F");
        }
        
        if(e.getSource() == objVista.btnG){
            verificar("G");
        }
        
        if(e.getSource() == objVista.btnH){
            verificar("H");
        }
        
        if(e.getSource() == objVista.btnI){
            verificar("I");
        }
        
        if(e.getSource() == objVista.btnJ){
            verificar("J");
        }
        
        if(e.getSource() == objVista.btnK){
            verificar("K");
        }
        
        if(e.getSource() == objVista.btnL){
            verificar("L");
        }
        
        if(e.getSource() == objVista.btnM){
            verificar("M");
        }
        
        if(e.getSource() == objVista.btnN){
            verificar("N");
        }
        
        if(e.getSource() == objVista.btnÑ){
            verificar("Ñ");
        }
        
        if(e.getSource() == objVista.btnO){
            verificar("O");
        }
        
        if(e.getSource() == objVista.btnP){
            verificar("P");
        }
        
        if(e.getSource() == objVista.btnQ){
            verificar("Q");
        }
        
        if(e.getSource() == objVista.btnR){
            verificar("R");
        }
        
        if(e.getSource() == objVista.btnS){
            verificar("S");
        }
        
        if(e.getSource() == objVista.btnT){
            verificar("T");
        }
        
        if(e.getSource() == objVista.btnU){
            verificar("U");
        }
        
        if(e.getSource() == objVista.btnV){
            verificar("V");
        }
        
        if(e.getSource() == objVista.btnW){
            verificar("W");
        }
        
        if(e.getSource() == objVista.btnX){
            verificar("X");
        }
        
        if(e.getSource() == objVista.btnY){
            verificar("Y");
        }
        
        if(e.getSource() == objVista.btnZ){
            verificar("Z");
        }
        
        if(e.getSource() == objVista.btnSalir){
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

    public void verificar(String letra) {
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
