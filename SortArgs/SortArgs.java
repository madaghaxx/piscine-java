
import java.util.Arrays;

public class SortArgs {

    public static void sort(String[] args) {
        short[] tenp = new short[args.length];
        for (int i = 0; i < tenp.length; i++) {
            tenp[i] = Short.parseShort(args[i].trim());
        }
        Arrays.sort(tenp);
        String sb = "";
        for (int i = 0; i < tenp.length; i++) {
            if (i > 0) {
                sb += (" ");
            }
            sb += (tenp[i]);
        }
        System.out.println(sb.toString());
    }

}
