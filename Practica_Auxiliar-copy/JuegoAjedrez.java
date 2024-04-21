
public class JuegoAjedrez
{
    private void movimientosCaballo(int x, int y, int n, int m){
            boolean [][] tabla = new boolean[n][m];
            movimientosCaballo(x,y,tabla, n, m);
        
    }
    
    private void movimientosCaballo(int x, int y, boolean[][] tabla, int n, int m){
        if(x>=0 && y>=0 && x < n && y < m){ 
            if(tabla[y][x] == false){
                tabla[y][x] = true;
            
                movimientosCaballo(x+1, y-2, tabla,n,m);
                movimientosCaballo(x-1, y-2, tabla,n,m);
                
                movimientosCaballo(x+1, y+2, tabla,n,m);
                movimientosCaballo(x-1, y+2, tabla,n,m);
                
                movimientosCaballo(x-2, y+1, tabla,n,m);
                movimientosCaballo(x-2, y-1, tabla,n,m);
                
                movimientosCaballo(x+2, y+1, tabla,n,m);
                movimientosCaballo(x+2, y-1, tabla,n,m);
            }
                    
        }
        
    }
    
    
    private void movimientoTorre(int n,int m, int X ,int Y) {
        boolean[][] tabla = new boolean[n][m];
        
        moverTorre(X, Y, tabla, n, m);
    }

    
    private void moverTorre(int x, int y, boolean[][] tabla, int n, int m) {
        if(x>=0 && y>=0 && x < n && y < m){ 
            if(tabla[y][x] == false){
            tabla[y][x] = true;

            moverTorre(x + n, y, tabla, n, m); 
            moverTorre(x - n, y, tabla, n, m); 
            moverTorre(x, y + m, tabla, n, m); 
            moverTorre(x, y - m, tabla, n, m); 
            }

        }
    }
    
    
    
    public String simular(int n, int m, int cx, int cy, int tx, int ty){
        movimientoTorre(n, m, cx ,cy );
        movimientosCaballo(tx, ty, n, m);
        System.out.print("Turno de torres");
        if(cx == tx && cy == ty){
            return "First y caballos Second";
            
        }else{
            return "Draw";
        }
    }
}




