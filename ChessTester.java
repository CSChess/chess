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
        Grid i;
        Grid f;
        while((move=br.readLine())!=null){
            i = b.getGrid(move.substring(0,2));
            f = b.getGrid(move.substring(3,5));
            try{
                System.out.println(move+"\n");
                b.move(i,f,i.getPieces().getColour());
                System.out.println(b);
            }
            catch (Exception ex){
                System.out.println("WrongMove\n");
            }
        }
    }

    public static void main(String[] args) throws  Exception{
        new ChessTester("/home/chris/Documents/test");
    }
}