import java.util.ArrayList;
import java.util.List;

public class Inscripcion {
  private Alumno alumnoInscripto;
  private List<Materia> materiasInscriptas;

  public Inscripcion(Alumno alumnoInscripto) {
    this.alumnoInscripto = alumnoInscripto;
    this.materiasInscriptas = new ArrayList<Materia>();
  }

  public void agregarMateriasInscriptas(Materia ... materiasInscriptas){
    this.materiasInscriptas.addAll(List.of(materiasInscriptas));
  }

  public boolean aprobada() {
    boolean estadoInscripcion = true;
    List<Materia> materiasCursadas = this.alumnoInscripto.getMateriasCursadas();
    for (Materia materia : materiasInscriptas) {
      estadoInscripcion = estadoInscripcion && materia.cumpleCorrelativas(materiasCursadas);
    }
    return estadoInscripcion;
  }
}
