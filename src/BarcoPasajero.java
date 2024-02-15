
import javax.swing.JOptionPane;


/**
 * @author vanes
 */
public final class BarcoPasajero extends Barco{
    private String[] nombresPasajeros;
    private double precioBoleto;
    private int contadorPasajero;
    
    public BarcoPasajero(String nombre, double precioBoleto, int limite){
        super(nombre);
        this.nombresPasajeros=new String[limite];
        this.precioBoleto = precioBoleto;
        this.contadorPasajero = 0;
        
    }
    
    
    public final String[] getNombresPasajeros() {
        return nombresPasajeros;
    }    
    
    @Override
    public void agregarElemento(){
        
        if (contadorPasajero < nombresPasajeros.length) {
            String pasajero = JOptionPane.showInputDialog(null, "Por favor, inserte el nombre del pasajero.");
            nombresPasajeros[contadorPasajero] = pasajero;
            contadorPasajero++;
                        JOptionPane.showMessageDialog(null, "¡Pasajero agregado de manera exitosa!");

            
        } else {
            
            JOptionPane.showMessageDialog(null, "Ya no se encuentra espacio en el barco para agregar otro pasajero.");
        }
    }

    @Override
    public double vaciarCobrar() {
        double total = contadorPasajero * precioBoleto;
        contadorPasajero = 0;
        return total;
    }

    @Override
    public double precioElemento() {
        return precioBoleto;
    }

    private StringBuilder listarPasajeros(int indice) {
        StringBuilder lista = new StringBuilder();
        
        lista.append ("---LISTA DE PASAJEROS---\n");
        
        if (indice < nombresPasajeros.length) {
            if (nombresPasajeros[indice] != null) {
                lista.append(indice+1).append(" -- ").append(nombresPasajeros[indice]).append("\n");
            }
            listarPasajeros(indice + 1);
        }
        
        return lista;
    }

    public StringBuilder listarPasajeros() {
        return listarPasajeros(0);
    }


}
