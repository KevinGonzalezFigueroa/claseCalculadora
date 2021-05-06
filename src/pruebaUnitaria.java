import static org.junit.Assert.*;
import org.junit.Test;

public class pruebaUnitaria {
        @Test
        public void testSuma() {
            calculadora c2 = new calculadora(6, 2);
    
            int expectedResult = 8;

            assertEquals(expectedResult, c2.suma(6, 2));
        }

        @Test
        public void testResta(){
            calculadora c2 = new calculadora(6, 2);
    
            int expectedResult = 4;

            assertEquals(expectedResult, c2.resta(6, 2));
        }

        @Test
        public void testMultiplicacion(){
            calculadora c2 = new calculadora(6, 2);
    
            int expectedResult = 12;

            assertEquals(expectedResult, c2.multiplicacion(6, 2));
        }

        @Test
        public void testDivision(){
            calculadora c2 = new calculadora(6, 2);
    
            int expectedResult = 3;

            assertEquals(expectedResult, c2.division(6, 2));
        }
        
        @Test
        public void testAbsoluto(){
            calculadora c2 = new calculadora(6);
    
            int expectedResult = 6;

            assertEquals(expectedResult, c2.valorAbsoluto(6));
        }

        @Test
        public void testPositivo(){
            calculadora c2 = new calculadora(6);
    
            boolean expectedResult = true;

            assertEquals(expectedResult, c2.EsPositivo(6));
        }


        @Test
        public void testElevar(){
            calculadora c2 = new calculadora(6,2);
    
            int expectedResult = 8;

            assertEquals(expectedResult, c2.elevaNumero(6,2));
        }

        @Test
        public void testObjetoExiste(){
            calculadora c2 = new calculadora(6,2);

            assertNotNull(c2);
        }

        @Test
        public void testObjetoNoIgual(){
            calculadora c2 = new calculadora(6,2);
            calculadora c1 = new calculadora(5);

            assertNotEquals(c1, c2);
        }
    
}
