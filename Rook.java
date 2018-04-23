public class Rook extends Pieces
{
    Rook(){}
    Rook(boolean colour){
        super(colour);
    }
    void judge(Grid initialGrid,Grid finalGrid,Grid[][] board)throws WrongMoveException{
        int rowI = initialGrid.getRow();
        int colI = initialGrid.getCol();
        int rowF = finalGrid.getRow();
        int colF = finalGrid.getCol();
       
        if(!(rowI==rowF||colI==colF))throw new WrongMoveException("");
        
        if(rowI==rowF)
        {
            int stride = (int)((colF-colI)/(Math.abs(colF-colI)));
            for(int x = colI+stride;x!=colF;x+=stride){
                if(board[rowI][x].getPieces()!=null)throw new WrongMoveException("");
            }
        }
        else if(colI==colF){
            int stride =(int)((rowF-rowI)/(Math.abs(rowF-rowI)));
            for(int x = rowI+stride;x<rowF;x+=stride)
            {
                if(board[x][colI]!=null)throw new WrongMoveException("");
            }
            return;
        }
    }
    boolean judgeKing(Grid initialGrid,Grid finalGrid,Grid[][] board){
        int rowI = initialGrid.getRow();
        int colI = initialGrid.getCol();
        int rowF = finalGrid.getRow();
        int colF = finalGrid.getCol();
        boolean checkmate=false;
        if(!(rowI==rowF||colI==colF))return checkmate;
        if(rowI==rowF){
            int stride = (int)((colF-colI)/(Math.abs(colF-colI)));
            for(int x = colI+stride;x!=colF;x+=stride){
                if(board[rowI][x].getPieces()!=null)return checkmate;
            }
        }
        else if(colI==colF){
            int stride =(int)((rowF-rowI)/(Math.abs(rowF-rowI)));
            for(int x = rowI+stride;x!=rowF;x+=stride){
                if(board[x][colI].getPieces()!=null)return checkmate;
            }
        }
        return true;
    }
    public String toString(){
        if(super.getColour()==true)return "WR";
        return "BR";
    }
}
