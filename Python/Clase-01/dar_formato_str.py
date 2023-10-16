
# Dar formato a un string

nombre = "Facundo"
edad = 28
mensaje_con_formato = "Mi nombre es %s y tengo %d años" %(nombre, edad)

# Creamos una tupla
persona = ("Carla", "Gomez", 5000)
mensaje_con_formato = "Hola %s %s. Tu sueldo es %.2f" # % persona # Le pasamos la tupla
print(mensaje_con_formato %persona)

nombre = "Juan"
edad = 19
sueldo = 3000
# mensaje_con_formato = "Nombre {} Edad {} Sueldo {:.2f}".format(nombre, edad, sueldo)
# print(mensaje_con_formato)

# mensaje = "Nombre {0} Edad {1} Sueldo {2:.2f}".format(nombre, edad, sueldo)
# print(mensaje)

mensaje = "Nombre {n} Edad {e} Sueldo {s:.2f}".format(n=nombre, e=edad, s=sueldo)
# print(mensaje)

diccionario = {'nombre' : 'Ivan', 'edad' : 35, 'sueldo' : 8000}
mensaje = 'Nombre {dic[nombre]} edad {dic[edad]} sueldo {dic[sueldo]:.2f}'.format(dic = diccionario)
print(mensaje)