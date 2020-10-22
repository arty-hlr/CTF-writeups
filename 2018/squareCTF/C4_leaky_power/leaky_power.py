import numpy as np

plaintexts = np.load('plaintexts.npy')
powertraces = np.load('powertraces.npy')

from matplotlib import pyplot as plt

plt.imshow(plaintexts, cmap='gray')
plt.show()

plt.imshow(powertraces, cmap='gray')
plt.show()
