package sample;

public class Friend {
    private String name;
    private int ID;
    private String grade;

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public String getGrade() {
        return grade;
    }

    public Friend(String name , String grade , int ID) {
        this.name = name;
        this.ID = ID;
        this.grade = grade;
    }
    public String toString(){
        return name;
    }

}
