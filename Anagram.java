import java.util.Scanner;

class Anagram{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First String:");
        String name=sc.nextLine();
        System.out.println(name.toLowerCase());
        System.out.print("Enter Second String:");
        
        String name1=sc.nextLine();
        System.out.println(name1.toLowerCase());
        
        int len=name.length();
        int len1=name1.length();
        boolean anagram=false;

        for(int i=0; i<len; i++)
        {
            char ch=name.charAt(i);
            System.out.println("check" +ch);
         for(int j=0; j<len1; j++)
         {
            char ch1=name1.charAt(j);
            if( len==len1 && ch==ch1)
            {
                anagram = true;
            }
          }
        
        }
                 if(anagram)
                 {
                   System.out.println("it is an anagram");
                 }
                else 
                {
                   
                    System.out.println("it is not anagam");
                }
                 System.out.println("Do you wish to continue? (y/n)");
            choice = sc.nextLine().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        System.out.println("Program Ended!");
        sc.close();
            }
         }
        
           

  
    







    



    

