import exemplo.Lote;
import exemplo.Produto;
import exemplo.LoteRepositorio;
import exemplo.ProdutoRepositorio;

public class Main{
    
    public static void main(String[] args){
        Produto produto1 = new Produto("leite integral", "Nestle");
        Produto produto2 = new Produto("leite de cabra", "Nestle");
        Produto produto3 = new Produto("leite vegano", "Nestle");
        Produto produto4 = new Produto("leite de castanha", "Nestle");
        Produto produto5 = new Produto("leite de amêndoas", "Nestle");
        ProdutoRepositorio repo =  new ProdutoRepositorio();

        repo.addProduto(produto1);
        repo.addProduto(produto2);
        repo.addProduto(produto3);
        repo.addProduto(produto4);
        System.out.println(repo.ListarProduto("leite"));    
    }
}