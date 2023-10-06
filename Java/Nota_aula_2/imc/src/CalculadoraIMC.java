public class CalculadoraIMC {

    private double peso;
    private double altura;

    // Construtor da classe
    public CalculadoraIMC(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    // Método para calcular o IMC
    public double calcularIMC() {
        return peso / (altura * altura);
    }
}
