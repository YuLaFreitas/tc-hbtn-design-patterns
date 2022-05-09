public class NaveEspacialDecorator extends NaveEspacial {
    private NaveEspacial naveEspacial;
    int saude;
    int ataque;


    public NaveEspacialDecorator(NaveEspacial naveEspacial) {
        super(naveEspacial.getSaude(), naveEspacial.getAtaque());
    }

    public NaveEspacial naveDecorada(){
        return naveEspacial;
    }

    @Override
    public int getSaude(){
        return this.saude;
    }

    @Override
    public int getAtaque(){
        return this.ataque;
    }
}
