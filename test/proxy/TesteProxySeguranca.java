package proxy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class TesteProxySeguranca {

    @Test
    public void testeAutorizaAcesso() {
        Usuario u = new Usuario("User1");

        u.autorizaAcesso("InterfaceNegocio", "executaTransacao");
        NegocioMock mock = new NegocioMock();
        InterfaceNegocio i = new ProxySegurancaNegocio(mock, u);

        i.executaTransacao();

        assertTrue(mock.isFoiAcessado());
    }

    @Test
    public void testeNaoAutorizaAcesso() {
        Usuario u = new Usuario("User1");

        u.autorizaAcesso("InterfaceNegocio", "executaTransacao");
        NegocioMock mock = new NegocioMock();
        InterfaceNegocio i = new ProxySegurancaNegocio(mock, u);

        try {
            i.cancelaTransacao();

            //se a exceção não for lançada, falha o teste
            fail();
        } catch (Exception e) {
            assertFalse(mock.isFoiAcessado());
        }
    }

    @Test(expected = RuntimeException.class)
    public void testeThrowRuntimeException() {
        Usuario u = new Usuario("User1");

        u.autorizaAcesso("InterfaceNegocio", "executaTransacao");
        NegocioMock mock = new NegocioMock();
        InterfaceNegocio i = new ProxySegurancaNegocio(mock, u);

        i.cancelaTransacao();
    }
}
