import java.util.Scanner;
public class ChatBot {
    public static void main(String[] args){
        String name = greeting();
        int favoriteNumber = counting();
        int age = guessAge();
        verify(name);
        quiz();
        story(name,favoriteNumber,age);
        days();
        System.out.println("It was nice talking to you! Bye!");
    }
    public static String greeting(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi there! What's your name?");
        String name = scanner.nextLine();
        System.out.println("Nice to meet you " + name + "!");
        return name;
    }
    public static void verify(String name){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Just double checking, what did you say your name was?");
        while (true) {
            String verification = scanner.nextLine();
            if (verification.equals(name)) {
                System.out.println("Right, that's what I thought you said.");
                break;
            } else {
                System.out.println("I'm pretty sure you said something different the first time.");
            }
        }
    }
    public static Integer guessAge(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's play a guessing game. I'll try to guess how old you are!");
        System.out.println("Go ahead and type in your age, I promise I won't cheat!");
        int age;
        while(true) {
            int ageInput = scanner.nextInt();
            if (ageInput > 100){
                System.out.println("I know you're not that old! How old are you really?");
            } else if (ageInput < 1) {
                System.out.println("I know you're not that young! How old are you really?");
            } else {
                age = ageInput;
                break;
            }
        }
        int guess = 20;
        int tries = 1;
        int minGuess = 0;
        int maxGuess = 100;
        System.out.println("My first guess is 20!");
        while(guess != age){
            tries ++;
            if(guess < age){
                minGuess = guess;
                guess = (minGuess + maxGuess)/2;
                System.out.println("My next guess is " + guess);
            } else{
                maxGuess = guess;
                guess = (minGuess + maxGuess)/2;
                System.out.println("My next guess is " + guess);
            }
        }
        System.out.println("Got it! It took me " + tries + " guess(es).");
        return age;
    }
    public static Integer counting(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your favorite number");
        int favNum = scanner.nextInt();
        System.out.println("That's a good one, let's count to it.");
        if(favNum >= 0) {
            for (int i = 0; i <= favNum; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = 0; i >= favNum; i--){
                System.out.println(i);
            }
        }
        return favNum;
    }
    public static void quiz(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's see how good you are with java!");
        System.out.println("Here is the question: What is one benefit of using an ArrayList over an array?");
        System.out.println("A) ArrayLists replace arrays in java.");
        System.out.println("B) An ArrayList has a defined size");
        System.out.println("C) An ArrayList has a lot of built in features that an array doesn't");
        System.out.println("Or D) an ArrayList can hold primitive data types");
        while (true){
            String answer = scanner.nextLine();
            if(answer.equalsIgnoreCase("c")){
                System.out.println("Yep, that's right!");
                break;
            } else {
                System.out.println("Not quite, try again!");
            }
        }
    }
    public static void story(String name, int number, int age){
        System.out.println("I feel like I'm getting to know you.\n" +
                "Your name is " + name + " and you are " + age + " years old.\n" +
                "Your favorite number is " + number + ", and you are a pretty good programmer.");
    }
    public static void days(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey what day is today anyways?");
        String day = scanner.nextLine();
        switch (day) {
            case "Monday" -> System.out.println("Oof, Monday's are when things start to happen.");
            case "Tuesday" -> System.out.println("Tuesday's are good days for chores.");
            case "Wednesday" -> System.out.println("Hey! I was born on a Wednesday!");
            case "Thursday" ->
                    System.out.println("Thursday's are great, the weeks almost over but you haven't checked out yet.");
            case "Friday" -> System.out.println("Last weekday, just hold on a little longer!");
            case "Saturday" -> System.out.println("Go and have some fun today!");
            case "Sunday" -> System.out.println("Ah, take it easy today and rest up for the week to come.");
        }
    }
}
