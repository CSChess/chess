
/**
 * Write a description of class RightInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class  Promotion
{ 
    static boolean  promotionCheck=false;
    static boolean promotionCheck(String input,String color)
    {
    int number=8;
    int number2=1;
    int letter=97;
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
    if(color.equals("black"))
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
