import java.util.Scanner;
public class Greeting{
    public static void main(String[] args) {
        String name;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
         // This program prompts the user to enter their name,
        name = in.nextLine();
        generategreetings(name);
       
        // then generates a personalized greeting using the generategreetings method.
    
    }

        public static void generategreetings(String name) {
            System.out.println("Hello "+ name+"! Welcome to github classroom!");
            
        }
    }
