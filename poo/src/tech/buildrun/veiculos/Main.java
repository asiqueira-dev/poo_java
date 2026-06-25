package tech.buildrun.veiculos;

public class Main {
    public static void main(String[] args) {

        CarroExportivo carroExportivo = new CarroExportivo("BMW",2025,"Asfalto",4,"Etanol",2,100);

        carroExportivo.ligar();
        carroExportivo.acelerar();
        carroExportivo.frear();
        carroExportivo.desligar();
    }
}
