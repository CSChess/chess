public class Queen extends Pieces
{
    Queen(boolean colour){
        super(colour);
    }
    void judge(Grid i,Grid f,Grid[][] board)throws WrongMoveException{
        int rowF = f.getRow();
        int rowI = i.getRow();
        int colF = f.getCol();
        int colI = i.getCol();
        
        if(rowF-rowI==0){
            int a = (int)((colF-colI)/(Math.abs(colF-colI)));
            for(int x = colI+a;x<colF;x+=a){
                if(board[rowI][x]==null)throw new WrongMoveException("");
            }
            return;
        }
        if(colF-colI==0){
            int a =(int)((rowF-rowI)/(Math.abs(rowF-rowI)));
            for(int x = rowI+1;x<rowF;x+=a){
                if(board[x][colI]==null)throw new WrongMoveException("");
            }
            return;
        }
        if(Math.abs(rowF-rowI)==Math.abs(colF-colI)){
            int a;
            int b;
        
            if(rowF-rowI>0)a=1;
            else a=-1;
        
            if(colF-colI>0)b=1;
            else b=-1;
            
            for(int x=rowI+a;x<rowF;x+=a){
                for(int y=colI+b;y<colF;y+=b){
                    if(board[x][y]!=null)throw new WrongMoveException("");
                }
            }
            
            return;
        }
    }
    public String toString(){
        if(super.getColour()==true)return "WQ";
        return "BQ";
    }
}
