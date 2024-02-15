/**
 * @author vanes
 */

public enum TipoPesquero {
    PEZ(100.0), CAMARON(400.0), LANGOSTA(300.0);
    public final double price;

    TipoPesquero(double precio) {
        price = precio;
    }
}
