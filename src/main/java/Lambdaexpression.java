
@FunctionalInterface
interface Interface1 {
    public void greetings();
}

@FunctionalInterface
interface Interface2 {
    public void name(String name);
}

@FunctionalInterface
interface Interface3 {
    public void add(int a, int b);
}


public class Lambdaexpression {
 public static void main(String[] args) {
     Interface1 interf1 = () -> {
         System.out.println("Hello World");
     };
     interf1.greetings();
     Interface2 interf2 = (String name) -> {
         System.out.println("My name is " + name);
     };
     interf2.name("JAVA");
     Interface3 interf3 = (int a, int b) -> {
         System.out.println("The addition is " + (a + b));
     };
     interf3.add(1, 2);
 }

}
