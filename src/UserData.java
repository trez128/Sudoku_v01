import java.util.Scanner;

public class UserData {

    public static SudokuPoint get() {
        System.out.printf("Prosze podac wsppolrzedne liczby X i Y (po przecinku): ");

        Scanner sc = new Scanner(System.in);
        String coordinates = sc.next();

        String[] split = coordinates.split(",", 2);
        int x = Integer.parseInt(split[0]);
        int y = Integer.parseInt(split[1]);

        System.out.printf("x = %d, y= %d\n", x, y);

        System.out.printf("Prosze podac wartosc [1-9]: ");
        int value = sc.nextInt();

        return new SudokuPoint(x - 1, y - 1, value);


    }

}
