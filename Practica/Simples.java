import java.util.ArrayList;
/**
 * Write a description of class Simples here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Simples
{
    private int numero;
    
    public Simples(int num){
        numero = num;    
    }
    
    public int potencia(int num ,int pow){
        return potencia1(num,pow);
    }
    private int potencia1(int base, int pow){
        if(pow  == 0){
            return 1;
            }else{
                return base*potencia(base,pow-1);            
            }
        }
    
        
    public boolean numprimo(){
        return numprimo(numero,2);
        }
    private boolean numprimo(int num, int divisor){
        if(num <=2){
            return (num == 2) ? true : false;  
        }
        
        if(num%divisor==0){
            return false;   
        }else if(divisor*divisor>num){
            return true;
        }
        return numprimo(num, divisor+1);
    }
        
    public int size(){
        return size(numero);
    }    
    private int size(int num){
        if(num<10){
            return 1;
        }else{
            return 1+ size(num/10);
        }
    }
    
    public ArrayList<Integer> factoresPrimosR(){
        ArrayList<Integer> res = new ArrayList<Integer>();
        factoresPrimosR(numero, 2, res);
        return res;
    }
    private void factoresPrimosR(int n, int d, ArrayList<Integer> factores){
        if(d<=n){
            if(n%d==0 && esPrimoR(d)){
                factores.add(d);
            }
            factoresPrimosR(n, d+1, factores);
        }
    }
    private boolean esPrimoR(int n){
        return esPrimoR(2, n, 0);
    }
    private boolean esPrimoR(int d, int n, int cantDiv){
        boolean res;
        if(cantDiv > 0){
            res = false;
        } else if(d > n/2) {
            res = true;
        } else {
            if(n%d == 0){
                cantDiv++;
            }
            res = esPrimoR(d+1, n, cantDiv);
        }
        return res;
    }
    
    public boolean Numpares(){
        return Numpares(numero);
    }
    private boolean Numpares(int num){
        
        if(num<10){
            return (num%2==0) ? true : false;            
        }else{
            return Numpares(num/10);
        }
    }
    
    public boolean esDivisible(int num){
        int aux = sumaDig(num, 1);
        return aux == 11 || aux == 0; 
    }
    private int sumaDig(int n, int op){
        int res;
        if(n < 10){
            res = op*n;
        }else{
            res = op * n%10 + sumaDig(n/10, op*-1);
        }
        return res;
    }
    
    public int frecuencia(String c, char x){
        return frecuencia(c, x, 0);    
    }
    private int frecuencia(String c, char x, int k){
        int res = 0;
        if(k < c.length()){
            if(x == c.charAt(k)){
                res = 1;
            }
            res += frecuencia(c, x, k+1);
        }
        return res;
    }
    
    public String invertir(String cad){
        String res;
        if(cad.length() <= 1){
            res = cad;
        }else{
            res = invertir(cad.substring(1)) + cad.charAt(0);
        }
        return res;
    }    
    
        public int vocales(String cad)
    {
        int res;
        res=vocales(cad,0,0);
        return res;
    }
    private int vocales(String cad,int contador, int pos)
    {
        boolean vocal;
        int res;
        vocal=false;
        if(pos==cad.length())
           res=0;
        else{
            char c=cad.charAt(pos);
            vocal=esvocal(c,0,vocal);
            if(vocal==true)
              contador=vocales(cad,contador+1,pos+1);
            else
              contador=vocales(cad,contador,pos+1);
        }
        res=contador;
        return res;
    }
    private boolean esvocal(char c,int pos,boolean vocal)
    {
        boolean res;
        char[] vocales=new char[]{'a','e','i','o','u'};
        if(pos==vocales.length)
          res=false;
        else{
            char aux=vocales[pos];
            if(c==aux)
              res=true;
            else
              res=esvocal(c,pos+1,vocal);
        }
        return res;
    }
    
    public int Numpromedio(int num){
        int aux = sumaDig(num, 1);
        return aux ;
    }
    private int Numpromedio(int n, int op){
        int res=0;
        if(n < 10){
            res = op*n;
        }else{
            res += op * n%10 + sumaDig(n/10, op*-1);
        }
        return res;
    }
    
    public int fAckerman(int m,int n)
    {
        int res;
        if(m==0){
          n=n+1;
          res=n;
        }else{
          if(n==0){
            res = fAckerman(m-1,1);
          }else{
            res = fAckerman(m-1, fAckerman(m,n-1));
          }
        }
        return res;
    }
    
    public boolean Palindromo(String cad){
        String cadreal = cad;
        String inver;
        if(cad.length() <= 1){
            inver = cad;
        }else{
            inver = invertir(cad.substring(1)) + cad.charAt(0);
        }
        return cadreal.contentEquals(inver);
    }    
}


    
        
    

    


