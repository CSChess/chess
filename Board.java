public class Board
{
    private Grid[][] board;
    Board(){
        board = new Grid[8][8];
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                board[i][j]=new Grid(i,j);
            }
        }
    }
    
    Grid getGrid(String str)throws ArrayIndexOutOfBoundsException{
        int col = (int)(str.charAt(0)-97);
        int row = (int)(str.charAt(1)-49);
        
        return board[row][col];
    }
    
    void move(Grid i,Grid f,boolean turn) throws WrongMoveException,GoodGameException{
        if(i.getPieces().getColour()!=turn)throw new WrongMoveException("");
        if(f.getPieces()!=null&&f.getPieces().getColour()==turn)throw new WrongMoveException("");
        i.getPieces().judge(i,f,board);
        i.getPieces().moved();
        f.movePieces(i.getPieces());
        i.removePieces();
    }
    
    void init(){
        board[0][0].setPieces(new Rook(true));
        board[0][1].setPieces(new Knight(true));
        board[0][2].setPieces(new Bishop(true));
        board[0][3].setPieces(new Queen(true));
        board[0][4].setPieces(new King(true));
        board[0][5].setPieces(new Bishop(true));
        board[0][6].setPieces(new Knight(true));
        board[0][7].setPieces(new Rook(true));
        
        board[7][0].setPieces(new Rook(false));
        board[7][1].setPieces(new Knight(false));
        board[7][2].setPieces(new Bishop(false));
        board[7][3].setPieces(new Queen(false));
        board[7][4].setPieces(new King(false));
        board[7][5].setPieces(new Bishop(false));
        board[7][6].setPieces(new Knight(false));
        board[7][7].setPieces(new Rook(false));
        
        for(int i=0;i<8;i++){
            board[1][i].setPieces(new Pawn(true));
            board[6][i].setPieces(new Pawn(false));
        }
    }
    
    Grid[][] getBoard(){
        return this.board;
    }
    
    public String toString(){
        String result="";
        for(int i=7;i>-1;i--){
            result += i+1+" ";
            for(int j=0;j<8;j++){
                result+=board[i][j].toString()+" ";
            }
            result+="\n";
        }
        result += "  a  b  c  d  e  f  g  h\n";
        return result;
    }
}
