abstract public class Pieces
{
    String colour;
    Pieces(String colour)
    {
        if(colour.equals("B")||colour.equals("W"))
            this.colour = colour;
        else
            System.out.println("wrong colour.(b for black and w for white)");
    }
    abstract boolean move(Grid i,Grid f);
}
