import java.util.Scanner;
import java.io.*;
public class Game
{
    private Board b;
    private boolean flag = true;
    private boolean turn = true;
    Game() throws IOException{
        b = new Board();
        b.init();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Let's chess!");
        while(flag){
            System.out.println(b);
            System.out.println(colour()+" turn");
            
            System.out.println("from?");
            String beg = br.readLine();
            
            if(beg.equals("exit"))System.exit(0);
            
            System.out.println("\nto?");
            String end = br.readLine();
            if(end.equals("exit"))System.exit(0);
            
            if(beg.equalsIgnoreCase("whosyour")&&end.equalsIgnoreCase("daddy")){System.out.println(colour()+" win?!");System.exit(0);}
            
            System.out.println("\n");
            
            try{
                b.move(b.getGrid(beg),b.getGrid(end),turn);
                turn = !turn;
            }
            catch(GoodGameException ex){
                flag = false;
            }
            catch(WrongMoveException ex){
                System.out.println("WRONG MOVE, Try again\n");
            }
            catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("grid out of board");
            }
        }
        
        System.out.println(colour()+" win!");
    }
    private String colour(){
        if(this.turn == true)return "white";
        return "black";
    }
    
    public static void main (String[] args) throws IOException{
        new Game();
    }
}