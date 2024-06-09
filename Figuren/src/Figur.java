public abstract class Figur {
  //zufällige Zahl zwischen 7 und 16
  public final int factor = (int) (Math.random() * 10) + 7;
  private int offsetLeft;
  private int maxHeightPanel;


  //abstrakte mehtode getHeight() : int
  public abstract int getHeight();

  //abstrakte mehtode getWidth() : int
  public abstract int getWidth();

  //abstrakte paintOnGraphics (Graphics g) : void
  public abstract void paintOnGraphics(Graphics g);

  public void paintOnGraphics(Graphics g, int offsetLeft, int maxHeightPanel) {
    this.offsetLeft = offsetLeft;
    this.maxHeightPanel = maxHeightPanel;
    paintOnGraphics(g);
  }

}
