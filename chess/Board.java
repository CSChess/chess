public class Board
{
    String[][] board=new String[8][8];
    int row=0;
    int column=0;
    public void initialize()
    {
        for(int i=0;i<8;i++)
            for(int j=0;j<8;j++)
            {
                if(board[i][j]==null)
                board[i][j]=" ";
            }
        board[0][0]+=new Rook("B");
        board[0][1]+=new Knight("B");
        board[0][2]+=new Bishop("B");
        board[0][3]+=new Queen("B");
        board[0][4]+=new King("B");
        board[0][5]+=new Bishop("B");
        board[0][6]+=new Knight("B");
        board[0][7]+=new Rook("B");
        for(int i=0;i<=7;i++)
        {
            board[1][i]+= new Pawn("B");
            board[6][i]+= new Pawn("W");
        }
        board[7][0]+=new Rook("W");
        board[7][1]+=new Knight("W");
        board[7][2]+=new Bishop("W");
        board[7][3]+=new Queen("W");
        board[7][4]+=new King("W");
        board[7][5]+=new Bishop("W");
        board[7][6]+=new Knight("W");
        board[7][7]+=new Rook("W");
    }
    public void printBoard()
    {
        initialize();
        int index1=0;
        int index2=0;
        int line=8;
        while(index1<8)
        {
            System.out.print(line);
            line-=1;
            while(index2<8)
            {
                if(board[index1][index2].length()==3)
                {
                    System.out.print(board[index1][index2]+" ");
                    index2++;
                }
                if(board[index1][index2].length()==2)
                {
                    System.out.print(board[index1][index2]+"  ");
                    index2++;
                }
                else if(board[index1][index2].length()==1)
                {
                    System.out.print(board[index1][index2]+"   ");
                    index2++;
                }
            }
            index1++;
            index2=0;
            System.out.println();
        }
    }
}