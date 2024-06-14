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
    //random color
    int color = (int) (Math.random() * 256);
    g.setColor(new java.awt.Color(color, color, color));
    //head
    g.fillOval(offsetLeft + (mainBodyWidth / 2) * factor - (headRadius / 2) * factor, maxHeightPanel - (int) (legsHeight + mainBodyHeight + headRadius * 0.75) * factor, headRadius * factor, headRadius * factor);
    //neck
    g.fillRect(offsetLeft + (mainBodyWidth / 2) * factor - (neckWidth / 2) * factor, maxHeightPanel - (int) (legsHeight + mainBodyHeight + headRadius * 0.75) * factor, neckWidth * factor, neckHeight * factor);
    //arms
    g.fillRect(offsetLeft, maxHeightPanel - (int) (legsHeight + mainBodyHeight + headRadius * 0.75 + neckHeight) * factor, armsWidth * factor, armsHeight * factor);
    //body
    g.fillRect(offsetLeft + armsWidth * factor, maxHeightPanel - (int) (legsHeight + mainBodyHeight) * factor, mainBodyWidth * factor, mainBodyHeight * factor);
    //legs
    g.fillRect(offsetLeft + (mainBodyWidth / 2) * factor - (legsWidth / 2) * factor, maxHeightPanel - legsHeight * factor, legsWidth * factor, legsHeight * factor);
  }
  
  
}
