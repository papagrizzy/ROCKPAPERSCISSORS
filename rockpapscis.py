import random

username = input("Hey! What's your name?: ")
print(f"Hello {username}")
boolean_status = True
game_arr = ['ROCK', 'PAPER', 'SCISSOR']
game_status = input("Start playing?(Y/N): ")

if game_status == "N":
    boolean_status = False

while boolean_status:
    print("\n")
    print("""For Rock, enter \'Rock\'
For Paper, enter \'Paper\'
For Scissors, enter \'Scissor\'""")
    print("\n")
    reps = 0
    user_win_status = 0
    machine_win_status = 0
    flag = True
    while reps < 5 and flag:
        random.shuffle(game_arr)
        choice = input("You: ").upper()
        if choice == game_arr[0]:
            if game_arr[0] == "ROCK":
                print("Machine: Rock")
            elif game_arr[0] == "SCISSOR":
                print("Machine: Scissor")
            elif game_arr[0] == "PAPER":
                print("Machine: Paper")
            print(f'Score: Machine = {machine_win_status}, User = {user_win_status}\n')
        elif choice == "ROCK" and game_arr[0] == "SCISSOR":
            user_win_status += 1
            print("Machine: Scissor")
            print(f'Score: Machine = {machine_win_status}, User = {user_win_status}\n')
        elif choice == "PAPER" and game_arr[0] == "ROCK":
            user_win_status += 1
            print("Machine: Rock")
            print(f'Score: Machine = {machine_win_status}, User = {user_win_status}\n')
        elif choice == "SCISSOR" and game_arr[0] == "PAPER":
            user_win_status += 1
            print("Machine: Paper")
            print(f'Score: Machine = {machine_win_status}, User = {user_win_status}\n')
        else:
            machine_win_status += 1
            if game_arr[0] == "ROCK":
                print("Machine: Rock")
            elif game_arr[0] == "SCISSOR":
                print('Machine: Scissor')
            elif game_arr[0] == "PAPER":
                print('Machine: Paper')
            print(f'Score: Machine = {machine_win_status}, User = {user_win_status}\n')

        reps += 1

    if user_win_status > machine_win_status:
        print("You win!!")
    elif machine_win_status > user_win_status:
        print("You Lose!!")
    else:
        print("Draw!!\n")
    game_status = input("Continue playing?(Y/N): ").upper()

    if game_status == "N":
        boolean_status = False
print("Quitting game")
