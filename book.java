class Book
{
  String name;
  double price;
  int stock;
  String author;

  public Book (String n, double p, int s, String a)
  {
    name = n;
    price = p;
    stock = s;
    author = a;
    
  }


  public String getname ()
   {
     return name;
   }



 public double getprice ()
{
     return price;
 }

  public int getstock ()
  {
    return stock;
  }
  public String getauthor ()
  {
    return author;
  }

}

public class Main
{
  
  public static void main (String[]args)
  {
    Book obj = new Book ("anshika", 54.32, 325, "afwy");
    System.out.println(obj.getname());
    System.out.println(obj.getprice());
    System.out.println(obj.getstock());
    System.out.println(obj.getauthor());
    //obj.setname("wdgfyue");
    //obj.setauthor("strfWA");
    //obj.setprice(246.8264);
    //obj.setstock(352);
    //   System.out.println (obj.getname ());
    //   //System.out.println (obj.getstock ());
    //   System.out.println (obj.getprice ());
    //   System.out.println (obj.getauthor ());
  }
}
