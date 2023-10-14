package utn.estudiantes.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import utn.estudiantes.modelo.estudiantes2022;
import utn.estudiantes.repositorio.EstudianteRepositorio;

@Service
public class EstudianteServicio implements IEstudianteServicio{

    @Autowired
    private EstudianteRepositorio estudianteRepositorio;

    @Override
    public List<estudiantes2022> listarEstudiantes() {
        List<estudiantes2022> estudiantes = estudianteRepositorio.findAll();
        return estudiantes;
    }

    @Override
    public estudiantes2022 buscarEstudiantePorId(Integer idEstudiante) {
        estudiantes2022 estudiante = estudianteRepositorio.findById(idEstudiante).orElse(null);
        return estudiante;
    }

    @Override
    public void guardarEstudiante(estudiantes2022 estudiante) {
        estudianteRepositorio.save(estudiante);
    }

    @Override
    public void eliminarEstudiante(estudiantes2022 estudiante) {
        estudianteRepositorio.delete(estudiante);
    }
    
}
