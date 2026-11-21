public class Animal {
    
    protected int peso;
    protected float altura;
    public String cor;

    public Animal(int peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public void comer() {
        System.out.println("Sou onivoro, como tudo!");
    }

    public void dormir() {
        System.out.println("Deitei e dormi");
    }

    public void correr() {

        System.out.println("Estou andando por ai");

    }
    public void fazerBarulho() {
        System.out.println("Huf! Huf! Huf! Huf!");
    }

    public String toString() {
    return getClass().getName() + "Peso: " + peso + "Altura: " + altura + "Cor: " + cor;
    }
    
}
