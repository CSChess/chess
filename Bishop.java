public class Bishop extends Pieces
{
    Bishop(){}
    Bishop(boolean colour){
        super(colour);
    }
    void judge(Grid initialGrid,Grid finalGrid,Grid[][] board) throws WrongMoveException{
        int rowI = initialGrid.getRow();
        int colI = initialGrid.getCol();
        int rowF = finalGrid.getRow();
        int colF = finalGrid.getCol();
        
        int row = rowF-rowI;
        int col = colF-colI;
        
        if(Math.abs(row)!=Math.abs(col))throw new WrongMoveException("");
        
        int strideRow;
        int strideCol;
        
        if(row>0)strideRow=1;
        else strideRow=-1;
        
        if(col>0)strideCol=1;
        else strideCol=-1;
        
        
        int x=rowI;
        int y=colI;
        while(x!=(rowF-strideRow) && y!=(colF-strideCol))
        {
           x=x+strideRow;
           y=y+strideCol;
           if(board[x][y].getPieces()!=null)throw new WrongMoveException(""); 
        }
        return;
    }
    boolean judgeKing(Grid initialGrid,Grid finalGrid,Grid[][] board){
        int rowI = initialGrid.getRow();
        int colI = initialGrid.getCol();
        int rowF = finalGrid.getRow();
        int colF = finalGrid.getCol();
        int row = rowF-rowI;
        int col = colF-colI;
        boolean checkmate=false;
        if(Math.abs(row)!=Math.abs(col))return checkmate;
        int strideRow;
        int strideCol;
        if(row>0)strideRow=1;
        else strideRow=-1;
        if(col>0)strideCol=1;
        else strideCol=-1;
        int x=rowI;
        int y=colI;
        while(x!=(rowF-strideRow) && y!=(colF-strideCol))
        {
           x=x+strideRow;
           y=y+strideCol;
           if(board[x][y].getPieces()!=null)return checkmate; 
        }
        return true;
    }
    public String toString(){
        if(super.getColour()==true)return "WB";
        return "BB";
    }
}
