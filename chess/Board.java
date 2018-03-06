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
    }
    Grid getGrid(String str)throws Exception{
        int row = (int)str.charAt(0)-97;
        int col = (int)str.charAt(1)-1;
        if(row<0|row>7|col<0|row>8)throw new Exception("GridOutOfBoard");
        return board[row][col];
    }
    void move(Grid i,Grid f){
        f.setPieces(i.getPieces());
        i.removePieces();
    }
    void initialize(){
        
    }
    public String toString(){
        
    }
}
