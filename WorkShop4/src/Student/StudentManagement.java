//@author Nguyen Van Tu HE194905
package Student;
import java.util.Scanner;

public class StudentManagement {
private Student [] a;

public void input (){
    int n; 
   
 String name;
 String studentId;
 Date birthDate ;
 String dob;
 String address;
 String major;
 double gpa;
 
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter maximum number of Student:");
    n=Integer.parseInt (sc.nextLine ());
    a = new Student[n];
    for (int i = 0; i< n; i++){
        System.out.println("Enter Student's Name:");
        name =sc.nextLine ();
        System.out.println("Enter Student ID: ");
        studentId =sc.nextLine();
        System.out.println("Enter date of birth");
        dob =sc. nextLine();
      String parts [] = dob.split("/");
      int date=Integer.parseInt(parts[0]);
      int month=Integer.parseInt(parts[1]);
      int year =Integer.parseInt(parts[2]);
      birthDate =new Date (date, month, year);
        System.out.println("Enter address: ");
        address =sc.nextLine();
        System.out.println("Enter major :");
        major =sc.nextLine();
        System.out.println("Enter the GPA:");
        gpa =Double.parseDouble(sc.nextLine());
        a[i] = new Student (name,studentId, birthDate,address,major,gpa);
        
    }
}
public void printAllAttributes (){
    for (int i =0; i< a.length; i++){
    System.out.println("Student Name: "+a[i].getName());
        System.out.println("Student ID: "+a[i].getStudentId());
        System.out.println("Date of birth: "+a[i].getBirthDate());
        System.out.println("Address: "+a[i].getAddress());
        System.out.println("Major: "+a[i].getMajor());
        System.out.println("GPA: "+a[i].getGpa());
}

}
   

}