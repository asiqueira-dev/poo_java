package tech.buildrun.veiculos;

public class Helicoptero extends VeiculoAereo{

    private int numeroHelices;

    public Helicoptero(String marca, int anoFabricacao, int autonomia, int altitudeMaxima, int numeroHelices) {
        super(marca, anoFabricacao, autonomia, altitudeMaxima);
        this.numeroHelices = numeroHelices;
    }

    public void pairar(){
        System.out.println("Pairar veículo");
    }
}
