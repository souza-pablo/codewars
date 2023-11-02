package main.eighth_kyu;

import org.junit.platform.commons.util.StringUtils;

//  kata/57eae20f5500ad98e50002c5
public class RemoveStringSpaces {
    public static String noSpace(final String x) {
        return StringUtils.replaceWhitespaceCharacters(x, "");
    }
}
