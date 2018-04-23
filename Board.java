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
        
        //System.out.println(row);
        //System.out.println(col);
        
        return board[row][col];
    }
    
    void move(Grid initialGrid,Grid finalGrid,boolean turn) throws WrongMoveException,GameOver{
        if(initialGrid.getPieces().getColour()!=turn)throw new WrongMoveException("");
        if(finalGrid.getPieces()!=null&& finalGrid.getPieces().getColour()==turn)throw new WrongMoveException("");
        initialGrid.getPieces().judge(initialGrid,finalGrid,board);
        initialGrid.getPieces().moved();
        finalGrid.movePieces(initialGrid.getPieces());
        initialGrid.removePieces();
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
    void promotion(String chessman,Grid grid,Grid remove)
    {
        boolean color=true;
        int row=1;
        if(chessman.substring(0,1)=="W")
        {
           color=false;
           row=8;
        }
        if(chessman.substring(1,2).equals("R")){
            grid.setPieces(new Rook(color));
            remove.setPieces(null);
        }
        if(chessman.substring(1,2).equals("N")){
            grid.setPieces(new Knight(color));
            remove.setPieces(null);
        } 
        if(chessman.substring(1,2).equals("B")){
            grid.setPieces(new Bishop(color));
            remove.setPieces(null);
        } 
        if(chessman.substring(1,2).equals("Q")){
            grid.setPieces(new Queen(color));
            remove.setPieces(null);
        } 
        
    }
}
