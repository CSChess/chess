public class Rook extends Pieces
{
    Rook(){}
    Rook(boolean colour){
        super(colour);
    }
    void judge(Grid i,Grid f,Grid[][] board)throws WrongMoveException{
        int rowI = i.getRow();
        int colI = i.getCol();
        int rowF = f.getRow();
        int colF = f.getCol();
       
        if(!(rowI==rowF||colI==colF))throw new WrongMoveException("");
        
        if(rowI==rowF){
            int a = (int)((colF-colI)/(Math.abs(colF-colI)));
            for(int x = colI+a;x!=colF;x+=a){
                if(board[rowI][x].getPieces()!=null)throw new WrongMoveException("");
            }
        }
        else if(colI==colF){
            int a =(int)((rowF-rowI)/(Math.abs(rowF-rowI)));
            for(int x = rowI+a;x!=rowF;x+=a){
                if(board[x][colI].getPieces()!=null)throw new WrongMoveException("");
            }
        }
        return;
    }
    boolean judgeKing(Grid i,Grid f,Grid[][] board){
        int rowI = i.getRow();
        int colI = i.getCol();
        int rowF = f.getRow();
        int colF = f.getCol();
        boolean checkmate=false;
        if(!(rowI==rowF||colI==colF))return checkmate;
        if(rowI==rowF){
            int a = (int)((colF-colI)/(Math.abs(colF-colI)));
            for(int x = colI+a;x!=colF;x+=a){
                if(board[rowI][x].getPieces()!=null)return checkmate;
            }
        }
        else if(colI==colF){
            int a =(int)((rowF-rowI)/(Math.abs(rowF-rowI)));
            for(int x = rowI+a;x!=rowF;x+=a){
                if(board[x][colI].getPieces()!=null)return checkmate;
            }
        }
        return true;
    }
    public String toString(){
        if(super.getColour()==true)return "WR";
        return "BR";
    }
}
