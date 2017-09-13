public class Pregunta
{
    private String texto;
    private String respuesta;
    
    public Pregunta()
    {
       texto="";
       respuesta="";
    }
    
    public void asingarTexto(String pregunta)
    {
        texto=pregunta;        
    }
    
    public void asiganarRespuesta(String Respuesta)
    {
        respuesta=Respuesta;
    }
    
    public boolean checarRespuesta(String respuestausuario)
    {
        if(respuestausuario==respuesta)
        {
            return true;
        }
        return false;
    }
    
    public void imprimete()
    {
        System.out.print("no se que respuesta imprimir");
    }
}