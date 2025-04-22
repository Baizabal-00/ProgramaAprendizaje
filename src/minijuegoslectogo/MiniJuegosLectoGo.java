package minijuegoslectogo;

import minijuegoslectogo.controladores.CtrlAudios;
import minijuegoslectogo.vistas.VistaMenuPrincipal;
import minijuegoslectogo.vistas.VistaMiniAbecedario;

public class MiniJuegosLectoGo {

    public static void main(String[] args) {
        
       // VistaMiniAbecedario abc = new VistaMiniAbecedario();
        //abc.setVisible(true);
        //abc.setLocation(500, 30);

        VistaMenuPrincipal objMnu = new VistaMenuPrincipal();
        objMnu.setVisible(true);
        objMnu.setLocation(500, 30);
        CtrlAudios objAudio = new  CtrlAudios();
        //objAudio.reproducirAudio_mp3("src/minijuegoslectogo/assets/sonidos/guias/GuiaMenuPrincipal.mp3");

    }

}
