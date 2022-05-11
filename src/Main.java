import exemplo.Lote;
import exemplo.Produto;

public class Main{
    
    public static void main(String[] args){
        Produto produto = new Produto("leite", "Nestle");
        Lote lote = new Lote(produto, 50);

        System.out.println(lote.toString());    
    }
}