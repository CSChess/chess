public class Pawn extends Pieces
{
    String colour;
    public void Pawn(String colour)
    {
        this.colour=colour;
    }
    public String toString()
    {
        return colour+"P";
    }
}
