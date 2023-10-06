class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int anoFabricacao, int cilindradas) {
        super(marca, modelo, anoFabricacao);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void imprimirDetalhes() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano de Fabricação: " + getAnoFabricacao());
        System.out.println("Cilindradas: " + cilindradas);
    }
}
