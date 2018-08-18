

class BoardState {
  def withCell(cell: Cell, illegalBoardState: IllegalBoardStateException)
  def getCell(location: Location): Cell
  def getWinner(): Token
  def hasWinner(): Boolean
  def getWinningLine(): Line
  
  
}