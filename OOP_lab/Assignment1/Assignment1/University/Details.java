package Assignment1.University;
public class Details {
    public String name, location;
    public int gov_funds;
    public Details(String name, String location, int gov_funds) {
        this.name = name;
        this.location = location;
        this.gov_funds = gov_funds;
    }
    
    public void display(){
        System.out.println("University Name: "+name);
        System.out.println("University location: "+location);
        System.out.println("Alloted Funds by Government: "+gov_funds+"\n");
    }
}