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
        // Kopf
        g.fillOval(offsetLeft + mainBodyWidth - headRadius, offSetTop, headRadius, headRadius);

        // Ohren
        g.fillRect(offsetLeft + mainBodyWidth - headRadius, offSetTop - earsHeight, earsWidth, earsHeight);
        g.fillRect(offsetLeft + mainBodyWidth - earsWidth, offSetTop - earsHeight, earsWidth, earsHeight);

        // Körper
        g.fillRect(offsetLeft, offSetTop + headRadius, mainBodyWidth, mainBodyHeight);

        // Beine
        g.fillRect(offsetLeft, offSetTop + headRadius + mainBodyHeight, legsWidth, legsHeight);
        g.fillRect(offsetLeft + mainBodyWidth - legsWidth, offSetTop + headRadius + mainBodyHeight, legsWidth, legsHeight);

        // Schwanz
        g.fillRect(offsetLeft - tailWidth, offSetTop + headRadius, tailWidth, tailHeight);
    }
    

  }
  


