public class Pawn extends Pieces
{
    boolean isPromotion;
    Pawn(boolean colour){
        super(colour);
        isPromotion = false;
    }
    void judge(Grid i,Grid f,Grid[][] board)throws WrongMoveException{
        int row = f.getRow()-i.getRow();
        int col = f.getCol()-i.getCol();
        
        if(isPromotion == true){
            return;
            //to be finished
        }
        
        int a;
        if(super.colour == true)a=1;
        else a=-1;
        
        if(super.isMove==false){
            if(col==0&&row==a*2){
                return;
            }
        }
        
        if(col==0){
            if(row==a){
                if(f.getPieces()==null){
                    return;
                }
            }
        }
        else if(col==1||col==-1){
            if(row==a){
                if(f.getPieces()!=null){
                    return;
                }
            }
        }
        throw new WrongMoveException("");
    }
    public String toString(){
        if(super.getColour()==true)return "WP";
        return "BP";
    }
}
