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
    
    public boolean gethojaPerenne () {
        return hojaPerenne ;
    }
    
    public int getAños () {
        return años;
    }
    
    public double getTamaño () {
        return tamaño;
    }
    
    public int getNumId() {
        return numId;
    }
}
