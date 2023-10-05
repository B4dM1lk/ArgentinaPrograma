public class Main {
    public static void main(String[] args) {
        BarajaDeCartas baraja = new BarajaDeCartas();
        baraja.barajar();
        System.out.println(baraja.darCartas(6).toString());
        baraja.cartasMonton();
        baraja.mostrarBaraja();

    }
}