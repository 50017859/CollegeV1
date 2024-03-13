// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Student s = new Student("Stewart", 24);
        Student s2 = new Student("Larry", 51);
        Student s3 = new Student("Bob", 29);

        Module m = new Module("Computing", 20);
        Module m2 = new Module("Art", 18);
        m.enrollStudent(s);
        m.enrollStudent(s2);
        m.enrollStudent(s3);

        System.out.println(m.getNumberOfEnrolments());
        m.printEnrolledStudents();

        System.out.print("\n");

        m.cancelEnrolment(1);
        m.printEnrolledStudents();
        System.out.println(m.getNumberOfEnrolments());
    }
}