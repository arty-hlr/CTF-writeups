def count(image,i,target):
    count = 0
    layer = image[i*25*6:(i+1)*25*6]
    for n in layer:
        if n == target:
            count += 1
    return count

def find_min_zeros(image):
    m = 25*6*100
    index = None
    for i in range(100):
        zeros = count(image,i,0)
        if zeros < m:
            m = zeros
            index = i
    return index

def ones_twos(image,index):
    ones = count(image,index,1)
    twos = count(image,index,2)
    return ones*twos

with open('input.txt','r') as f:
    image = [int(n) for n in f.read().strip()]

index = find_min_zeros(image)
print(ones_twos(image,index))
