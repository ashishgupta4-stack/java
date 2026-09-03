class StaticExample{
    static String name="Ashish";
    static int count=0;
    int id;

    StaticExample(){
        count++;
    }
    StaticExample(int id){
        count++;
    }

    static void display(){
        int id1=10;
        System.out.println("Name: "+name);
       // System.out.println("Count: "+count);
        return;  
        //System.out.println("Id: "+id);
    }

    void show(){
        //System.out.println("Name: "+name);
        System.out.println("Id: "+id);
    }

    public static void main(String args[]){
       
        StaticExample se =new StaticExample();
        StaticExample se1= new StaticExample(5);
        se1.display();
        se.show();
        se.display();

    }
}