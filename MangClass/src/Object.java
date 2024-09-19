//@author Nguyen Van Tu HE194905

public class Object {

    private int age;
    private String name;
    private String address;
    public Object(){
        
    }

    public Object(int age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public void setInfo(int age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

}
