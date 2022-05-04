import org.jetbrains.annotations.NotNull;

class TerraMediaPersonagemFactory extends  PersonagemFactory{

    @Override
    public Personagem createPersonagem(@NotNull TipoPersonagem tipo , String nome) {
        switch (tipo){
            case MAGO : return new Mago(nome, 10, 2, 5, 3, 4);
            case LADRAO : return new Ladrao(nome, 2, 6, 8, 5, 10);
            case GUERREIRO: return  new Guerreiro(nome, 1, 8, 5, 10, 6);
        }
        return null;

    }

}