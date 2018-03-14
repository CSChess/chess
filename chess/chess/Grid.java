public class Grid
{
    private Pieces p;
    private int row;
    private int col;
    Grid(int row,int col){
        this.row = row;
        this.col = col;
    }
    
    void setPieces(Pieces p){
        this.p = p;
    }
    boolean removePieces ()throws Exception{
        if(p instanceof King)throw new Exception("goodgame");
        this.p = null;
    }
    Pieces getPieces(){
        return p;
    }
    
    int getRow(){
        return row;
    }
    int getCol(){
        return col;
    }
    
    public String toString(){
        
    }
}