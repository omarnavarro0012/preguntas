import java.util.ArrayList;

public class OpcionMultiple extends Pregunta
{
    private ArrayList<String> opciones;
    
    
    /**
     * En este metodo se muestran los diferentes tipos de 
     * opcione que se puden mostrar a la hora de mandar llamar 
     * a las opciones de la pregunta de opcion multiple.
     */
    @Override
    public void imprimete()
    {
        super.imprimete();
        for(int i=0;i<opciones.size();i++)
        {
            System.out.println(opciones.get(i));
        }
    }
    
    
}