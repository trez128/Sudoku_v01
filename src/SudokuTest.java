import org.junit.Assert;
import org.junit.Test;

public class SudokuTest {


    //tests for SudokuMatrix class
    @Test
    public void testValueAt03() {
        SudokuMatrix sudoku = new SudokuMatrix();
        Assert.assertEquals(sudoku.getValue(0, 3), 3);

    }

    @Test
    public void testChangedValue() {
        SudokuMatrix sudoku = new SudokuMatrix();
        sudoku.changeValue(new SudokuPoint(0, 0, 4));
        Assert.assertEquals(sudoku.getValue(0, 0), 4);

    }


}

