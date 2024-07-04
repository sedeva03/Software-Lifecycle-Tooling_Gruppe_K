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
        boolean playAgain;

        do {
            board.clear();
            currentPlayer = player1;
            boolean gameEnded = false;

            while (!gameEnded) {
                System.out.println("Current Player: " + currentPlayer.getMarker());
                board.print();
                System.out.print("row(0-2): ");
                int row = scanner.nextInt();
                System.out.print("column(0-2): ");
                int col = scanner.nextInt();

                if (row < 0 || row > 2 || col < 0 || col > 2) {
                    System.out.println("Invalid move. Try again.");
                    continue;
                }

                if (board.isCellEmpty(row, col)) {
                    board.place(row, col, currentPlayer.getMarker());
                    if (hasWinner()) {
                        gameEnded = true;
                    }
                     else {
                        switchCurrentPlayer();
                    }
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");
        } while (playAgain);
      
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
