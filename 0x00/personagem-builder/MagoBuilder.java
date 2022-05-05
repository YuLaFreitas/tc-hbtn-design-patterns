public class MagoBuilder implements Builder{
    String nome;
    TipoPersonagem tipo;
    int inteligencia;
    int forca;
    int vigor;
    int resistencia;
    int destreza;


    @Override
    public void setForca(int forca) {
        this.forca = forca;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setTipo(TipoPersonagem tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    @Override
    public void setVigor(int vigor) {
        this.vigor = vigor;
    }

    @Override
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public Mago build(){
        return new Mago(this.nome, this.inteligencia, this.forca, this.vigor, this.resistencia, this.destreza);
    }
}