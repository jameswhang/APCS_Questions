public class Square {
    public Square (boolean isBlack, int num);    
}

public class Crossword {
    private Square[][] puzzle;

    public Crossword(boolean[][] blackSquares) {
        int number = 1;
        for(int r = 0; r < blackSquares.length; r++) {
            for(int c = 0; c < blackSquares[r].length; c++) {
                if(toBeLabeled(r,c,blackSquares[r][c])) {
                    puzzle[r][c] = new Square(false, number);
                    number++;
                }
                else {
                    puzzle[r][c] = new Square(true, 0);
                }
            }
        }
    }
    private boolean toBeLabeled(int r, int c, boolean[][]blackSquares) {
        if(blackSquares[r][c]) {
            return false;
        }
        else {
            if((blackSquares[r][c-1] == true) || (blackSquares[r-1][c] == true)) {
                return true;
            }
            return false;
        }
    }
}

