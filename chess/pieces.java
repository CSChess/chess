abstract class  Pieces
{
    String color;
    String column;
    String row;
    private void setColour(String colour){
        if(color.equals("B")||color.equals("W"))
            this.color = color;
        else
            System.out.println("wrong colour.(b for black and w for white)");
    }
    private void set(String column, String row){
        this.column = column;
        this.row = row;
    }
}