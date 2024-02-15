
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 * @author vanes
 */
public class Muelle {

    private ArrayList<Barco> barcos;

    public Muelle() {
        barcos = new ArrayList<>();
    }

    private Barco buscarBarco(String nombre) {
        for (Barco nombreBarco : barcos) {
            if (nombreBarco.getNombre().equals(nombre)) {
                return nombreBarco;
            }
        }
        return null;
    }

    public void agregarBarco(String tipo) {
        
        String nombreBarco = JOptionPane.showInputDialog(null, "Por favor insertar nombre del barco que desea agregar. ");

        if (buscarBarco(nombreBarco) != null) {
            JOptionPane.showMessageDialog(null, "El barco ya existe.");

        } else {
            switch (tipo.toUpperCase()) {
                case "PESQUERO":
                    String tipoPez = JOptionPane.showInputDialog(null, "Elegir el tipo de mercancia: [PEZ / CAMARON / LANGOSTA]");

                    if (tipoPez.equalsIgnoreCase("PEZ")) {
                        BarcoPesquero barcoPesquero = new BarcoPesquero(nombreBarco, TipoPesquero.PEZ);
                        barcos.add(barcoPesquero);
                        JOptionPane.showMessageDialog(null, "¡Barco de Tipo Pesquero (PEZ) agregado de manera exitosa!");

                    } else if (tipoPez.equalsIgnoreCase("CAMARON")) {
                        BarcoPesquero barcoPesquero = new BarcoPesquero(nombreBarco, TipoPesquero.CAMARON);
                        barcos.add(barcoPesquero);
                        JOptionPane.showMessageDialog(null, "¡Barco de Tipo Pesquero (CAMARON) agregado de manera exitosa!");

                    } else if (tipoPez.equalsIgnoreCase("LANGOSTA")) {
                        BarcoPesquero barcoPesquero = new BarcoPesquero(nombreBarco, TipoPesquero.LANGOSTA);
                        barcos.add(barcoPesquero);
                        JOptionPane.showMessageDialog(null, "¡Barco de Tipo Pesquero (LANGOSTA) agregado de manera exitosa!");
                    } else {

                        JOptionPane.showMessageDialog(null, "La opcion impuesta no es valida.");
                    }

                    break;

                case "PASAJERO":                    
                try {

                    String limite = JOptionPane.showInputDialog(null, "Por favor, inserte el limite de pasajeros.");

                    int limiteINT = Integer.parseInt(limite);

                    String precioBoleto = JOptionPane.showInputDialog(null, "Por favor, inserte el precio del boleto.");

                    double precioBoletoDouble = Double.parseDouble(precioBoleto);

                    BarcoPasajero barcoPasajero = new BarcoPasajero(nombreBarco, precioBoletoDouble, limiteINT);
                    barcos.add(barcoPasajero);
                    JOptionPane.showMessageDialog(null, "¡Barco de Tipo Pasajero agregado de manera exitosa!");
                    break;

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor insertar una opcion numerica valida.");

                }

                default:
                    JOptionPane.showMessageDialog(null, "Tipo de barco inválido.");
                    break;
            }
        }
    }

    public void agregarElemento(String nombre) {

        Barco barcoEncontrado = buscarBarco(nombre);

        if (barcoEncontrado != null) {
            barcoEncontrado.agregarElemento();
        } else {
            JOptionPane.showMessageDialog(null, "El barco con el nombre de '" + nombre + "' no existe.");
        }
    }

    public double vaciarBarco(String nombre) {

        Barco barcoEncontrado = buscarBarco(nombre);
        StringBuilder listaPasajeros = new StringBuilder();

        if (barcoEncontrado != null) {
            if (barcoEncontrado instanceof BarcoPasajero) {
                JOptionPane.showMessageDialog(null, ((BarcoPasajero) barcoEncontrado).listarPasajeros().toString());


            }
        }

        return barcoEncontrado.vaciarCobrar();
    }

    public void barcosDesde(int year) {
        barcosDesdeRecursivo(year, 0);
        
    }

    private void barcosDesdeRecursivo(int year, int indice) {
        if (indice < barcos.size()) {

            Barco barco = barcos.get(indice);

            if (barco.getFecha().get(Calendar.YEAR) >= year) {

                JOptionPane.showMessageDialog(null, "Nombre: " + barco.getNombre() + ", Fecha: " + barco.getFecha().getTime());
            }

            barcosDesdeRecursivo(year, indice + 1);
        }
    }
}
