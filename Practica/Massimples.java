import java.util.ArrayList;

public class Massimples
{
    public void piramide(int limite)
    {
       piramide(1,limite);   
    }
    private void piramide(int inicio, int limite)
    {
       int aux; 
       if(inicio<=limite){
         aux=inicio;
         imprimirPiramide(aux,inicio,limite);
        }
    }
    private void imprimirPiramide(int aux,int inicio,int limite)
    {
       int i=aux;
       if(i==1){
         System.out.println(i);
         piramide(inicio+1,limite);
       }else{
         System.out.print(i);
         imprimirPiramide(i-1,inicio,limite);
        }
    }

}
