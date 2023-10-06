
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Ford", "Fiesta", 2020, 4);
        Moto moto = new Moto("Honda", "CBR 1000RR", 2021, 1000);

        System.out.println("Detalhes do Carro:");
        carro.imprimirDetalhes();

        System.out.println("\nDetalhes da Moto:");
        moto.imprimirDetalhes();
    }
}