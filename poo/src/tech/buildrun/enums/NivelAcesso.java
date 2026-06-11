package tech.buildrun.enums;

public enum NivelAcesso {

    ADMIN("Adminsitrador do Sistema"),
    USUARIO("Usuário do Sistema"),
    CONVIDADO("Convidado do Sistema");

    private String descricao;

    NivelAcesso(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }


}
