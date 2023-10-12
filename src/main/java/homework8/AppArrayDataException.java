package homework8;

public class AppArrayDataException extends Exception {
    private static int row;
    private static int column;

    public AppArrayDataException(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}
