public class King extends Pieces
{
    King(boolean colour){
        super(colour);
    }
    void judge(Grid i,Grid f,Grid[][] board)throws WrongMoveException{
        int row = Math.abs(f.getRow()-i.getRow());
        int col = Math.abs(f.getCol()-i.getCol());
        if((row==0||row==1)&&(col==0||col==1)){
            return;
        }
        
        //送将判定
        int checkRow=0;
        int checkCol=0;
        Rook r=new Rook();
        Queen q=new Queen();
        Pawn p=new Pawn();
        Knight k=new Knight();
        Bishop b=new Bishop();
        while(checkRow<8)
        {
            while(checkCol<8)
            {
                if(super.getColour()!=board[checkRow][checkCol].getPieces().getColour())
                {
                    if(super.getColour()==true)
                    {
                        if(board[checkRow][checkCol].getPieces().equals("BR"))
                        {
                            if(r.judgeKing(board[checkRow][checkCol],f,board)==true)
                            {throw new WrongMoveException("");}
                        }
                        if(board[checkRow][checkCol].getPieces().equals("BK"))
                        {
                            if(judgeKing(board[checkRow][checkCol],f,board)==true)
                            {throw new WrongMoveException("");}
                        }
                        if(board[checkRow][checkCol].getPieces().equals("BQ"))
                        {
                            if(q.judgeKing(board[checkRow][checkCol],f,board)==true)
                            {throw new WrongMoveException("");}
                        }
                        if(board[checkRow][checkCol].getPieces().equals("BN"))
                        {
                            if(k.judgeKing(board[checkRow][checkCol],f,board)==true)
                            {throw new WrongMoveException("");}
                        }
                        if(board[checkRow][checkCol].getPieces().equals("BB"))
                        {
                            if(b.judgeKing(board[checkRow][checkCol],f,board)==true)
                            {throw new WrongMoveException("");}
                        }
                        if(board[checkRow][checkCol].getPieces().equals("BP"))
                        {
                            if(p.judgeKing(board[checkRow][checkCol],f,board)==true)
                            {throw new WrongMoveException("");}
                        }
                    }
                    if(super.getColour()==false)
                    {
                        if(board[checkRow][checkCol].getPieces().equals("WR"))
                        {
                            if(r.judgeKing(board[checkRow][checkCol],f,board)==true)
                            {throw new WrongMoveException("");}
                        }
                        if(board[checkRow][checkCol].getPieces().equals("WK"))
                        {
                            if(judgeKing(board[checkRow][checkCol],f,board)==true)
                            {throw new WrongMoveException("");}
                        }
                        if(board[checkRow][checkCol].getPieces().equals("WQ"))
                        {
                            if(q.judgeKing(board[checkRow][checkCol],f,board)==true)
                            {throw new WrongMoveException("");}
                        }
                        if(board[checkRow][checkCol].getPieces().equals("WN"))
                        {
                            if(k.judgeKing(board[checkRow][checkCol],f,board)==true)
                            {throw new WrongMoveException("");}
                        }
                        if(board[checkRow][checkCol].getPieces().equals("WB"))
                        {
                            if(b.judgeKing(board[checkRow][checkCol],f,board)==true)
                            {throw new WrongMoveException("");}
                        }
                        if(board[checkRow][checkCol].getPieces().equals("WP"))
                        {
                            if(p.judgeKing(board[checkRow][checkCol],f,board)==true)
                            {throw new WrongMoveException("");}
                        }
                    }
                }
                checkCol++;
            }
            checkRow++;
            checkCol=0;
        }
        
        
        throw new WrongMoveException("");
    }
    boolean judgeKing(Grid i,Grid f,Grid[][] board){
        int row = Math.abs(f.getRow()-i.getRow());
        int col = Math.abs(f.getCol()-i.getCol());
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
