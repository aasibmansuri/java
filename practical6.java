class student{

    int enrollmentNo;
    String name;

    public student(int enrollmentNo, String name) {
        this.enrollmentNo = enrollmentNo;
        this.name = name;
    }
}

public class practical6{
    public static void main(String[] args) {
        
        student student = new student(101, "aasib");
        student student2 = new student(102, "nawaz");
        student student3 = new student(103, "samir");

        
        System.out.println("student Names:");
        System.out.println(student.name);
        System.out.println(student2.name);
        System.out.println(student3.name);
    }
}

