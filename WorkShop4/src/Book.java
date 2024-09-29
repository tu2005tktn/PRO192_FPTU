//@author Nguyen Van Tu HE194905

public class Book {
private Author author;
private String title;
private int noOfPages;
private boolean fiction;
public Book (){
    
}
    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public void setFiction(boolean fiction) {
        this.fiction = fiction;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public String isFiction() {
        return fiction ? "La sach vien tuong": "Khong phai sach vien tuong";
    }
    


   

}