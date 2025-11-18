import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class FormatDate {

    public static String formatToFullText(LocalDateTime dateTime) {
        if (dateTime == null) {
            return null;
        }
        return String.format("Le %d %s de l'an %d à %dh%dm et %ds", dateTime.getDayOfMonth(), dateTime.getMonth(),
                dateTime.getYear(), dateTime.getHour(), dateTime.getMinute(), dateTime.getSecond());
    }

    public static String formatSimple(LocalDate date) {
        if (date == null) {
            return null;
        }
        return String.format("%s %d %d",
                date.getMonth().getDisplayName(java.time.format.TextStyle.SHORT, java.util.Locale.ITALIAN),
                date.getDayOfMonth(), date.getYear() % 100);
    }

    public static String formatIso(LocalTime time) {
        if (time == null) {
            return null;
        }
        return time.toString();
    }
}