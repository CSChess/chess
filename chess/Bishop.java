public class Bishop extends Pieces
{
    String colour;
    Bishop(String colour)
    {
       this.colour=colour;
    }
    public String toString()
    {
        return colour+"B";
    }
}
