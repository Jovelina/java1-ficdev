public class CalcularoraTest  extends TestCase {
public CalculadoraTest (String testName){
        super(testName);
}    
public static Test suíte(){
    return suite;
}
/**
 * Test of somar method, of class junit.aplicativos.Calculadora.
 */

private final Calculadora cal = new Calculadora();

public void testSomar(){
    assertEquals(30, calc.somar(10,20), 0);
}
/**
 * Test of subtrair method, of class junit.aplicativos.Calculadora.
 * 
 public void testSubtrair(){
 //TODO add your test code.    
}

}
