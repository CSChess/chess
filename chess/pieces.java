abstract class  Pieces
{
    String colour;
    String column;
    String row;
    private void setColour(String colour){
        if(colour.equals("b"))
            this.colour = "black";
        else if(colour.equals("w"))
            this.colour = "white";
        else
            System.out.println("wrong colour.(b for black and w for white)");
    }
    private void set(String column, String row){
        this.column = column;
        this.row = row;
    }
}