package exemplo;
import java.util.Map;
import java.util.HashMap;

public class LoteRepositorio{
    
    private Map<String, Lote> loteamentos;

    public LoteRepositorio(){
        this.loteamentos = new HashMap<String, Lote>();
    }

    public void AdicionarLote(Lote lote){
        this.loteamentos.put(lote.getID(), lote);
    }

    public void RemoveLote(String id){
        this.loteamentos.remove(id);
    }

    public void AtualizarLote(String id, int quantidade){
        Lote aux = this.loteamentos.get(id);
        aux.setQuantidade(quantidade);
        this.AdicionarLote(aux);
    }
}