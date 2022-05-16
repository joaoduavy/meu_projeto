package exemplo;
import java.util.Map ;
import java.util.HashMap;
import java.util.ArrayList;

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

    public HashMap<String, Produto> getCatalogo(){
        return (HashMap<String, Produto>)this.catalogo;   
    }

    public ArrayList<Produto> getAll(){
        ArrayList<Produto> query = new ArrayList<Produto>();

        for(String id : this.catalogo.keySet()){
            if(this.catalogo(id).getName().contains(nome))
                query.add(p);
        }

        return query; 
    }
}
