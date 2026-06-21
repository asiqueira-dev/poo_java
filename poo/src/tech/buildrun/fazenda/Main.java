package tech.buildrun.fazenda;

public class Main {

    public static void main(String[] args) {

        Galinheiro granjaFeliz = new Galinheiro(
                "Granja Feliz",
                50,
                3
        );

        Galinheiro granjaOvosDeOuro = new Galinheiro(
                "Granja de Ovos de Ouro",
                10,
                1
        );

        granjaFeliz.mostrarInfo();
        granjaOvosDeOuro.mostrarInfo();
    }
}