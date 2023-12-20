package Assignment1.University;

public class Admin{
    public int id;
    public String name, uniName;
    public Admin(int id, String name, String uniName) {
        this.id = id;
        this.name = name;
        this.uniName = uniName;
    }
    
    public void display(){
        System.out.println("Admin details:-");
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Affiliated University: "+uniName+"\n");
    }
}