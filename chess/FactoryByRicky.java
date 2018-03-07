public class FactoryByRicky
{
    String colour;
    int numOfN = 0;
    int numOfB = 0;
    int numOfP = 0;
    int numOfQ = 0;
    int numOfK = 0;
    int numOfR = 0;
    FactoryByRicky(String colour){
        this.colour = colour;
    }
    public Knight creatN(){
        if(numOfN == 2){
            new Error("Out of number");
        }
        numOfN++;
        return new Knight(colour);
    }
    public Bishop creatB(){
        if(numOfB == 2){
            new Error("Out of number");
        }
        numOfB++;
        return new Bishop(colour);
    }
    public Pawn creatP(){
        if(numOfP == 8){
            new Error("Out of number");
        }
        numOfP++;
        return new Pawn(colour);
    }
    public Queen creatQ(){
        if(numOfQ >0){
            new Error("Out of number");
        }
        numOfQ++;
        return new Queen(colour);
    }
    public King creatK(){
        if(numOfK > 0){
            new Error("Out of number");
        }
        numOfK++;
        return new King(colour);
    }
    public Rook creatR(){
        if(numOfR == 2){
            new Error("Out of number");
        }
        numOfR++;
        return new Rook(colour);
    }
}
