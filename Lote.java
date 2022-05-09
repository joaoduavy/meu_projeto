public class Lote{
    
    private String ID;
    private Produto produto;
    private int quantidade;

    public Lote(Produto p, int q){
        produto = p;
        quantidade = q;
    }

    public String toString(){
        return "quantidade: " + quantidade + ", " + "produto: " + produto.toString();
    } 
}