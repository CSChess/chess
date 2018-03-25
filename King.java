public class King extends Pieces
{
    King(boolean colour){
        super(colour);
    }
    void judge(Grid i,Grid f,Grid[][] board)throws WrongMoveException{
        int row = Math.abs(f.getRow()-i.getRow());
        int col = Math.abs(f.getCol()-i.getCol());
        
        if((row==0||row==1)&&(col==0||col==1)){
            return;
        }
        
        throw new WrongMoveException("");
    }
    public String toString(){
        if(super.getColour()==true)return "WK";
        return "BK";
    }
}
