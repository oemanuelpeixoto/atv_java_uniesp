class Carro extends Veiculo {
    private int numPortas;

    public Carro(String marca, String modelo, int anoFabricacao, int numPortas) {
        super(marca, modelo, anoFabricacao);
        this.numPortas = numPortas;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void imprimirDetalhes() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano de Fabricação: " + getAnoFabricacao());
        System.out.println("Número de Portas: " + numPortas);
    }
}