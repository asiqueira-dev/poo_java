package tech.buildrun.veiculos;

public final class CarroExportivo extends Carro {

    private int qtdNitro;

    public CarroExportivo(String marca, int anoFabricacao, String tipoTerreno, int numeroRodas, String tipoCombustivel, int qtdPortas, int qtdNitro) {
        super(marca, anoFabricacao, tipoTerreno, numeroRodas, tipoCombustivel, qtdPortas);
        this.qtdNitro = qtdNitro;
    }

    public void ativarNitro(){
        System.out.println("Nitro Ativado");
        this.qtdNitro = 0;
    }
}
