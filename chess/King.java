public class King extends Pieces
{
    String colour;
    public void setKing(String colour)
    {
        this.colour=colour;
    }
    public String toString()
    {
        return colour+"K";
    }
}
