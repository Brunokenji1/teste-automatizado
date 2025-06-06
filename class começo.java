/**
 *
 * @author aluno
 */
public class Testando {
    /**
     * 
     * @param nome cadastra o nome do cliente pessoal
     * @param cpf cadastra o cpf do cliente pessoal
     * @param senha cadastra a senha do cliente pessoal
     * @return retorna true se o cpf estiver correto, o nome e a senha tiver algo escrito
     */
    public boolean cadastroCP(String nome, String cpf, String senha ){
        
        boolean validacao = false;
        if(cpf.length()==11 && !nome.equals("") && !senha.equals("")){
            validacao=true;
        }
    return validacao;
        
    }
    /**
     * 
     * @param nome cadastra o nome do cliente corporativo
     * @param cnpj cadastra o cnpj do cliente corporativo
     * @param senha cadastra a senha do cliente corporativo
     * @param limiteCredito cadastra o limite de credito do cliente corporativo
     * @return retorna true se tudo estiver completo
     */
    public boolean cadastroCC(String nome, String cnpj, String senha, double limiteCredito ){
        
        boolean validacao = false;
        if(cnpj.length()==14 && !nome.equals("") && !senha.equals("") && limiteCredito !=0){
            validacao=true;
        }
    return validacao;
    
    }
    /**
     * 
     * @param cliente nome do ciente
     * @param idProduto string que define qual produto foi escolhido e o seu id
     * @param qtd variavel inteira de quantidade
     * @return retorna uma string que define se foi registrado ou não
     */
    private qtdEstoque;
   
    public String registroPedido(String cliente, String idProduto, int qtd){
        String status = "nao registrado";
        if(!cliente.equals("") && !idProduto.equals("") && qtd != 0){
            status = "registrado";
        }
        return status; 
    }
}
