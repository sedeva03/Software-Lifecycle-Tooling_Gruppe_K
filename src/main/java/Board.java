import java.sql.SQLOutput;

public class Board {
    public char [][] cells;

    public Board(){
        this.cells = new char[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                cells[i][j] = ' ';
            }
        }
    }

    public boolean isCellEmpty(int x, int y){
        if(cells[x][y] == ' '){
            return true;
        }
        return false;
    }

    public void place(int x, int y, char marker){
        cells[x][y] = marker;
    }

    public boolean isFull(){
        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells[0].length -1 ; j++){
                if(cells[i][j] == ' '){
                    return false;
                }
            }
        }
        return true;
    }

    public void clear() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                cells[i][j] = ' ';
            }
        }
    }

    public void print(){
        System.out.println("-------------");
        for(int i = 0; i < cells.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < cells[0].length; j++) {
                System.out.print(cells[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    public boolean isWinner(char marker) {
        // checking rows
        for (int i = 0; i < 3; i++) {
            if (cells[i][0] == marker && cells[i][1] == marker && cells[i][2] == marker) {
                return true;
            }
        }

        // checking columns
        for (int j = 0; j < 3; j++) {
            if (cells[0][j] == marker && cells[1][j] == marker && cells[2][j] == marker) {
                return true;
            }
        }

        // checking diagonals
        if ((cells[0][0] == marker && cells[1][1] == marker && cells[2][2] == marker) ||
                (cells[0][2] == marker && cells[1][1] == marker && cells[2][0] == marker)) {
            return true;
        }

        return false;
    }

}
