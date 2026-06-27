package tech.buildrun.override;

public class Gato extends Animal{

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
       // super.emitirSom();
        System.out.println("Miau Miau Miau Miau");
    }
}
