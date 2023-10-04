public class Main {
    public static void main(String[] args) {
        Student st1= new Student();
        System.out.println("Student 1 Information:");
        st1.displayInfo();

        Student st2 = new Student("Anna",15,'A');
        System.out.println("Student 2 Information:");
        st2.displayInfo();


    }

}
