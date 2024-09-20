
import java.util.Scanner;

//@author Nguyen Van Tu HE194905
public class Menu {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
            
            System.out.println("Nhap so luong nhan vien toi da: ");
            
            int n = Integer.parseInt(sc.nextLine());
            Employee[] nv = new Employee[n];
            
            int c;
            
            do {
                System.out.println("----Employee Management----");
                System.out.println("1.Input Information");
                System.out.println("2.Print Employee list");
                System.out.println("3.Search and Print list of Employee by Name");
                System.out.println("4.Sort and Print list of Employee order by Name (Desc)");
                System.out.println("5.Exit");
                System.out.println("6.Select an option: ");
                c = Integer.parseInt(sc.nextLine());
                
                switch (c) {
                    case 1: {
                        for (int i = 0; i < n; i++) {
                            nv[i] = new Employee();
                        }
                        for (int i = 0; i < n; i++) {
                            nv[i].inputEmployee();
                        }
                        break;
                        
                    }
                    
                    
                    case 2: {
                        
                        System.out.println("In thong tin:");
                        
                        for (int i = 0; i < n; i++) {
                            System.out.println(nv[i].printEmployee());
                        }
                        break;
                    }
                    case 3: {
                        System.out.println("Nhap chu cai dau");
                        char x = sc.nextLine().charAt(0);
                       x= Character.toUpperCase(x);
                        for(int i=0; i< n ; i++){
                            if (Character.toUpperCase(nv[i].getEmployeeName().charAt(0))== x){
                                System.out.println(nv[i].printEmployee());
                                System.out.println("\n");
                            }
                        }
                        break;
                    }
                    case 4: {
                        Employee y = new Employee();
                        for(int i=0; i<n; i++){
                            for (int j=i+1; j<n-1; j++){
                                if(nv[i].getEmployeeName().charAt(0)< nv[j].getEmployeeName().charAt(0)){
                                    y= nv[i];
                                    nv[i]= nv[j];
                                    nv[j]= y;
                                }
                            }
                        }
                        for(int i =0; i< n; i++){
                            System.out.println(nv[i].printEmployee());
                        }
                        break;
                    }
                    case 5: {
                        System.exit(0);
                    }

                }
                
            } while (c>=1 && c<= 5);
        }
    


    }