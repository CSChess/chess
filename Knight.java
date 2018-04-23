public class Knight extends Pieces
{
    Knight(){}
    Knight(boolean colour){
        super(colour);
    }
    void judge(Grid i,Grid f,Grid[][] board) throws WrongMoveException{
        int row = Math.abs(i.getRow()-f.getRow());
        int col = Math.abs(i.getCol()-f.getCol());
        if(row*col==2&&row+col==3){
            return;
        }
        throw new WrongMoveException("");
    }
    boolean judgeKing(Grid i,Grid f,Grid[][] board){
        int row = Math.abs(i.getRow()-f.getRow());
        int col = Math.abs(i.getCol()-f.getCol());
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
