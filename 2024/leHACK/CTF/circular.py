import numpy as np
from sage.all import is_prime

def spiral_fill(size):
    """Fill a grid of the given size with integers in a spiral order starting from the center."""
    grid = np.zeros((size, size), dtype=int)
    x, y = size // 2, size // 2  # Start from the center of the grid

    directions = ((1,0), (0,1), (-1,0), (0,-1))
    dir_idx = 0


    # Start numbering from 1
    num = 1
    grid[x,y] = num
    num += 1

    for n in range(1,size//2):
        # start from upper left corner
        x -= 1
        y -= 1
        for d in directions:
            for i in range(n*2):
                try:
                    grid[x,y] = num
                    num += 1
                    x += d[0]
                    y += d[1]
                except:
                    return grid

    return grid

# def find_nth_prime_sum_square(nth):
#     directions = ((1,0), (0,1), (-1,0), (0,-1))
#     dir_idx = 0

#     primes = [0]
#     prime_count = 0

#     grid_size = 10000

#     while True:
#         grid = spiral_fill(grid_size)
#         print(grid_size)
#         x, y = grid_size // 2, grid_size // 2  # Start from the center of the grid

#         for n in range(1,grid_size//2):
#             # start from upper left corner
#             x -= 1
#             y -= 1
#             for d in directions:
#                 for i in range(n*2):
#                     square = grid[x,y]
#                     if square > primes[-1]:
#                         print(prime_count, end='\r')
#                         total_sum = compute_sum(grid, x, y)
#                         if total_sum > 0 and is_prime(total_sum):
#                             primes.append(square)
#                             prime_count += 1
#                             if prime_count == nth:
#                                 return grid[x,y], total_sum
#                     x += d[0]
#                     y += d[1]
#         grid_size += 10000  # Increment grid size by 50 each iteration to expand the search area
            
def print_layers(grid):
    """Print the first two layers of the grid."""
    size = len(grid)
    center = size // 2
    for x in range(center-3, center+4):
        for y in range(center-3, center+4):
            print(f"{grid[x, y]:>4}", end=" ")
        print()

def manual_sum(grid, x, y):
    """Compute the sum of a 3x3 square centered at (x, y) if possible, otherwise return 0."""
    size = len(grid)
    if 0 <= x-1 < size and 0 <= y-1 < size and 0 <= x+1 < size and 0 <= y+1 < size:
        return np.sum(grid[x-1:x+2, y-1:y+2])
    return 0

# def find_nth_prime_sum_square(n):
#     prime_count = 0
#     primes = []
#     last_prime_sum_square = None
#     grid_size = 2000

#     grid = spiral_fill(grid_size)

#     for x in range(grid_size):
#         for y in range(grid_size):
#             print(prime_count, end='\r')
#             total_sum = compute_sum(grid, x, y)
#             if total_sum > 0 and is_prime(total_sum):
#                 prime_count += 1
#                 primes += grid[x,y]
#                 if prime_count == n:
#                     return grid[x,y], total_sum

#     return None

def find_20000th_prime_sum_square():
    prime_count = 0
    last_prime_sum_square = None
    grid_size = 100  # Start with a 100x100 grid

    while prime_count < 20000:
        grid = spiral_fill(grid_size)

        for x in range(grid_size):
            for y in range(grid_size):
                total_sum = compute_sum(grid, x, y)
                if total_sum > 0 and is_prime(total_sum):
                    prime_count += 1
                    print(prime_count, end='\r')
                    if prime_count == 20000:
                        return grid[x, y], total_sum

        grid_size += 50  # Increment grid size by 50 each iteration to expand the search area

    return last_prime_sum_square

# grid = spiral_fill(100)
# size = len(grid)
# center = size // 2
# print(compute_sum(grid, center, center))

# n = 20000
# # n = 20
# result = find_nth_prime_sum_square(n)
# # result = find_20000th_prime_sum_square()
# print()
# print(f"The {n}th square with a prime sum is {result[0]} with the prime sum {result[1]}")

# compute numbers from first few rows manually
def first_row_manual():
    directions = ((1,0), (0,1), (-1,0), (0,-1))
    dir_idx = 0
    primes = []
    grid_size = 20
    grid = spiral_fill(grid_size)
    x, y = grid_size // 2, grid_size // 2  # Start from the center of the grid
    for n in range(1,grid_size//2):
        # start from upper left corner
        x -= 1
        y -= 1
        for d in directions:
            for i in range(n*2):
                square = grid[x,y]
                if square >= 10:
                    return primes
                total_sum = manual_sum(grid, x, y)
                if is_prime(total_sum):
                    primes.append(square)
                x += d[0]
                y += d[1]

ul_corners = [(i, n, n**2 + 1) for i,n in enumerate(range(1,100000,2))]

def find_ulcorner(n):
    for i,s in enumerate(ul_corners):
        if s[2] > n:
            return ul_corners[i-1]

def compute_ul_corner(idx, n, root, ulcorner):
    before = ul_corners[idx-1][2]
    after = ul_corners[idx+1][2]
    last = ul_corners[idx+2][2]
    return before + n + n+1 + after-1 + after + after+1 + after+2 + last-2 + last-1

def compute_ulb_adj(idx, n, root, ulcorner):
    before = ul_corners[idx-1][2]
    cur = ul_corners[idx][2]
    after = ul_corners[idx+1][2]
    return after+1 + after+2 + after+3 + cur + cur+1 + cur+2 + after-1 + before + before+1

def compute_blu_adj(idx, n, root, ulcorner):
    before = ul_corners[idx-1][2]+ul_corners[idx-1][1]
    cur = ul_corners[idx][2]+ul_corners[idx][1]
    after = ul_corners[idx+1][2]+ul_corners[idx+1][1]
    return before + before+1 + cur-1 + cur + cur+1 + cur+2 + after-2 + after-1 + after 

def compute_bl_corner(idx, n, root, ulcorner):
    before = ul_corners[idx-1][2]+ul_corners[idx-1][1]
    cur = ul_corners[idx][2]+ul_corners[idx][1]
    after = ul_corners[idx+1][2]+ul_corners[idx+1][1]
    return before+1 + cur + cur+1 + cur+2 + after-1 + after + after+1 + after+2 + after+3

def compute_blr_adj(idx, n, root, ulcorner):
    before = ul_corners[idx-1][2]+ul_corners[idx-1][1]
    cur = ul_corners[idx][2]+ul_corners[idx][1]
    after = ul_corners[idx+1][2]+ul_corners[idx+1][1]
    return before+1 + before+2 + + cur + cur+1 + cur+2 + cur+3 + after+2 + after+3 + after+4

def compute_brl_adj(idx, n, root, ulcorner):
    before = ul_corners[idx-1][2]+2*ul_corners[idx-1][1]
    cur = ul_corners[idx][2]+2*ul_corners[idx][1]
    after = ul_corners[idx+1][2]+2*ul_corners[idx+1][1]
    return before+1 + before+2 + cur + cur+1 + cur+2 + cur+3 + after-1 + after + after+1

def compute_br_corner(idx, n, root, ulcorner):
    before = ul_corners[idx-1][2]+2*ul_corners[idx-1][1]
    cur = ul_corners[idx][2]+2*ul_corners[idx][1]
    after = ul_corners[idx+1][2]+2*ul_corners[idx+1][1]
    return before+2 + cur+1 + cur+2 + cur+3 + after + after+1 + after+2 + after+3 + after+4

def compute_bru_adj(idx, n, root, ulcorner):
    before = ul_corners[idx-1][2]+2*ul_corners[idx-1][1]
    cur = ul_corners[idx][2]+2*ul_corners[idx][1]
    after = ul_corners[idx+1][2]+2*ul_corners[idx+1][1]
    return before+2 + before+3 + cur+1 + cur+2 + cur+3 + cur+4 + after+3 + after+4 + after+5

def compute_urd_adj(idx, n, root, ulcorner):
    before = ul_corners[idx-1][2]+3*ul_corners[idx-1][1]
    cur = ul_corners[idx][2]+3*ul_corners[idx][1]
    after = ul_corners[idx+1][2]+3*ul_corners[idx+1][1]
    return before+2 + before+3 + cur+1 + cur+2 + cur+3 + cur+4 + after + after+1 + after+2

def compute_ur_corner(idx, n, root, ulcorner):
    before = ul_corners[idx-1][2]+3*ul_corners[idx-1][1]
    cur = ul_corners[idx][2]+3*ul_corners[idx][1]
    after = ul_corners[idx+1][2]+3*ul_corners[idx+1][1]
    return before+3 + cur+2 + cur+3 + cur+4 + after+1 + after+2 + after+3 + after+4 + after+5

def compute_url_adj(idx, n, root, ulcorner):
    before = ul_corners[idx-1][2]+3*ul_corners[idx-1][1]
    cur = ul_corners[idx][2]+3*ul_corners[idx][1]
    after = ul_corners[idx+1][2]+3*ul_corners[idx+1][1]
    return before+3 + before+4 + cur+2 + cur+3 + cur+4 + cur+5 + after+4 + after+5 + after+6

def compute_ulr_adj(idx, n, root, ulcorner):
    before = ul_corners[idx-1][2]
    cur = ul_corners[idx][2]
    nextn = ul_corners[idx+1][2]
    after = ul_corners[idx+2][2]
    return before + cur-1 + cur + cur+1 + nextn-1 + nextn-2 + after-1 + after-2 + after-3

def compute_ulrr_adj(idx, n, root, ulcorner):
    if n < ulcorner+root*1+1:
        leg = 0
    elif n < ulcorner+root*2+2:
        leg = 1
    elif n < ulcorner+root*3+3:
        leg = 2
    else:
        leg = 3
    diff = n - leg*root - ulcorner
    before = ul_corners[idx-1][2]+leg*ul_corners[idx-1][1] + diff - 1
    after = ul_corners[idx+1][2]+leg*ul_corners[idx+1][1] + diff + 1
    return before-1 + before + ul_corners[idx-1][2] + n-1 + n + n+1 + after-1 + after + after+1

def compute_generic(idx, n, root, ulcorner):
    if n < ulcorner+root*1+1:
        leg = 0
    elif n < ulcorner+root*2+2:
        leg = 1
    elif n < ulcorner+root*3+3:
        leg = 2
    else:
        leg = 3
    diff = n - leg*root - ulcorner
    before = ul_corners[idx-1][2]+leg*ul_corners[idx-1][1] + diff - 1
    after = ul_corners[idx+1][2]+leg*ul_corners[idx+1][1] + diff + 1
    return before-1 + before + before+1 + n-1 + n + n+1 + after-1 + after + after+1

def compute_sum(n):
    idx,root,ulcorner = find_ulcorner(n)
    if n == ulcorner:
        return compute_ul_corner(idx, n, root, ulcorner)
    elif n == ulcorner + 1:
        return compute_ulb_adj(idx, n, root, ulcorner)

    elif n == ulcorner + (root+1) - 1:
        return compute_blu_adj(idx, n, root, ulcorner)
    elif n == ulcorner + (root+1):
        return compute_bl_corner(idx, n, root, ulcorner)
    elif n == ulcorner + (root+1) + 1:
        return compute_blr_adj(idx, n, root, ulcorner)

    elif n == ulcorner + 2*(root+1) - 1:
        return compute_brl_adj(idx, n, root, ulcorner)
    elif n == ulcorner + 2*(root+1):
        return compute_br_corner(idx, n, root, ulcorner)
    elif n == ulcorner + 2*(root+1) + 1:
        return compute_bru_adj(idx, n, root, ulcorner)

    elif n == ulcorner + 3*(root+1) - 1:
        return compute_urd_adj(idx, n, root, ulcorner)
    elif n == ulcorner + 3*(root+1):
        return compute_ur_corner(idx, n, root, ulcorner)
    elif n == ulcorner + 3*(root+1) + 1:
        return compute_url_adj(idx, n, root, ulcorner)

    elif n == ulcorner + 4*(root+1) - 2:
        return compute_ulrr_adj(idx, n, root, ulcorner)
    elif n == ulcorner + 4*(root+1) - 1:
        return compute_ulr_adj(idx, n, root, ulcorner)

    else:
        return compute_generic(idx, n, root, ulcorner)

def check_computes(maximum):
    directions = ((1,0), (0,1), (-1,0), (0,-1))
    dir_idx = 0

    grid_size = 2000
    grid = spiral_fill(grid_size)

    x, y = grid_size // 2, grid_size // 2  # Start from the center of the grid

    for n in range(1,grid_size//2):
        # start from upper left corner
        x -= 1
        y -= 1
        for d in directions:
            for i in range(n*2):
                square = grid[x,y]
                if square > maximum:
                    return
                if square >= 10:
                    try:
                        assert compute_sum(square) == manual_sum(grid,x,y)
                    except:
                        print(square)
                        exit()
                x += d[0]
                y += d[1]

# check_computes(1000000)
# exit()

primes = first_row_manual()
prime_count = len(primes)

for i in range(10,10000000000):
    print(i, prime_count, primes[-1], end='\r')
    if is_prime(compute_sum(i)):
        primes.append(i)
        prime_count += 1
    if prime_count == 20000:
        print(primes[-1])

print()
