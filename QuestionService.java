import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String[] userSelection = new String[5];
    public QuestionService() {
        questions[0] = new Question(
                1,
                "What the best programming language?",
                "C++",
                "Python",
                "Java",
                "All language the best",
                "All language the best"
        );
        questions[1] = new Question(
                2,
                "What the worst programming language?",
                "C++",
                "Python",
                "Java",
                "JavaScript",
                "JavaScript"
        );
        questions[2] = new Question(
                3,
                "Size of int in bytes?",
                "2",
                "4",
                "8",
                "16",
                "4"
        );
        questions[3] = new Question(
                4,
                "Java best?",
                "Yes",
                "No",
                "Dont think so",
                "Cpp is the best",
                "Yes"
        );
        questions[4] = new Question(
                5,
                "What the biggest animal in the world?",
                "Python-users(The creator of this code <:)",
                "Whale",
                "Your mother(the perfect women, just joke)",
                "A cat",
                "Whale"

        );


    }
    public void displayQuestion(){

        int i = 0;
        for (Question q : questions) {
            System.out.println("Question: " + q.getId());
            System.out.println("--- " + q.getQuestion() + " ---");
            System.out.println("A) " + q.getOption1());
            System.out.println("B) " + q.getOption2());
            System.out.println("C) " + q.getOption3());
            System.out.println("D) "+ q.getOption4());
            System.out.println();
            Scanner sc = new Scanner(System.in);
            userSelection[i] = sc.nextLine();
            i++;
        }

        for(String s : userSelection) {
            System.out.println(s);
        }
    }

    public void printScore(){
        int score = 0;
        for(int i = 0; i<questions.length; i++) {
            Question q = questions[i];
            String answer = q.getAnswer();
            String userAnswer = userSelection[i];
            if(answer.equals(userAnswer)) {
                score++;
            }

        }
        System.out.println("Score: " + score);
    }

}
