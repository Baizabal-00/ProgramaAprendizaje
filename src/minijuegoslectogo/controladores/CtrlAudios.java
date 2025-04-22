package minijuegoslectogo.controladores;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class CtrlAudios {
    
    public void reproducirAudio_mp3(String file){
        Player apl;
        
        try{
            apl = new Player(new FileInputStream(file));
            apl.play();
        }catch(FileNotFoundException | JavaLayerException e){
            
        }
    }
    
}
