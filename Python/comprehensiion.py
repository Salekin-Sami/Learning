mat1= [[0,-5],[-1,0],[-6,-1]]
mat2 = [[0,-1],[-3,2]]
print(mat1)
print(mat2)
row1 = len(mat1)
print(row1)
print("row1: ",row1)
cols1 = len(mat1[0])
print("cols1: ",cols1)
row2 = len(mat2)
print("row2: ",row2)
cols2 = len(mat2[0])
print("cols2: ",cols2)
if cols1!=row2:
    print("Matrix multiplication not possible")
else:
    result = [[0 for i in range(cols2)] for j in range(row1)]
    for i in range(row1):
        for j in range(cols2):
            for k in range(row2):
                result[i][j] += mat1[i][k]*mat2[k][j]
    print(result)
    for r in result:
        print(r)