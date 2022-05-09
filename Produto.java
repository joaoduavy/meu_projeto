public class Produto{

    private String ID;
    private String name;
    private String fabricante;
    
    public Produto(String name){
        name = name;
    }

    public String toString(){
        return "(name: " + name + ")";
    }
}