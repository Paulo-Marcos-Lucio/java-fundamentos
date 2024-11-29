package modelo;

import pagamento.DocumentoPagavel;
import pagamento.MetodoPagamento;

public class TransferenciaTed  implements MetodoPagamento {


    @Override
    public void pagar(DocumentoPagavel documento) {
        Beneficiario beneficiario = documento.getBeneficiario();

        if(beneficiario.naoPossuiContaBancaria()) {
            throw new RuntimeException("Beneficiário não possui conta bancária");
        }
        System.out.printf("Efetuando TED para %s no valor %.2f para a conta bancaria %s%n",
                beneficiario.getNome(), documento.getValorTotal(), beneficiario.getContaBancaria());
    }
}
