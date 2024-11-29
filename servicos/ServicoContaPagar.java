package servicos;

import modelo.PagamentoPix;
import modelo.TransferenciaTed;
import pagamento.DocumentoPagavel;
import modelo.Beneficiario;
import pagamento.MetodoPagamento;

public class ServicoContaPagar {

    private MetodoPagamento metodoPagamento;

    public ServicoContaPagar(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void pagar(DocumentoPagavel documento) {
        metodoPagamento.pagar(documento);
    }
}