 class Employee {
     String name;
     int age;
    void eat(){
         System.out.println("eat");
     }
      public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "ram";
        e1.age = 19;
        System.out.println(e1.name+" "+e1.age);
        e1.eat();
     }
 }


