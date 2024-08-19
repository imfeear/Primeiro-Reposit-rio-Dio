import java.util.Scanner;

class numeros{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        float numero1 = 30;
        System.out.println("Digite um número: ");
        float numero2 = s.nextFloat();
        

        System.out.println("O resultado é: " + (numero1 + numero2)/2);
    }
}