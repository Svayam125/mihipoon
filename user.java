import java.util.Scanner;



public class user {
    public static void main(String[] args) {
        Scanner myobj = new Scanner (System.in);

        System.out.println("enter name,age and Salay:");

        String name = myobj.nextLine();

        int age = myobj.nextInt();

        double salary = myobj.nextDouble();

        System.out.println("name:"+name  +" "+"age:"+age+" "+"Salary:"+salary);




        
    }
    
}
