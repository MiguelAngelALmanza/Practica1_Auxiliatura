import java.util.ArrayList;


public class Backtracking
{
    public void torresHanoi(int n){
        if(n<=0){
            System.out.println("No hay discos: ERROR");
        }else{
            torresHanoi(n, "origen", "auxiliar", "destino");
        }
    }
    private void torresHanoi(int n, String origen, String auxiliar, String destino){
        if(n==1){
            System.out.println("Mover el disco "+n+" de "+origen+" a "+destino);
        }else{
            torresHanoi(n-1, origen, destino, auxiliar);
            System.out.println("Mover el disco "+n+" de "+origen+" a "+destino);
            torresHanoi(n-1, auxiliar, origen, destino);
        }
    }
    
    
    public void posiblesSumas(int numero){
        if(numero <= 0){
            System.out.println("El numero está mal");
        }else{
            posiblesSumas(numero, new ArrayList(), 0);
        }
    }
    
    private void posiblesSumas(int numero, ArrayList<Integer> numeros, int suma){
        if(suma == numero){
            System.out.println(numeros);
        }else{
            for(int i=1;i<=numero;i++){
                suma = suma + i;
                if(suma<=numero){
                    numeros.add(i);
                    posiblesSumas(numero, numeros, suma);
                    numeros.remove(numeros.indexOf(i));
                }
                suma = suma - i;
            }
        }
    }
    
    public void movimientosCaballo(int x, int y){
        if(x < 0 || y < 0){
            System.out.println("Son negativos :v");
        }else if(x > 8 || y  > 8){
            System.out.println("Se sale del tablero");
        }else{
            boolean [][] tabla = new boolean[8][8];
            movimientosCaballo(x,y,tabla);
            for(int i=0;i<tabla.length;i++){
                for(int j=0;j<tabla[0].length;j++){
                    System.out.print(tabla[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
      private void movimientosCaballo(int x, int y, boolean[][] tabla){
        if(x>=0 && y>=0 && x < 8 && y < 8){ //Dentro de la matriz
            if(tabla[y][x] == false){
                tabla[y][x] = true;
                System.out.println("El caballo puede pasar por "+x+" y "+y);
                //ARRIBA
                movimientosCaballo(x+1, y-2, tabla);
                movimientosCaballo(x-1, y-2, tabla);
                //ABAJO
                movimientosCaballo(x+1, y+2, tabla);
                movimientosCaballo(x-1, y+2, tabla);
                //IZQUIERDA
                movimientosCaballo(x-2, y+1, tabla);
                movimientosCaballo(x-2, y-1, tabla);
                //DERECHA
                movimientosCaballo(x+2, y+1, tabla);
                movimientosCaballo(x+2, y-1, tabla);
            }
        }else{
            
        }
        
    }
    
    
    public void NReinas(int n){
        if(n<1){
            System.out.println("ERROR");
        }else{
            NReinas(n, new boolean[n][n], 0);
        }
    }
    
    private void NReinas(int n, boolean[][] tabla, int j){
        if(j<tabla.length){
            boolean [][] tablaClon;
            for(int i=0;i<tabla.length;i++){
                if(tabla[i][j] == false){
                    tablaClon = clonarTabla(tabla);
                    dondeAtacaReina(tabla, i, j);
                    NReinas(n,tabla,j+1);
                    if(j==tabla.length-1) imprimirTabla(tabla);
                    tabla = tablaClon;
                }
            }
        }
    }
    
    public void dondeAtacaReina(boolean [][] tabla, int posI, int posJ){
        int cambiaI = 1;
        int cambiaJ = 1;
        while(posI + cambiaI < tabla.length || posI - cambiaI >= 0
        || posJ + cambiaJ < tabla.length || posJ - cambiaJ >=0){
            boolean boolI = posI + cambiaI < tabla.length;
            boolean boolNI = posI - cambiaI >= 0;
            
            boolean boolJ = posJ + cambiaJ < tabla.length;
            boolean boolNJ = posJ - cambiaJ >= 0;
            
            //VERTICALES Y HORIZONTALES
            if(boolI) tabla[posI+cambiaI][posJ] = true;
            if(boolJ) tabla[posI][posJ+cambiaJ] = true;
            if(boolNI) tabla[posI-cambiaI][posJ] = true;
            if(boolNJ) tabla[posI][posJ-cambiaJ] = true;
            
            //DIAGONALES
            if(boolI && boolJ) tabla[posI+cambiaI][posJ+cambiaJ] = true;
            if(boolI && boolNJ) tabla[posI+cambiaI][posJ-cambiaJ] = true;
            if(boolNI && boolJ) tabla[posI-cambiaI][posJ+cambiaJ] = true;
            if(boolNI && boolNJ) tabla[posI-cambiaI][posJ-cambiaJ] = true;
            cambiaI = cambiaI + 1;
            cambiaJ = cambiaJ + 1;
        }
    }
    
    private boolean [][] clonarTabla(boolean [][] tabla){
        boolean [][] tablaRespuesta = new boolean[tabla.length][tabla.length];
        for(int i=0;i<tabla.length;i++){
            for(int j=0;j<tabla.length;j++){
                tablaRespuesta[i][j] = tabla[i][j];
            }
        }
        return tablaRespuesta;
    }
    
    private void imprimirTabla(boolean [][] tabla){
        for(int i=0;i<tabla.length;i++){
            for(int j=0;j<tabla[0].length;j++){
                System.out.print((tabla[i][j] ? "T" : "F")+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    
    public void torresShanoi(int n){
        if(n<=0){
            System.out.println("No hay discos: ERROR");
        }else{
            torresShanoi(n, "origen", "auxiliar1", "auxiliar2", "destino");
        }
    }
    
    private void torresShanoi(int n, String origen, String auxiliar1, String auxiliar2, String destino){
        if(n==1){
            System.out.println("Mover el disco "+n+" de "+origen+" a "+destino);
        }else{
            torresShanoi(n-1, origen, destino, auxiliar2, auxiliar1);
            System.out.println("Mover el disco "+n+" de "+origen+" a "+destino);
            torresShanoi(n-1, auxiliar1, origen, destino, auxiliar2);
            torresShanoi(n-1, auxiliar2, auxiliar1, origen, destino);
        }
    }
    
}





