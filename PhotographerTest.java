import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PhotographerTest {
  Photographer photographer;
  DigitalCamera digitalCamera;
  AnalogCamera analogCamera;

  @Before
  public void before() {
    photographer = new Photographer();
    digitalCamera = new DigitalCamera();
    analogCamera = new AnalogCamera();
  }

  @Test
  public void CollectionStartsEmpty(){
    assertEquals(0, photographer.cameraCount());
  }

  @Test
  public void canAddCamera(){
    photographer.add(huh?);
    assertEquals(1, photographer.cameraCount());
  }

}