package ir.shariaty.x_o

import kotlin.random.Random

data class GameModel (
    var gameId : String = "-1",
    var filledPos: MutableList<String> = mutableListOf("","","","","","","","",""),
    //mutable list یعنی قابل تغییر
    //immutable list یعنی غیر قابل تغییر
    var winner : String = "",
    var gameStatus : GameStatus = GameStatus.CREATED,
    var currentPlayer : String = (arrayOf("X","O"))[Random.nextInt(2)]
)
enum class GameStatus{
            CREATED,
            JOINED,
            INPROGRESS,
            FINISHED
}