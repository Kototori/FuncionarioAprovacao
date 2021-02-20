
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import com.br.ufes.funcionarioaprovacao.model.Funcionario;
import com.br.ufes.funcionarioaprovacao.main.AprovacaoPagamento;

public class AprovacaoPagamentoTeste {

    public AprovacaoPagamentoTeste() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void CT01() {
        AprovacaoPagamento aprovacaoPagamento = new AprovacaoPagamento();
        Funcionario funcionario = new Funcionario("gerente geral");
        var valor = 100000.0;

        var retorno = aprovacaoPagamento.solicitarAprovacaoPagamento(funcionario, valor);
        
        assertNotNull(retorno);
        assertEquals(retorno, false);
    }
    
    @Test
    public void CT02() {
        AprovacaoPagamento aprovacaoPagamento = new AprovacaoPagamento();
        Funcionario funcionario = new Funcionario("gerente geral");
        var valor = 200.0;

        var retorno = aprovacaoPagamento.solicitarAprovacaoPagamento(funcionario, valor);
        
        assertNotNull(retorno);
        assertEquals(retorno, true);
    }

}
