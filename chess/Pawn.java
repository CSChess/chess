public class Pawn extends Pieces
{
    Pawn(String colour)
    {
        super.colour=colour;
    }
    public String toString()
    {
        return colour+"P";
    }
}
