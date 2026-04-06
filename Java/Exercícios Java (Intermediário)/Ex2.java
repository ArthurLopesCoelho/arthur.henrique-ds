import java.util.Scanner;

public class Ex2
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    System.out.println("Digite o seu cpf: ");
	    String CPF = input.next();
	    
	    int[] numeros_cpf = new int[CPF.length()];
	    for (int i=0; i<CPF.length();i++)
	        {
	            numeros_cpf[i] = Character.getNumericValue(CPF.charAt(i));
	        }
	        
	    if ((CPF.length() != 11) || (CPF=="00000000000" ) || (CPF=="11111111111")) {
	        System.out.println("Esse cpf é inválido!!!");
	    }
	    else {
	        int i = 0;
	        int soma = 0;
	        for (int j=10;j >=2; j--)
	    { 
	        soma = soma + (numeros_cpf[i] * j);
	        i++;
	    }
	        if ((soma % 11 < 2 && numeros_cpf[9] == 0) || (soma % 11 >= 2 && numeros_cpf[9] == (11-(soma%11)))) {
        	            int m = 0;
        	            int somadois = 0;
        	            for (int k=11; k >=2; k--)
        	    { 
        	        somadois = somadois + (numeros_cpf[m] * k);
        	        m++;
        	    }
        	        if((somadois % 11 < 2 && numeros_cpf[10] == 0) || (somadois % 11 >= 2 && numeros_cpf[10] == (11-(somadois%11)))){
        	           System.out.println("O CPF ESTA CORRETO!!!!"); 
        	        }
	        }
	        else{
	            System.out.print("CPF INVALIDO!!!!!");
	        }
	    }
	        
	    
	}
}
