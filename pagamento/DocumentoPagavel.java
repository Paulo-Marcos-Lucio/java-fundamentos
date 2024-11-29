package pagamento;

import modelo.Beneficiario;

public interface DocumentoPagavel {

    double getValorTotal();

    Beneficiario getBeneficiario();

}
