public class King extends Pieces
{
    King(boolean colour){
        super(colour);
    }
    boolean move(Grid i,Grid f){
        
    }
    public String toString(){
        if(super.getColour() == true){
            return "wk";
        }
        return "bk";
    }
}
