public class Main {
    public static void main(String[] args){
        Employee Employee1 = new Employee(123, "Louis","Phung", 100);
        System.out.println(Employee1);
        Employee1.setRaiseSalary(5);
        System.out.println("Annual Salary: "+ Employee1.getAnnualSalary());
        System.out.println("Salary after raising 5%: " + Employee1.getRaiseSalary());
    }
}
