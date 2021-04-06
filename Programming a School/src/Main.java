public class Main {
    public static void main(String[] args){
        School School = new School("Windermere Secondary" , 10 , 100);
        System.out.println(School);

        //add 10 Students
        School.AddStudent("Anna","Kim",88);
        School.AddStudent("Anne","Jin",86);
        School.AddStudent("Angela", "Zhen", 78);
        School.AddStudent("Anthea", "Zeng", 68);
        School.AddStudent("Anthony", "Yan", 89);
        School.AddStudent("Aaron", "Nguyen", 90);
        School.AddStudent("Ben", "Phung", 56);
        School.AddStudent("Steven", "Zhou", 67);
        School.AddStudent("John", "Zou", 90);
        School.AddStudent("Johnny", "Zang", 77);

        //add 3 Teachers
        School.AddTeacher("Soo","Carly", "English");
        School.AddTeacher("Thompson","Ly", "Math");
        School.AddTeacher("Grey","Zhou", "Physic");

        //Show StudentList
        School.ShowStudents();
        //Show TeacherList
        School.ShowTeachers();

        //remove 2 students
        School.DeleteStudent("Jhon", "Zou", 90);
        School.DeleteStudent("Steven", "Zhou", 67);
        //remove 1 teacher
        School.DeleteTeacher("Soo", "Carly","English");
        // print out student list
        System.out.println("Student list:");
        School.ShowStudents();
        //print out teacher list
        System.out.println("Teacher list:");
        School.ShowTeachers();


    }
}
