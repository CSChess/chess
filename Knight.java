public class Knight extends Pieces
{
    Knight(){}
    Knight(boolean colour){
        super(colour);
    }
    void judge(Grid initialGrid,Grid finalGrid,Grid[][] board) throws WrongMoveException{
        int row = Math.abs(initialGrid.getRow()-finalGrid.getRow());
        int col = Math.abs(initialGrid.getCol()-finalGrid.getCol());
        if(row*col==2&&row+col==3){
            return;
        }
        throw new WrongMoveException("");
    }
    boolean judgeKing(Grid initialGrid,Grid finalGrid,Grid[][] board){
        int row = Math.abs(initialGrid.getRow()-finalGrid.getRow());
        int col = Math.abs(initialGrid.getCol()-finalGrid.getCol());
        boolean checkmate=false;
        if(row*col==2&&row+col==3){
            return true;
        }
        return checkmate;
    }
    public String toString(){
        if(super.getColour()==true)return "WN";
        return "BN";
    }
}
