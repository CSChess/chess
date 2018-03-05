public class Rook extends Pieces
{
    String colour;
    Rook(String colour)
    {
       this.colour=colour;
    }
    public String toString()
    {
        return colour+"R";
    }
}
