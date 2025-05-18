class practical20 {
    public static void main(String[] args) {
        circle c1=new circle();
        c1.area();
        rectangle r1=new rectangle();
        r1.area();
        triangle t1=new triangle();
        t1.area();
    }
}

abstract class shape{
    abstract void area();
}
class circle extends shape{
         public void area(){
                int radius=12;
                System.out.println("area of circle ="+3.1*radius*radius);
         }
}
class rectangle extends shape{
    public void area(){
          int length=12;
          int breadth=21;
          System.out.println("area of rectangle="+length*breadth);
    }
}

class triangle extends shape{
        public void area(){
            int base=12;
            int heigght=32;
            System.out.println("area of triangle="+(base*heigght)/2);
        }
}