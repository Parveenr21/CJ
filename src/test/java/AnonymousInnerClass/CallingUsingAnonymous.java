package AnonymousInnerClass;

public class CallingUsingAnonymous {

    public static void main(String[] args) {

        CallingUsingAnonymous obj=new CallingUsingAnonymous();

        //The below is can be seen as not creating instance of Outer class but a subclass  with functionality
        //same as Outerclass with a overriden method at run time
        Outer o=new Outer(){
            @Override
            void getx() {
                System.out.println("overrriden method ");
            }
        };

        o.getx();



//Creting a class from Thread class and creating thatto create thread with startmethod overriding.
        Thread t =new Thread(){

            @Override
            public synchronized void run() {
                System.out.println("HELLO guys");
            }
        };
        t.start();


        //Another use..where Interface implementation can be diretly used
        int y=35;

        Age age=new Age() {
            @Override
            public void getAge() {
                System.out.println(y);
            }
        };

        age.getAge();


        //Implement runnable interface
        //Here its not Runnable interface but its subclass or implemnetation of Runnable with run overriding

    Runnable runn=new Runnable() {
        @Override
        public void run() {
            System.out.println("Thread created by Runnable implementation");
        }
    };


    //Creating Thread class object by passing run method implementing class reference.
    Thread t1=new Thread(runn);
    t1.start();

    }
}
