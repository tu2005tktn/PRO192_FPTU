//@author Nguyen Van Tu HE194905

public class Run {
    public static void main(String[] args) {
        Object[] pp = new Object [5];
       for (int i =0 ; i< 5 ; i++ ){
           pp[i] = new Object();
       }
       
        pp[1].setInfo(20, "Tu", "Thai Nguyen");
        pp[2].setName("Em iu");
        pp[3].setAge(20);
       for (int i = 0 ; i< 5 ; i++){
           pp[i]. display ();
       }
       
        
    }
   

}