package projeto;

import java.math.BigDecimal;
import projeto.builder.PedidoBuilder;
import projeto.modelo.Pedido;

public class Main {

    public static void main(String[] args) {

        
      Pedido pedido = new PedidoBuilder()
              .setPedido("9999")
              .setCliente(100L,"Luiz", "9342-9900")
              .setVendedor(2L,"joao")
              .setProduto("Caderno", 1,new BigDecimal(12.00))
              .setProduto("Lapis", 3,new BigDecimal(1.00))
              .setProduto("borracha", 2,new BigDecimal(0.50)).builder();       
        
        
         System.out.println(pedido);
        
      /*  Cliente cliente = new Cliente();
        cliente.setCodigo(100L);
        cliente.setNome("carlos");
        cliente.setTelefone("9254-6544");

        
        Vendedor vendedor = new Vendedor();
        vendedor.setId(1L);
        vendedor.setNome("joao");

        
        Produto produto1 = new Produto();
        produto1.setQuantidade(1);
        produto1.setNome("Caderno");
        produto1.setValor(new BigDecimal(10.00));

        
        Produto produto2 = new Produto();
        produto2.setQuantidade(2);
        produto2.setNome("Caneta");
        produto2.setValor(new BigDecimal(1.50));

        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        
        
        Pedido pedido = new Pedido();
        pedido.setNumeroPedido("00001");
        pedido.setCliente(cliente);
        pedido.setVendedor(vendedor);
        pedido.setProdutos(produtos);
        //pedido.setProdutos(new ArrayList<>());
        //pedido.getProdutos().add(produto1);
        //pedido.getProdutos().add(produto2);

        System.out.println(pedido); */
        
    }

    
}
