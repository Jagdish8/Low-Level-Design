from random import randint, random


class dice:
    def __init__(self,no_of_dice):
        dice.size = no_of_dice

    def rollDice(self):
        total = 0
        for i in range(dice.size):
            total += randint(1,6)
        return total