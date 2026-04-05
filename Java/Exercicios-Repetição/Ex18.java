import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome");String nome1 = scanner.next();
        System.out.println("Digite a sua nota");double nota1 = scanner.nextDouble();
        
        System.out.println("Digite seu nome");String nome2 = scanner.next();
        System.out.println("Digite a sua nota");double nota2 = scanner.nextDouble();
        
        System.out.println("Digite seu nome");String nome3 = scanner.next();
        System.out.println("Digite a sua nota");double nota3 = scanner.nextDouble();
        
        double primeiro=Math.max(nota1,Math.max(nota2,nota3));
        
        if(nota1==nota2 && nota2==nota3)
        {System.out.println("Todas ficaram empatados em primeiro lugar");}
        
        else if(nota1==primeiro)
        {if(nota2>nota3)
            {System.out.println("O primeiro é "+nome1+" O segundo é "+nome2+" O terceiro é "+nome3);}
        
         else if(nota3>nota2)
         {System.out.println("O primeiro é "+nome1+" O segundo é "+nome3+" O terceiro é "+nome2);}
         else if(nota2==nota3)
         {System.out.println("O primeiro é "+nome1+" e o segundo ficou empatado entre "+nome2+" e "+nome3);}
        }
        
        else if(nota2==primeiro)
        {if(nota1>nota3)
            {System.out.println("O primeiro é "+nome2+" O segundo é "+nome1+" O terceiro é "+nome3);}
        
         else if(nota3>nota1)
         {System.out.println("O primeiro é "+nome2+" O segundo é "+nome3+" O terceiro é "+nome1);}
         else if(nota1==nota3)
         {System.out.println("O primeiro é "+nome2+" e o segundo ficou empatado entre "+nome1+" e "+nome3);}
        }
        
        else if(nota3==primeiro)
        {if(nota1>nota2)
            {System.out.println("O primeiro é "+nome3+" O segundo é "+nome1+" O terceiro é "+nome2);}
        
         else if(nota2>nota1)
         {System.out.println("O primeiro é "+nome3+" O segundo é "+nome2+" O terceiro é "+nome1);}
         else if(nota2==nota1)
         {System.out.println("O primeiro é "+nome3+" e o segundo ficou empatado entre "+nome2+" e "+nome1);}
        }
        
    }
}