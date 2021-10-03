package nestedclass;

public class OuterClass {


    //outer class variables
     private int outerNum1 = 10;
    //outer class constructor

    public OuterClass(){

}
    Inner inner = new Inner();


    //outer class method
    public void outerMethod1() {
        System.out.println("outer class method A");
        inner.innerMethod();

    }
    public void outerMethod2() {
        System.out.println("outer class method B");
    }
    //inner class A
    public class Inner {
       //inner class constructor
        public Inner() {

        }
        //inner class variables
        int numA= 6;
        //inner class method
        public void innerMethod() {
            outerNum1 = 64;
            System.out.println("this is inner method");
        }

    }


} //outer class ends here
