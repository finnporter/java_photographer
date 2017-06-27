import java.util.ArrayList;

public class Photographer {
  private ArrayList<Printable> cameraCollection;


  public Photographer() {
    this.cameraCollection = new ArrayList<Printable>();
  }

  public int cameraCount() {
    return this.cameraCollection.size();
  }

  //  public void addCamera(Printable details) {
  //   return this.cameraCollection.add(details);
  // }

}