package minijuegoslectogo.controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import minijuegoslectogo.vistas.VistaMenuMinijuegos;
import minijuegoslectogo.vistas.VistaMenuPrincipal;

public class CtrlVistaMenuPrincipal implements ActionListener {

    private VistaMenuPrincipal objMP;
    private VistaMenuMinijuegos objVMMJ;
    private CtrlAudios objAudio;
    private boolean v1 = false;
    String rutaGuias = "src/minijuegoslectogo/assets/sonidos/guias/";

    public CtrlVistaMenuPrincipal(VistaMenuPrincipal objMP) {
        this.objMP = objMP;
        objMP.btnMinijuegos.addActionListener(this);
        objMP.btnPuntuacion.addActionListener(this);
        objMP.btnSalir.addActionListener(this);
        objMP.btnSonidoMinijuegos.addActionListener(this);
        objMP.btnSonidoPuntuacion.addActionListener(this);
        objMP.btnSonidoSalir.addActionListener(this);
        objMP.btnGuiaLarga.addActionListener(this);
        objMP.btnLectoGo.addActionListener(this);
        objAudio = new CtrlAudios();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == objMP.btnGuiaLarga) {
            objAudio.reproducirAudio_mp3(rutaGuias + "GuiaMenuPrincipal.mp3");
        }

        if (e.getSource() == objMP.btnLectoGo) {
            objAudio.reproducirAudio_mp3(rutaGuias + "LectoGo.mp3");
        }

        if (e.getSource() == objMP.btnSonidoMinijuegos) {
            objAudio.reproducirAudio_mp3(rutaGuias + "MiniJuegos.mp3");

        }

        if (e.getSource() == objMP.btnSonidoPuntuacion) {
            objAudio.reproducirAudio_mp3(rutaGuias + "Puntuacion.mp3");
        }

        if (e.getSource() == objMP.btnSonidoSalir) {
            objAudio.reproducirAudio_mp3(rutaGuias + "Salir.mp3");

        }

        if (e.getSource() == objMP.btnPuntuacion) {
            System.out.println("Tu puntuacion es de mas de 9000!");
        }

        if (e.getSource() == objMP.btnMinijuegos) {
            objVMMJ = new VistaMenuMinijuegos();
            objVMMJ.setVisible(true);
            objVMMJ.setLocation(500, 30);
            objMP.dispose();

        }

        if (e.getSource() == objMP.btnSalir) {
            objMP.dispose();
        }

        if (v1 == true) {
            objAudio.reproducirAudio_mp3(rutaGuias + "GuiaMenuPrincipal.mp3");
            v1 = false;
        }
    }

}
