import java.awt.*;
import javax.swing.JFrame;

/*
 * Questions:
 * 1. When drawing a line, what do the four numbers represent?
 *    - The four numbers represent the x and y coordinates of the starting point and the x and y coordinates of the ending point. 
 *      Syntax: drawLine(x1, y1, x2, y2)
 * 
 * 2. When drawing a rectangle, where on the rectangle is the starting point you provide?
 *    - The starting point is the top-left corner of the rectangle.
 * 
 * 3. When drawing strings, where on the string is the starting point you provide?
 *    - The starting point is the baseline of the first character of the string.
 * 
 * 4. When setting a custom font, what happens if you provide a font that doesn't exist?
 *    - Java will revert to a default font.
 * 
 * 5. When setting a custom font, what happens if you provide a font that isn't installed on this machine?
 *    - Java will use a fallback system font if the font is not installed.
 */

public class GraphicsDemo3 extends Canvas
{
    public void paint( Graphics g )
    {
        // lines
        g.setColor(Color.green);
        g.drawLine(10,100,400,100);  // Long green line
        g.setColor(Color.red);
        g.drawLine(200, 100, 200, 120);  // Short red line that intersects the green line

        g.setColor(Color.blue);
        g.drawLine(50,150,100,180);
        g.setColor(Color.red);
        g.drawLine(190, 290, 160, 310);  // Red line roughly perpendicular to the magenta diagonal line

        g.setColor(Color.magenta);
        g.drawLine(100,350,300,230);

        g.setColor(Color.black);

        // fonts
        g.drawString("Graphics are pretty neat.", 500, 100);
        g.setFont(new Font("Consolas", Font.PLAIN, 36)); // 36-pt plain
        g.drawString("Yes, they are.", 400, 200);

        g.setColor(Color.white);
        g.setFont(new Font("Arial", Font.BOLD+Font.ITALIC, 60)); // Changed to Arial 60-pt italic bold
        g.drawString("Leander Lions", 300, 350);

        g.setColor(Color.blue);
        g.setFont(Font.decode("Arial-BOLDITALIC-60")); // Blue text changed to match Arial font
        g.drawString("Leander Lions", 290, 360);
        
        g.setColor(Color.black);
        g.setFont(new Font(null)); // restore default font

        int x=400, y=490;
        g.drawRect(x,y,150,20); // Rectangle, starting point is the top-left corner
        g.drawString("Where is the starting point?", x,y); // String starting point is baseline of the text
        g.setColor(Color.red);
        g.drawLine(x,y,x,y);	// drawing a line from a point to itself makes a 1px-by-1px dot

    }

    public static void main( String[] args )
    {
        JFrame win = new JFrame("GraphicsDemo3: Fonts and Lines");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphicsDemo3 canvas = new GraphicsDemo3();
        win.add( canvas );
        win.setVisible(true);
    }
}
