/**
     selvadelejemplodondeseencuentrandosleones    
   */
public class leon
{
    private String leon="leon";
    
    
       public int cantLeones(String c){
            return cantLeones(c, 0, 0, "leon");
        }
        private int cantLeones(String c, int i, int j, String leon){
            int res = 0;
            if(j < leon.length()){
                if(i < c.length()){
                    if(c.charAt(i) == leon.charAt(j)){
                        res = cantLeones(c, i+1, j+1, leon);
                    }else
                        res = cantLeones(c, i+1, j, leon);
                }
            }else{
                res = 1 + cantLeones(c, i, 0, leon);
            }
            return res;
       }

}
