    import java.util.Scanner;
     class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Produto p = new Produto();
            int resp;

            System.out.println("Qual o nome do produto");
            p.nome = sc.nextLine();

            System.out.println("Qual a quantidade do produto");
            p.quantidade = sc.nextInt();

            System.out.println("Qual o valor do produto ? ");
            p.preco = sc.nextDouble();

            System.out.println("||Produto=" + p.nome + "||Preço= R$ " + p.preco + " || " + p.quantidade + " unidades");
            do {
            System.out.println("Digite o que você deseja fazer :" +
                    "\n 1- Consultar estoque " +
                    "\n 2- Vender produto" +
                    "\n 3- Adicionar produto");
            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("A quantidade atual é " + p.quantidade);
                    break;
                case 2:
                    System.out.println("Digite a quantidade que quer vender ");
                    int retirar = sc.nextInt();
                    p.vender(retirar);
                    System.out.println("**************************************");
                    System.out.println("A quantidade atual é " + p.quantidade);
                    System.out.println("**************************************");
                case 3:
                    System.out.println("Qual quantidade deseja adicionar");
                    int adicionar = sc.nextInt();
                    p.adicionarestoque(adicionar);
                    System.out.println("**************************************");
                    System.out.println("A quantidade atual é " + p.quantidade);
                    System.out.println("**************************************");
                    break;
                default:
                    System.out.println("\nOpção inválida ");
                    break;
            }

            System.out.println("\nPara voltar ao menu digite 0");
            resp = sc.nextInt();
            } while (resp == 0 );

            }

        }

