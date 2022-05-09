public class LaserDecorator extends NaveEspacialDecorator{
    private NaveEspacial naveEspacial;
    public LaserDecorator(NaveEspacial ne) {
        super(ne);
        this.naveEspacial = ne;

    }

    @Override
    public int getAtaque(){
        return naveEspacial.getAtaque() + 40;
    }

    @Override
    public int getSaude(){
        return naveEspacial.getSaude();
    }
}
