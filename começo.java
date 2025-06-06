
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author aluno
 */
public class TestandoRequisitos {
    Testando test = new Testando();

    @Test //teste requisito funcional 1 para cadastrar clietne pessoal
    public void testRF1clientepessoal(){
        String nome = "bruno";
        String cpf = "12345678910";
        String senha= "1212121212";
        assertTrue(test.cadastroCP(nome, cpf, senha), "Cadastro invalido");
    }
    @Test //test requito funcional 1 para cadastrar cliente corporativo
    public void testRF1clientecorporativo(){
        String nome = "empresa";
        String cnpj = "12345670018910";
        String senha= "1212121212";
        double credito = 10000.0;
        assertTrue(test.cadastroCC(nome, cnpj, senha, credito), "Cadastro invalido");
    }
    @Test //test requisito funcional 2 registro de pedido
    public void testRF2(){
        String cliente = "bruno";
        String idProduto = "0119";
        int qtd = 3;
        assertEquals("registrado", test.registroPedido(cliente, idProduto, qtd));
    } 
    @Test
    public void testRF4(){
        
    }
    
}
