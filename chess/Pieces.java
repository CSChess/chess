abstract class  Pieces
{
    String colour;
    String column;
    String row;
    Pieces(String colour){
        if(colour.equals("B")||colour.equals("W"))
            this.colour = colour;
        else
            System.out.println("wrong colour.(b for black and w for white)");
    }
    private void set(String column, String row){
        this.column = column;
        this.row = row;
    }
}