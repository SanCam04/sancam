Notas=int(input("ingrese la cantidad de notas: "))
vec=[]
n=0

for i in range(1,Notas+1):
    nota=int(input("Nota: "))
    n=n+nota
    vec.append(nota)

promedio=n/len(vec)

npromedio=0
for j in vec:
    if j>promedio:
        npromedio=npromedio+1

aprobado=0
for h in vec:
    if h>10:
        aprobado=aprobado+1
reprobado=0
for k in vec:
    if k<11:
        reprobado=reprobado+1
print("Max nota:", max(vec))
print("Min nota:", min(vec))
print("promedio:", promedio)
print("superiores al promedio:", npromedio)
print("aprobados:", aprobado)
print("desaprobados", reprobado)