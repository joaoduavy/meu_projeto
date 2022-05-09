public class Main{
    
    public static void main(String[] args){
        Produto produto = new Produto("leite");
        Lote lote = new Lote(produto, 50);

        System.out.println(lote.toString());658231    
    }
}