package tech.buildrun.override;

public class Leao extends Animal{

    public Leao(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
       // super.emitirSom();
        System.out.println("Uuuuurr Uuuuurr Uuuuurr Uuuuurr");

    }
}
