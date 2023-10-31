def calculate_bid(player, pos, first_moves, second_moves):
    player1_money = 100
    player2_money = 100
    player1_draw = 1  # Player 1 has the draw advantage initially.
    player2_draw = 0

    # Calculate the total amount of money spent by each player.
    for i in range(len(first_moves)):
        if i % 2 == 0:
            player1_money -= first_moves[i]
        else:
            player2_money -= first_moves[i]

    for i in range(len(second_moves)):
        if i % 2 == 0:
            player1_money -= second_moves[i]
        else:
            player2_money -= second_moves[i]

    # Calculate the remaining distance to the scotch.
    distance_to_scotch = abs(pos - 5)

    # Calculate the maximum possible bid for each player based on their remaining money.
    max_bid_player1 = player1_money
    max_bid_player2 = player2_money

    # Calculate the minimum bid required to win if both players bid.
    min_bid_required = distance_to_scotch + 1

    # Check if the current player has the draw advantage.
    if player == 1 and player1_draw == 1:
        # Player 1 has the draw advantage, so they can bid 0 to draw.
        if max_bid_player1 >= min_bid_required:
            return min_bid_required
        else:
            return 0
    elif player == 2 and player2_draw == 1:
        # Player 2 has the draw advantage, so they can bid 0 to draw.
        if max_bid_player2 >= min_bid_required:
            return min_bid_required
        else:
            return 0

    # If neither player has the draw advantage, they bid to win.
    if player == 1:
        # Player 1 bids to win.
        if max_bid_player1 >= min_bid_required:
            return min_bid_required
        else:
            return max_bid_player1
    else:
        # Player 2 bids to win.
        if max_bid_player2 >= min_bid_required:
            return min_bid_required
        else:
            return max_bid_player2

# Example usage:
player = 1
pos = 6
first_moves = [10, 8, 10]
second_moves = [5, 20, 30]
bid = calculate_bid(player, pos, first_moves, second_moves)
print(bid)