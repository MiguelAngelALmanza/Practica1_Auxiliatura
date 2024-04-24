public class Fractales
{
 private int estrellas;
 private int estrellas2;
 private int estrellas3; 
 private int lineas;
  public void estrellita(int nivel){
   if(nivel == 1){
    estrellas = 1;
    lineas = 10;
  }else if(nivel == 2){
    estrellas = 6;
    lineas = 55;
  } else if(nivel == 3){
    estrellas = 26;
    lineas = 235;
  }else if(nivel >= 4){
   estrellas = 20;
   estrellas2 = 6;
    for(int i= 3; i < nivel; i++){
     estrellas2 = estrellas2 + estrellas;
     estrellas = estrellas * 4;
     estrellas3 = estrellas2 + estrellas;
   }
   
   estrellas = estrellas3;
   lineas = (estrellas * 9) + 1; 
  }
  
  System.out.println("" + lineas);
 }  
    
}
