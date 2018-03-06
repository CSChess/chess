public class Pawn extends Pieces
{
    String colour;
    Pawn(String colour)
    {
        this.colour=colour;
    }
    public String toString()
    {
        return colour+"P";
    }
}
