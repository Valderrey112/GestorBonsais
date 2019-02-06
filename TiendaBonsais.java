import java.util.ArrayList;

/**
 * Write a description of class TiendaBonsais here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TiendaBonsais
{
    // instance variables - replace the example below with your own
    private int numId;
    private ArrayList<Bonsais> listaBonsais;

    /**
     * Constructor de la clase, nos creará el ArrayList
     */
    public TiendaBonsais()
    {
        listaBonsais = new ArrayList<Bonsais>();
        numId = 1;
    }

    /**
     * Metodo para añadir un nuevo objeto bonsai al ArrayList
     */
    public void setNuevoBonsai(String claseBonsai, boolean tienePerenne, int añosBonsai, double tamañoBonsai)
    {
        Bonsais nuevoBonsai = new Bonsais(claseBonsai, tienePerenne, añosBonsai, tamañoBonsai, numId);
        listaBonsais.add(nuevoBonsai);
        numId++;
    }
    
    public String getListaBonsais() {
        String cadena = "";
        for (Bonsais bonsai: listaBonsais) {
            cadena += bonsai.getCaracteristicas() + "\n";
        }
        return cadena;
    }
}
