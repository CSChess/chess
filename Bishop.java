public class Bishop extends Pieces
{
    Bishop(boolean colour){
        super(colour);
    }
    void judge(Grid i,Grid f,Grid[][] board) throws WrongMoveException{
        int rowI = i.getRow();
        int colI = i.getCol();
        int rowF = f.getRow();
        int colF = f.getCol();
        
        int row = rowF-rowI;
        int col = colF-colI;
        
        if(Math.abs(row)!=Math.abs(col))throw new WrongMoveException("");
        
        int a;
        int b;
        
        if(row>0)a=1;
        else a=-1;
        
        if(col>0)b=1;
        else b=-1;
        
        for(int x=rowI+a;x<rowF;x+=a){
            for(int y=colI+b;y<colF;y+=b){
                if(board[x][y]!=null)throw new WrongMoveException("");
            }
        }
        
        return;
    }
    public String toString(){
        if(super.getColour()==true)return "WB";
        return "BB";
    }
}
