public class App {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado("Azul", 5.0);
        Circulo circulo = new Circulo("Vermelho", 3.0);

        System.out.printf("Area do quadrado: %.2f%n", quadrado.calcularArea());
        System.out.printf("Area do circulo: %.2f%n", circulo.calcularArea());
    }
}
