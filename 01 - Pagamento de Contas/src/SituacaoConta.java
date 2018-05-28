
public enum SituacaoConta {

    PENDENTE("Pendente"),
    PAGA("Paga"),
    CANCELADA("Cancelada");

    private String descricao;

    private SituacaoConta(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
