public class Main {

    public static void main(String[] args) {
        SudokuMatrix sudoku = new SudokuMatrix();
        sudoku.display();

        while (true) {

            SudokuPoint data = UserData.get();
            sudoku.changeValue(data);
        }
    }
}
