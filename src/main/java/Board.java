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
    
}
