//https://www.codewars.com/kata/535474308bb336c9980006f2/train/java
public class GreetMe{
    public static String greet(String name){
        return String.format("Hello %s!", name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase());
    }
}