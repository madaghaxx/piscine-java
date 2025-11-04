
public class DoOp {

    public static String operate(String[] args) {
        if (args == null || args.length != 3) {
            return "Error";
        }
        int a = Integer.parseInt(args[0].trim());
        int b = Integer.parseInt(args[2].trim());
        return switch (args[1]) {
            case "+" ->
                String.valueOf(a + b);
            case "-" ->
                String.valueOf(a - b);
            case "*" ->
                String.valueOf(a * b);
            case "/" ->
                b == 0 ? "Error" : String.valueOf(a / b);
            case "%" ->
                b == 0 ? "Error" : String.valueOf(a % b);
            default ->
                "Error";
        };
    }
}
