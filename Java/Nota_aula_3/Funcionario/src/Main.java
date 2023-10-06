public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("João", 5000.0, "Vendas");
        Diretor diretor = new Diretor("Maria", 10000.0, 1000);

        System.out.println("Dados do Gerente:");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Salário: R$" + gerente.getSalario());
        System.out.println("Departamento: " + gerente.getDepartamento());
        System.out.println("Bônus: R$" + gerente.calcularBonus());

        
        System.out.println("\nDados do Diretor:");
        System.out.println("Nome: " + diretor.getNome());
        System.out.println("Salário: R$" + diretor.getSalario());
        System.out.println("Ações: " + diretor.getAcoes());
    }
}