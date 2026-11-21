public class Leao extends Animal {
    
    public Leao (int peso, float altura) {
        super(peso, altura);
        this.peso = peso;
        this.altura = altura;
    }

    @Override 
    public void comer() {
        System.out.println("Leao comendo carne.");
    }
    @Override 
    public void dormir() {
        System.out.println("Leao dormindo...");
    }
    @Override 
    public void correr() {

        System.out.println("Leao correndo...");
    }
    @Override
    public void fazerBarulho() {
        System.out.println("Leao rugindo!");
    }
}
