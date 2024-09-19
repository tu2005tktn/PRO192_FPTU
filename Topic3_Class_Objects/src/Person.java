
import java.util.logging.Logger;

//@author Nguyen Van Tu HE194905

public class Person {

   int id;
   String firstName;
   String lastName;
   int yearOfBirth;
   boolean gender;
   // Dinh nghia ham khoi tao (contructor)
   public Person(){
   
   }
   public Person (int _id, String _fName, String _lName, int _year, boolean _gender){
       // gan gia tri cho cac thuoc tinh 
       this.id= _id;
       firstName= _fName;
       lastName = _lName;
       yearOfBirth = _year;
       gender= _gender;
   }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

   
       // Nhap thong tin cho person 
       public void inputInfo(){
           // Cho nguoi dung nhap tu ban phim 
       }
       // Hien thi thong tin cua Person
       public String printInfo (){
           String label ="Student information: \n";
          
           return label+ "ID: "+ id +"\nFullname: "+firstName+ " "+ lastName+ "\nYear of birth: "+ yearOfBirth+ "\nGender: "+ gender;
       }
       
   

}