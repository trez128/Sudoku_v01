public class SudokuValidator {

    public static boolean isValid(SudokuMatrix matrix, SudokuPoint point) {

        boolean SudokuFinishedStatus = true;

        for (int i = 0; i <= 8; i++) {
            for (int z = 0; z <= 8; z++) {
                if (matrix.getValue(i, z) == 0) {
                    SudokuFinishedStatus = false;
                }
            }
        }

        if (!SudokuFinishedStatus) {
            System.out.printf("SUDOKU SKONCZONE ! ! ! !  ");
        }


        //check X
        if (point.getX() >= 0 & point.getX() < 9) {
            System.out.printf("X poprawne, ");
        } else {
            System.out.printf("X NIE poprawne, ");
            return false;
        }
        //check Y
        if (point.getY() >= 0 & point.getY() < 9) {
            System.out.printf("Y poprawne, ");
        } else {
            System.out.printf("Y NIE poprawne, ");
            return false;
        }

        //check value

        if (point.getValue() > 9) {
            return false;
        }

        //check if there is no set same value in matrix 3x3
        // FOR ROW X 1-3
        if (point.getX() <= 2) {

            if (point.getY() <= 2) {

                for (int i = 0; i <= 2; i++) {
                    for (int z = 0; z <= 2; z++) {
                        if (point.getValue() == matrix.getValue(i, z)) {
                            return false;
                        }
                    }
                }
            }
            if (point.getY() >= 3 && point.getY() <= 5) {

                for (int i = 0; i <= 2; i++) {
                    for (int z = 3; z <= 5; z++) {
                        if (point.getValue() == matrix.getValue(i, z)) {
                            return false;
                        }
                    }
                }
            }

            if (point.getY() >= 6 && point.getY() <= 8) {

                for (int i = 0; i <= 2; i++) {
                    for (int z = 6; z <= 8; z++) {
                        if (point.getValue() == matrix.getValue(i, z)) {
                            return false;
                        }
                    }
                }
            }
        }

        // FOR ROW X 4-6
        if (point.getX() >= 3 && point.getX() <= 5) {

            if (point.getY() <= 2) {

                for (int i = 3; i <= 5; i++) {
                    for (int z = 0; z <= 2; z++) {
                        if (point.getValue() == matrix.getValue(i, z)) {
                            return false;
                        }
                    }
                }
            }
            if (point.getY() >= 3 && point.getY() <= 5) {

                for (int i = 3; i <= 5; i++) {
                    for (int z = 3; z <= 5; z++) {
                        if (point.getValue() == matrix.getValue(i, z)) {
                            return false;
                        }
                    }
                }
            }

            if (point.getY() >= 6 && point.getY() <= 8) {

                for (int i = 3; i <= 5; i++) {
                    for (int z = 6; z <= 8; z++) {
                        if (point.getValue() == matrix.getValue(i, z)) {
                            return false;
                        }
                    }
                }
            }
        }

        // FOR ROW X 7-9
        if (point.getX() >= 6 && point.getX() <= 8) {

            if (point.getY() <= 2) {

                for (int i = 6; i <= 8; i++) {
                    for (int z = 0; z <= 2; z++) {
                        if (point.getValue() == matrix.getValue(i, z)) {
                            return false;
                        }
                    }
                }
            }
            if (point.getY() >= 3 && point.getY() <= 5) {

                for (int i = 6; i <= 8; i++) {
                    for (int z = 3; z <= 5; z++) {
                        if (point.getValue() == matrix.getValue(i, z)) {
                            return false;
                        }
                    }
                }
            }

            if (point.getY() >= 6 && point.getY() <= 8) {

                for (int i = 6; i <= 8; i++) {
                    for (int z = 6; z <= 8; z++) {
                        if (point.getValue() == matrix.getValue(i, z)) {
                            return false;
                        }
                    }
                }
            }
        }

        //check if there is something in cell and we do not want overwrite

        if (matrix.getValue(point.getX(), point.getY()) != 0) {
            return false;
        } else {


            // check values in a row
            for (int i = 0; i < 9; i++) {
                if (point.getValue() == matrix.getValue(i, point.getY())) {
                    return false;
                }
            }
            //check values in column
            for (int i = 0; i < 9; i++) {
                if (point.getValue() == matrix.getValue(point.getX(), i)) {
                    return false;
                }
            }
        }


        return true;
    }


}
