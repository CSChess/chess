public class Queen extends Pieces
{
    Queen(){}
    Queen(boolean colour){
        super(colour);
    }
    void judge(Grid i,Grid f,Grid[][] board)throws WrongMoveException{
        int rowF = f.getRow();
        int rowI = i.getRow();
        int colF = f.getCol();
        int colI = i.getCol();
        boolean judge=false;
        if(rowF-rowI==0){
            judge=true;
            int a = (int)((colF-colI)/(Math.abs(colF-colI)));
            for(int x = colI+a;x!=colF;x+=a){
                if(board[rowI][x].getPieces()!=null)throw new WrongMoveException("");
            }
            return;
        }
        else if(colF-colI==0){
            judge=true;
            int a =(int)((rowF-rowI)/(Math.abs(rowF-rowI)));
            for(int x = rowI+a;x!=rowF;x+=a){
                if(board[x][colI].getPieces()!=null)throw new WrongMoveException("");
            }
            return;
        }
        else if(Math.abs(rowF-rowI)==Math.abs(colF-colI)){
            int a;
            int b;
            judge=true;
            if(rowF-rowI>0)a=1;
            else a=-1;
        
            if(colF-colI>0)b=1;
            else b=-1;
            
            int x=rowI;
            int y=colI;
            while(x!=(rowF-a) && y!=(colF-b))
            {
                 x=x+a;
                 y=y+b;
                 if(board[x][y].getPieces()!=null)throw new WrongMoveException(""); 
            }
            
            return;
        }
        if(!judge)
            throw new WrongMoveException("");
    }
    boolean judgeKing(Grid i,Grid f,Grid[][] board){
        int rowF = f.getRow();
        int rowI = i.getRow();
        int colF = f.getCol();
        int colI = i.getCol();
        boolean judge=false;
        boolean checkmate=false;
        if(rowF-rowI==0){
            judge=true;
            int a = (int)((colF-colI)/(Math.abs(colF-colI)));
            for(int x = colI+a;x!=colF;x+=a){
                if(board[rowI][x].getPieces()!=null)return checkmate;
            }
            return true;
        }
        else if(colF-colI==0){
            judge=true;
            int a =(int)((rowF-rowI)/(Math.abs(rowF-rowI)));
            for(int x = rowI+a;x!=rowF;x+=a){
                if(board[x][colI].getPieces()!=null)return checkmate;
            }
            return true;
        }
        else if(Math.abs(rowF-rowI)==Math.abs(colF-colI)){
            int a;
            int b;
            judge=true;
            if(rowF-rowI>0)a=1;
            else a=-1;
            if(colF-colI>0)b=1;
            else b=-1;
            int x=rowI;
            int y=colI;
            while(x!=(rowF-a) && y!=(colF-b))
            {
                 x=x+a;
                 y=y+b;
                 if(board[x][y].getPieces()!=null)return checkmate; 
            }
            return true;
        }
        if(!judge)
            return checkmate;
        return checkmate;
    }
    public String toString(){
        if(super.getColour()==true)return "WQ";
        return "BQ";
    }
}
