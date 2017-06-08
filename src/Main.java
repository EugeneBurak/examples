public class Main {

    public static void main(String[] args) {
        Integer a1 = 4000;
        int a2 = 4000;
        Integer a3 = 4000;
        Integer a4 = 5;
        Integer a5 = 5;
        Integer a6 = new Integer(5);
        if (a1.equals(a2))  {
            System.out.println("a1 equals a2 - true");
        } else  {
            System.out.println("equals false");
        }
        if (a1.equals(a3))  {
            System.out.println("a1 equals a3 - true");
        } else  {
            System.out.println("equals false");
        }
        if (a1 == a2)   {
            System.out.println("a1 == a2");
        }   else    {
            System.out.println("!=");
        }
        if (a1 == a3)   {
            System.out.println("==");
        }   else    {
            System.out.println("!=");
        }
        if (a4 == a5)   {
            System.out.println("a4 == a5");
        }   else    {
            System.out.println("!=");
        }
        if (a4 == a6)   {
            System.out.println("a4 == a6");
        }   else    {
            System.out.println("!=");
        }
	// write your code here
    }
}
