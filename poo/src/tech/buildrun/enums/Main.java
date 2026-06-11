package tech.buildrun.enums;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Usuario bruno = new Usuario(
                "Anderson",
                NivelAcesso.ADMIN,
                "contato@andersoniqueira.com"
        );

        bruno.mostrarInfo();
    }
}
