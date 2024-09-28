//@author Nguyen Van Tu HE194905

public class Molecule {
/*●	structure: a string that contains characters or numbers only, holding the molecular structure. 
●	name: a string that holding the full name of the molecule and.
●	weight: a positive, less than 100 floating point value holding the molecular weight. 
*/
    private String structure;
    private String name;
    private float weight;
    /*●	Default constructor: leave the object in safe empty state.
●	Constructor: to set values for State/Data/Attributes.
●	void display(): displays the molecular information on standard output.
*/
    public Molecule (){
        
    }

    public Molecule(String structure, String name, float weight) {
        this.structure = structure;
        this.name = name;
        this.weight = weight;
    }

    public String getStructure() {
        return structure;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }
  
    @Override
   public String toString(){
       return structure +"      "+name+"        "+weight;
   }

}