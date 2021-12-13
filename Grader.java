import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Grader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<5; i++) {
            System.out.print("What is your score: ");

            int user_score = Integer.parseInt(br.readLine());

            while (user_score < 0 || user_score > 100){
                System.out.print("Enter your score: ");
                user_score = Integer.parseInt(br.readLine());
            }

            if (user_score < 40) {
                System.out.println("Your grade is F.");
            } else if (user_score < 50) {
                System.out.println("Your grade is D");
            } else if (user_score < 60) {
                System.out.println("Your grade is C");
            } else if (user_score < 70) {
                System.out.println("Your grade is B.");
            } else {
                System.out.println("Your grade is A.");
            }
        }
    }
}
