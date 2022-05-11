package exemplo;
import java.util.Map ;
import java.util.HashMap;

public class ProdutoRepositorio {
    private Map<String, Produto> catalogo;
    
    public ProdutoRepositorio(){
        this.catalogo = new HashMap<String, Produto>();
    }

    public String addProduto(Produto p){
        this.catalogo.put(p.getID(), p);
        return p.getID();
    }

    public void AtualizarProduto(String id, String fabricante){
        Produto aux = this.catalogo.get(id);
        aux.setFabricante(fabricante);
        this.addProduto(aux);
    } 

    public void RemoverProduto(String id){
            this.catalogo.remove(id);
    }

    public Produto RecuperarProduto(String id){
       return this.catalogo.get(id); 
    }

    public String ListarProduto(){
        String aux = "";
        for (Map.Entry<String,Produto> pair : catalogo.entrySet()) {
            aux += pair.getValue() + "\n";
        }
        return aux;
    }

    public HashMap<String, Produto> getCatalogo(){
        return (HashMap<String, Produto>)this.catalogo;   
    }
}
