package main.eighth_kyu;

//  kata/57356c55867b9b7a60000bd7
public class BasicOperations {
    public static Integer basicMath(String op, int v1, int v2) {
        return switch (op) {
            case "+" -> v1 + v2;
            case "-" -> v1 - v2;
            case "*" -> v1 * v2;
            case "/" -> {
                if (v2 == 0) throw new IllegalArgumentException("Division by zero");
                yield v1 / v2;
            }
            default -> throw new IllegalStateException(String.format("Unexpected value: {%s}", op));
        };
    }
}
