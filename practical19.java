interface a
{
    public void aasib();
}interface b{
    public void aasib1();
}
class aasib implements a,b{


    public void aasib(){
        System.out.println("I am from interface a");
    }
    public void aasib1(){
        System.out.println("I am from interface b");
    }

}
public class practical19{
    public static void main(String args[])
    {
        aasib a = new aasib();
        a.aasib();
        a.aasib1();
    }
}