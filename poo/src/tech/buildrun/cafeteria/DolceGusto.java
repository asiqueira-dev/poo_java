package tech.buildrun.cafeteria;

public class DolceGusto implements MaquinaCafe {

    private boolean ligada;
    private boolean resistenciaLigada;
    private boolean possuiCachimbo;
    private ModoCafe modoCafeSelecionado;
    private int qtdAguaCaldeira;

    @Override
    public void ligar() {
        System.out.println("Ligando a Dolce Gusto...");
        this.ligada = true;
    }

    @Override
    public void desligar() {
        System.out.println("Desligando a Dolce Gusto...");
        this.ligada = false;
    }

    @Override
    public void colocarCachimbo() {
        System.out.println("Cachimbo inserido");
        this.possuiCachimbo = true;
    }

    @Override
    public void retirarCachimbo() {
        System.out.println("Cachimbo removido");
        this.possuiCachimbo = false;
    }

    @Override
    public void selecionarModo(ModoCafe modoCafe) {
        System.out.println("Modo de Cafe selecionado " +  modoCafe.getDescricao());
        this.modoCafeSelecionado = modoCafe;
    }

    @Override
    public void fazerCafe() {
        if(this.ligada){
            if(this.possuiCachimbo){
                if(this.modoCafeSelecionado != null){
                       // pode fazer café
                    this.injetarAguaCaldeira(300);
                    this.ligarResistencia();

                    System.out.println("Fazendo " + this.modoCafeSelecionado.getDescricao() + "...");
                    System.out.println("Café Pronto!");


                    this.esvaziarCaldeira();
                    this.desligarResistencia();

                }else{
                    System.out.println("Modo de Café não selecionado, selecione antes de prosseguir");
                }

            }else{
                System.out.println("Dolce Gusto esta sem o cachimbo. Coloque o cachimbo com o pó de café.");
            }

        }else{
            System.out.println("Dolce Gusto esta desligada.");
        }

    }

    private boolean isLigada() {
        return this.ligada;
    }

    private void injetarAguaCaldeira(int qtdAguaCaldeira) {
        System.out.println("Injetando " + qtdAguaCaldeira + "ml de Agua Caldeira...");
        this.qtdAguaCaldeira = qtdAguaCaldeira;
    }

    private void esvaziarCaldeira() {
        System.out.println("Esvaziando "  + qtdAguaCaldeira + "ml de Agua Caldeira...");
        this.qtdAguaCaldeira = 0;
        System.out.println("Caldeira esvaziada....");
    }

    private void ligarResistencia() {
        System.out.println("Ligando a Resistencia...");
        this.resistenciaLigada = true;
    }

    private void desligarResistencia() {
        System.out.println("Desligando a Resistencia...");
        this.resistenciaLigada = false;
    }
}
