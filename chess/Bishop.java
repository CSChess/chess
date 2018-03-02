public class Bishop extends Pieces
{
    String colour;
    public void setBishop(String colour)
    {
       this.colour=colour;
    }
    public String toString()
    {
        return colour+"B";
    }
}
