import java.util.ArrayList;

public class Student {
    private String name; //name field - holds a student's name, keep data private, use a getter to call it = Good OOP
    private int age; //age field - holds a student's age
    private ArrayList<String> nickNames; //nickNames field - holds the nicknames the student may be known as

    public Student(String aName, int anAge){ //Constructor for the Student Class - Creates a Student Object
        this.name = aName;
        this.age = anAge;
        this.nickNames = new ArrayList<>();
    }

    public String getName(){ //Getter method for getting the name field
        return this.name;
    }

    public int getAge(){ //Getter method for getting the name field
        return this.age;
    }

    public void setName(String aName){ //Setter Method for the name field - sets the value of the name field to the value of the parameter aName
        this.name = aName;
    }

    public void birthday(){ //Increments the value of the age field of the student
        this.age++;
    }

    public void addNickname(String aName){
        this.nickNames.add(aName);
    }

    public void printNicknames(){ //Prints the students nicknames to the console.
        for (String eachName : this.nickNames) {
            System.out.println(eachName);
        }
    }
}
