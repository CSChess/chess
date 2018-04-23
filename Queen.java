public class Queen extends Pieces
{
    Queen(){}
    Queen(boolean colour){
        super(colour);
    }
    void judge(Grid initialGrid,Grid finalGrid,Grid[][] board)throws WrongMoveException{
        int rowF = finalGrid.getRow();
        int rowI = initialGrid.getRow();
        int colF = finalGrid.getCol();
        int colI = initialGrid.getCol();
        boolean judge=false;
        if(rowF-rowI==0){
            judge=true;
            int stride = (int)((colF-colI)/(Math.abs(colF-colI)));
            for(int x = colI+stride;x!=colF;x+=stride){
                if(board[rowI][x].getPieces()!=null)throw new WrongMoveException("");
            }
            return;
        }
        else if(colF-colI==0){
            judge=true;
            int stride =(int)((rowF-rowI)/(Math.abs(rowF-rowI)));
            for(int x = rowI+stride;x!=rowF;x+=stride){
                if(board[x][colI].getPieces()!=null)throw new WrongMoveException("");
            }
            return;
        }
        else if(Math.abs(rowF-rowI)==Math.abs(colF-colI)){
            int strideRow;
            int strideCol;
            judge=true;
            if(rowF-rowI>0)strideRow=1;
            else strideRow=-1;
        
            if(colF-colI>0)strideCol=1;
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
        if(!judge)
            throw new WrongMoveException("");
    }
    boolean judgeKing(Grid initialGrid,Grid finalGrid,Grid[][] board){
        int rowF = finalGrid.getRow();
        int rowI = initialGrid.getRow();
        int colF = finalGrid.getCol();
        int colI = initialGrid.getCol();
        boolean judge=false;
        boolean checkmate=false;
        if(rowF-rowI==0){
            judge=true;
            int stride = (int)((colF-colI)/(Math.abs(colF-colI)));
            for(int x = colI+stride;x!=colF;x+=stride){
                if(board[rowI][x].getPieces()!=null)return checkmate;
            }
            return true;
        }
        else if(colF-colI==0){
            judge=true;
            int stride =(int)((rowF-rowI)/(Math.abs(rowF-rowI)));
            for(int x = rowI+stride;x!=rowF;x+=stride){
                if(board[x][colI].getPieces()!=null)return checkmate;
            }
            return true;
        }
        else if(Math.abs(rowF-rowI)==Math.abs(colF-colI)){
            int strideRow;
            int strideCol;
            judge=true;
            if(rowF-rowI>0)strideRow=1;
            else strideRow=-1;
            if(colF-colI>0)strideCol=1;
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
        if(!judge)
            return checkmate;
        return checkmate;
    }
    public String toString(){
        if(super.getColour()==true)return "WQ";
        return "BQ";
    }
}
