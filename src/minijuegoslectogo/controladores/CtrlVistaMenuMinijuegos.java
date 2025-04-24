package minijuegoslectogo.controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import minijuegoslectogo.vistas.VistaMenuMinijuegos;
import minijuegoslectogo.vistas.VistaMenuPrincipal;
import minijuegoslectogo.vistas.VistaMiniAbecedario;
import minijuegoslectogo.vistas.VistaMiniAhorcado;
import minijuegoslectogo.vistas.VistaMiniImagenesYPalabras;
import minijuegoslectogo.vistas.VistaMiniVocales;

public class CtrlVistaMenuMinijuegos implements ActionListener {

    private VistaMenuMinijuegos objMMJ;
    private VistaMiniVocales miniVocales;


    public CtrlVistaMenuMinijuegos(VistaMenuMinijuegos objMMJ) {
        this.objMMJ = objMMJ;
        objMMJ.btnVocales.addActionListener(this);
        objMMJ.btnAbecedario.addActionListener(this);
        objMMJ.btnAhorcado.addActionListener(this);
        objMMJ.btnArrLasPal.addActionListener(this);
        objMMJ.btnCompletaLasOraciones.addActionListener(this);
        objMMJ.btnMelissa.addActionListener(this);
        objMMJ.btnMeliza.addActionListener(this);
        objMMJ.btnImagenesYPalabras.addActionListener(this);
        objMMJ.btnSalir.addActionListener(this);
     
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == objMMJ.btnVocales) {
            miniVocales = new VistaMiniVocales();
            miniVocales.setVisible(true);
            miniVocales.setLocation(500, 200);
            objMMJ.dispose();
        }

        if (e.getSource() == objMMJ.btnAbecedario) {
            VistaMiniAbecedario miniAbecedario = new VistaMiniAbecedario();
            miniAbecedario.setVisible(true);
            miniAbecedario.setLocation(500, 200);
            objMMJ.dispose();
        }

        if (e.getSource() == objMMJ.btnAhorcado) {
            VistaMiniAhorcado miniAhorcado = new VistaMiniAhorcado();
            miniAhorcado.setVisible(true);
            miniAhorcado.setLocation(500,200);
            objMMJ.dispose();
        }

        if (e.getSource() == objMMJ.btnArrLasPal) {
        }

        if (e.getSource() == objMMJ.btnCompletaLasOraciones) {
        }

        if (e.getSource() == objMMJ.btnImagenesYPalabras) {
            VistaMiniImagenesYPalabras miniImYpa = new VistaMiniImagenesYPalabras();
            miniImYpa.setVisible(true);
            miniImYpa.setLocation(500, 200);
            objMMJ.dispose();
        }

        if (e.getSource() == objMMJ.btnMelissa) {
        }

        if (e.getSource() == objMMJ.btnMeliza) {
        }

        if (e.getSource() == objMMJ.btnSalir) {
            VistaMenuPrincipal objMnu = new VistaMenuPrincipal();
            objMnu.setVisible(true);
            objMnu.setLocation(500, 30);
            objMMJ.dispose();
        }

    }

}
