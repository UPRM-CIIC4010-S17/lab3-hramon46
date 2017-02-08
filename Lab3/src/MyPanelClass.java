import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.BLACK);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        //Draw a border
//                        g.setColor(Color.YELLOW);
//                        g.drawRect(x1, y1, width, height);
//                        
//                        g.setColor(Color.BLUE);
//                        g.drawRect(x1 + 5, y1 + 5, width - 10, height - 10);
//                        
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                        
//                        g.setColor(Color.RED);
//                        g.drawLine(x1, y2, x2, y1);
                        
//                        g.setColor(Color.LIGHT_GRAY);
//                        g.fillOval(72, 72, 55, 55);
                        
//                        Polygon p = new Polygon();
//                        p.addPoint(x1 + 5, y1 + 25);
//                        p.addPoint(x1 + 20, y1 + 10);
//                        p.addPoint(x1 + 35, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 25);
//                        g.setColor(Color.YELLOW);
//                        g.fillPolygon(p);
                        
//                        Polygon p2 = new Polygon();
//                        p2.addPoint(x1 + 25, y1 + 73);
//                        p2.addPoint(x1 + 41, y1 + 73);
//                        p2.addPoint(x1 + 47, y1 + 58);
//                        p2.addPoint(x1 + 53, y1 + 73);
//                        p2.addPoint(x1 + 69, y1 + 73);
//                        p2.addPoint(x1 + 56, y1 + 83);
//                        p2.addPoint(x1 + 61, y1 + 98);
//                        p2.addPoint(x1 + 47, y1 + 88);
//                        p2.addPoint(x1 + 34, y1 + 98);
//                        p2.addPoint(x1 + 38, y1 + 83);
//                        g.setColor(Color.DARK_GRAY);
//                        g.drawPolygon(p2);
                        
                        //Draw fifth stripe
                        g.setColor(Color .RED);
                        g.fillRect(x1, 160, width+1, 40);
                        
                       //Draw fourth stripe 
                        g.setColor(Color .WHITE);
                        g.fillRect(x1, 120, width+1, 40);
                        
                       //Draw third stripe
                        g.setColor(Color .RED);
                        g.fillRect(x1, 80, width+1, 40);
                        
                       //Draw second stripe
                        g.setColor(Color .WHITE);
                        g.fillRect(x1, 40, width+1, 40); 
                        
                       //Draw first stripe
                        g.setColor(Color .RED);
                        g.fillRect(x1, y1, width+1, 40);
                        

                        
                       //Draw triangle
                        Polygon p3 = new Polygon();
                        p3.addPoint(x1, y1);
                        p3.addPoint(85, 100);
                        p3.addPoint(x1, 200);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p3);  
                        
                        //Draw star
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 10, y1 + 88);
                        p2.addPoint(x1 + 26, y1 + 88);
                        p2.addPoint(x1 + 32, y1 + 73);
                        p2.addPoint(x1 + 38, y1 + 88);
                        p2.addPoint(x1 + 54, y1 + 88);
                        p2.addPoint(x1 + 39, y1 + 98);
                        p2.addPoint(x1 + 46, y1 + 112);
                        p2.addPoint(x1 + 32, y1 + 103);
                        p2.addPoint(x1 + 19, y1 + 113);
                        p2.addPoint(x1 + 23, y1 + 98);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
            }
}