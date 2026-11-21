public class App {
    public static void main(String[] args) throws Exception {
        
        Animal animal = new Animal(10, 1.5f);
        animal.cor = "Branco";
        animal.comer();
        animal.dormir();
        animal.correr();
        animal.fazerBarulho();

        System.out.println(animal);

        Leao leao = new Leao(20, 1.8f);
        leao.cor = "Amarelo";
        leao.comer();
        leao.dormir();
        leao.correr();
        leao.fazerBarulho();
        leao.toString();
        System.out.println(leao);

        Gato gato = new Gato(5, 0.5f, "Mingau");
        gato.cor = "Cinza";
        gato.comer();
        gato.dormir();
        gato.correr();
        gato.fazerBarulho();
        System.out.println(gato);

        Cachorro cachorro = new Cachorro();
        cachorro.comer();
        cachorro.fazerBarulho();
        System.out.println(cachorro);

    }
}
