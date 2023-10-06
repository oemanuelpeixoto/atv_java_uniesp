import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite o peso em kg: ");
            double peso = sc.nextDouble();

            System.out.print("Digite a altura (em metros): ");
            double altura = sc.nextDouble();

            CalculadoraIMC calculadora = new CalculadoraIMC(peso, altura);

            double imc = calculadora.calcularIMC();

            System.out.println("O seu IMC é: " + imc);
    }
}