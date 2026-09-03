import java.util.Scanner;

class Student{
       
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Student name:");
        String name= sc.nextLine();
        
        //Remove leading and trailing spaces from the name
        System.out.println(name.trim());

        //Count the number of characters in the name
         System.out.println(name.length());

         //Display First and last name
          System.out.println(name.substring(1,6));
          System.out.println(name.substring(8,12));

          //Convert name into Uppercase and Lowercase
          System.out.println(name.toUpperCase());
            System.out.println(name.toLowerCase());

            //Check if the name contains a specific character
          //  System.out.println(name.co);


    }
}