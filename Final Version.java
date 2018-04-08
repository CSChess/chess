public class Bishop extends Pieces
{
    Bishop(){}
    Bishop(boolean colour){
        super(colour);
    }
    void judge(Grid i,Grid f,Grid[][] board) throws WrongMoveException{
        int rowI = i.getRow();
        int colI = i.getCol();
        int rowF = f.getRow();
        int colF = f.getCol();
        
        int row = rowF-rowI;
        int col = colF-colI;
        
        if(Math.abs(row)!=Math.abs(col))throw new WrongMoveException("");
        
        int a;
        int b;
        
        if(row>0)a=1;
        else a=-1;
        
        if(col>0)b=1;
        else b=-1;
        
        
        int x=rowI;
        int y=colI;
        while(x!=(rowF-a) && y!=(colF-b))
        {
           x=x+a;
           y=y+b;
           if(board[x][y].getPieces()!=null)throw new WrongMoveException(""); 
        }
        return;
    }
    boolean judgeKing(Grid i,Grid f,Grid[][] board){
        int rowI = i.getRow();
        int colI = i.getCol();
        int rowF = f.getRow();
        int colF = f.getCol();
        int row = rowF-rowI;
        int col = colF-colI;
        boolean checkmate=false;
        if(Math.abs(row)!=Math.abs(col))return checkmate;
        int a;
        int b;
        if(row>0)a=1;
        else a=-1;
        if(col>0)b=1;
        else b=-1;
        int x=rowI;
        int y=colI;
        while(x!=(rowF-a) && y!=(colF-b))
        {
           x=x+a;
           y=y+b;
           if(board[x][y].getPieces()!=null)return checkmate; 
        }
        return true;
    }
    public String toString(){
        if(super.getColour()==true)return "WB";
        return "BB";
    }
}
