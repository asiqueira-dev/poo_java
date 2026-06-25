package tech.buildrun.veiculos;

public final class Aviao extends VeiculoAereo{

    private int numeroTurbinas;

    public Aviao(String marca, int anoFabricacao, int autonomia, int altitudeMaxima, int numeroTurbinas) {
        super(marca, anoFabricacao, autonomia, altitudeMaxima);
        this.numeroTurbinas = numeroTurbinas;
    }

    public void ativarPilotoAutomatico(){

        System.out.print("Ativando Piloto Automatico");
    }
}
