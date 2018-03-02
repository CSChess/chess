public class Rook extends Pieces
{
    String colour;
    public void setRook(String colour)
    {
       this.colour=colour;
    }
    public String toString()
    {
        return colour+"R";
    }
}
