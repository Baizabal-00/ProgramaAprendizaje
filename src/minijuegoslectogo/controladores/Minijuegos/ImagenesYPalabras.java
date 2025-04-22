package minijuegoslectogo.controladores.Minijuegos;

import Modelos.Minijuegos;
import Modelos.MinijuegosImagenes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import minijuegoslectogo.controladores.ColocadorImagenes;
import minijuegoslectogo.vistas.VistaMiniImagenesYPalabras;

public class ImagenesYPalabras implements Minijuegos, MinijuegosImagenes {

    private String[] palabras = {"Almohada", "Armario", "Aspiradora", "Cama", "Computadora", "Cortina", "Cubiertos", "Espejo",
        "Estufa", "Lampara", "Lavadora", "Licuadora", "Mesa", "Microondas", "Persiana", "Plancha", "Plato", "Radio", "Refrigerador",
        "Reloj", "Secadora", "Silla", "Sofa", "Taza", "Telefono", "Television", "Tendedero", "Tenedor", "Toalla", "Ventilador"
    };
    private Random random;
    private String palabraActual;
    private ArrayList<String> palabrasActuales, Palabras;
    private VistaMiniImagenesYPalabras objIYP;
    private ColocadorImagenes objCI;
    private int ptnInt;
    private String ptn;

    public ImagenesYPalabras() {
        objCI = new ColocadorImagenes();

        random = new Random();
    }

    @Override
    public String inicializador() {
        palabraActual = palabras[random.nextInt(palabras.length)];
        return palabraActual;
    }
    
    @Override
    public void puntuacion() {
        ptn = objIYP.labelPuntuacion.getText();
        ptnInt = Integer.parseInt(ptn);
        ptnInt++;
        ptn = String.valueOf(ptnInt);
        objIYP.labelPuntuacion.setText(ptn);
    }

    public ArrayList alAzar() {
        palabrasActuales = new ArrayList();
        for (int i = 0; i < 4; i++) {
            palabrasActuales.add(inicializador());
        }
        return palabrasActuales;
    }
    
    @Override
    public void colocarImagenes() {
        Palabras = new ArrayList();
        Palabras = alAzar();

        List<Integer> indices = Arrays.asList(0, 1, 2, 3);
        Collections.shuffle(indices);

        for (int i = 0; i < Palabras.size(); i++) {
            int index = indices.get(i);
            String palabra = Palabras.get(i);

            switch (index) {
                case 0:
                    objIYP.btnOpcionA.setText(palabra);
                    break;
                case 1:
                    objIYP.btnOpcionB.setText(palabra);
                    break;
                case 2:
                    objIYP.btnOpcionC.setText(palabra);
                    break;
                case 3:
                    objIYP.btnOpcionD.setText(palabra);
                    break;
            }
        }

        objCI.setImage(objIYP.Imagenes, "src/minijuegoslectogo/assets/imagenes/hogar/" + palabraActual + ".png");
    }

    public void setObjIYP(VistaMiniImagenesYPalabras objIYP) {
        this.objIYP = objIYP;
    }

    public String getPalabraActual() {
        return palabraActual;
    }

    public ArrayList<String> getPalabras() {
        return Palabras;
    }

}
