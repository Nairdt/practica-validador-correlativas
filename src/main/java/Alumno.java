import java.util.ArrayList;
import java.util.List;

public class Alumno {
  private String nombre;
  private String apellido;
  private String legajo;
  private List<Materia> materiasCursadas;

  public Alumno(String nombre, String apellido, String legajo) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.legajo = legajo;
    this.materiasCursadas = new ArrayList<Materia>();
  }

  public void addMateriasCursadas(Materia ... materiasCursadas) {
    this.materiasCursadas.addAll(List.of(materiasCursadas));
  }

  public List<Materia> getMateriasCursadas() {
    return materiasCursadas;
  }
}
