
   
  
import javax.swing.*;  
import java.awt.*;  
  
public class IniChessBoard {  
      
    //set int cubewidth and boardwidth  
    int cubewidth = 45;  
    int boardwidth = 8 * cubewidth ;  
      
    public static void main (String[] args)  
    {  
        IniChessBoard gui = new IniChessBoard();  
        gui.go();  
    }  
      
    public void go()  
    {  
        //new a frame  
        JFrame frame = new JFrame();  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
          
        //new a panel  
        MyDrawPanel drawPanel = new MyDrawPanel();  
          
        frame.getContentPane().add(drawPanel);  
        frame.setSize(1000,1000);  
        frame.setVisible(true);  
          
    }  
      
    class MyDrawPanel extends JPanel  
    {  
        public void paintComponent(Graphics G)  
        {  
            //draw the chess board  
            G.setColor(Color.black);  
            G.fillRect(200, 200, boardwidth, boardwidth);  
            G.setColor(Color.white);  
            for (int Line = 0; Line < 8; Line ++)  
            {  
                for (int Row = 0; Row < 8; Row ++)  
                {  
                    if((Line - Row) % 2 == 0 )  
                    {  
                        G.fillRect(Line * cubewidth + 200, Row * cubewidth + 200, cubewidth, cubewidth);  
                    }  
                }  
            }  
        }  
    }  
}  
