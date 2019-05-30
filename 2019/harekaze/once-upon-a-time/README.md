This was a pretty easy challenge in the end but for which I needed a bit of time to get what was happening exactly.

Basically, we get an output text, and the Python script which created it. Reading through the script, we see that the input is first padded so that its length is a multiple of 25, and then transormed into a list of 5x5 matrices, each matrix corresponding to 25 characters and each value being the numerical value of the character, that was the `kinoko` function. We then have another matrix, m2, which goes with the list of matrices in the `encrypt` function, which puts each matrix mat of the list of matrices along with m2 in the `takenoko` function which actually just computes the product of the two matrices. The twist there is that half of the times the order of the matrices sent to `takenoko` is (mat, m2), and the other half it's (m2, mat), and as we know, matrix multiplication is not commutative, so `mat*m2 != m2*mat`. Another thing to note is that all the computations in the matrix multiplication are done modulo 251.

Now to the solve. We have either of the following equations for the mk, the result of the multiplication: `mk = mat*m2` or `mk = m2*mat`, which can be rewritten using matrix inverses `mat = mk*(m2^-1)` or `mat = (m2^-1)*mk`. We now have a way to get the original matrix from m2 and mk, we just have to compute the inverse of m2, without forgetting that everything is modulo 251. That can be easily done with sage (see script), and in the end we just reverse the `kinoko` function to get the original string associated with the matrix, and voilà, we have the flag:

```HarekazeCTF{Op3n_y0ur_3y3s_1ook_up_t0_th3_ski3s_4nd_s33}```

In conclusion an easy challenge, on which I managed to spend one or two hours just because I had misread the regex in the script and expected `HarekazeCTF{` to be in the flag used to build the matrices, which obviously wasn't ;p There was a bit of translation from Python3 to Python2 as the `kinoko` function wasn't working properly with Python2, but that was ok.
