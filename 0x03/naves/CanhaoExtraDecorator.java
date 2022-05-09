public class CanhaoExtraDecorator extends NaveEspacialDecorator{

    private NaveEspacial naveEspacial;

    public CanhaoExtraDecorator(NaveEspacial ne) {
        super(ne);
        naveEspacial = ne;
    }

    @Override
    public int getAtaque(){
        return naveEspacial.getAtaque() + 75;
    }

    @Override
    public int getSaude(){
        return naveEspacial.getSaude();
    }
}
