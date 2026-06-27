package tech.buildrun.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Caixa<String> caixaDeTexto = new Caixa<>();
        caixaDeTexto.guardar("Hello World!");
        System.out.println(caixaDeTexto.pegar());

        Caixa<Integer> caixaDeNumero = new Caixa<>();
        caixaDeNumero.guardar(2);
        System.out.println(caixaDeNumero.pegar());

        List<String> listaTarefas =  new ArrayList<>();
        listaTarefas.add("Primeira tarefa");
        listaTarefas.add("Segunda tarefa");
        listaTarefas.add("Terceira tarefa");

    }
}
