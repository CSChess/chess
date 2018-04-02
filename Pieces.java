abstract public class Pieces
{
    protected boolean colour;
    protected boolean isMove;
    Pieces(boolean b){
        this.colour = b;
        isMove = false;
    }
    Pieces(){}
    boolean getColour(){
        return colour;
    }
    void moved(){
        isMove = true;
    }
    abstract void judge(Grid i,Grid f,Grid[][] board) throws WrongMoveException;
}
