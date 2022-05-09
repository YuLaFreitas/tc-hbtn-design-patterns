public class ArmaduraDecorator extends NaveEspacialDecorator{
    private NaveEspacial naveEspacial;
    public ArmaduraDecorator(NaveEspacial ne) {
        super(ne);
        naveEspacial = ne;
    }

    @Override
    public int getSaude(){
        return naveEspacial.getSaude() + 150;
    }

    @Override
    public int getAtaque(){
        return naveEspacial.getAtaque();
    }

}
