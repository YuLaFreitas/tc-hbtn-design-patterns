public class ImpressaoFactory{


    public static Impressao createImpressao(TamanhoImpressao tamanho, int totalPaginas,
                                            int pagCorF, boolean ehFrenteVerso) {

        return new Impressao(tamanho,totalPaginas, pagCorF, ehFrenteVerso);


    }
}
