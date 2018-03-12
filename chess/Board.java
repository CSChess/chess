public class Board
{
    String[][] board=new String[9][9];
    int row=0;
    int column=0;
    public void initialize()
    {
        for(int i=0;i<=8;i++)
            for(int j=0;j<=8;j++)
            {
                if(board[i][j]==null)
                board[i][j]="  ";
            }
        for(int counter = 0; counter < 8; counter++){
            board[8][counter] = (char)(65+counter)+"";
        }
        for(int counter = 0; counter < 8; counter++){
            board[counter][8] = (8-counter)+"";
        }
        board[8][8] ="  ";
        board[0][0] = new Rook("B").toString();
        board[0][1] = new Knight("B").toString();
        board[0][2] = new Bishop("B").toString();
        board[0][3] = new Queen("B").toString();
        board[0][4] = new King("B").toString();
        board[0][5] = new Bishop("B").toString();
        board[0][6] = new Knight("B").toString();
        board[0][7] = new Rook("B").toString();
        for(int i=0;i<=7;i++)
        {
            board[1][i] = new Pawn("B").toString();
            board[6][i] = new Pawn("W").toString();
        }
        board[7][0] =new Rook("W").toString();
        board[7][1] =new Knight("W").toString();
        board[7][2] =new Bishop("W").toString();
        board[7][3] =new Queen("W").toString();
        board[7][4] =new King("W").toString();
        board[7][5] =new Bishop("W").toString();
        board[7][6] =new Knight("W").toString();
        board[7][7] =new Rook("W").toString();
    }
    public void printBoard()
    {
        initialize();
        int index1=0;
        int index2=0;
        while(index1<9)
        {
            while(index2<9)
            {
                if(board[index1][index2].length()==3)
                {
                    System.out.print(board[index1][index2].toString()+" ");
                    index2++;
                }
                if(board[index1][index2].length()==2)
                {
                    System.out.print(board[index1][index2].toString()+"  ");
                    index2++;
                }
                else if(board[index1][index2].length()==1)
                {
                    System.out.print(board[index1][index2].toString()+"   ");
                    index2++;
                }
            }
            index1++;
            index2=0;
            System.out.println();
        }
    }
}
