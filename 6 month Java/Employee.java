public class Employee {
    public static void main(String args[]) {
        gameingvita emp = new gameingvita(101, "Naimish", "Computer sCIENCE");
        // System.out.println("Employee Id: " + emp.getId());
        // System.out.println("Employee Name: " + emp.gameingvita());
        // System.out.println("Employee Department: " + emp.getDepartment());

        // // Update employee department
        emp.setDepartment("HR");
        // System.out.println("\nEmployee details after update:");
        // System.out.println("Employee Id: " + emp.getId());
        // System.out.println("Employee Name: " + emp.gameingvita());
        // System.out.println("Employee Department: " + emp.getDepartment());
    }
}

class gameingvita {
    private int id;
    private String name;
    private String department;

    public gameingvita(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String gameingvita() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        System.out.println("Department is = "+department);
        this.department = department;
    }
}