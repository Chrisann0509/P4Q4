import java.util.Scanner;
public class TestCarRegistration {
    public static void main(String[] args){
        
        CarType[] types={new CarType("Toyota","Vios",1.5),
                         new CarType("Nissan","Teana",2.0),
                         new CarType("Honda","City",1.6)};
        Registration[] registration=new Registration[2];
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<registration.length;i++){
            System.out.println("Registration number:"+Registration.getCount());
            System.out.print("Enter the owner name: ");
            String name=scan.nextLine();
            System.out.print("Enter the IC number: ");
            String icNo=scan.nextLine();
            
            Person own=new Person(name,icNo);
            System.out.print("Enter the plate No:");
            String plateNo=scan.nextLine();
            System.out.print("Enter the color: ");
            String color=scan.nextLine();
            System.out.print("Enter the year: ");
            int year=scan.nextInt();
            
            //for(carType t:types)
            
            System.out.println("Car Types:");
            for(int a=0;a<types.length;a++){
                System.out.printf("%d %s \n",a+1,types[a].toString());
                
            }
            System.out.print("Select car type:");
            int selection=scan.nextInt();
           
            
            Car car=new Car(plateNo,color,year,types[selection-1]);
            registration[i]=new Registration(own,car);
            
            
            
        }
        
    displayListing(registration);
    
    }
    
public static void displayListing(Registration[] regArr){
    System.out.printf("%50s \n","Car Registration Listing");
    System.out.printf("%-6s %-12s %-12s %-10s %-8s %-6s %-10s %-5s\n","Reg No." ,"Name" ,"IC No.", "Plate No." ,"Color", "Year", "Make","Model" ,"Capacity");
    for(int i=0;i<regArr.length;i++){
        System.out.println(regArr[i]);
    }
    
}
}
