package Lesson17_Polymorphism;

public class MethodOverloading {

    public void numberCall(int number){
        System.out.println("int parameter");
    }

    public void numberCall(double number){
        System.out.println( "double parameter");
    }

    public void numberCall(Integer number){
        System.out.println( "Integer parameter");
    }

    public void numberCall(Double number){
        System.out.println( "Double parameter");
    }

    public void numberCall(String number){
        System.out.println( "String parameter");
    }

}

class Call {
    public static void main(String[] args) {
        MethodOverloading overloading = new MethodOverloading();

        overloading.numberCall('a');

        System.out.println('a' + 'b');   // 195
//   byte > char > short > int > long > float > double
    }
}