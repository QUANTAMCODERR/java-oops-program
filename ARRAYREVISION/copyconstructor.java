public class copyconstructor {
    public static void main(String[] args) {
        Student s1 = new Student("mc23", "tushar", 19);
        System.out.println(s1);
        Student s2 = new Student( s1);
        System.out.println(s2);
    }
}
class Student
{
    String roll;
    String name;
    int Id;
    
    Student(String rollNO, String name , int id)
    {
        this.roll=rollNO;
        this.name=name;
        this.Id=id;

    }
    
    Student(Student s1)
    {
        this.Id=s1.Id;
        this.roll=s1.roll;
        this.name=s1.name;
    }
}
