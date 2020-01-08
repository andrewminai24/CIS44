#PsuedoCode
#iterate left to right
#1.1 update lowest (best buy price)
#1.2 calculate  profit for day
#1.3 update best profit

# 2.Return best profit



def buy_and_sell(prices):
    min_price = float('inf')
    best = 0
    for price in prices:
        profit = price - min_price
        if profit > best:
            best = profit
        if price < min_price:
            min_price = price
        return best
