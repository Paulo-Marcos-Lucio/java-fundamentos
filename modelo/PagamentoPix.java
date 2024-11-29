package modelo;

import pagamento.DocumentoPagavel;
import pagamento.MetodoPagamento;

public class PagamentoPix implements MetodoPagamento {


    @Override
    public void pagar(DocumentoPagavel documento) {
        Beneficiario beneficiario = documento.getBeneficiario();

        if(beneficiario.naoPossuiChavePix()) {
            throw new RuntimeException("Beneficiário não possui chave pix.");
        }

        System.out.printf("DEBUG: efeturando PIX para %s no valor de %.2f com a chave %s%n",
                beneficiario.getNome(), documento.getValorTotal(), beneficiario.getChavePix());
    }


}