
public class EmployeeC {
    private String name;
    private double salary;
    EmployeeC(){
        name="";
        salary=0.0;
    }
    EmployeeC(String employeeName){
       name = employeeName;
       salary=0.0;
    }
    public EmployeeC(String employeeName, double currentSalary) { 
    name = employeeName;
    salary = currentSalary;
    }
    public void setName(String n){
        name=n;
    }
    public void setSalary(double sly){
      
             salary=sly;
        
    }
   
    public String getName(){
        return name;
    }
    public double getSalary(){
      return salary;
    }
    void raiseSalary(double percent){
    salary = salary + (salary * percent / 100.0);
    }
    
    
}
