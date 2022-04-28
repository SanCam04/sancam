from re import X
import numpy as np

x3=np.array([1,2,3,11,9,7])
x6=np.array([-1,2,7,18,9,8])


x7=np.zeros(len(x3))
print(x7)
for i in range(len(x3)):
    x7[i]=x3[i]+x6[i]
    print(x7)