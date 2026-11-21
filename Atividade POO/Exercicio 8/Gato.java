public class Gato extends Animal {

    public String nome;

    public Gato(int peso, float altura, String nome) {
        super(peso, altura);
        this.peso = peso;
        this.altura = altura;
        this.nome = nome;
    }    
    @Override 
    public void comer(){
        System.out.println("Gato comendo racao");
    }
}
