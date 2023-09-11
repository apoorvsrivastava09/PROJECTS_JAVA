import java.util.*;
public class QuestionService {
    Question[] questions = new Question[5];
String selection[]=new String[5];
    public QuestionService() {
        questions[0] = new Question(1, "What is the size of byte data type", "2", "1", "4", "3",
                "1");
        questions[1] = new Question(2, "What is the size of int data type", "3", "4", "2", "1",
                "4");
        questions[2] = new Question(3, "what is the size of float data type", "3", "4", "1", "8",
                "4");
        questions[3] = new Question(4, "what is the size of double data type", "8", "4", "2", "16",
                "8");
        questions[4] = new Question(5, "what is the size of String data type", "16",
                "32", "8", "NONE", "none");
    }

    public void playQuiz()

    {
       Scanner in=new Scanner(System.in); 
       int i=0;
        for(Question q:questions)
        {
            System.out.println("Question no: "+q.getId());
            System.out.println("Question : "+q.getQuestion());
            System.out.println("Option 1:"+q.getOpt1());
            System.out.println("Option 2:"+q.getOpt2());
            System.out.println("Option 3:"+q.getOpt3());
            System.out.println("Option 4:"+q.getOpt4());
            selection[i]=in.nextLine();
            i++;
           
        }
        System.out.println("PLAYER ANSWERS");
        for(String s:selection)
        {
                System.out.println(s);
        }

    }
    public void printScore()
    {
        int score=0;
        for(int i=0;i<questions.length;i++)
        {
                Question que= questions[i];
                String ans=que.getAnswer();
                String userAnswer=selection[i];
                if(ans.equals(userAnswer))
                score++;
        }
        System.out.println("YOUR SCORE IS="+score);
    }
    public void printAns()
    {
        for(Question q:questions)
        {
                System.out.println(q.getAnswer());
        }
    }

}
