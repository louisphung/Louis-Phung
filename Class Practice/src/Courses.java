public class Courses {
    private String StudentName;
    private int grade;

    Courses(String StudentName, int grade){
        this.StudentName = StudentName;
        this.grade = grade;
    }


    public int getAverageGrade(){
        int AverageGrade = grade/8;
        return AverageGrade;
    }


}
