public class BoardByRicky
{
    String[][] board=new String[9][9];
    int row=0;
    int column=0;
    FactoryByRicky BF = new FactoryByRicky("B");
    FactoryByRicky WF = new FactoryByRicky("W");
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
        board[0][0] = BF.creatR().toString();
        board[0][1] = BF.creatN().toString();
        board[0][2] = BF.creatB().toString();
        board[0][3] = BF.creatQ().toString();
        board[0][4] = BF.creatK().toString();
        board[0][5] = BF.creatB().toString();
        board[0][6] = BF.creatN().toString();
        board[0][7] = BF.creatR().toString();
        for(int i=0;i<=7;i++)
        {
            board[1][i] = BF.creatP().toString();
            board[6][i] = WF.creatP().toString();
        }
        board[7][0] = WF.creatR().toString();
        board[7][1] = WF.creatN().toString();
        board[7][2] = WF.creatB().toString();
        board[7][3] = WF.creatQ().toString();
        board[7][4] = WF.creatK().toString();
        board[7][5] = WF.creatB().toString();
        board[7][6] = WF.creatN().toString();
        board[7][7] = WF.creatR().toString();
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