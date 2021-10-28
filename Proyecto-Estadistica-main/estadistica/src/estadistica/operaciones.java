
package estadistica;

public class operaciones {
    int numerador, denominador;
    public operaciones (int num, int den){
    numerador=num;
    denominador=den;
}
    public int mcd(){
        int num=numerador, den=denominador;
        if (num==0){
            return 1;
        }else{
            if(num<0)
                num = num*-1;
              if(den<0)
                den= den*-1;
        }
        if(den>num){
            int aux=num;
            num=den;
            den=aux;
        }
        int mcd=1;
        while(den!=0){
            
            mcd=den;
            den=num % den;
            num = mcd;
        }
        return mcd;
                
}
    public void simplificar(){
        int mcd = mcd();
        numerador=numerador/mcd;
        denominador =denominador/mcd;
        if(numerador<0&&denominador<0){
            numerador=numerador*-1;
            denominador=denominador*-1;
            
        }else if (numerador>0&&denominador<0){
            numerador=numerador*-1;
            denominador=denominador*-1;
        }
        
    }
    public String tosString(){
        if(denominador!=0){
        simplificar();    
        return numerador+"/"+denominador;
        
    }else{
            return "El dominador debe ser distinto a 0";
        }
} 
}
