package RegexReplace;

public class RegexReplace {
    public static String removeUnits(String s) {

    public static String obfuscateEmail(String s) {
        return s.replaceAll(
                "([a-zA-Z0-9]+)([-._])([a-zA-Z0-9]+)@([a-zA-Z0-9.-]+)",
                "$1$2***@$4").replaceAll(
                        "\\b([a-zA-Z0-9]{1,3})([a-zA-Z0-9]+)@([a-zA-Z0-9.-]+)",
                        "$1***@$3")
                .replaceAll(
                        "@([a-zA-Z0-9]+)\\.([a-zA-Z0-9]+)\\.([a-zA-Z0-9]+)\\.([a-zA-Z]{2,})",
                        "@*******.$2.$3.***")
                .replaceAll(
                        "@([a-zA-Z0-9]+)\\.([a-zA-Z0-9]+)\\.([a-zA-Z]{2,})",
                        "@***.$2.***")
                .replaceAll(
                        "@([a-zA-Z0-9]+)\\.((?!com|org|net)[a-zA-Z]{2,})\\b",
                        "@***.***")
                .replaceAll(
                        "@([a-zA-Z0-9]+)\\.(com|org|net)\\b",
                        "@*******.$2");
    }
}