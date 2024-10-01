
abstract class Employee {
    protected String name;
    protected int age;
    protected double salary;  
    

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        this.salary = 0;  
    }
    
    
    public abstract void calculateSalary();
    
    // Phương thức hiển thị thông tin
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Salary: " + salary);
    }
}

// Lớp con OfficeEmployee (Nhân viên văn phòng)
class OfficeEmployee extends Employee {
    private int workingDays;    // Số ngày làm việc trong tháng
    private final double dailySalary;  // Lương mỗi ngày (cố định)

    public OfficeEmployee(String name, int age, int workingDays, double dailySalary) {
        super(name, age);
        this.workingDays = workingDays;
        this.dailySalary = dailySalary;
    }

    // Ghi đè phương thức tính lương
    @Override
    public void calculateSalary() {
        salary = workingDays * dailySalary;
    }
}

class TechnicalEmployee extends Employee {
    private int workingHours;   
    private double hourlyWage;  

    public TechnicalEmployee(String name, int age, int workingHours, double hourlyWage) {
        super(name, age);
        this.workingHours = workingHours;
        this.hourlyWage = hourlyWage;
    }


    @Override
    public void calculateSalary() {
        salary = workingHours * hourlyWage;
    }
}

public class bai1 {
    public static void main(String[] args) {
        OfficeEmployee officeEmployee = new OfficeEmployee("Nguyen Van A", 30, 20, 100);
        officeEmployee.calculateSalary();
        officeEmployee.displayInfo();

        // Tạo một nhân viên kỹ thuật
        TechnicalEmployee technicalEmployee = new TechnicalEmployee("Nguyen Van B", 28, 160, 15);
        technicalEmployee.calculateSalary();
        technicalEmployee.displayInfo();
    }
}
