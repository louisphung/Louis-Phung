import java.util.ArrayList;

public class School {
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    private String SchoolName;
    private int NumberOfTeacher;
    private int NumberOfStudent;

    School(String SchoolName, int NumberOfTeacher, int NumberOfStudent) {
        this.SchoolName = SchoolName;
        this.NumberOfTeacher = NumberOfTeacher;
        this.NumberOfStudent = NumberOfStudent;
    }
    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }

    public int getNumberOfTeacher() {
        return NumberOfTeacher;
    }

    public void setNumberOfTeacher(int numberOfTeacher) {
        NumberOfTeacher = numberOfTeacher;
    }

    public int getNumberOfStudent() {
        return NumberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        NumberOfStudent = numberOfStudent;
    }
    // add teacher
    public void AddTeacher(String firstname, String lastname, String subject){
        teachers.add(new Teacher(firstname,lastname, subject));
    }

    //delete teacher
    public void DeleteTeacher(String firstname, String lastname, String subject){
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getFirstname() == firstname && teachers.get(i).getLastname() == lastname && teachers.get(i).getSubject() == subject) {
                teachers.remove(i);
            }
        }
    }

    //add student
    public void AddStudent(String firstname, String lastname, int grade){
        students.add(new Student(firstname,lastname, grade));
    }
    //delete teacher
    public void DeleteStudent(String firstname, String lastname, int grade) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getFirstname() == firstname && students.get(i).getLastname() == lastname && students.get(i).getGrade() == grade) {
                students.remove(i);
            }
        }
    }

    //show all Teachers
    public void ShowTeachers(){
        for (int i = 0; i< teachers.size(); i++){
            System.out.println("Teacher Name: "+ teachers.get(i).getFirstname() + " "+ teachers.get(i).getLastname() + " | Subject: " + teachers.get(i).getSubject());
        }
    }

    //show all Students
    public void ShowStudents(){
        for (int i = 0; i< students.size(); i++){
            System.out.println("Student Name: "+ students.get(i).getFirstname() + " "+ students.get(i).getLastname() + " | Grade: " + students.get(i).getGrade());
        }
    }


    public String toString(){
        return "School name: " + SchoolName + " | Number of teacher: " + NumberOfTeacher + "| Number of student: " + NumberOfStudent;
    }
}
