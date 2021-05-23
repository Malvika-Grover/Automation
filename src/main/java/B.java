public class B {
    static int d = 2;
    static int e = 3;


    //method3 - divide
    public static void divide(){
        int f = d/e;
        System.out.println("The Division is "+ f);
    }

    //method4
    public static void subtract(){

        int sub = d-e;
        System.out.println("The subtraction is" +sub);
    }

    //method7
    public static void Vivo(){
        System.out.println("this is a Vivo phone");
    }

    public static void Oppo(){
        System.out.println("This is a Oppo phone");
    }




    //main method
    public static void main(String[] args) {
        //object create with name - obj of class A
        A obj = new A();

        //calling method1(sum) using object created above
        obj.sum();

        //calling method2(multiply) using object created above
        obj.multiply();

        //method3 call
        subtract();

        //method4 call
        divide();

        //calling method5(Samsung) using object created above
        obj.Samsung();

        //calling method6(Apple) using object created above
        obj.Apple();

        //method7 call
        Vivo();

        //method8 call
        Oppo();

    }
}
