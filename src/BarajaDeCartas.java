import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class BarajaDeCartas {
    private List<Carta> cartas;
    private List<Carta> cartasMonton;

    //Constructores
    public BarajaDeCartas(List<Carta> cartas, List<Carta> cartasMonton) {
        this.cartas = cartas;
        this.cartasMonton = cartasMonton;
    }
    public BarajaDeCartas(){
        this.cartasMonton = new ArrayList<Carta>();
        this.cartas = new ArrayList<Carta>();
        for(Palo palo : Palo.values()){
            for(int j=1; j<=12;j++){
                if(j==8||j==9){
                    continue;
                }
                Carta nuevaCarta = new Carta(j, palo);
                this.cartas.add(nuevaCarta);
            }
        }
    }

    //Setters
    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }
    public void setCartasMonton(List<Carta> cartasMonton) {
        this.cartasMonton = cartasMonton;
    }

    //Getters
    public List<Carta> getCartas() {
        return cartas;
    }
    public List<Carta> getCartasMonton() {
        return cartasMonton;
    }

    //Metodos
    @Override
    public String toString() {
        return "BarajaDeCartas{" +
                "cartas=" + cartas.toString() +
                '}';
    }
    public void barajar(){
        Collections.shuffle(this.getCartas());
    }
    public Carta siguienteCarta(){
        if(this.getCartas().isEmpty()){
            System.out.println("El mazo no tiene mas cartas");
            return null;
        }
        Carta  cartaADevolver = this.getCartas().get(this.getCartas().size()-1);
        this.getCartasMonton().add(cartaADevolver);
        this.getCartas().remove(this.getCartas().size()-1);
        return cartaADevolver;
    }
    public int cartasDisponibles(){
        return this.getCartas().size();
    }
    public List<Carta> darCartas(int cantidadDeCartas){
        ArrayList<Carta> devolucion = new ArrayList<Carta>();
        if(this.getCartas().size()<cantidadDeCartas){
            System.out.println("La no operacion es posible porque no hay la cantidad de cartas que pide");
            return null;
        }
        for(int i = 0; i<cantidadDeCartas;i++){
            devolucion.add(this.siguienteCarta());
        }
        return devolucion;
    }
    public void cartasMonton(){
        System.out.println(this.getCartasMonton().toString());
    }
    public void mostrarBaraja(){
        System.out.println(this.getCartas().toString());
    }

}
