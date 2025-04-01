import java.util.ArrayList;
import java.util.List;

public class Materia {
  private String nombreMateria;
  private List<Materia> materiasCorrelativas;

  public Materia (String nombreMateria) {
    this.nombreMateria = nombreMateria;
    materiasCorrelativas = new ArrayList<Materia>();
  }

  public void addMateriasCorrelativa(Materia ... materiasCorrelativas) {
    this.materiasCorrelativas.addAll(List.of(materiasCorrelativas));
  }

  public boolean cumpleCorrelativas(List<Materia> materiasCursadas) {
    boolean cumpleCorrelativa = true;
    for (Materia materia : materiasCorrelativas) {
      cumpleCorrelativa = cumpleCorrelativa && materiasCursadas.contains(materia);
    }
    return cumpleCorrelativa;
  }
}
