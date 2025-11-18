import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ParseDate {
    public static LocalDateTime parseIsoFormat(String stringDate) {
        if (stringDate == null) {
            return null;
        }
        return LocalDateTime.parse(stringDate);
    }

    public static LocalDate parseFullTextFormat(String stringDate) {
        if (stringDate == null) {
            return null;
        }
        return LocalDate.parse(stringDate,
                java.time.format.DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy", java.util.Locale.ENGLISH));
    }

    public static LocalTime parseTimeFormat(String stringDate) {
        if (stringDate == null) {
            return null;
        }
        java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter
                .ofPattern("hh' hours in the 'a', 'mm' minutes and 'ss' seconds'", java.util.Locale.ENGLISH);
        return LocalTime.parse(stringDate, formatter);
    }
}