package tech.buildrun.veiculos;

public abstract class Veiculo {

    protected String marca;
    protected int anoFabricacao;

    public Veiculo(String marca, int anoFabricacao) {
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
    }

    public void ligar(){
        System.out.println("Veiculo ligado");
    }
    public void desligar(){
        System.out.println("Veiculo desligado");
    }
}
