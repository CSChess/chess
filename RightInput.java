
/**
 * Write a description of class RightInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RightInput
{
    int number=1;
    int letter=97;
    String Grid=""+(char)letter+number;
    boolean rightInput=false;
    public boolean rightInput(String input)
    {
       while(true)
       {
       number++;
       if(number==9)
       {
          number=1; 
          letter++; 
           
       }
       if(letter==105)
       {
           number=1;
          letter=97;
           break;
        }
       if(input==Grid){rightInput=true;}   
       
       }
       return rightInput; 
    }
}
