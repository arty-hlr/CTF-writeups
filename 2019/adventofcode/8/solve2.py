import numpy as np
from PIL import Image

B = 0
W = 1
T = 2
colors = {0:255,1:0}
height = 6
width = 25
depth = 100
# height = 2
# width = 2
# depth = 4

def init():
    with open('input.txt','r') as f:
        image = [int(n) for n in f.read().strip()]
    return np.array([np.array(image[i*width*height:(i+1)*width*height]).reshape((height,width)) for i in range(depth)])

layers = init()
image = np.empty((height,width),dtype=np.uint8)
for i in range(height):
    for j in range(width):
        for layer in layers:
            if layer[i,j] != T:
                image[i,j] = colors[layer[i,j]]
                break

img = Image.fromarray(image,'L')
img = img.resize((width*50,height*50))
img.show()
# img.save('image.png')
