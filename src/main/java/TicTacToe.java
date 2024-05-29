public class TicTacToe {
    public Player player1;
    public Player player2;
    public Player currentPlayer;
    public Board board;

    public TicTacToe(Player player1, Player player2, Player currentPlayer, Board board) {
        this.player1 = new Player('X');
        this.player2 = new Player('O');
        this.currentPlayer = player1;
        this.board = new Board();

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
