import java.util.HashMap;
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
    private HashMap<String, String> respuestas;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        random = new Random();
        numero = new ArrayList<>();
        respuestas = new HashMap<>();
        numero.add("Are you sure?");
        numero.add("I need a bit more information on that");
        numero.add("What is your operating system?");
        numero.add("Ok, we are working on that problem!");
        numero.add("Can you give me more information?");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String userInput)
    {
        String respuesta = "";
        if(respuestas.containsKey(userInput)){
            respuestas.get(userInput);
        }
        
        else{
            int num = random.nextInt(numero.size());
            respuesta=  numero.get(num);
        }
        return respuesta;
    }
}
