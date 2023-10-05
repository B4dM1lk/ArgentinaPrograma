public class Carta {
    private int numero;
    private Palo palo;

    //Constructores
    public Carta(int numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }
    public Carta(){}

    //Setters
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    //Getters
    public int getNumero() {
        return numero;
    }
    public Palo getPalo() {
        return palo;
    }

    //Metodos
    @Override
    public String toString() {
        return "Carta{" +
                "numero=" + numero +
                ", palo=" + palo +
                '}';
    }
}
