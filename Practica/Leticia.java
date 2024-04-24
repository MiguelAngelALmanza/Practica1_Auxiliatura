import java.util.ArrayList;

public class Leticia
{
  private int[] datos;
  
  public Leticia(){
    }
    
  public int pascal(int i, int j) {
        if (j == 0 || j == i) {
            return 1; 
        } else {
            return pascal(i - 1, j - 1) + pascal(i - 1, j);
        }
    }  
   public void printPascalTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal(i, j) + " ");
            }
            System.out.println(); 
        }
    }

    public void main(String[] args) {
        int rows = 5; 
        printPascalTriangle(rows);
    }
}  

