// program for data hiding in java

public class Employee {
    private int  id;
    private String name;
    private String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    public static void main(String args[]){
        Employee emp=new Employee(101,"Naimish","Computer");
        System.out.println("Employee Id: "+emp.id);
        System.out.println("Employee Name:"+emp.name);
        System.out.println("Employee Department: "+emp.department);
        
        // Update employee department
        emp.setDepartment("HR");
        System.out.println("\nEmployee details after update:");
        System.out.println("Employee Id: "+emp.id);
        System.out.println("Employee Name:"+emp.name);
        System.out.println("Employee Department: "+emp.department);
    }
}