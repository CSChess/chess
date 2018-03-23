public class Queen extends Pieces
{
    Queen(boolean colour){
        super(colour);
    }
    public String toString(){
        return colour_name+"Q   ";
    }
    void judge(Grid i,Grid f) throws WrongMoveException{
        int iRow = i.getRow();
        int iCol = i.getCol();
        int fRow = f.getRow();
        int fCol = f.getCol();
        int colDistance=Math.abs(iCol-fCol);
        int rowDistance=Math.abs(iRow-fRow);
        if(iRow==fRow || iCol==fCol || colDistance==rowDistance){
            return;
        }
        throw new WrongMoveException("");
    }
}
