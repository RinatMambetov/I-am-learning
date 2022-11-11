import random


class Tank:
    def __init__(self, model, armor, min_damage, max_damage, health):
        self.model = model
        self.armor = armor
        self.damage = random.randint(min_damage, max_damage)
        self.health = health

    def print_info(self):
        print(f"{self.model} имеет лобовую броню {self.armor} мм. при {self.health} ед. здоровья и урон в {self.damage} единиц")

    def shot(self, enemy):
        enemy.health_down(self.damage)
        if enemy.health <= 0:
            print(f"Экипаж танка {enemy.model} уничтожен")
        else:
            print(
                f"{self.model}: точно в цель, у противника {enemy.model} осталось {enemy.health:.2f} единиц здоровья")

    def health_down(self, enemy_damage):
        self.health = self.health-enemy_damage/self.armor
        print(f"{self.model}: командир, по экипажу {self.model} попали, у нас осталось {self.health:.2f} очков здоровья")


def main():
    my_tank = Tank("my_tank", 5, 1, 10, 20)
    enemy_tank = Tank("enemy_tank", 5, 1, 10, 20)
    my_tank.print_info()
    enemy_tank.print_info()
    while my_tank.health > 0 and enemy_tank.health > 0:
        my_tank.shot(enemy_tank)
        if enemy_tank.health > 0:
            enemy_tank.shot(my_tank)


if __name__ == '__main__':
    main()
