import java.awt.Graphics;
public class Person extends Figur{

  private final int mainBodyWidth = 10; 
  private final int mainBodyHeight = 10; 
  private final int legsWidth = 4; 
  private final int legsHeight = 10; 
  private final int headRadius = 6; 
  private final int neckWidth = 4; 
  private final int neckHeight = 4; 
  private final int armsHeight = 8; 
  private final int armsWidth = 3;

  public int getHeight() {
    return (int) (legsHeight + mainBodyHeight + headRadius * 0.75 + neckHeight) * factor;
  }

  public int getWidth() {
    return (int) (armsWidth * 2 + mainBodyWidth) * factor;
  }

  @Override
  public void paintOnGraphics(Graphics g) {
    int offSetTop = maxHeightPanel - this.getHeight();
    // set figure random color
    int color = (int) (Math.random() * 256);
    g.setColor(new java.awt.Color(color, color, color));
    
    // Zeichnen der Person
    //head 
    g.fillOval(offsetLeft + armsWidth * factor + (neckWidth/2) * factor, offSetTop, headRadius * factor, headRadius * factor);
    //neck
    g.fillRect(offsetLeft + armsWidth * factor + (mainBodyWidth/3) * factor, offSetTop + (int) (headRadius * factor * 0.75), neckWidth * factor, neckHeight * factor);
    //body
    g.fillRect(offsetLeft + armsWidth * factor, offSetTop + (int) (headRadius * 0.75 * factor) + neckHeight * factor, mainBodyWidth * factor, mainBodyHeight * factor);
    //arm 1
    g.fillRect(offsetLeft, offSetTop + (int) (headRadius * 0.75 * factor) + neckHeight * factor, armsWidth * factor, armsHeight * factor);
    //arm 2
    g.fillRect(offsetLeft + armsWidth * factor + mainBodyWidth * factor, offSetTop + (int) (headRadius * 0.75 * factor) + neckHeight * factor, armsWidth * factor, armsHeight * factor);
    //leg 1
    g.fillRect(offsetLeft + armsWidth * factor , offSetTop + (int) (headRadius * 0.75 * factor) + neckHeight * factor + mainBodyHeight * factor, legsWidth * factor, legsHeight * factor);
    //leg 2
    g.fillRect(offsetLeft + armsWidth * factor + (mainBodyWidth - legsWidth) * factor, offSetTop + (int) (headRadius * 0.75 * factor) + neckHeight * factor + mainBodyHeight * factor, legsWidth * factor, legsHeight * factor);

  }
  
  
}
