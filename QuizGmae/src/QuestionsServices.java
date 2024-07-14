import java.util.Scanner;
public class QuestionsServices {

    Question[] questions = new Question[5];

    public QuestionsServices(){
        questions[0] = new Question(1,"What is the capital of France?", "Paris", "London", "Berlin", "Madrid", "Paris");
        questions[1] = new Question(2,"What is the capital of Germany?", "Paris", "London", "Berlin", "Madrid", "Berlin");
        questions[2] = new Question(3,"What is the capital of Spain?", "Paris", "London", "Berlin", "Madrid", "Madrid");
        questions[3] = new Question(4,"What is the capital of England?", "Paris", "London", "Berlin", "Madrid", "London");
        questions[4] = new Question(5,"What is the capital of Italy?", "Paris", "London", "Rome", "Madrid", "Rome");
    }

    public void displayQuestion (){
        for (Question q : questions) {
            System.out.println(q);
            
            System.out.println(q.getQuestion());
            System.out.println("A. " + q.getOpt1());
            System.out.println("B. " + q.getOpt2());
            System.out.println("C. " + q.getOpt3());
            System.out.println("D. " + q.getOpt4());
            System.out.println("Enter your answer: ");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase(q.getAnswer())) {
                System.out.println("Correct!");
                continue;
            } else {
                System.out.println("Incorrect!");
                break;
            }
        }
    }
}
