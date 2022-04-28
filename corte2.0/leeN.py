from re import X


n=-1 
while(n<0):
 n=int(input("cuantos numeros va ingresar? "))
x=int(input("ingrese primer numero "))
may,men=x,x
for i in range(n-1):
  x=int(input("ingrese el siguiente numero "))
  if x<men:
    men=x

  if x>may:
       may=x
print("el menor numero es ",men,"el mayor numero es ",may)

 
