import java.util.Scanner;

public class userinput 
{
    public static void main(String[] args) 
    {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the age ");
            int age = scan.nextInt();
            
            System.out.println("Age is " + age);
            
            System.out.println("Enter the average age");
            double avg = scan.nextDouble();

            System.out.println("Average is " + avg);
            
            System.out.println("Enter the name");
            String name = scan.next();

            System.out.println("Name is "+name);
        }



        
    }
    
}
