public class Main {
  public static void main (String[] args) {

    int spaceBetweenFigures = (int) (Math.random()* 10) + 5;

    Figur [] figuren = new Figur[10];
    for (int i = 0; i < figuren.length; i++) {
      if (Math.random() < 0.5) {
        figuren[i] = new Person();
      } else {
        figuren[i] = new Cat();
      }
    }
    //algorithmus um die Figuren nach der Größe zu sortieren
    for (int i = 0; i < figuren.length; i++) {
      for (int j = i + 1; j < figuren.length; j++) {
        if (figuren[i].getHeight() > figuren[j].getHeight()) {
          Figur temp = figuren[i];
          figuren[i] = figuren[j];
          figuren[j] = temp;
        }
      }
    }

    int maxHeightPanel;
    int totalWidthPanel = spaceBetweenFigures + figuren[0].getWidth() + spaceBetweenFigures + figuren[1].getWidth() + spaceBetweenFigures + figuren[2].getWidth() + spaceBetweenFigures + figuren[3].getWidth() + spaceBetweenFigures + figuren[4].getWidth() + spaceBetweenFigures + figuren[5].getWidth() + spaceBetweenFigures + figuren[6].getWidth() + spaceBetweenFigures + figuren[7].getWidth() + spaceBetweenFigures + figuren[8].getWidth() + spaceBetweenFigures + figuren[9].getWidth() + spaceBetweenFigures;
    

  }
  
}