
import java.util.Scanner;

//@author Nguyen Van Tu HE194905

public class MoleculeManagement {
    int n;
  Molecule [] m ;
    public MoleculeManagement (){
        
    }
    
    
    
public void input (){
    Scanner sc= new Scanner(System.in);
    System.out.println("Number of Molecules ?");
    n= Integer.parseInt(sc.nextLine());
    m = new Molecule [n];
    for (int i = 0; i < n; i++){
        float weight;
        String name;
        String structure;
        System.out.println("Enter Molecule's Structure:");
        structure = sc.nextLine();
        System.out.println("Enter Molecule's Name:");
        name = sc.nextLine();
        System.out.println("Enter Molecule's Weight:");
        weight =Float.parseFloat(sc.nextLine());
        m[i] = new Molecule(structure, name, weight);
    }
    
    
}
  public void display (){
      System.out.println("STRUCTURE       NAME        WEIGHT");
        for(int i = 0; i< m .length; i++){
            
            System.out.println(m[i]);
    }
   

}
}