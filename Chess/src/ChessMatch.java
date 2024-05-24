public class ChessMatch {
    
    private int turn;
    private Color currentPlayer;
    private boolean check;
    private boolean checkMate;
    private ChessPiece enPassantVunerable;
    private ChessPiece promoted;
    
    public ChessPiece[][] getPieces(){}
    public boolean[][] possibleMoves(ChessPosition sourcePosition){}
    public ChessPiece performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition){}
    public ChessPiece replacePromotedPiece(String type){}
    
}
