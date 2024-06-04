import java.util.Scanner;
public class TicTacToe {
    public Player player1;
    public Player player2;
    public Player currentPlayer;
    public Board board;

    public TicTacToe() {
        this.player1 = new Player('X');
        this.player2 = new Player('O');
        this.currentPlayer = player1;
        this.board = new Board();

    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.start();
    }
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("row(0-2):");
        int row = scanner.nextInt();
        System.out.print("column(0-2):");
        int col = scanner.nextInt();
        if (board.isCellEmpty(row, col)) {
            board.place(row, col, currentPlayer.getMarker());
            switchCurrentPlayer();
        }
        else {
            System.out.println("Invalid move. Try again.");
        }
        board.print();
        scanner.close();
    }
    private boolean hasWinner() {
        return board.isWinner(player1.getMarker()) || board.isWinner(player2.getMarker());
    }
    public void switchCurrentPlayer(){
        if(player1==currentPlayer){
            currentPlayer = player2;
        }
        else {
            currentPlayer = player1;
        }
    }
}
