from player import player
from dice import dice
from jumper import jumper
from gameBoard import gameBoard

player1 = player("abc","abc")
player2 = player("xyz","xyz")
current_position = {}
current_position[player1] = 1
current_position[player2] = 1
dice = dice(1)
q = [player1,player2]
snake_jumper = [jumper(50,11),jumper(99,10),jumper(15,1)]
ladder_jumper = [jumper(12,49),jumper(9,78),jumper(2,98)]

gameBoard = gameBoard(dice,current_position,snake_jumper,ladder_jumper,100,q)
gameBoard.startGame()