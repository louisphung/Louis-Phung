public class Main {
    public static void main(String[] args){
    School School = new School("Windermere Secondary" , 10 , 100);
    System.out.println(School);

    //add 10 Students
        Student Student1 = new Student("Lucy","A", 12);
        Student Student2 = new Student("Luu","B", 12);
        Student Student3 = new Student("Khan","C", 10);
        Student Student4 = new Student("Alex","D", 12);
        Student Student5 = new Student("Brian","E", 11);
        Student Student6 = new Student("Harry","F", 12);
        Student Student7 = new Student("Lisa","G", 10);
        Student Student8 = new Student("Brianna","H", 9);
        Student Student9 = new Student("Lion","I", 11);
        Student Student10 = new Student("Tam","J", 12);

    //add 3 Teachers
        Teacher Teacher1 = new Teacher("Soo","Carly", "English");
        Teacher Teacher2 = new Teacher("Thompson","Ly", "Math");
        Teacher Teacher3 = new Teacher("Grey","Zhou", "Physic");

    //Show StudentList
        School.ShowStudents();
    //Show TeacherList
        School.ShowTeachers();
    }
}