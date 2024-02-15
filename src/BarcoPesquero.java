
import javax.swing.JOptionPane;


public final class BarcoPesquero extends Barco {

    private int pecesCapturados;
    private TipoPesquero tipo;

    public BarcoPesquero(String nombre, TipoPesquero tipo){
        super(nombre);
        this.pecesCapturados = 0;
        this.tipo = tipo;

    }

    @Override
    public void agregarElemento() {
        pecesCapturados += 1;
        JOptionPane.showMessageDialog(null, "El barco se encuentro con "+ pecesCapturados +"peces capturados actualmente.");
    }

    @Override
    public double vaciarCobrar() {
        double total = pecesCapturados * tipo.price;
        pecesCapturados = 0;
        return total;
    }

    @Override
    public double precioElemento() {
        return tipo.price;
    }
    

}
