class Calculation {
    public static void main(String [] args)
    {
        String StudentName="Ashish";
        int StringAge=23;
        int javaMarks=63;
        int sqlMarks=85;
        int pythonMarks=78;
        int totalMarks=javaMarks + sqlMarks + pythonMarks;
        int averageMarks=totalMarks/3;
        
        System.out.println("Enter Student Name: " + StudentName);
        System.out.println("Enter Student Age: " + StringAge);
        System.out.println("totalmarks: " + totalMarks);
        System.out.println("averageMarks: " + averageMarks);
    }


      
}