
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
                new java.time.format.DateTimeFormatterBuilder()
                        .parseCaseInsensitive()
                        .appendPattern("EEEE dd MMMM yyyy")
                        .toFormatter(java.util.Locale.ENGLISH));
    }

    public static LocalTime parseTimeFormat(String stringDate) {
        if (stringDate == null) {
            return null;
        }
        java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter
                .ofPattern("hh' hours 'B', 'mm' minutes and 'ss' seconds'", java.util.Locale.ENGLISH);
        LocalTime time = LocalTime.parse(stringDate, formatter);
        String lowerString = stringDate.toLowerCase();
        if (lowerString.contains("evening") || lowerString.contains("afternoon") || lowerString.contains("night")) {
            if (time.getHour() < 12) {
                time = time.plusHours(12);
            }
        }

        return time;
    }

}