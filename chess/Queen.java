public class Queen extends Pieces
{
    String colour;
    public void setQueen(String colour)
    {
        this.colour=colour;
    }
    public String toString()
    {
        return colour+"Q";
    }
}
