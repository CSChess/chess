public class Rook extends Pieces
{
    String colour;
    Rook(String colour)
    {

       if(color=="B")
       {return "Rook(B)";}
       else
       {return "Rook(W)";}

       this.colour=colour;
    }
    public String toString()
    {
        return colour+"R";

    }
}
