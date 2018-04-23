public class Grid
{
    private Pieces p;
    private int row;
    private int col;
    Grid(int row,int col){
        this.row = row;
        this.col = col;
    }
    
    void movePieces(Pieces p) throws GameOver{
        if(this.p instanceof King)throw new GameOver("");  
        this.p = p;
    }
    void removePieces(){
        this.p = null;
    }
    Pieces getPieces(){
        return p;
    }
    void setPieces(Pieces p){
        this.p = p;
    }
    
    int getRow(){
        return row;
    }
    int getCol(){
        return col;
    }
    
    public String toString(){
        if(p==null){
            return "  ";
        }
        return p.toString();
    }
}
