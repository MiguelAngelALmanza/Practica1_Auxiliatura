public class Fractalesdeverdad
{
    public int estrellada(int n){
        if(n==1){
            return 10;
        }else{
            return estrellada(n-1)+(((3*(n-1))*(3*(n-1)))*5);
        }
    
    }


    public String carita(int n){
        return carita1(n);
    }
    private String carita1(int n){
        if(n==0){
            return "(-.-)";
        }else{
            return "(-."+carita1(n-1)+".-)";
        }
    }
    
    
    public int panal(int n){
        return panal1(n);
    }
    private int panal1(int n){
        if(n==1){
            return 6;
        }else{
            return panal1(n-1)+((18*n)-12);
        }
    }
    
    
    public int parsimoniosa(int n){
        return 1;
    }
    private String parsimoniosa(int n, boolean bandera){
        if(n==0){
            return "**"+ "V"+"**";
        }else{
            if()
        }
    }
    
}




