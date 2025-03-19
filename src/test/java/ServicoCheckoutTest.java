import org.example.IServico;
import org.example.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServicoCheckoutTest {

    @Test
    void executarCheckout() {
        IServico servico = ServicoFactory.obterServico("Checkout");
        assertEquals("Checkout efetivado", servico.executar());
    }

    @Test
    void cancelarCheckout() {
        IServico servico = ServicoFactory.obterServico("Checkout");
        assertEquals("Checkout cancelado", servico.cancelar());
    }

}
