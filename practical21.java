 class practical21 {
    public static void main(String args[]){
        a a1=new a();
        a1.display();
    }
}

final class a{
    void display(){
        System.out.println("\ndispaly function of final class.....");
    }
}
/*class b extends  a{
    void dispaly(){
        System.out.println("display function of subclass b.....");
    }
}*/ //final class never inherited by another class....