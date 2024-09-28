
import java.util.Scanner;

//@author Nguyen Van Tu HE194905

public class AtomDetails {
Atom[] s;

public void input (){
    int n;
    Scanner sc =new Scanner (System.in);
    
    System.out.println("Enter maximum numbers of atomic:");
    n= Integer.parseInt (sc.nextLine());
    s=new Atom[n];
    int number;
    String symbol;
    String fullname;
    float weight;
    for (int i= 0; i< n; i++){
        System.out.println("Enter position of the atomic in periodic table:");
        number =Integer.parseInt (sc.nextLine());
        System.out.println("Enter symbol of the atomic:");
        symbol=sc.nextLine();
        System.out.println("Enter full name of the atomic:");
        fullname =sc.nextLine();
        System.out.println("Enter weight of the atomic:");
        weight=Float.parseFloat(sc.nextLine());
        s[i] =new Atom (number, symbol, fullname, weight);
    }

}
public void display (){
    for (int i = 0; i< s.length; i++){
        System.out.println(s[i]);
    }
}
}