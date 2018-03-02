public class Panel
{
    String[][] board=new String[9][9];
    int row=0;
    int column=0;
    public String[][] chessBoard()
    {
        while(row<9)
        {
            while(column<9)
            {
                if(row%2==0)
                {
                    if(column%2==0)
                    {
                        board[row][column]="W";
                    }
                    if(column%2!=0)
                    {
                        board[row][column]="B";
                    }
                }
                if(row%2!=0)
                {
                    if(column%2==0)
                    {
                        board[row][column]="B";
                    }
                    if(column%2!=0)
                    {
                        board[row][column]="W";
                    }
                }
                column++;
            }
            row++;
            column=0;
        }
        board[8][0]="A";
        board[8][1]="B";
        board[8][2]="C";
        board[8][3]="D";
        board[8][4]="E";
        board[8][5]="F";
        board[8][6]="G";
        board[8][7]="H";
        board[0][8]="8";
        board[1][8]="7";
        board[2][8]="6";
        board[3][8]="5";
        board[4][8]="4";
        board[5][8]="3";
        board[6][8]="2";
        board[7][8]="1";
        board[8][8]=" ";
        return board;
    }
    public void printBoard()
    {
        chessBoard();
        int index1=0;
        int index2=0;
        while(index1<9)
        {
            while(index2<9)
            {
                System.out.print(board[index1][index2]+" ");
                index2++;
            }
            index1++;
            index2=0;
            System.out.println();
        }
    }
}
