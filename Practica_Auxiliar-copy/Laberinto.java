

public class Laberinto
{
    private char [][] maze;
    private int xS, yS, xE, yE;
    public Laberinto(int size){
        maze = new char[size][size];
    }
    
    private boolean valido(int x, int y){
        return (x < maze.length && y < maze[x].length && x> 0 && y > 0)? true : false;
    }
    
    public boolean puedoSalir(){
       return puedoSalir(xE, yE);     
    }   
    private boolean puedoSalir(int x, int y){
        boolean encontrado = false;
        if(valido(x,y)){
            if(maze[x][y]=='*'){
                if(x == xS && y == yS){
                    encontrado = true;
                }else{
                    encontrado = puedoSalir(x+1,y);
                    if(maze[x][y] == '?'){
                        encontrado = puedoSalir(x-1,y);
                        if(maze[x][y] == '?'){
                            encontrado = puedoSalir(x,y+1);
                            if(maze[x][y] == '?'){
                                encontrado = puedoSalir(x,y-1);
                            }
                        }
                    }
                
                } maze[x][y] = '*'; 
            }else{
                encontrado = false;
            }
        }else{
            encontrado = false;
        }
        return encontrado;
    }
    
    
}