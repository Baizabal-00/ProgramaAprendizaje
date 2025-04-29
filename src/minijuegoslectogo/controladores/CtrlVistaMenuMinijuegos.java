package minijuegoslectogo.controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import minijuegoslectogo.vistas.VistaMenuMinijuegos;
import minijuegoslectogo.vistas.VistaMenuPrincipal;
import minijuegoslectogo.vistas.VistaMiniAbecedario;
import minijuegoslectogo.vistas.VistaMiniAhorcado;
import minijuegoslectogo.vistas.VistaMiniImagenesYPalabra;
import minijuegoslectogo.vistas.VistaMiniVocales;

public class CtrlVistaMenuMinijuegos implements ActionListener {

    private VistaMenuMinijuegos objMMJ;
    private VistaMiniVocales miniVocales;
    private VistaMiniAbecedario miniAbecedario;
    private VistaMiniImagenesYPalabra miniImYpa;
    private VistaMenuPrincipal objMnu;
    private CtrlAudios objAudi;
    private String ruta = "src/minijuegoslectogo/assets/sonidos/guias/";

    //Meliza aqui arriba agrega tus vistas e! instancialas en los 2 botones que te tocaron :)
    public CtrlVistaMenuMinijuegos(VistaMenuMinijuegos objMMJ) {
        this.objMMJ = objMMJ;
        objMMJ.btnVocales.addActionListener(this);
        objMMJ.btnAbecedario.addActionListener(this);
        objMMJ.btnAyuda.addActionListener(this);
        objMMJ.btnOrdYGan.addActionListener(this);
        objMMJ.btnImagenesYPalabras.addActionListener(this);
        objMMJ.btnSalir.addActionListener(this);
        objMMJ.sonidoAbecedario.addActionListener(this);
        objMMJ.sonidoImaYPal.addActionListener(this);
        objMMJ.sonidoOrdyGan.addActionListener(this);
        objMMJ.sonidoLecto.addActionListener(this);
        objMMJ.sonidoPalOcult.addActionListener(this);
        objMMJ.sonidoSalir.addActionListener(this);
        objMMJ.sonidoVocales.addActionListener(this);
        objAudi = new CtrlAudios();

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
            miniAbecedario = new VistaMiniAbecedario();
            miniAbecedario.setVisible(true);
            miniAbecedario.setLocation(500, 200);
            objMMJ.dispose();
        }

//Esta sdos son las tuyas meliza
        if (e.getSource() == objMMJ.btnOrdYGan) {
        }

        if (e.getSource() == objMMJ.sonidoPalOcult) {
        }

//Esta sdos son las tuyas meliza
        if (e.getSource() == objMMJ.btnImagenesYPalabras) {
            miniImYpa = new VistaMiniImagenesYPalabra();
            miniImYpa.setVisible(true);
            miniImYpa.setLocation(500, 200);
            objMMJ.dispose();
        }

        if (e.getSource() == objMMJ.btnSalir) {
            objMnu = new VistaMenuPrincipal();
            objMnu.setVisible(true);
            objMnu.setLocation(500, 30);
            objMMJ.dispose();
        }

        if (e.getSource() == objMMJ.sonidoAbecedario) {
            objAudi.reproducirAudio_mp3(ruta + "abecedario.mp3");
        }

        if (e.getSource() == objMMJ.sonidoImaYPal) {
            objAudi.reproducirAudio_mp3(ruta + "imagensYpalabras.mp3");
        }

        if (e.getSource() == objMMJ.sonidoLecto) {
            objAudi.reproducirAudio_mp3(ruta + "LectoGo.mp3");
        }

        if (e.getSource() == objMMJ.sonidoOrdyGan) {
            objAudi.reproducirAudio_mp3(ruta + "ordeanaYgana.mp3");
        }

        if (e.getSource() == objMMJ.sonidoPalOcult) {
            objAudi.reproducirAudio_mp3(ruta + "palOcult.mp3");
        }

        if (e.getSource() == objMMJ.sonidoSalir) {
            objAudi.reproducirAudio_mp3(ruta + "Salir.mp3");
        }

        if (e.getSource() == objMMJ.sonidoVocales) {
            System.out.println("hooolaaaaaaaaaaaaaa");
            objAudi.reproducirAudio_mp3(ruta + "Vocales.mp3");
        }

    }

}
