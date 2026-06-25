package tech.buildrun.veiculos;

public abstract class VeiculoAereo extends Veiculo {

    protected int altitudeMaxima;
    protected int autonomia;

    public VeiculoAereo(String marca, int anoFabricacao, int autonomia, int altitudeMaxima) {
        super(marca, anoFabricacao);
        this.autonomia = autonomia;
        this.altitudeMaxima = altitudeMaxima;
    }

    public void decolar(){
        System.out.println("Veículo decolando!");
    }

    public void pousar(){
        System.out.println("Veículo pousando!");
    }
}
