public class Knight extends Pieces
{
    String colour;
    Knight(String color){
        this.color = color;
    }
    public String toString(){
        return color+"N";
    }
}
