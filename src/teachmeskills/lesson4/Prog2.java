// Создать программу для раскраски шахматной доски с помощью цикла.
//Создать двумерный массив String'oв 8х8.  С помощью циклов задать элементам циклам значения B(Вlack)
//или W(White).

package teachmeskills.lesson4;

public class Prog2 {
    public static void main(String[] args) {
        String[][] array = new String[8][8];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if ((i + j) % 2 == 0)
                    array[i][j] = "W";
                else array[i][j] = "B";
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
