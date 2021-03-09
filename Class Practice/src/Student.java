import java.util.ArrayList;
import java.util.IdentityHashMap;

public class Student {
    private String firstname;
    private int id;
    private ArrayList<Courses> courses;

    Student (String firstname, int id ){
        this.firstname = firstname;
        this.id = id;
        System.out.println("Student object created");
    }

    public void getAddCourses( Courses Courses){
        this.courses.add(Courses);
    }

    public boolean getAverageGrade(){
        int total = 0;
        int i;
        int [] arr2
        for (i = 0, i<length. , i++ ){

        }
    }




    public void setFirstName(String firstname){
        firstname = firstname;
    }
    public String getFirstName(){
        return firstname;
    }

    public void setId(int id){
        id = id;
    }
    public int getId(){
        return id;
    }

    public String toString(){
        return "Student Firstname: "+ firstname + "ID: " + id;
    }
}
