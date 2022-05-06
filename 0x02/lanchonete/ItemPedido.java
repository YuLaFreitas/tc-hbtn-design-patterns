public class ItemPedido {

    private TipoItemPedido tipoItemPedido;
    private String nome;

    public ItemPedido(TipoItemPedido pedido, String name) {
        this.tipoItemPedido = pedido;
        this.nome = name;
    }

    public TipoItemPedido getTipo() {
        return tipoItemPedido;
    }

    public void setTipo(TipoItemPedido tipoItemPedido) {
        this.tipoItemPedido = tipoItemPedido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
