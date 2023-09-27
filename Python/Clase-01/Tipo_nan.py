import math
from decimal import Decimal

# NaN (Not a Numer)
a = float('NaN')
print(f"a: {a}")

# Modulo math
a = float('nan')
print(f"Es de tipo Nan?: {math.isnan(a)}")

# Modulo decimal
a = Decimal('2.0')
print(f"Es de tipo Nan?: {math.isnan(a)}")

