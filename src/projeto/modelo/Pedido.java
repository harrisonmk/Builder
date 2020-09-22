package projeto.modelo;

import java.math.BigDecimal;
import java.util.List;

public class Pedido {

    private String numeroPedido;
    private List<Produto> produtos;
    private Cliente cliente;
    private Vendedor vendedor;
    
    

    public BigDecimal getValor() {

        BigDecimal total = BigDecimal.ZERO;

        for (Produto produto : produtos) {

            total = total.add(produto.getValor().multiply(new BigDecimal(produto.getQuantidade())));

        }

        return total;
    }

    public int getTotalProdutos() {

        int total = 0;

        for (Produto produto : produtos) {

            total += produto.getQuantidade();

        }
        return total;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public String toString() {
        return "N° Pedido: " + numeroPedido + 
                "\nProdutos: "+produtos+
                "\nCliente: " + cliente + 
                "\nVendedor: " + vendedor +
                "\nProduto(s): "+this.getTotalProdutos()+
                "\nValor total: R$ "+this.getValor();
        
    }
    
    
    
    
    

}
