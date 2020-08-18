package TCS20.JunitGeometria.TCS20.JunitGeometria;

import TCS20.JunitGeometria.TCS20.dto.Geometria;

import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

class AppTest {
  
	//Area cuadrado
	private static Stream<Arguments> sourceAreaCuadrado(){
	   return Stream.of(
			   Arguments.of(2, 4),
			   Arguments.of(8, 64),
			   Arguments.of(3, 9));
	}
   
   @ParameterizedTest
   @MethodSource("sourceAreaCuadrado")
   public void testAreaCuadrado(int a, int b) {
	   Geometria gm = new Geometria();
	   int result = gm.areacuadrado(a);
	   assertEquals(b, result);
   }
   
   //Area circulo
   private static Stream<Arguments> sourceAreaCirculo(){
	   return Stream.of(
			   Arguments.of(6, 113.0976),
			   Arguments.of(22, 1520.5344),
			   Arguments.of(8, 201.0624));
   }

	@ParameterizedTest
	@MethodSource("sourceAreaCirculo")
	public void testAreaCirculo(int a, double b) {
	   Geometria gm = new Geometria();
	   double result = gm.areaCirculo(a);
	   assertEquals(b, result);
	}
	
	//Area circulo - No es pot ya que no es un public y no ha de ser static
	private static Stream<Arguments> sourceAreaTriangulo(){
		return Stream.of(
		   Arguments.of(2, 5, 5),
		   Arguments.of(9, 8, 36),
		   Arguments.of(21, 86, 903));
	}

	@ParameterizedTest
	@MethodSource("sourceAreaTriangulo")
	public void testAreaTriangulo(int a, int b, int c) {
	   Geometria gm = new Geometria();
	   double result = gm.areatriangulo(a, b);
	   assertEquals(c, result);
	}
	
	//Area rectangulo
    private static Stream<Arguments> sourceAreaRectangulo(){
	    return Stream.of(
	 		   Arguments.of(5, 6, 30),
	 		   Arguments.of(2, 3, 6),
			   Arguments.of(9, 5, 45));
    }

	@ParameterizedTest
	@MethodSource("sourceAreaRectangulo")
	public void testAreaRectangulo(int a, int b, int c) {
	   Geometria gm = new Geometria();
	   int result = gm.arearectangulo(a, b);
	   assertEquals(c, result);
	}
	
	//Area pentagono
    private static Stream<Arguments> sourceAreaPentagono(){
	    return Stream.of(
	 		   Arguments.of(7, 2, 7),
	 		   Arguments.of(5, 6, 15),
			   Arguments.of(21, 4, 42));
    }

	@ParameterizedTest
	@MethodSource("sourceAreaPentagono")
	public void testAreaPentagono(int a, int b, int c) {
	   Geometria gm = new Geometria();
	   int result = gm.areapentagono(a, b);
	   assertEquals(c, result);
	}
	
	//Area rombo
    private static Stream<Arguments> sourceAreaRombo(){
	    return Stream.of(
	 		   Arguments.of(7, 2, 7),
	 		   Arguments.of(5, 6, 15),
			   Arguments.of(21, 4, 42));
    }

	@ParameterizedTest
	@MethodSource("sourceAreaRombo")
	public void testAreaRombo(int a, int b, int c) {
	   Geometria gm = new Geometria();
	   int result = gm.arearombo(a, b);
	   assertEquals(c, result);
	}
	
	//Area romboide
    private static Stream<Arguments> sourceAreaRomboide(){
	    return Stream.of(
	 		   Arguments.of(5, 6, 30),
	 		   Arguments.of(2, 3, 6),
			   Arguments.of(9, 5, 45));
    }

	@ParameterizedTest
	@MethodSource("sourceAreaRomboide")
	public void testAreaRomboide(int a, int b, int c) {
	   Geometria gm = new Geometria();
	   int result = gm.arearomboide(a, b);
	   assertEquals(c, result);
	}
	
	//Area trapecio
    private static Stream<Arguments> sourceAreaTrapecio(){
	    return Stream.of(
	 		   Arguments.of(6, 4, 7, 35),
	 		   Arguments.of(2, 8, 3, 15),
			   Arguments.of(21, 5, 5, 65));
    }

	@ParameterizedTest
	@MethodSource("sourceAreaTrapecio")
	public void testAreaTrapecio(int a, int b, int c, int d) {
	   Geometria gm = new Geometria();
	   int result = gm.areatrapecio(a, b, c);
	   assertEquals(d, result);
	}
	
	//Comprobar getters & setters 1
    private static Stream<Arguments> sourceGetSetter1(){
	    return Stream.of(
	 		   Arguments.of(1, 2.9, "cuadrado", "Geometria [id=" + 1 + ", nom=" + "cuadrado" + ", area=" + 2.9 + "]"),
	 		   Arguments.of(2, 8.2, "Circulo", "Geometria [id=" + 2 + ", nom=" + "Circulo" + ", area=" + 8.2 + "]"),
			   Arguments.of(3, 11.0, "Triangulo", "Geometria [id=" + 3 + ", nom=" + "Triangulo" + ", area=" + 11.0 + "]"),
			   Arguments.of(4, 21.1, "Rectangulo", "Geometria [id=" + 4 + ", nom=" + "Rectangulo" + ", area=" + 21.1 + "]"),
			   Arguments.of(5, 6.7, "Pentagono", "Geometria [id=" + 5 + ", nom=" + "Pentagono" + ", area=" + 6.7 + "]"),
			   Arguments.of(6, 15.12, "Rombo", "Geometria [id=" + 6 + ", nom=" + "Rombo" + ", area=" + 15.12 + "]"),
			   Arguments.of(7, 9.06, "Romboide", "Geometria [id=" + 7 + ", nom=" + "Romboide" + ", area=" + 9.06 + "]"),
			   Arguments.of(8, 11.4, "Trapecio", "Geometria [id=" + 8 + ", nom=" + "Trapecio" + ", area=" + 11.4 + "]"));
    }

	@ParameterizedTest
	@MethodSource("sourceGetSetter1")
	public void testGetSetter1(int a, double b, String c, String d) {
	   Geometria gm = new Geometria(a);	   
	   int resultId = gm.getId();
	   gm.setArea(b);
	   double resultArea = gm.getArea();
	   String resultString = gm.getNom();
	   String resultToString = gm.toString();
	   assertEquals(a, resultId);
	   assertEquals(b, resultArea);
	   assertEquals(c, resultString);
	   assertEquals(d, resultToString);
	}
	
	//Comprobar getters & setters 2
    private static Stream<Arguments> sourceGetSetter2(){
	    return Stream.of(
	 		   Arguments.of(1, "cuadrado"),
	 		   Arguments.of(2, "Circulo"),
			   Arguments.of(3, "Triangulo"),
			   Arguments.of(4, "Rectangulo"),
			   Arguments.of(5, "Pentagono"),
			   Arguments.of(6, "Rombo"),
			   Arguments.of(7, "Romboide"),
			   Arguments.of(8, "Trapecio"));
    }

	@ParameterizedTest
	@MethodSource("sourceGetSetter2")
	public void testGetSetter2(int a, String b) {
	   Geometria gm = new Geometria();
	   gm.setId(a);
	   int resultId = gm.getId();
	   gm.setNom(b);
	   String resultString = gm.getNom();
	   String resultFigura = gm.figura(9);
	   assertEquals(a, resultId);
	   assertEquals(b, resultString);
	   assertEquals("Default", resultFigura);
	}
	
}
