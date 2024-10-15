public class BuclesFor {
    public static void main(String[] args) {


        //Desarrolla un programa que permita mostrar el factorial de un número
        //definido previamente.

        int numero = 5;
        int sum = 1;

        for (int i = 1; i <= numero; i++ ){
            sum *= i;
        }

        System.out.println(sum);



        //Desarrollar un programa que determine los divisores de un número
        //definido previamente.

        int num = 8;
        int acum = 0;

        for (int i = 1; i <= num; i++){
            if (num%i == 0){
                acum = i;
                System.out.println(acum);
            }
        }



        //Desarrollar un programa que permita definir si un número entero ya
        //establecido es un número perfecto o no.


        int n = 8128;
        int a = 0;

        for (int i = 1; i < n; i++){
            if (n%i == 0){
                a +=i;
            }
        }
        //System.out.println(a);
        if (a == n){
            System.out.println(n + " es perfecto");
        }else {
            System.out.println(n + " no es perfecto");
        }















    }
}
