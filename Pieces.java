abstract public class Pieces
{
    protected boolean colour;
    protected boolean isMove;
    Pieces(boolean colour){
        this.colour = colour;
        isMove = false;
    }
    Pieces(){}
    boolean getColour(){
        return colour;
    }
    void moved(){
        isMove = true;
    }
    abstract void judge(Grid initialGrid,Grid finalGrid,Grid[][] board) throws WrongMoveException;
}
