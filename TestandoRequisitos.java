import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author bruno, pedro, murilo
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
    
    @Test //test requisito funcional 1 para cadastrar cliente corporativo
    public void testRF1clientecorporativo(){
        String nome = "empresa";
        String cnpj = "12345670018910";
        String senha= "1212121212";
        double credito = 10000.0;
        assertTrue(test.cadastroCC(nome, cnpj, senha, credito), "Cadastro invalido");
    }
    
    @Test //test requisito funcional 2 registro de pedido de cliente pessoal
    public void testRF2registroPedidoCP(){
        String nPedido = "001";
        String cliente = "bruno";
        String cpf = "12345678910";
        String idProduto = "0119";
        int qtdEstoque=3;
        int qtd = 3;   
        double pUnitario = 10.5;
        double total = 31.5;
        assertEquals("registrado", test.registroPedidoCP(cliente, cpf, idProduto, qtdEstoque , qtd, nPedido, pUnitario, total));
        assertEquals(0, test.estoqueProdutoAtualizadoVendido(qtdEstoque, qtd));
    } 
    @Test //test requisito funcional 2 registro de pedido de cliente corporativo e atualizaa o estoque
    public void testRF2registroPedidoCC(){
        String nPedido = "002";
        String cliente = "empresa";
        String cnpj = "12345670018910";
        String idProduto = "0119";
        int qtdEstoque=3;
        int qtd = 3;   
        double pUnitario = 10.5;
        double total = 31.5;
        double limCredito = 1000.0;
        assertEquals("registrado", test.registroPedidoCC(cliente, cnpj, idProduto, qtdEstoque , qtd, nPedido, pUnitario, total, limCredito));
        assertEquals(0, test.estoqueProdutoAtualizadoVendido(qtdEstoque, qtd));
    } 
    
    @Test
    public void cadastraProdutoRF3(){
        String nome = "caderno";
        String idProduto = "453";
        double preco = 29.90;
        int qtdProduto=5;
        assertTrue(test.cadastrarProduto(nome, idProduto, preco, qtdProduto),"não cadastrado");
           
    }
    @Test //registra a copra com o fornecedor, ve se todods os dados foram completados e atualiza o estoque
    public void registroComprasFornecedorRF4(){
        String fornecedor = "Pedro";
        String produto = "saco de 5kg Arroz";
        String data = "06/06";
        int qtdProduto= 5;
        int qtdEstoque=1;
        double pUnitario = 5.00;
        double total=25;
        assertTrue(test.registroComprasForn(fornecedor, produto, data, qtdProduto, qtdEstoque, pUnitario, total), "não registrado");
        assertEquals(6, test.estoqueProdutoAtualizadoComprado(qtdEstoque, qtdProduto));
    }
    
    @Test //verifica se é um cliente frequente
    public void relatorioClientesFrequentes(){
        String cliente = "Pedro";
        int vezesPedida= 3;
        String produto ="Arroz";
        assertTrue(test.clientesFrequentes(cliente, vezesPedida, produto),"não é cliente frequente");
    }
    
    @Test //controla o estoque se o produto foi adicionado no estoque
    public void controleDeEstoqueADDproduto(){
        int estoque = 3;
        int addEstoque = 3;
        assertEquals(6, test.estoqueProdutoAtualizadoComprado(estoque, addEstoque));
    }
    @Test // controla o estoque se o produto foi vendido
    public void controleDeEstoquePrdutoVendido(){
        int estoque = 3;
        int qtd = 3;
        assertEquals(0, test.estoqueProdutoAtualizadoVendido(estoque, qtd));
    }
    
    @Test // login e controle de acesso
    public void login(){
        String usuarioValido = "bruno";
        String senhaValida = "123456";
        String usuario = "bruno";
        String senha= "123456";
        assertTrue(test.validacaoLogin(usuarioValido, senhaValida, usuario, senha), "Senha ou usuario errado");
    }
    
    @Test // alerta de estoque baixo se tiver 3 ou menos no estoque
    public void alertaEstoqueBaixo(){
        int qtdEstoque = 3;
        String idProduto = "1235689";
        assertEquals("estoque baixo", test.alertaEstoque(qtdEstoque, idProduto));
    }
    
    
    @Test // inserir pedido com três produtos e verificar cálculo automático do total
    public void calculoAutomaticoRF6C1(){
        int qtdProdutos = 3;
        String idProduto1 = "0119";
        String idProduto2 = "0120";
        String idProduto3 = "0121";
        String nPedido = "100";
        double preco1 = 100.00;
        double preco2 = 50.00;
        double preco3 = 150.00;
        double total = 300.00;
        assertEquals("ok", test.validaPedido(qtdProdutos,nPedido,idProduto1,idProduto2,idProduto3));
        assertTrue(test.calculoAutomatico(total,preco1,preco2,preco3),"erro");
    }
    
    @Test // converte o valor com casas decimais extras para valores inteiros
    public void calculoAutomaticoRD6C3(){
        double valor = 10.4;
        int valorConvertido = 10;
        assertEquals("erro",test.arredondamentoCalculoAutomatico(valor,valorConvertido), "ok");
    }
    
    /* 
    FAZER
    REQUISITO FUNCIONAL 13
    */
    
    @Test // cadastro de fornecedores
    public void cadastroFornecedor (){
        String nome = "empresa";
        String cnpj = "12345670018910";
        String senha= "1212121212";
        assertEquals("ok",test.cadastroForn(nome,cnpj,senha),"erro");
        
    }
}
