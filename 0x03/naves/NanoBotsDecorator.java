public class NanoBotsDecorator extends NaveEspacialDecorator{
    private NaveEspacial naveEspacial;

    public NanoBotsDecorator(NaveEspacial ne) {
        super(ne);
        naveEspacial = ne;
    }

    public int getAtaque(){
        return naveEspacial.getAtaque() + 25;
    }

    @Override
    public int getSaude(){
        return naveEspacial.getSaude();
    }

}
