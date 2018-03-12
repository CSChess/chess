abstract public class Pieces
{
    private boolean colour;
    Pieces(boolean b){
        this.colour = b;
    }
    boolean getColour(){
        return colour;
    }
    abstract boolean move(Grid i,Grid f);
}