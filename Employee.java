class Employee
{
    int id;
    String name;
    public void print(){
        System.out.println(id);
        System.out.println(name);
        
    }
}

public class Main
{
	public static void main(String[] args) {
	    Employee harry=new Employee();
	    Employee john=new Employee();
	    
	    harry.id=12;
	    harry.name="anshika";
	    john.id=12;
	    john.name="anshika";
	    harry.print();
	    john.print();
	//	System.out.println(harry.id);
		//	System.out.println(harry.name);
	}
}
