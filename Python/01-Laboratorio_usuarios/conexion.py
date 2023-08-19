from psycopg2 import pool
from logger_base import log
import sys

class Conexion:
    _DATABASE = 'test_bd'
    _USERNAME = 'prueba'
    _PASSWORD = 'Prueba2022'
    _DB_PORT = '5432'
    _HOST = '127.0.0.1'
    _MIN_CON = 1
    _MAX_CON = 5
    _pool = None

    @classmethod
    def ObtenerConexion(cls):
        conexion = cls.ObtenerPool().getconn()
        log.debug(f'Conexion obtenida del pool: {conexion}')
        return conexion
            
    @classmethod
    def ObtenerCursor(cls):
        pass

    @classmethod
    def ObtenerPool(cls):
        if cls._pool is None:
            try:
                cls._pool = pool.SimpleConnectionPool(cls._MIN_CON,
                                                      cls._MAX_CON,
                                                      host=cls._HOST,
                                                      user=cls._USERNAME,
                                                      password=cls._PASSWORD,
                                                      port=cls._DB_PORT,
                                                      database=cls._DATABASE)
                log.debug(f'Creacion del pool exitosa: {cls._pool}')
                return cls._pool
            except Exception as e:
                log.error(f'Ocurrio un error al obtener el pool: {e}')
                sys.exit()
        else:
            return cls._pool
        
    @classmethod
    def liberarConexion(cls, conexion):
        cls.ObtenerPool().putconn(conexion)
        log.debug(f'Regresamos la conexion del pool: {conexion}')

    @classmethod
    def cerrarConexiones(cls):
        cls.ObtenerPool().closeall()


if __name__ == '__main__':
    conexion1 = Conexion.ObtenerConexion()
    Conexion.liberarConexion(conexion1)
    conexion2 = Conexion.ObtenerConexion()
    Conexion.liberarConexion(conexion2)
    conexion3 = Conexion.ObtenerConexion()
    Conexion.liberarConexion(conexion3)
    conexion4 = Conexion.ObtenerConexion()
    conexion5 = Conexion.ObtenerConexion()
    conexion6 = Conexion.ObtenerConexion()














