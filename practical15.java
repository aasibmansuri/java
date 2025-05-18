
 class base {
    void base(){
        System.out.println("this is base class");

    }}
    class base2 extends base{
        void base2(){
            System.out.println("this is base 2");

        }
    }class child extends base2{
        void child(){
            System.out.println("this is child class ");

        }
    }
    class practical15{
        public static void main(String[] args) {
            child c = new child();
            c.base();
            c.base2();
            c.child();
            
        }
    }


 