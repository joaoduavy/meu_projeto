package exemplo;


public class Produto{

    private String ID;
    private String name;
    private String fabricante;
    
    public Produto(String name, String fabricante){
        this.ID = Integer.toString(hashCode());
        this.fabricante = fabricante;
        this.name = name;
    }

    public String toString(){
        return "(name: " + name + ")";
    }

    public String getFabricante(){
        return this.fabricante;
    }

    public String getID(){
        return this.ID;
    }

    public String getName(){
        return this.name;
    }

    public void setFabricante(String novoFabricante) {
        this.fabricante = novoFabricante;
    }
}