package w;


public class w1 {

	public static void main(String[] args) {
    
        double e=1,i,j,fm;
        for(i=1;i<=20;i++)
        	{fm=1;
            for(j=1;j<=i;j++)
            	{fm=fm*j;}
            e+=1/fm;}
        System.out.printf("%.5f",e); 
           
            
      
	}

}
