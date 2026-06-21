package tech.buildrun.estadio;

public class Main {
    public static void main(String[] args) {

        JogadorFutebol anderson = new JogadorFutebol("Anderson",9,"Direito",20);
        JogadorFutebolAmericano joao = new JogadorFutebolAmericano("Joao",12,"Arquivo com a lista de jogadas",350);
        JogadorBasquete antonio = new JogadorBasquete("Antonio",15,5,50);

        System.out.println(" ");
        anderson.fazerGol();
        anderson.driblar();

        System.out.println(anderson.toString());

        System.out.println(" ");
        System.out.println("========================================");
        System.out.println(" ");


        joao.bloquear();
        joao.fazerTouchDown();

        System.out.println(joao.toString());

        System.out.println(" ");
        System.out.println("========================================");
        System.out.println(" ");


        antonio.arremessar();
        antonio.fazerEnterrada();

        System.out.println(antonio.toString());
    }
}
