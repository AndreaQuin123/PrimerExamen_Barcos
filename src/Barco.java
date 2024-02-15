import java.util.Calendar;

public abstract class Barco {

    private String nombre;
    private Calendar fecha;

    public Barco(String nombre) {
        this.nombre = nombre;
        Calendar today = Calendar.getInstance();
        this.fecha = today;

    }


    public final String getNombre() {
        return nombre;
    }

    public final Calendar getFecha() {
        return fecha;
    }

    @Override
    public String toString(){
        return "Nombre: "+nombre;
    }
    
    public abstract void agregarElemento();
    
    public abstract double vaciarCobrar();
    
    public abstract double precioElemento();
   
}

