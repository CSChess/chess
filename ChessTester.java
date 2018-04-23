import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ChessTester {
    private BufferedReader br;
    private Board b;
    private String path;
    
    public ChessTester(String path) throws Exception{
        File file = new File(path);
        br = new BufferedReader(new FileReader(file));
        b = new Board();
        b.init();
        
        String move;
        Grid initialGrid;
        Grid finalGrid;
        while((move=br.readLine())!=null){
            initialGrid = b.getGrid(move.substring(0,2));
            finalGrid = b.getGrid(move.substring(3,5));
            try{
                System.out.println(move+"\n");
                b.move(initialGrid,finalGrid,initialGrid.getPieces().getColour());
                System.out.println(b);
            }
            catch (Exception ex){
                System.out.println("WrongMove\n");
            }
        }
    }

    public static void main(String[] args) throws Exception{
        new ChessTester("args[0]");
    }
}
