import java.util.ArrayList;
/**
 * Write a description of class Medios here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Medios
{
   
    public int longcaracter(String cad, char k){
        return 1;
    }
    public int longcaracter(String cad, char k, int pos){
        ArrayList<Integer> lista = new ArrayList<>();
        
        return 1;
        }
    
    
    
    public String cadlongest(String cad, char k, int pos){
        ArrayList<String> lista = new ArrayList<>();
        String res = cad;
        if(pos == cad.length()){
            return res;
        }else{
            String subcad = subcadena(cad, k, pos);
            if(subcad.length()> cad.length()){
                res = subcad;
            }
            return cadlongest(cad, k, pos+1);
        }
    }
    public String subcadena(String cad, char k, int pos){
        String res = cad;
        if(pos==cad.length()){
            return res;
        }else{
            if(cad.charAt(pos)==k){
                res = cad.substring(pos,cad.indexOf(k, pos+1)+1);
                return res;
            }else{
                res = subcadena(cad,k,pos+1);
                return res;
            }
        }
        
        
    }
    
    public ArrayList<Integer> subsecuencia(int nums[]){
        ArrayList<Integer> res = new ArrayList<>();
        return subsecuencia(nums, res, 0);
    }
    
    private ArrayList<Integer> subsecuencia(int nums[], ArrayList<Integer> res, int pos){
        
        if(pos==nums.length){
            return res;
        
        }else{
            ArrayList<Integer> actual = new ArrayList<>();
            actual.add(nums[pos]);
            evaluar(nums, actual, pos+1);
            if(actual.size() > res.size()){
                res = actual;
            }
        return subsecuencia(nums, res, pos +1);
        }
        
    }
    
    private void evaluar(int nums[], ArrayList<Integer> actual, int pos){
        if(pos<nums.length){
            if(nums[pos]<nums[pos-1]){
                actual.add(nums[pos]);
                evaluar(nums, actual, pos+1);
            }
        }    
    }
    
    
    
    public boolean siames(int n){
        boolean res=true;
        int contd=(int)Math.log10(n)+1;
        if(n!=0){
            if(contd%2==0){
                int aux=n/(int)(Math.pow(10,(contd/2)));
                int aux2=n%(int)(Math.pow(10,(contd/2)));
                if(aux%10==aux2%10){
                    aux=aux/10;
                    aux2=aux2/10;
                    aux*=(int)Math.pow(10,(contd/2)-1);
                    n=aux+aux2;
                    res=siames(n);
                }
                else{
                    res=false;
                }
            }
            else{
                res=false;
            }
        }
        return res;
    }

    
}






