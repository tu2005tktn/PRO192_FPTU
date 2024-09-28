//@author Nguyen Van Tu HE194905

public class Atom {
private int number;
private String symbol;
private String fullname;
private float weight;

public Atom (){
    
}

    public Atom(int number, String symbol, String fullname, float weight) {
        this.number = number;
        this.symbol = symbol;
        this.fullname = fullname;
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getFullname() {
        return fullname;
    }

    public float getWeight() {
        return weight;
    }
    
@Override
public String toString (){
    return number+"     "+symbol+"      "+fullname+"        "+weight;
}
   

}