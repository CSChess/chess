abstract class  Pieces
{
    static String colour;
    static int numOfN = 0;
    static int numOfB = 0;
    static int numOfP = 0;
    static int numOfQ = 0;
    static int numOfK = 0;
    static int numOfR = 0;
    static void Piece(String color){
        if(colour.equals("B")||colour.equals("W"))
            colour = color;
        else
            System.out.println("wrong colour.(b for black and w for white)");
    }
    
    static Knight creatN(String color){
        if(numOfN == 4){
            throw new Error("Out of number");
        }
        numOfN+=1;
        return new Knight(color);
    }
    static Bishop creatB(String color){
        if(numOfB == 4){
           throw new Error("Out of number");
        }
        numOfB+=1;
        return new Bishop(color);
    }
    static Pawn creatP(String color){
        if(numOfP == 16){
            throw new Error("Out of number");
        }
        numOfP+=1;
        return new Pawn(color);
    }
    static Queen creatQ(String color){
        if(numOfQ >1){
            throw new Error("Out of number");
        }
        numOfQ+=1;
        return new Queen(color);
    }
    static King creatK(String color){
        if(numOfK > 1){
            throw new Error("Out of number");
        }
        numOfK+=1;
        return new King(color);
    }
    static Rook creatR(String color){
        if(numOfR == 4){
            throw new Error("Out of number");
        }
        numOfR+=1;
        return new Rook(color);
    }
}
