import  java.io.BufferedReader;
import java.io.*;
class Buffer{
    public static void main(String args[]) throws IOException


    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        System.out.print( "Enter your name:");
        String name= br.readLine();

        System.out.print("Enter your Age:");

        int age= Integer.parseInt(br.readLine());

        System.out.println("Helllo : " + name);
        System.out.println("Age : " + age);

    }
}