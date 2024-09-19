
import java.util.Scanner;

//@author Nguyen Van Tu HE194905
public class IOBasic {

    public static void main(String[] args) {
        int a[], n;
        // Khoi tao doi tuong cho nhap du lieu tu ban phim
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = Integer.parseInt(sc.nextLine());
        // Cap phat mang a
        a = new int[n];
        // Nhap gia tri cho cac phan tu cua mang a
        System.out.println("Input the elements of array a: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + "/" + n + ": ");
            a[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.print("Output the elements of array: ");
        for (int item : a) {
            System.out.format("%5d", item);
        }
        System.out.print("\nSum of the elements: ");
        int sum = 0;
        for (int item : a) {
            sum += item;
        }
        System.out.println(sum);
    }

}
