
import java.lang.System.Logger;

public class MyClass {
    
import org.apache.log.LogManager;
import org.apache.log.Logger;

private static final Logger logger = LogManager.getLogger(MyClass.class);

public void meuMetodo() {
// ...
logger.info("Mensagem informativa");
logger.warn("Mensagem de aviso");
// ...
}

} // fim de classe
