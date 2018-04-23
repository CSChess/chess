public class King extends Pieces
{
    King(boolean colour){
        super(colour);
    }
    void judge(Grid initialGrid,Grid finalGrid,Grid[][] board)throws WrongMoveException{
        int checkRow=0;
        int checkCol=0;
        Rook r=new Rook(true);
        Queen q=new Queen(true);
        Pawn p=new Pawn(true);
        Knight k=new Knight(true);
        Bishop b=new Bishop(true);
        while(checkRow<8)
        {
            while(checkCol<8)
            {
                if(board[checkRow][checkCol].getPieces()!=null&&super.getColour()!=board[checkRow][checkCol].getPieces().getColour())
                {
                        if(board[checkRow][checkCol].getPieces().toString().substring(1,2).equals("R"))
                        {
                            if(r.judgeKing(board[checkRow][checkCol],finalGrid,board)==true)
                            {throw new WrongMoveException("");}
                        }
                        if(board[checkRow][checkCol].getPieces().toString().substring(1,2).equals("K"))
                        {
                            if(judgeKing(board[checkRow][checkCol],finalGrid,board)==true)
                            {throw new WrongMoveException("");}
                        }
                        if(board[checkRow][checkCol].getPieces().toString().substring(1,2).equals("Q"))
                        {
                            if(q.judgeKing(board[checkRow][checkCol],finalGrid,board)==true)
                            {throw new WrongMoveException("");}
                        }
                        if(board[checkRow][checkCol].getPieces().toString().substring(1,2).equals("N"))
                        {
                            if(k.judgeKing(board[checkRow][checkCol],finalGrid,board)==true)
                            {throw new WrongMoveException("");}
                        }
                        if(board[checkRow][checkCol].getPieces().toString().substring(1,2).equals("B"))
                        {
                            if(b.judgeKing(board[checkRow][checkCol],finalGrid,board)==true)
                            {throw new WrongMoveException("");}
                        }
                        if(board[checkRow][checkCol].getPieces().toString().substring(1,2).equals("P"))
                        {
                            if(p.judgeKing(board[checkRow][checkCol],finalGrid,board)==true)
                            {throw new WrongMoveException("");}
                        }
                }
                checkCol++;
            }
            checkRow++;
            checkCol=0;
        }
        
        int row = Math.abs(finalGrid.getRow()-initialGrid.getRow());
        int col = Math.abs(finalGrid.getCol()-initialGrid.getCol());
        if((row==0||row==1)&&(col==0||col==1)){
            return;
        }
        throw new WrongMoveException("");
    }
    boolean judgeKing(Grid initialGrid,Grid finalGrid,Grid[][] board){
        int row = Math.abs(finalGrid.getRow()-initialGrid.getRow());
        int col = Math.abs(finalGrid.getCol()-initialGrid.getCol());
        boolean checkmate=false;
        if((row==0||row==1)&&(col==0||col==1)){
            return true;
        }
        return checkmate;
    }
    public String toString(){
        if(super.getColour()==true)return "WK";
        return "BK";
    }
}
