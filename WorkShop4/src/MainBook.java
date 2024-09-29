
import java.util.Scanner;

//@author Nguyen Van Tu HE194905

public class MainBook {
    public static void main(String[] args) {
        Book b = new Book();
        Author a = new Author ("Tu","Nguyen","20/09/2005","Thai Nguyen");
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap thu Tac gia :");
        b.setAuthor(a);
        System.out.println("Nhap tieu de");
        b.setTitle(sc.nextLine());
        System.out.println("Nhap so trang");
        b.setNoOfPages(Integer.parseInt(sc.nextLine()));
        System.out.println("The book is fiction ?");
        b.setFiction(Boolean.parseBoolean(sc.nextLine()));
        System.out.println("Thong tin ve cuon sach:");
        System.out.println(b.getAuthor());
        System.out.println(b.getTitle());
        System.out.println(b.getNoOfPages());
        System.out.println(b.isFiction());
        
        
    }
   

}