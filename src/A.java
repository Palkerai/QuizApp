 class A{
    void eat(){
        System.out.println("1");
    }
 }
 class B extends A {
     void walk() {
         System.out.println("2");
     }
 }

 class C extends B {
     void sleep() {
         System.out.println("3");
     }

     public static void main(String[] args) {
         C c1 = new C();
         c1.eat();
         c1.walk();
         c1.sleep();
     }
 }


