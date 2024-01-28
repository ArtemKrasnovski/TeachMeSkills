package teachmeskills.lesson10.homework;

public class Strings {

    protected static String task1(String string) {
        return string.substring(0, 4) + "-" + string.substring(9, 13);
    }

    protected static String task2(String string) {
        return string.substring(0, 5) + "***" + string.substring(8, 14) + "***" + string.substring(17);
    }

    protected static String task3(String string) {
        return string.substring(5, 8).toLowerCase() + "/" + string.substring(14, 17).toLowerCase() + "/" + string.substring(19, 20).toLowerCase() + "/" + string.substring(21).toLowerCase();
    }

    protected static String task4(String string) {
        StringBuilder output = new StringBuilder();
        return output.append(string.substring(5, 8).toUpperCase()).append("/").append(string.substring(14, 17).toUpperCase()).append("/").append(string.substring(19, 20).toUpperCase()).append("/").append(string.substring(21).toUpperCase()).toString();
    }

    protected static String task5(String string) {
        if (string.contains("ABC") || string.contains("abc")) {
            return "Номер документа СОДЕРЖИТ последовательность ABC или abc";
        } else {
            return "Номер документа НЕ содержит последовательность ABC или abc";
        }
    }

    protected static String task6(String string) {
        if (string.startsWith("555")) {
            return "Номер документа НАЧИНАЕТСЯ с последовательности 555";
        } else {
            return "Номер документа НЕ начинается с последовательности 555";
        }
    }

    protected static String task7(String string) {
        if (string.endsWith("1a2b")) {
            return "Номер документа ЗАКАНЧИВАЕТСЯ на 1a2b";
        } else {
            return "Номер документа НЕ заканчивается на 1a2b";
        }
    }

}
