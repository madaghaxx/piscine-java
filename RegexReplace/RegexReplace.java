import java.util.regex.*;

public class RegexReplace {
    private static String starsFor(String str) {
        return "*".repeat(str.length());
    }

    public static String removeUnits(String s) {
        return s.replaceAll("(\\d+)(cm|€)( |$)", "$1$3");
    }

    public static String obfuscateEmail(String s) {
        if (s == null || !s.contains("@"))
            return s;

        String[] parts = s.split("@");
        String user = obfuscateUser(parts[0]);
        String domain = obfuscateDomain(parts[1]);
        return user + "@" + domain;
    }

    private static String obfuscateUser(String user) {
        int lastSep = user.lastIndexOf('-');
        lastSep = Math.max(lastSep, user.lastIndexOf('.'));
        lastSep = Math.max(lastSep, user.lastIndexOf('_'));

        if (lastSep != -1) {
            return user.substring(0, lastSep + 1) + starsFor(user.substring(lastSep + 1));
        }
        return user.length() > 3 ? user.substring(0, 3) + starsFor(user.substring(3)) : user;
    }

    private static String obfuscateDomain(String domain) {
        String[] parts = domain.split("\\.");

        if (parts.length == 2) {
            String top = parts[1];
            String topOut = top.matches("com|org|net") ? top : starsFor(top);
            return starsFor(parts[0]) + "." + topOut;
        } else if (parts.length == 3) {
            return starsFor(parts[0]) + "." + parts[1] + "." + starsFor(parts[2]);
        }
        return domain;
    }
}