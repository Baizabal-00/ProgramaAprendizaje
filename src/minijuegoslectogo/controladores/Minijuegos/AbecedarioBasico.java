package minijuegoslectogo.controladores.Minijuegos;

import Modelos.Minijuegos;
import minijuegoslectogo.controladores.CtrlAudios;
import java.util.Random;
import minijuegoslectogo.vistas.VistaMiniAbecedario;

public class AbecedarioBasico implements Minijuegos{
    
    private VistaMiniAbecedario objVista;
    private CtrlAudios ctrlAudio;
    private String[] abecedario = {"A", "B", "C", "D", "E", "F", "G", "H", "I",
        "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", 
        "W", "X", "Y", "Z"};
    private String letraActual;
    private String ptn;
    private int ptnInt;

    public AbecedarioBasico() {
        ctrlAudio = new CtrlAudios();
    }
    
    public String inicializador() {
        Random random = new Random();
        letraActual = abecedario[random.nextInt(abecedario.length)];
        ctrlAudio.reproducirAudio_mp3("src/minijuegoslectogo/assets/sonidos/" + letraActual + ".mp3");
        System.err.println(letraActual);
        return  letraActual;
    }
    
    @Override
    public void puntuacion() {
        ptn = objVista.labelPuntuacion.getText();
        ptnInt = Integer.parseInt(ptn);
        ptnInt++;
        ptn = String.valueOf(ptnInt);
        objVista.labelPuntuacion.setText(ptn);
    }

    public void setObjVista(VistaMiniAbecedario objVista) {
        this.objVista = objVista;
    }
    
    
}
