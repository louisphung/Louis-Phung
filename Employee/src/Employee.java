public class Employee {

    private int id;
    private String firstname;
    private String lastname;
    private int salary;
    private int RaiseSalary;

    Employee(int id, String firstname, String lastname, int salary){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
        System.out.println("Employee object created");
    }

    public void setId(int id) {
        id = id;
    }

    public int getId(){
        return id;
    }

    public void setFirstname(String firstname){
        firstname = firstname;
    }

    public String getFirstname(){
        return firstname;
    }

    public void setLastname(String lastname){
        lastname = lastname;
    }

    public String getLastname(){
        return lastname;
    }

    public String getName(){
        String getName = firstname + " "+ lastname;
        return getName;
    }

    public void setSalary(){
        if (salary < 0){
            salary = 0;
        }
        else {
            salary = salary;
        }
    }

    public int getSalary(){
        return salary;
    }

    public int getAnnualSalary(){
        int AnnualSalary = salary * 12;
        return AnnualSalary;
    }

    public void setRaiseSalary(int percent){
        int Percent = percent;
        RaiseSalary = salary + (salary*Percent)/100;
    }

    public int getRaiseSalary(){
        return RaiseSalary;
    }

    public String toString(){
        return "Employee ID: " + id + " Name: " + firstname + " " + lastname + " Salary: " + salary;
    }
}
