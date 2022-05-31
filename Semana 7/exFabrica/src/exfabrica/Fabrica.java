package exfabrica;

import java.util.ArrayList;

public class Fabrica {

    private ArrayList<Sucursal> sucursales;

    public Fabrica() {
        this.sucursales = new ArrayList<>();
    }
    
    public Instrumento borrarInstrumento(String ID) {
        Instrumento borrado = null;
        int i = 0;
        while (i < sucursales.size() && borrado == null) {
            borrado = sucursales.get(i).borrarInstrumento(ID);
            i++;
        }
        return borrado;
    }
    
    public ArrayList<Instrumento> instrumentosPorTipo(TipoInstrumento tipo) {
        ArrayList<Instrumento> instEncontrados = new ArrayList<>();
        for (Sucursal sucursal : sucursales) {
            instEncontrados.addAll(sucursal.instrumentosPorTipo(tipo));
        }
        return instEncontrados;
    }
        
    public void listarInstrumentos() {
        for (Sucursal sucursal : sucursales) {
            System.out.println(sucursal.getNombre());
            sucursal.listarInstrumentos();
        }
    }
   
    public void agregarSucursal(Sucursal suc) {
        this.sucursales.add(suc);
    }
}
