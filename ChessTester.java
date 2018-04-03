import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class ChessTester {
    private BufferedReader br;
    private Board b;
    private String path;
    private PrintWriter pw;
    
    public ChessTester(String path) throws Exception{
        File file = new File(path);
        br = new BufferedReader(new FileReader(file));
        b = new Board();
        
        Pieces p = deterPieces(br.readLine());
        
        Grid i = b.getGrid(br.readLine());
        i.setPieces(p);
        System.out.println("the inital board:\n"+b);
        
        Grid f = b.getGrid(br.readLine());
        try{
            p.judge(i,f,b.getBoard());
            f.movePieces(p);
            i.removePieces();
            System.out.println("\nthe final board:\n"+b+"\n Right move!");
        }
        catch(WrongMoveException ex){
            System.out.println("\nIt's a wrong move");
        }
        
    }
    
    private Pieces deterPieces(String str){
        Pieces p;
        switch(str.toLowerCase()){
            case "rook": p = new Rook(true);break;
            case "knight": p = new Knight(true);break;
            case "queen": p = new Pawn(true);break;
            case "bishop": p = new Bishop(true);break;
            case "king": p = new King(true);break;
            default: p = new Pawn(true);break;
        }
        return p;
    }

    public static void main(String[] args) throws  Exception{
        new ChessTester("/home/chris/Documents/test");
    }
}