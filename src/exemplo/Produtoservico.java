import java.util.ArrayList;

public class Produtoservico{

    private LoteRepositorio loterep;
    private ProdutoRepositorio prodrep;
    
    public Produtoservico(LoteRepositorio aux1, ProdutoRepositorio aux2){
        this.loterep = aux1;
        this.prodrep = aux2;
    }

    private ArrayList<Produto> ListProdsLote(String nome){
        ArrayList<Lote> lotes = loterep.getAll();
        ArrayList<Produto> prods = getProdsFromLote(lotes);
        ArrayList<Produto> prodsName =  getProdsByName(nome, prods);

        return prodsName;
    }

    private static getProdsFromLote(ArrayList<Lote> lote){
        ArrayList<Produto> query = new ArrayList<Produto>();
        
        for(Lote l : lote)
            query.add(l.getProd());

        return query;
    }

    private static ArrayList<Produto> getProdsByName(String nome, ArrayList<Produto> prods){
        ArrayList<Produto> query = new ArrayList<Produto>();

        for(Produto p : prods){
            if(p.getName().contains(nome))
                query.add(p);
        }

        return query; 
    }

    public ArrayList<Produto> ListProdByName(String nome){
        ArrayList<Produto> prods = this.prodrep.getAll();
        ArrayList<Produto> query = getProdsByName(nome, prods);

        return query;
       
    }
}