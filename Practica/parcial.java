

public class parcial
{
    public String fraccioncont(int a, int b){
        return fraccioncont1(a,b);
    }
    private String fraccioncont1(int a, int b){
        int res = 0;
        if(a%b==0){
            return a/b+")";
        }else{
            int resto = a%b;
            int cociente = a/b;
            return cociente + "+1/("+fraccioncont1(b,resto);
        }
    
    }
}
