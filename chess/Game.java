import java.util.Scanner;
public class Game
{
    Board b = new Board();
    boolean flag = true;
    boolean turn = true;
    static Scanner sc = new Scanner(System.in);
    Game(){
        System.out.println("Let's chess!");
        
        while(flag){
            System.out.println(b);
            System.out.println(colour(turn)+" turn");
            
            System.out.println("from?");
            String beg = sc.next();
            
            System.out.println("to?");
            String end = sc.next();
            
            
            try{
                turn=!turn;
            }
            catch(Exception goodgame){
                flag = false;
            }
        }
        
        System.out.println(colour(!turn)+" win!");
    }
    
    private String colour(boolean b){
        if(b = true)return "white";
        return "black";
    }
}