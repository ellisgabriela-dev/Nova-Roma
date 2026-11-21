public class App {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int resultado1 = calculadora.somar(10, 20);
        double resultado2 = calculadora.somar(5.5, 3.2);
        int resultado3 = calculadora.somar(10, 20, 30);

        System.out.println("Soma de inteiros: " + resultado1);
        System.out.println("Soma de decimais: " + resultado2);
        System.out.println("Soma de tres numeros: " + resultado3);
    }
}
