
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author aluno
 */
public class testandoRequisitos {
    Dados item = new Dados();
    @Test
    public void cadastraProdutoRF3(){
        String nome = "caderno";
        String codigo = "453";
        double preco = 29.90;
        assertTrue(item.cadastrarProduto(nome, codigo, preco),"não cadastrado");
           
    }
}
