/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minijuegoslectogo.controladores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadAudios {

    private CtrlAudios ctrlAudio;

    private static final ExecutorService executor = Executors.newSingleThreadExecutor();

    public void reproducirSonidoAsync(String actual) {
        executor.submit(() -> {
            try {
                ctrlAudio.reproducirAudio_mp3("src/minijuegoslectogo/assets/sonidos/" + actual + ".mp3");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public void setCtrlAudio(CtrlAudios ctrlAudio) {
        this.ctrlAudio = ctrlAudio;
    }
    
    public void apagar(){
        executor.shutdown();
    }

}
