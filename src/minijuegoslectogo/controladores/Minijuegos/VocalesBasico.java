package minijuegoslectogo.controladores.Minijuegos;

import Modelos.Minijuegos;
import minijuegoslectogo.controladores.CtrlAudios;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import minijuegoslectogo.vistas.VistaMiniVocales;

public class VocalesBasico implements Minijuegos {

    private VistaMiniVocales objVista;
    private CtrlAudios ctrlAudio;
    private String[] vocales = {"A", "E", "I", "O", "U"};
    private String letraActual;
    private Random random;
    private int ptnInt;
    private String ptn;

    public VocalesBasico() {
        ctrlAudio = new CtrlAudios();
        random = new Random();
        
    }

    @Override
    public String inicializador() {
        letraActual = vocales[random.nextInt(vocales.length)];
        System.err.println(letraActual);
        ctrlAudio.reproducirAudio_mp3("src/minijuegoslectogo/assets/sonidos/" + letraActual + ".mp3");
        System.err.println(letraActual);
        return letraActual;
    }

    @Override
    public void puntuacion() {
        ptn = objVista.labelPuntuacion.getText();
        ptnInt = Integer.parseInt(ptn);
        ptnInt++;
        ptn = String.valueOf(ptnInt);
        objVista.labelPuntuacion.setText(ptn);

    }

    @Override
    public void derrota() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setObjVista(VistaMiniVocales objVista) {
        this.objVista = objVista;
    }

}
