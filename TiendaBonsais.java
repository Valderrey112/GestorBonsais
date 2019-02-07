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
    
    /**
     * Metodo que devuelve un String con cada objeto del ArrayList, una en cada linea.
     */
    public String getListaBonsais() {
        String cadena = "";
        for (Bonsais bonsai: listaBonsais) {
            cadena += bonsai.getCaracteristicas() + "\n";
        }
        return cadena;
    }
    
    /**
     * Metodo que devuelve un String con cada objeto del ArrayList, una en cada linea y ordenadas por años que tiene el bonsai.
     */
    public String getListaBonsaisOrdenados() {
        String cadena = "";
        int contadorLento = 0;
        if (listaBonsais.size() > 0) {
            while (contadorLento< listaBonsais.size()) {
                int contadorRapido = contadorLento + 1;
                while (contadorRapido< listaBonsais.size()) {
                    Bonsais añoTemporal;
                    if (listaBonsais.get(contadorRapido).getAños()>= listaBonsais.get(contadorLento).getAños()) {
                        añoTemporal = listaBonsais.get(contadorRapido);
                        listaBonsais.set(contadorRapido, listaBonsais.get(contadorLento));
                        listaBonsais.set(contadorLento, añoTemporal);
                    }
                    contadorRapido++;
                }
                contadorLento++;
            }
            for (Bonsais bonsai: listaBonsais) {
                cadena += bonsai.getCaracteristicas() + "\n";
            }
        }
        return cadena;
    }
    
    /**
     * Metodo que devuelve un String con cada objeto del ArrayList, una en cada linea y ordenadas por tamaños, siempre y cuando tengan la hoja perenne.
     */
    public String getListaBonsaisOrdenadosConCondicion() {
        String cadena = "";
        int contadorLento = 0;
        if (listaBonsais.size() > 0) {
            while (contadorLento< listaBonsais.size()) {
                int contadorRapido = contadorLento + 1;
                while (contadorRapido< listaBonsais.size()) {
                    Bonsais tamañoTemporal;
                    if (listaBonsais.get(contadorRapido).getTamaños()>= listaBonsais.get(contadorLento).getAños()) {
                        tamañoTemporal = listaBonsais.get(contadorRapido);
                        listaBonsais.set(contadorRapido, listaBonsais.get(contadorLento));
                        listaBonsais.set(contadorLento, tamañoTemporal);
                    }
                    contadorRapido++;
                }
                contadorLento++;
            }
            for (Bonsais bonsai: listaBonsais) {
                cadena += bonsai.getCaracteristicas() + "\n";
            }
        }
        return cadena;
    }
}
