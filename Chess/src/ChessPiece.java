public class ChessPiece extends Piece {

    private Color color;
    private int moveCount;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor(){
        return color;
    }
    
    public ChessPosition getChessPosition() {
    }

    protected boolean isThereOpponentPiece(Position position) {
    }

    protected void increaseMoveCount() {
    }

    protected void decreaseMoveCount() {
    }

}
