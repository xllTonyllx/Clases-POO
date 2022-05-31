package exfabrica;
import java.util.ArrayList;
public class Principal {

    public static void main(String[] args) {

        Fabrica f = new Fabrica();
        cargarFabrica(f);
        
        // Listar todo
        //f.listarInstrumentos();
        
        // Listar por tipo
        //ArrayList<Instrumento> lista = f.instrumentosPorTipo(TipoInstrumento.VIENTO);
        //for (Instrumento instrumento : lista) {
        //    System.out.println(instrumento);
        //}
        
        Instrumento borrado = f.borrarInstrumento("VXCBE2");
        System.out.println("Se borró: " + borrado);
        f.listarInstrumentos();
    }
    
    private static void cargarFabrica(Fabrica f) {
        Sucursal s1 = new Sucursal("Sucursal A");
        Sucursal s2 = new Sucursal("Sucursal B");

        s1.agregarInstrumento(new Instrumento("ABC123", 13214, TipoInstrumento.CUERDA));
        s1.agregarInstrumento(new Instrumento("BCD456", 13432, TipoInstrumento.VIENTO));
        s1.agregarInstrumento(new Instrumento("DEF567", 15464, TipoInstrumento.PERCUSION));

        s2.agregarInstrumento(new Instrumento("ASD353", 52432, TipoInstrumento.CUERDA));
        s2.agregarInstrumento(new Instrumento("VXCBE2", 45645, TipoInstrumento.VIENTO));

        f.agregarSucursal(s1);
        f.agregarSucursal(s2);
    }
}
