import java.util.ArrayList;

public class Module {
    private String name;
    private int capacity;
    private ArrayList<Student> students;

    public Module(String aName, int aCapacity){
        this.name = aName;
        this.capacity = aCapacity;
        this.students = new ArrayList<>();
    }

    public String getName(){ //Getter method for getting the name field
        return this.name;
    }

    public int getCapacity(){ //Getter method for getting the capacity field
        return this.capacity;
    }

    public void enrollStudent(Student aStudent){
        this.students.add(aStudent);
    }

    public void cancelEnrolment(int  index){
        this.students.remove(index);
    }

    public void cancelEnrolment(String name)
    {
        int index = -1;
        int count = 0;

        for (Student eachStudent : this.students)
        {
            if (eachStudent.getName().equals(name))
            {
                index = count;
            }

            count++;
        }

        if (index != -1)
        {
            this.students.remove(index);
        }
    }

    public void printEnrolledStudents(){
        for (Student eachStudent: this.students){
            System.out.print(eachStudent.getName() + ", age " + eachStudent.getAge() + "\n");
        }
    }

    public int getNumberOfEnrolments(){
        return this.students.size();
    }
}
