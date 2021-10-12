class Student{
     String name;
     public Student(String s)
     {
         name=s;
     }
     Student()
     {  name="unknown";
         
     }
 }

public class Main
{
	public static void main(String[] args) {
	    Student o=new Student("abc");
	    Student i=new Student();
		System.out.println(o.name);
			System.out.println(i.name);
	}
}
