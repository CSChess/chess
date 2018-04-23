public class Pawn extends Pieces
{
    Pawn(){}
    Pawn(boolean colour){
        super(colour);
    }
    void judge(Grid initialGrid,Grid finalGrid,Grid[][] board)throws WrongMoveException{
        int row = finalGrid.getRow()-initialGrid.getRow();
        int col = finalGrid.getCol()-initialGrid.getCol();
        
        int stride;
        if(super.colour == true)stride=1;
        else stride=-1;
        
        if(super.isMove==false){
            if(col==0&&row==stride*2){
                return;
            }
        }
        
        if(col==0){
            if(row==stride){
                if(finalGrid.getPieces()==null){
                    return;
                }
            }
        }
        else if(col==1||col==-1){
            if(row==stride){
                if(finalGrid.getPieces()!=null){
                    return;
                }
            }
        }
        throw new WrongMoveException("");
    }
    boolean judgeKing(Grid initialGrid,Grid finalGrid,Grid[][] board){
        int row = finalGrid.getRow()-initialGrid.getRow();
        int col = finalGrid.getCol()-initialGrid.getCol();
        boolean checkmate=false;
        int stride;
        if(super.colour == true)stride=1;
        else stride=-1;
        if(col==1||col==-1){
            if(row==stride){
                if(finalGrid.getPieces()!=null){
                    return true;
                }
            }
        }
        return checkmate;
    }
    public String toString(){
        if(super.getColour()==true)return "WP";
        return "BP";
    }
}
