package utn.estudiantes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import utn.estudiantes.modelo.estudiantes2022;

public interface EstudianteRepositorio extends JpaRepository<estudiantes2022, Integer>{
    
}
