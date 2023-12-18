package Assignment1;

import Assignment1.University.*;
import Assignment1.Member.*;

public class Viewer{
    public static void main(String[] args) {
        Details uni = new Details("UIT", "Javendrabad", 12000000);
        Admin admin = new Admin(342, "Lisa Dxn", "UIT");
        Teacher teacher = new Teacher("Eren Yagami", "CSE", 86000, "PhD in Neural Engines", "UIT");
        Student student = new Student("Meliodas Toshinori", "CSE", 1, 19, "Slokovia", "UIT");
        uni.display();
        admin.display();
        teacher.display();
        student.display();
    }
}