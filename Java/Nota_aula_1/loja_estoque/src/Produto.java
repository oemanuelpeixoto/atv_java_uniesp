public class Produto {
    String nome;
    double preco ;
    int quantidade ;

    public void adicionarestoque ( int adicionar){
        quantidade += adicionar;

    }
    public void vender ( int retirar){
        quantidade -= retirar;

    }
}

