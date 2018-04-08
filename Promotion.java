public class  Promotion
{ 
    static boolean  promotionCheck=false;
    static boolean promotionCheck(String input,String color)
    {
    int number=8;
    int number2=1;
    int letter=97;
    if(!(input.substring(1,2).equals("P")))
        return false;
    if(color.equals("white"))
       {
       while(true)
       {
       letter++;
       if(letter==105)
       {
          break;
       }
       String Grid=""+(char)letter+number;
       //System.out.print(Grid);
       if(input.equals(Grid)){return true;}   
       }
    }
    else if(color.equals("black"))
    {
        while(true)
       {
       letter++;
       if(letter==105)
       {
          break;
       }
       String Grid=""+(char)letter+number2;
       //System.out.print(Grid);
       if(input.equals(Grid)){return true;}   
       }
    }
    return promotionCheck; 
    }
}
