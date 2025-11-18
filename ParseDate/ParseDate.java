import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ParseDate {

    public static LocalDateTime parseIsoFormat(String stringDate) {
        return LocalDateTime.parse(stringDate);
    }

    public static LocalDate parseFullTextFormat(String stringDate) {
        return LocalDate.parse(stringDate, java.time.format.DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy"));
    }

    public static LocalTime parseTimeFormat(String stringDate) {
        return LocalTime.parse(stringDate);
    }
}