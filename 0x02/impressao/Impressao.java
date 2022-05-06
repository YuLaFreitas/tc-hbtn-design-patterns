public class Impressao {

    private int paginasTotais, paginasColoridas;
    private boolean ehFrenteVerso;
    private double valorColoridasFrenteVerso;
    private double valorPretoBrancoFrenteVerso;
    private double valorColoridasFrenteApenas;
    private double valorPretoBrancoFrenteApenas;
    private TamanhoImpressao tamanhoImpressao;
    private int paginasBrancoPreto;
    private double valorTotal;

    public Impressao(TamanhoImpressao tamanhoImpressao,
                     int totalPaginas, int qtdColoridas, boolean freVer){
        this.tamanhoImpressao = tamanhoImpressao;
        this.paginasTotais = totalPaginas;
        this.paginasColoridas = qtdColoridas;
        this.ehFrenteVerso = freVer;
        this.paginasBrancoPreto = totalPaginas - qtdColoridas;
    }

    public double calcularTotal(){
        if (tamanhoImpressao == TamanhoImpressao.A2 && ehFrenteVerso == false){
            valorPretoBrancoFrenteApenas = 0.32;
            valorColoridasFrenteApenas = 0.22;
            valorTotal =  (paginasBrancoPreto*valorPretoBrancoFrenteApenas) + (paginasColoridas*valorColoridasFrenteApenas);
        }else if(tamanhoImpressao == TamanhoImpressao.A2 && ehFrenteVerso == true){
            valorPretoBrancoFrenteVerso = 0.28;
            valorColoridasFrenteVerso = 0.18;
            valorTotal = (paginasBrancoPreto*valorPretoBrancoFrenteVerso) + (paginasColoridas*valorColoridasFrenteVerso);
        }else if(tamanhoImpressao == TamanhoImpressao.A3 && ehFrenteVerso == false){
            valorPretoBrancoFrenteApenas = 0.30;
            valorColoridasFrenteApenas = 0.20;
            valorTotal =  (paginasBrancoPreto*valorPretoBrancoFrenteApenas) + (paginasColoridas*valorColoridasFrenteApenas);
        }else if(tamanhoImpressao == TamanhoImpressao.A3 && ehFrenteVerso == true){
            valorPretoBrancoFrenteVerso = 0.25;
            valorColoridasFrenteVerso = 0.15;
            valorTotal = (paginasBrancoPreto*valorPretoBrancoFrenteVerso) + (paginasColoridas*valorColoridasFrenteVerso);
        }else if(tamanhoImpressao == TamanhoImpressao.A4 && ehFrenteVerso == false) {
            valorPretoBrancoFrenteApenas = 0.25;
            valorColoridasFrenteApenas = 0.15;
            valorTotal = (paginasBrancoPreto * valorPretoBrancoFrenteApenas) + (paginasColoridas * valorColoridasFrenteApenas);
        } else if(tamanhoImpressao == TamanhoImpressao.A4 && ehFrenteVerso == true) {
            valorPretoBrancoFrenteVerso = 0.20;
            valorColoridasFrenteVerso = 0.10;
            valorTotal = (paginasBrancoPreto * valorPretoBrancoFrenteVerso) +
                    (paginasColoridas * valorColoridasFrenteVerso);
        }
        return valorTotal;

    }

    @Override
    public String toString() {
        String frase = ehFrenteVerso?
                "frente e verso, ": "frente apenas ";

        return String.format(
                        "total de paginas: %d," +
                        " total coloridas: %d, " +
                        "total preto e branco: %d, " +
                                "%se " +
                                        "total: R$ %.2f",
                this.paginasTotais,
                this.paginasColoridas,
                this.paginasBrancoPreto,
                frase,
                calcularTotal()
        );
    }
}
