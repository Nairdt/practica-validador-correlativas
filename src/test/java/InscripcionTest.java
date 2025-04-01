import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class InscripcionTest {
  Materia algoritmos = new Materia("Algoritmos y Estructuras de Datos");
  Materia paradigmas = new Materia("Paradigmas de Programacion");
  Materia disenio = new Materia("Diseño de Sistemas");

  Alumno unAlumno = new Alumno("Adrian", "Tolaba", "1604417");
  Alumno otroAlumno = new Alumno("Otro", "Alumno", "1614427");

  Inscripcion unaInscripcion = new Inscripcion(unAlumno);
  Inscripcion otraInscripcion = new Inscripcion(otroAlumno);

  @BeforeEach
  public void init(){
    this.disenio.addMateriasCorrelativa(this.paradigmas);
    this.paradigmas.addMateriasCorrelativa(this.algoritmos);

    this.unAlumno.addMateriasCursadas(this.algoritmos,this.paradigmas);
    this.otroAlumno.addMateriasCursadas(this.algoritmos);

    unaInscripcion.agregarMateriasInscriptas(this.disenio);
    otraInscripcion.agregarMateriasInscriptas(this.disenio);
  }

  @Test
  void inscripcionFallida() {
    Assertions.assertFalse(otraInscripcion.aprobada());
  }
  @Test
  void inscripcionAprobada() {
    Assertions.assertTrue(unaInscripcion.aprobada());
  }
}