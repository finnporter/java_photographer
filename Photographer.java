import java.util.ArrayList;

public class Photographer {
  private ArrayList<Printable> cameras;


  public Photographer() {
    this.cameras = new ArrayList<Printable>();
  }

  public int cameraCount() {
    return this.cameras.size();
  }

   public void addCamera(Printable details) {
    return this.cameras.add(details);
  }

}