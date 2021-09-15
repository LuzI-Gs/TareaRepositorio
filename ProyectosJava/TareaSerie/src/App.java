public class App {
    public static void main(String[] args) throws Exception {
       System.out.println("Serie de Fibonacci");
        int Valor1=0;
        int Valor2=1;
        int ValorDeCiclo=10;
        
        int Suma;
        System.out.println(Valor1);
        System.out.println(Valor2);
         for(int i=0;i<ValorDeCiclo;i++)
         {
            
            Suma=Valor1+Valor2;
            System.out.println(Suma);
            Valor1=Valor2;
            Valor2=Suma;
         }
    }
}
