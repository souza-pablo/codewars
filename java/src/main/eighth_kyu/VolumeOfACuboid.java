package main.eighth_kyu;

//  kata/58261acb22be6e2ed800003a
public class VolumeOfACuboid {
  public static double getVolumeOfCuboid(final double length, final double width, final double height) {
    if (length <= 0 || width <= 0 || height <= 0) throw new IllegalArgumentException("Measure needs to be a positive " +
            "value");
    return length * width * height;
  }
}
