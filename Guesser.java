import java.util.*; 

public class Guesser{
    public static void main(String[] args) {
  } 
   void menu(){
        System.out.print ("0) Exit");
        System.out.print("1) Human Guesser");
        System.out.print("0) Computer Guesser");
        System.out.print("Plese enter a number from 0-2.");
        Scanner input = new Scanner(System.in);
        String userinput = input.nextInt();
    }
    void humanGuesser(){
    booleanValue(keeptrying=false correct=true);
    num=random.math(1-100); 
    if(correct==num)
        System.out.print("Correct");
    if(correct>num);
        keeptrying
        System.out.print("Too High");
    else(correct<num);
        keeptrying
        system.out.print("Too Low")
    }
    //void ComputerGuesser(){}
}