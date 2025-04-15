import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        String[] questions = {"What is the main function of a router?",
                "Which part of the computer is considered as the brain of the computer?",
                "What year wa Facebook launched?",
                "Who is known as the father of computer?",
                "What was the first programming language?"};

        String[][] options = {{"1. Storing messages.", "2. Directing internet Traffic.", "3. Managing password."},
                {"1. Keyboard.", "2. CPU", "3. GPU"},
                {"1. 2000", "2. 2001", "3. 2004"},
                {"1. Charles Babbage", "2. Albert Einstein", "3. Mary Curie"},
                {"1. Fortan", "2. C++", "3. COBOL"}};

        int[] answers = {2, 2, 3, 1, 1};
        int score;
        int guess;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lets start the Game of Quiz");


        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for(String option :options[i]){
                System.out.println(option);
            }
            System.out.println("|-----------------|");
            System.out.print("Enter Your Guess:");
            guess= scanner.nextInt();

            if(guess==answers[i]){
                System.out.println("|----------------------------------|");
                System.out.println("You Guessed Correct My Besto Frendd:");
                System.out.println("|----------------------------------|");
            }else{
                System.out.println("|-----------------|");
                System.out.println("You Guessed Wrong:");
                System.out.println("|-----------------|");
            }
        }


    }
}







