import math
from decimal import Decimal

# Manejo de valores infinitos
infinito_positivo = float('inf')
print(infinito_positivo)
print(f'Es infinito? {math.isinf(infinito_positivo)}')

infinito_negativo = float('-inf')
print(infinito_negativo)
print(f'Es infinito? {math.isinf(infinito_negativo)}')

# Modulo math
infinito_positivo = math.inf
print(infinito_positivo)
print(f'Es infinito? {math.isinf(infinito_positivo)}')

infinito_negativo = -math.inf
print(infinito_negativo)
print(f'Es infinito? {math.isinf(infinito_negativo)}')

# Modulo decimal
infinito_positivo = Decimal('Infinity')
print(infinito_positivo)
print(f'Es infinito? {math.isinf(infinito_positivo)}')

infinito_negativo = Decimal('-Infinity')
print(infinito_negativo)
print(f'Es infinito? {math.isinf(infinito_negativo)}')
