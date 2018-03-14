public class Board
{
    String[][] board=new String[8][8];
    int row=0;
    int column=0;
    Board(){
        initialize();
    }
    private void initialize()
    {
        for(int i=0;i<=7;i++)
            for(int j=0;j<=7;j++)
            {
                if(board[i][j]==null)
                board[i][j]="  ";
            }
        board[0][0] = Pieces.creatR("B").toString();
        board[0][1] = Pieces.creatN("B").toString();
        board[0][2] = Pieces.creatB("B").toString();
        board[0][3] = Pieces.creatQ("B").toString();
        board[0][4] = Pieces.creatK("B").toString();
        board[0][5] = Pieces.creatB("B").toString();
        board[0][6] = Pieces.creatN("B").toString();
        board[0][7] = Pieces.creatR("B").toString();
        for(int i=0;i<=7;i++)
        {
            board[1][i] = Pieces.creatP("B").toString();
            board[6][i] = Pieces.creatP("W").toString();
        }
        board[7][0] = Pieces.creatR("W").toString();
        board[7][1] = Pieces.creatN("W").toString();
        board[7][2] = Pieces.creatB("W").toString();
        board[7][3] = Pieces.creatQ("W").toString();
        board[7][4] = Pieces.creatK("W").toString();
        board[7][5] = Pieces.creatB("W").toString();
        board[7][6] = Pieces.creatN("W").toString();
        board[7][7] = Pieces.creatR("W").toString();
    }
    public void printBoard()
    {
        int index1=0;
        int index2=0;
        while(index1<8)
        {
            while(index2<8)
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