import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.WeekFields;
import java.util.Locale;

/**
 * Реализуйте метод printDate (Строка даты).
 * Он должен быть в порядке принятия даты (в одном из 3х форматов) в соответствии с примером:
//1) Для «21.4.2014 15:56:45» вывод должен быть:
//День: 21
//День недели: 1
//День месяца: 21
//День года: 111
//Неделя месяца: 4
//Неделя года: 17
//Месяц: 4
//Год: 2014
//AM или PM: PM
//Часы: 3
//Часы дня: 15
//Минуты: 56
//Секунды: 45
//2) Для «21.4.2014»:
//День: 21
//День недели: 1
//День месяца: 21
//День года: 111
//Неделя месяца: 4
//Неделя года: 17
//Месяц: 4
//Год: 2014
//3) Для «17:33:40»:
//AM или PM: PM
//Часы: 5
//Часы дня: 17
//Минуты: 33
//Секунды: 40
 * Требования:
 * 1. Если в методе printDate указана дата в формате "дата время", он должен вывести:
 * День месяца, День года, Неделя месяца, Неделя года, Месяц, Год, AM или PM, Часы, Часы дня, Минуты, Секунды.
 * 2. Если в методе printDate указана дата в формате "дата", он должен вывести:
 * День года, Неделя месяца, Неделя года, Месяц, Год.
 * 3. Если в методе printDate дата в формате "время", он должен вывести: AM или PM, Часы, Часы
 * дня, Минуты, Секунды.
 * 4. Используйте статический метод parse классов LocalDate и LocalTime.
 */
public class Task7 {
    public static void main(String[] args) {
        System.out.println(printDate("21.4.2014 15:56:45"));
        System.out.println("------------------------");
        System.out.println(printDate("21.4.2014"));
        System.out.println("------------------------");
        System.out.println(printDate("17:33:40"));

    }

    static String printDate(String date) {
        try {
            LocalDate localDate = null;
            LocalTime localTime = null;
            WeekFields weekFields = WeekFields.of(Locale.getDefault());
            String str = "";

            DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                    .appendOptional(DateTimeFormatter.ofPattern("d.M.yyyy HH:mm:ss")) // datetime
                    .appendOptional(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss")) // datetime
                    .appendOptional(DateTimeFormatter.ofPattern("HH:mm:ss")) // time
                    .appendOptional(DateTimeFormatter.ofPattern("dd.MM.yyyy")) // date
                    .appendOptional(DateTimeFormatter.ofPattern("d.M.yyyy")) // date
                    .toFormatter();
            // have date?
            try {
                localDate = LocalDate.parse(date, formatter);
            } catch (Exception ignored) {
            }
            // have time?
            try {
                localTime = LocalTime.parse(date, formatter);
            } catch (Exception ignored) {
            }

            if (localDate != null) {
                str = "День: " + localDate.getDayOfMonth() +
                        "\nДень недели: " + localDate.get(weekFields.dayOfWeek()) +
                        "\nДень месяца: " + localDate.getDayOfMonth() +
                        "\nДень года: " + localDate.getDayOfYear() +
                        "\nНеделя месяца: " + localDate.get(weekFields.weekOfMonth()) +
                        "\nНеделя года: " + localDate.get(weekFields.weekOfWeekBasedYear()) +
                        "\nМесяц: " + localDate.getMonthValue() +
                        "\nГод: " + localDate.getYear();
            }
            if (localTime != null) {
                str += "\nAM или PM: " + localTime.format(DateTimeFormatter.ofPattern("a")) +
                        "\nЧасы: " + localTime.format(DateTimeFormatter.ofPattern("h")) +
                        "\nЧасы дня: " + localTime.getHour() +
                        "\nМинуты: " + localTime.getMinute() +
                        "\nСекунды: " + localTime.getSecond();
            }
            return str;
        } catch (Exception e) {
            return "Very bad string";
        }
    }
}
