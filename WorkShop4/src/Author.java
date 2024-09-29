//@author Nguyen Van Tu HE194905

public class Author {

   private String firstName;
   private String lastName;
   private String dob;
   private String address;

   public Author (){
       
   }

    public Author(String firstName, String lastName, String dob, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.address = address;
    }
   
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDob() {
        return dob;
    }

    public String getAddress() {
        return address;
    }
   
   
   @Override
   public String toString (){
       return firstName+"   "+lastName+"    "+dob+"     "+address;
       
   }

}