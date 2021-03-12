import java.util.ArrayList;
import java.util.IdentityHashMap;

public class Student {
    private String firstname;
    private int id;
    private int ID;
    private ArrayList<Courses> course ;

    Student (String firstname, int id ){
        this.firstname = firstname;
        this.id = ID;
        course = new ArrayList<>();
        System.out.println("Student object created");
    }

    public void getAddCourses(Courses Courses){
        this.course.add(Courses);
    }

    public double getAverage(){
        double average = 0;
        double total = 0;
        for ( int i = 0; i < course.size(); i++){
            total = total + course.get(i).getStudentGrade();
        }
        average = total / course.size();
        return average;
    }


    public String getFirstName(){
        return firstname;
    }

    public int getId(){
        return ID++;
    }

    public String toString(){
        return "Student Firstname: "+ firstname + "ID: " + ID;
    }
}