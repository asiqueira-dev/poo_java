package tech.buildrun.override;

public class Cachorro extends Animal{

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        //super.emitirSom();
        System.out.println("Au Au! Au! Au! Au!");
    }
}
