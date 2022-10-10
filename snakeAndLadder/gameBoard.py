
class gameBoard:
    def __init__(self,dice,current_poistion,snake_jumper,ladder_jumper,board_size,q_of_players):
        self.current_position = current_poistion
        self.snake_jumper = snake_jumper
        self.ladder_jumper = ladder_jumper
        self.board_size = board_size
        self.q_of_player = q_of_players
        self.dice = dice

    def startGame(self):
        while(len(self.q_of_player) > 1):
            current_player = self.q_of_player.pop(0)
            curentPosition = self.current_position[current_player]
            number = self.dice.rollDice()
            nextCell = curentPosition + number
            if(nextCell > self.board_size):
                print(current_player.playerName + " got " + str(number) + " out of board")
                self.q_of_player.append(current_player)
            elif(nextCell == self.board_size):
                print(current_player.playerName + " got " + str(number) + " won the game")
                self.current_position[current_player] = nextCell
            else:
                flag = False
                for i in self.snake_jumper:
                    if(nextCell == i.end):
                        flag = True
                        self.current_position[current_player] = i.start

                if(not flag):
                    for i in self.ladder_jumper:
                        if(nextCell == i.start):
                            flag = True
                            self.current_position[current_player] = i.end
                
                if(not flag):
                    self.current_position[curentPosition] = nextCell

                self.q_of_player.append(current_player)
                print(current_player.playerName + " got " + str(number) + " went to" + str(self.current_position[current_player]))

            