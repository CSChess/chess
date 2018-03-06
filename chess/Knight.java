public class Knight extends Pieces
{
    String colour;
    Knight(String colour)
    {
        this.colour = colour;
    }
    public String toString()
    {
        return colour+"N";
    }
}
