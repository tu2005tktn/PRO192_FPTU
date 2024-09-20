
import java.util.Scanner;

//@author Nguyen Van Tu HE194905

public class Employee {
private int employeeId;
private String employeeName;
private String dateOfBirth;
private String gender;
private boolean isMarried;
public void inputEmployee (){
    Scanner sc = new Scanner (System.in );
    
    System.out.println("Nhap id: ");
    employeeId= sc.nextInt();
    sc.nextLine();
    System.out.println("Nhap ten: ");
    employeeName = sc.nextLine();
    System.out.println("Nhap ngay thang nam sinh: ");
    dateOfBirth =sc.nextLine();
    System.out.println("Nhap gioi tinh: ");
    gender = sc. nextLine();
    System.out.println("Nhap trang thai hon nhan: ");
    isMarried =sc.nextBoolean();
    sc.nextLine();
    
    
    
}
public String printEmployee (){
    return "ID  Name    Date of birth   Gender  Married \n"+employeeId+"    "+employeeName+"        "+dateOfBirth+"         "+gender+"  "+isMarried;
}
public Employee (){

   
}
public Employee (int employeeId, String employeeName, String dateOfBirth, String gender, boolean isMarried){
    
}

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public boolean isIsMarried() {
        return isMarried;
    }

}