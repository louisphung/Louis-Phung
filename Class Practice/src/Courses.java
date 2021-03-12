public class Courses {
    private String SubjectName;
    private int StudentGrade;

    Courses(String SubjectName, int StudentGrade){
        this.SubjectName = SubjectName;
        this.StudentGrade = StudentGrade;
    }

    public int getStudentGrade() {
        return StudentGrade;
    }

    public void setStudentGrade(int studentGrade) {
        StudentGrade = studentGrade;
    }

    public String toString(){
        return "Subject name: " + SubjectName + " | Student Grade: " + StudentGrade;
    }
}