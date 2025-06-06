
/**
 *
 * @author aluno
 */
public class Dados {

    
    public boolean cadastrarProduto(String nome, String codigo, double preco ){
        boolean cadastrado = false;
        if(!nome.equals("") && !codigo.equals("") && preco!= 0){
            cadastrado = true;
        }
        return cadastrado;
    }
}
