public class Student {
    private String firstname;
    private String lastname;
    private int grade;

    Student(String firstname, String lastname, int grade) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.grade = grade;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String toString(){
        return "Student name: "+ firstname + " " + lastname + " | Grade: " + grade;
    }
}