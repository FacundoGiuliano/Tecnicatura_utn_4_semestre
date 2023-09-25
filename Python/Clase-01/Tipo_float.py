# Profundizando en el tipo float
a = 3.0

# Constructor de tipo float
# Puede recibir int y str ( sobrecarga)
a = float(10) # Le pasamos un int
a = float('10') # Le pasamos un str
print(f"a: {a:.2f}")

# Notacion exponencial (valores positivos o negativos)
a = 3e5
print(f"a: {a:.2f}")

a = 3e-5
print(f'a: {a:.5f}')

# CUalquier calculo que incluya un float, todo cambia a float
a = 4.0 + 5
print(a)