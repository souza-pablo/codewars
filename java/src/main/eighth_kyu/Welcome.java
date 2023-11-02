package main.eighth_kyu;

import java.util.HashMap;
import java.util.Map;

//  kata/577ff15ad648a14b780000e7
public class Welcome {
  public static String greet(String language) {
    var greeting = feedMap();

    return greeting.getOrDefault(language, greeting.get("english"));
  }

  public static Map<String, String> feedMap() {
    return new HashMap<>() {{
      put("english", "Welcome");
      put("czech", "Vitejte");
      put("danish", "Velkomst");
      put("dutch", "Welkom");
      put("estonian", "Tere tulemast");
      put("finnish", "Tervetuloa");
      put("flemish", "Welgekomen");
      put("french", "Bienvenue");
      put("german", "Willkommen");
      put("irish", "Failte");
      put("italian", "Benvenuto");
      put("latvian", "Gaidits");
      put("lithuanian", "Laukiamas");
      put("polish", "Witamy");
      put("spanish", "Bienvenido");
      put("swedish", "Valkommen");
      put("welsh", "Croeso");
    }};
  }
}
