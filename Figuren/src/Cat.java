import java.awt.Graphics;
public class Cat extends Figur {
  private final int mainBodyWidth = 10; 
  private final int mainBodyHeight = 4; 
  private final int legsWidth = 2; 
  private final int legsHeight = 4; 
  private final int headRadius = 4; 
  private final int earsHeight = 2; 
  private final int earsWidth = 2; 
  private final int tailWidth = 1; 
  private final int tailHeight = 4;

  public int getHeight() {
    return (int) (legsHeight + mainBodyHeight + tailHeight) * factor;
  }

  public int getWidth() {
    return (int) (mainBodyWidth + headRadius * 0.75 + tailWidth) * factor;
  }

  @Override
  public void paintOnGraphics(Graphics g) {
    int color = (int) (Math.random() * 256);
    g.setColor(new java.awt.Color(color, color, color));
    int offSetTop = maxHeightPanel - this.getHeight();
   // Zeichnen der Katze
      //tail
      g.fillRect(offsetLeft, offSetTop, tailWidth * factor, tailHeight * factor);
      //body
      g.fillRect(offsetLeft, offSetTop + tailHeight * factor, mainBodyWidth * factor, mainBodyHeight * factor);
      //leg 1
      g.fillRect(offsetLeft + tailWidth * factor, offSetTop + (tailHeight + mainBodyHeight) * factor, legsWidth *factor, legsHeight * factor);
      //leg 2
      g.fillRect(offsetLeft   + ((mainBodyWidth * factor) - legsWidth * factor), offSetTop + (tailHeight + mainBodyHeight) * factor, legsWidth *factor, legsHeight * factor);
      //head
      g.fillOval(offsetLeft + (mainBodyWidth) * factor , offSetTop, headRadius * factor, headRadius * factor);

    }
    

  }
  


