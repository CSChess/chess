public class Queen extends Pieces
{
    String colour;
    public void Queen(String colour)
    {
        this.colour=colour;
    }
    public String toString()
    {
        return colour+"Q";
    }
}
