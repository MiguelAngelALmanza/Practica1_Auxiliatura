public class Saltarin
{
    public String formarMensaje(char[] cinta, String palabra){
        return formarMensaje(cinta, 0, palabra, 0);
    }

    private String formarMensaje(char[] cinta, int i, String palabra, int j){
        String res = "";
        if(j<palabra.length()){
            char x = palabra.charAt(j);
            int derecha = pasos(cinta, x, i, 1);
            int izquierda = pasos(cinta, x, i, -1);
            String aux;
            if(izquierda != -1 && derecha != -1){
                if(izquierda < derecha){
                    aux = formarMensaje(cinta, i - izquierda, palabra, j+1);
                    if(!aux.equals("IMPOSIBLE")){
                        res = "-"+izquierda+" "+aux;
                    }else{
                        res = aux;
                    }
                }else{
                    aux = formarMensaje(cinta, i + derecha, palabra, j+1);
                    if(!aux.equals("IMPOSIBLE")){
                        res = "+"+derecha+" "+aux;
                    }else{
                        res = aux;
                    }
                }
            }else if(izquierda == -1 && derecha != -1){
                aux = formarMensaje(cinta, i + derecha, palabra, j+1);
                if(!aux.equals("IMPOSIBLE")){
                    res = "+"+derecha+" "+aux;
                }else{
                    res = aux;
                }
            }else if(derecha == -1 && izquierda != -1){
                aux = formarMensaje(cinta, i - izquierda, palabra, j+1);
                if(!aux.equals("IMPOSIBLE")){
                    res = "-"+izquierda+" "+aux;
                }else{
                    res = aux;
                }
            }else{
                res = "IMPOSIBLE";
            }
        }
        return res;
    }

    private int pasos(char[] cinta, char x, int pos, int k){
        int pasos = 0;
        if(pos>=0 && pos<cinta.length){
            if(cinta[pos] != x){
                int aux = pasos(cinta, x, pos + k, k);
                if(aux != -1){
                    pasos = aux + 1;
                }else{
                    pasos = -1;
                }
            }
        } else {
            pasos = -1;
        }
        return pasos;
    }
    
    
    
}