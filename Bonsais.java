/**
 * Write a description of class Bonsais here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bonsais
{
    // instance variables - replace the example below with your own
    private String clase;
    private boolean hojaPerenne;
    private int años;
    private double tamaño;
    private int numId;
    
    /**
     * Constructor for objects of class Bonsais
     */
    public Bonsais(String claseBonsai, boolean tienePerenne, int añosBonsai, double tamañoBonsai, int numIdentificador)
    {
        clase = claseBonsai;
        hojaPerenne = tienePerenne;
        años = añosBonsai;
        tamaño = tamañoBonsai;
        numId = numIdentificador;
    }
    
    public String getClase () {
        return clase;
    }
    
    public void setClase (String nuevaClase) {
        clase = nuevaClase;
    }
    
    public boolean gethojaPerenne () {
        return hojaPerenne ;
    }
    
    public void setHoja (boolean nuevaHoja) {
        hojaPerenne = nuevaHoja;
    }
    
    public int getAños () {
        return años;
    }
    
    public void setAños (int nuevoAño) {
        años = nuevoAño;
    }
    
    public double getTamaño () {
        return tamaño;
    }
    
    public void setHoja (double nuevoTamaño) {
        tamaño = nuevoTamaño;
    }
    
    public int getNumId() {
        return numId;
    }
    
    public String getCaracteristicas() {
        String caracteristicas = "";
        if (hojaPerenne) {
            caracteristicas =  numId + ". " + clase + " de " + tamaño + " cm de alto, tiene " + años + " años y es de hoja perenne";
        }
         if (!hojaPerenne) {
            caracteristicas = numId + ". " + clase + " de " + tamaño + " cm de alto, tiene " + años + " años y no es de hoja perenne";
        }
        return caracteristicas;
    }
    
}
