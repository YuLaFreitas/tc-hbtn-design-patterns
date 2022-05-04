public class Director {
    public void buildGuerreiro(Builder builder){
       // GuerreiroBuilder guerreiroBuilder = new GuerreiroBuilder();
                builder.setNome("Guerreiro");
                builder.setTipo(TipoPersonagem.GUERREIRO);
                builder.setInteligencia(1);
                builder.setForca(8);
                builder.setDestreza(6);
                builder.setVigor(5);
                builder.setResistencia(10);
              //  guerreiroBuilder.build();
    }
    public void buildLadrao(Builder builder){
        //LadraoBuilder  ladraoBuilder = new LadraoBuilder();
        builder.setNome("Ladrao");
        builder.setTipo(TipoPersonagem.LADRAO);
        builder.setInteligencia(2);
        builder.setForca(6);
        builder.setDestreza(10);
        builder.setVigor(8);
        builder.setResistencia(5);

    }
    public void buildMago(Builder builder){
       // MagoBuilder magoBuilder = new MagoBuilder();
        builder.setNome("Mago");
        builder.setTipo(TipoPersonagem.MAGO);
        builder.setInteligencia(10);
        builder.setForca(2);
        builder.setDestreza(4);
        builder.setVigor(5);
        builder.setResistencia(3);

    }
}
