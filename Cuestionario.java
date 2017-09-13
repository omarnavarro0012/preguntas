import java.util.Scanner;
public class Cuestionario
{
    public void aplicaPregunta(Pregunta p)
    {
        p.imprimete();
        System.out.print("Respuesta: ");
        Scanner entrada = new Scanner(System.in);
        String respuesta=entrada.nextLine();
        
        if (p.checarRespuesta(respuesta))
        {
           System.out.println("Acertaste");
        }
        System.out.println("Respuesta incorrecta");
    }
}