import java.util.Scanner;
import java.io.*;
public class Client
{
    private Board b;
    private boolean flag = true;
    private boolean turn = true;
    Client() throws IOException{
        b = new Board();
        b.init();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Let's chess!");
        while(flag){
            System.out.println(b);
            System.out.println(colour(turn)+" turn");
            
            System.out.println("from?");
            String beg = br.readLine();
            
            System.out.println("\nto?");
            String end = br.readLine();
            
            System.out.println("\n");
            
            try{
                b.move(b.getGrid(beg),b.getGrid(end),turn);
                turn = !turn;
            }
            catch(GoodGameException ex){
                flag = false;
            }
            catch(WrongMoveException ex){
                System.out.println("Wrong move, try again");
            }
            catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("grid out of board");
            }
        }
        
        System.out.println(colour(!turn)+" win!");
    }
    
    private String colour(boolean b){
        if(b == true)return "black";
        return "white";
    }
    
    public static void main (String[] args) throws IOException{
        Client g = new Client();
    }
}
