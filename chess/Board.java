public class Board
{
    Grid[][] board;
    Board(){
        board = new Grid[8][8];
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                board[i][j]=new Grid(i,j);
            }
        }
        initialize();
    }
    
    Grid getGrid(String str)throws GridOutOfBoardException{
        int row = (int)str.charAt(0)-97;
        int col = (int)str.charAt(1)-1;
        if(row<0|row>7|col<0|row>8)throw new GridOutOfBoardException("");
        return board[row][col];
    }
    
    void move(Grid i,Grid f) throws WrongMoveException,GoodGameException{
        if(i.getPieces().getColour()==f.getPieces().getColour())throw new WrongMoveException("");
        i.getPieces().judge(i,f);
        f.movePieces(i.getPieces());
        i.removePieces();
    }
    
    void initialize(){
        board[0][0].p = new Rook(true);
        board[0][1].p = new Knight(true);
        board[0][2].p = new Bishop(true);
        board[0][3].p = new Queen(true);
        board[0][4].p = new King(true);
        board[0][5].p = new Bishop(true);
        board[0][6].p = new Knight(true);
        board[0][7].p = new Rook(true);
        for(int i=0;i<=7;i++)
        {
            board[1][i].p = new Pawn(true);
            board[6][i].p = new Pawn(false);
        }
        board[7][0].p = new Rook(false);
        board[7][1].p = new Knight(false);
        board[7][2].p = new Bishop(false);
        board[7][3].p = new Queen(false);
        board[7][4].p = new King(false);
        board[7][5].p = new Bishop(false);
        board[7][6].p = new Knight(false);
        board[7][7].p = new Rook(false);
    }
    
    public void printBoard()
    {
        String rowNumber[]={"A","B","C","D","E","F","G","H"};
        String colNumber[]={"8","7","6","5","4","3","2","1"};
        int i=0;
        int j=0;
        while(i<8)
        {
            System.out.print(colNumber[i]+" ");
            while(j<8)
            {
                
                if(board[i][j].p==null)
                {
                    System.out.print("     ");
                    j++;
                }
                else 
                {
                    System.out.print(board[i][j].p);
                    j++;
                }
            }
            i++;
            j=0;
            System.out.println();
        }
        System.out.print("  ");
        for(i=0;i<8;i++)
        {
            System.out.print(rowNumber[i]+"    ");
        }
    }
}
    
    
