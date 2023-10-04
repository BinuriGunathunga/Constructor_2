public class Student {
    private String name;
    private int age;
    private char grade;

    Student(){
        name = "Liya";
        age = 18;
        grade = 'B';
    }
    Student(String name, int age, char grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = 'N';
    }
    void displayInfo(){
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
        System.out.println("Grade is: " + grade);
    }
}
