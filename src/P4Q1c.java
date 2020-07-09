
public class P4Q1c {
        public static void main(String[]args){
        EmployeeC epy1=new EmployeeC("John",4000);
        EmployeeC epy2=new EmployeeC("Alex");

        epy2.setSalary(5000);
        System.out.print("The Higher Salary: ");
        if(epy1.getSalary()>epy2.getSalary()){
            System.out.println(epy1.getName()+ "  " + epy2.getSalary());
        }else{
            System.out.println(epy2.getName()+ "  "+ epy2.getSalary());
        }
        System.out.println("Employee Name:"+epy1.getName());
        System.out.println("Salary: RM"+epy1.getSalary());
        epy1.raiseSalary(0.08);
        System.out.println("Salary+8%: RM"+epy1.getSalary());
        System.out.println("Employee Name:"+epy2.getName());
        System.out.println("Salary: RM"+epy2.getSalary());
        epy2.raiseSalary(0.08);
        System.out.println("Salary+8%: RM"+epy2.getSalary());
        System.out.printf("Total: RM%.2f + RM%.2f=RM%.2f \n",epy1.getSalary(),epy2.getSalary(),(epy1.getSalary()+epy2.getSalary()));
        
        
    }
    
    
}
