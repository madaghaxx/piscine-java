package FormatDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class FormatDate {

    public static String formatToFullText(LocalDateTime dateTime) {
        return String.format("Le %d %s de l'an %d à %dh%dm et %ds", dateTime.getDayOfMonth(), dateTime.getMonth(),
                dateTime.getYear(), dateTime.getHour(), dateTime.getMinute(), dateTime.getSecond());
    }

    public static String formatSimple(LocalDate date) {
        return String.format("%s %d %d", date.getMonth().getDisplayName(java.time.format.TextStyle.FULL, java.util.Locale.ITALIAN), date.getDayOfMonth(), date.getYear());
    }

    public static String formatIso(LocalTime time) {
        return String.format("%d:%d:%d.%d",time.getHour(),time.getMinute(),time.getSecond(),time.getNano());
    }

    public static void main(String[] args) {
        System.out.println(FormatDate.formatToFullText(LocalDateTime.of(2021, 8, 22, 13, 25, 46)));
        System.out.println(FormatDate.formatSimple(LocalDate.of(2022, 2, 13)));
        System.out.println(FormatDate.formatIso(LocalTime.of(16, 18, 56, 8495847)));

    }
}