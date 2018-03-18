public class Bishop extends Pieces
{
    protected Bishop(String colour)
    {
       super.colour=colour;
    }
    public String toString()
    {
        return colour+"B";
    }
    protected boolean moveRule(String from, String to){
        int fC = Translater.conversion(from.substring(0,1));
        int fR = Translater.conversion(from.substring(1,2));
        int tC = Translater.conversion(to.substring(0,1));
        int tR = Translater.conversion(to.substring(1,2));
        if(Math.abs(fC-tC) == Math.abs(fR-tR)){
            return true;
        }
        else
            return false;
    }
}