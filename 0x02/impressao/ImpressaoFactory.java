public class ImpressaoFactory{


    public static Impressao createImpressao(TamanhoImpressao tamanho, int totalPaginas,
                                            int pagCorF, boolean frenteVerso) {

        return new Impressao(tamanho,totalPaginas, pagCorF, frenteVerso);


    }
}
