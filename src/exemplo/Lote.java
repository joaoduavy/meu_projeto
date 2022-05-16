package exemplo;


public class Lote{
    
    private String id;
    private Produto produto;
    private int quantidade;

    public Lote(Produto p, int q){
        this.id = Integer.toString(hashCode());
        this.produto = p;
        this.quantidade = q;
    }

    public String toString(){
        return "quantidade: " + quantidade + ", " + "produto: " + produto.toString();
    } s

    public String getID(){
        return this.id;
    }

    public void setQuantidade(int novaQuantidade) {
        this.quantidade = novaQuantidade;
    }

    public Produto getProd(){
        return this.produto;
    }
}