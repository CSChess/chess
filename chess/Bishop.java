public class Bishop extends Pieces
{
    Bishop(boolean colour){
        super(colour);
    }
    public String toString(){
        return colour_name+"B   ";
    }
    void judge(Grid i,Grid f) throws WrongMoveException{
        int iRow = i.getRow();
        int iCol = i.getCol();
        int fRow = f.getRow();
        int fCol = f.getCol();
        int colDistance=Math.abs(iCol-fCol);
        int rowDistance=Math.abs(iRow-fRow);
        if(colDistance==rowDistance){
            return;
        }
        throw new WrongMoveException("");
    }
}
