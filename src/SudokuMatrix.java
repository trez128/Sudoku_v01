import javax.xml.validation.Validator;

public class SudokuMatrix {
    private int[][] sudo_table;

    public SudokuMatrix() {

        sudo_table = new int[9][9];

        sudo_table[0][3] = 3;
        sudo_table[0][4] = 9;
        sudo_table[0][7] = 1;

        sudo_table[1][0] = 5;
        sudo_table[1][2] = 1;
        sudo_table[1][7] = 4;

        sudo_table[2][0] = 9;
        sudo_table[2][3] = 7;
        sudo_table[2][6] = 5;

        sudo_table[3][0] = 6;
        sudo_table[3][2] = 2;
        sudo_table[3][3] = 5;
        sudo_table[3][4] = 3;
        sudo_table[3][7] = 7;

        sudo_table[4][4] = 7;
        sudo_table[4][8] = 8;

        sudo_table[5][0] = 7;
        sudo_table[5][3] = 8;
        sudo_table[5][6] = 9;
        sudo_table[5][8] = 3;

        sudo_table[6][0] = 8;
        sudo_table[6][2] = 3;
        sudo_table[6][4] = 1;
        sudo_table[6][7] = 9;

        sudo_table[7][1] = 9;
        sudo_table[7][3] = 2;
        sudo_table[7][5] = 6;
        sudo_table[7][8] = 7;

        sudo_table[8][2] = 4;
        sudo_table[8][5] = 3;
        sudo_table[8][7] = 6;
        sudo_table[8][8] = 1;
    }

    public void display() {

        System.out.println("Wyswietlam SUDOKU !");
        for (int i = 0; i < sudo_table.length; i++) {
            for (int j = 0; j < sudo_table[i].length; j++) {
                System.out.print("|" + sudo_table[i][j] + "|");
            }
            System.out.println();
        }
    }

    public void changeValue(SudokuPoint point) {
        if (SudokuValidator.isValid(this, point)) {
            sudo_table[point.getX()][point.getY()] = point.getValue();

        } else {
            System.out.println("Wartosc " + point.getValue() + " nie moze byc wstawiona w polu o wspolrzednych: (" + (point.getX() + 1) + "," + (point.getY() + 1) + ")");
        }
        display();
    }

    public int getValue(int x, int y) {
        return sudo_table[x][y];
    }


}