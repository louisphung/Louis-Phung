public class Main {
    public static void main (String[] args){
        Student Student1= new Student("Jay", 100);
        System.out.println(Student1);
        Courses course1 = new Courses("English", 85);
        System.out.println(course1);
        Courses course2 = new Courses("Physic", 98);
        System.out.println(course2);
        Courses course3 = new Courses("CLC", 80);
        System.out.println(course3);
        Courses course4 = new Courses("Programming", 90);
        System.out.println(course4);
        Courses course5 = new Courses("Spanish", 87);
        System.out.println(course5);
        Courses course6 = new Courses("Math", 78);
        System.out.println(course6);
        Courses course7 = new Courses("Bio", 81);
        System.out.println(course7);
        Courses course8 = new Courses("PE", 96);
        System.out.println(course8);
        Student1.getAddCourses(course1);
        Student1.getAddCourses(course2);
        Student1.getAddCourses(course3);
        Student1.getAddCourses(course4);
        Student1.getAddCourses(course5);
        Student1.getAddCourses(course6);
        Student1.getAddCourses(course7);
        Student1.getAddCourses(course8);
        System.out.println(Student1.getAverage());


    }
}