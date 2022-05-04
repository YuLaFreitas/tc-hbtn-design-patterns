abstract class Personagem{
       private String nome;
       private TipoPersonagem tipo;


   int inteligencia, forca, vigor, resistencia, destreza;

   public Personagem(String nome, TipoPersonagem tipo, int inteligencia, int forca, int vigor, int resistencia, int destreza) {
        this.nome = nome;
        this.tipo = tipo;
        this.inteligencia = inteligencia;
        this.forca = forca;
        this.vigor = vigor;
        this.resistencia = resistencia;
        this.destreza = destreza;
    }

   public double getDanoAtaque(){
        return this.forca;
    }


    @Override
   public String toString() {
        return "Personagem { " +
                "nome = " + nome  +
                ", tipo = " + tipo +
                ", inteligencia = " + inteligencia +
                ", forca = " + forca +
                ", vigor = " + vigor +
                ", resistencia = " + resistencia +
                ", destreza = " + destreza +
                String.format(", dano ataque = %.02f", getDanoAtaque()) +
                " }";
    }
}