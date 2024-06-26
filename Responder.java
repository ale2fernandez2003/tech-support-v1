import java.util.HashMap;
import java.util.Random;
import java.util.ArrayList;
import java.util.HashSet;
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
    private HashSet<String> responder1;
    private HashSet<String> responder2;
    private HashMap<HashSet<String>, String> responses;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        random = new Random();
        numero = new ArrayList<>();
        respuestas = new HashMap<>();
        responder1 = new HashSet<>();
        responder2 = new HashSet<>();
        responses = new HashMap<>();
        numero.add("Are you sure?");
        numero.add("I need a bit more information on that");
        numero.add("What is your operating system?");
        numero.add("Ok, we are working on that problem!");
        numero.add("Can you give me more information?");
        
        respuestas.put("1","primera");
        respuestas.put("2","segunda");
        respuestas.put("3","tercera");
        respuestas.put("4","cuarta");
        
        responder1.add("free");
        responder1.add("app");
        responses.put(responder1, "responder1 coincide");
        
        responder2.add("problem");
        responder2.add("linux");
        responder2.add("crash");
        responses.put(responder2, "responder2 coincide");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> userInput)
    {
        String respuesta = "";
        for (String palabra : userInput) {
            if(respuestas.containsKey(palabra)){
                respuesta = respuestas.get(palabra);
                break;
            }
            else{
                int num = random.nextInt(numero.size());
                respuesta=  numero.get(num);
            }
        }
        for (HashSet<String> solucion : responses.keySet()) {
            if(solucion.equals(userInput)){
                respuesta = responses.get(solucion);
            }
        }
        return respuesta;
    }
}
