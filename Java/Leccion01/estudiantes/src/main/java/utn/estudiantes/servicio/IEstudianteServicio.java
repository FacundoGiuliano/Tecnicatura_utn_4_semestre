package utn.estudiantes.servicio;

import java.util.List;

import utn.estudiantes.modelo.estudiantes2022;

public interface IEstudianteServicio {
    public List<estudiantes2022> listarEstudiantes();
    public estudiantes2022 buscarEstudiantePorId(Integer idEstudiante);
    public void guardarEstudiante(estudiantes2022 estudiante);
    public void eliminarEstudiante(estudiantes2022 estudiante);
}
