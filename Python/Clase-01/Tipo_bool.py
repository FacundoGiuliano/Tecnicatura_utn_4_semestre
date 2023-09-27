
# Los tipos numericos , es false para el 0 y true para los demas valores

valor = 0
resultado = bool(valor)
print(f'valor: {valor}, resultado: {resultado}')

valor = 0.15
resultado = bool(valor)
print(f'valor: {valor}, resultado: {resultado}')

# Tipo str: False = '' True = para los demas valores 

valor = ''
resultado = bool(valor)
print(f'valor: {valor}, resultado: {resultado}')

valor = 'Hola'
resultado = bool(valor)
print(f'valor: {valor}, resultado: {resultado}')

# Tipo colecciones
# False = colecciones vacias y True para todas las demas

valor = []
resultado = bool(valor)
print(f'valor: {valor}, resultado: {resultado}')

valor = [2,3,4]
resultado = bool(valor)
print(f'valor: {valor}, resultado: {resultado}')

# Tuplas
valor = ()
resultado = bool(valor)
print(f'valor: {valor}, resultado: {resultado}')

valor = (5,)
resultado = bool(valor)
print(f'valor: {valor}, resultado: {resultado}')

# Diccionario
valor = {}
resultado = bool(valor)
print(f'valor: {valor}, resultado: {resultado}')

valor = {'Nombre' : 'Juan', 'Apellido' : 'Perez'}
resultado = bool(valor)
print(f'valor: {valor}, resultado: {resultado}')

# Sentencias de control con bool
if '':
    print('Regresa verdadero')
else:
    print('Regresa falso')

if bool('hola'):
    print('Regresa verdadero')
else:
    print('Regresa falso')

# Ciclos
variable = 3
while variable:
    print('Regresa verdadero')
    break
else:
    print('Regresa falso')
