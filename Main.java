import modelo.Holerite;
import modelo.OrdemServico;
import modelo.Beneficiario;
import modelo.PagamentoPix;
import pagamento.MetodoPagamento;
import servicos.ServicoContaPagar;

public class Main {
    public static void main(String[] args) {


        MetodoPagamento metodoPagamento = new PagamentoPix();
        ServicoContaPagar scp = new ServicoContaPagar(metodoPagamento);

        Beneficiario funcionario = new Beneficiario("Paulo Marcos", "93280-2398-122891", "23892");
        Holerite holerite = new Holerite(funcionario, 19.45, 176);

        scp.pagar(holerite);

        Beneficiario fornecedor = new Beneficiario("Oblivion SA", "992032-12828-xxx", "000293");
        OrdemServico os = new OrdemServico(fornecedor, 9932.22);

        scp.pagar(os);
    }
}