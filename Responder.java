import java.util.Random;
import java.util.ArrayList;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private Random random;
    private ArrayList<String> numero;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        random = new Random();
        numero = new ArrayList<>();
        
        numero.add("respuesta 1");
        numero.add("respuesta 2");
        numero.add("respuesta 3");
        numero.add("respuesta 4");
        numero.add("respuesta 5");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int num = random.nextInt(numero.size());
        return numero.get(num);
    }
}
