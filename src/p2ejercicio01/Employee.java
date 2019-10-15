package p2ejercicio01;

public class Employee {
    private int employeeNumber;
    private String employeeName;
    private String employeeLastName;
    private double employeeSalary;

    public Employee(){ }
    
    public Employee(int empNumber, String empName, String empLName, double empSalary){
        this.employeeNumber = empNumber;
        this.employeeName = empName;
        this.employeeLastName = empLName;
        this.employeeSalary = empSalary;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
    
    public double calculatePayroll(int workDays){
        return workDays * this.employeeSalary;
    }
    
    public double calculatePayroll(int workDays, double taxes){
        return workDays * this.employeeSalary 
                * (1-taxes);
    }
    
    public String toString(){
        return "Employee Number : " + 
                this.employeeNumber
               + "\n Employee Name : " + 
                this.employeeName +
                " " + this.employeeLastName +
                "\n Employee Salary : ";
    }
}

