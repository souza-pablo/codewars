package main.sixth_kyu;

//  kata/5266876b8f4bf2da9b000362
public class WhoLikesIt {
  public static String whoLikesIt(String... names) {
    switch (names.length) {
      case 0 -> {
        return "no one likes this";
      }
      case 1 -> {
        return String.format("%s likes this", names[0]);

      }
      case 2 -> {
        return String.format("%s and %s like this", names[0], names[1]);
      }

      case 3 -> {
        return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
      }

      default -> {
        return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
      }
    }
  }
}
