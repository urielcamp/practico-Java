public class CondicionalesSimples {

    public static void main(String[] args) {


        //Desarrollar un algoritmo que genere un número aleatorio de 1 a 100
        //(Math.random) y por medio de una condicional determinar sí el número
        //es menor a 50 o mayor.


        double numRandom = (Math.random() * 100) - 1;

        System.out.println(numRandom);
        System.out.println();

        if (numRandom > 50){
            System.out.println(numRandom + " es mayor a 50");
        }else{
            System.out.println(numRandom + " es menor a 50");
        }

        System.out.println("---------------------");



        //Dados dos números enteros, determinar cuál es el mayor por medio de
        //una condicional y realizar una potencia con el número menor como
        //exponente (Math.pow).

        int num = 30;
        int oNum = 40;

        if (num > oNum){
            System.out.println(num + " es mayor que " + oNum);
        }else if(oNum > num) {
            System.out.println(oNum + " es mayor que " + num);
        }else {
            System.out.println("los numeros son iguales");
        }

        System.out.println("---------------------");


        //Dado un número entero, determinar por medio de un condicional si es
        //negativo o no (Menor a cero).


        int numero = 4;


        if (numero > 0){
            System.out.println(numero + " es positivo");
        }else{
            System.out.println(numero + " es negativo");
        }


        //Dados dos números enteros, determinar si uno es múltiplo del otro (Por
        //medio del módulo).


        int a = 2;
        int b = 4;

        if (b%a == 0){
            System.out.println(b + " es multiplo de " + a);
        }else {
            System.out.println("no son multiplos");
        }



        //Por medio de una nota decimal, determinar sí el estudiante aprobó o no
        //la clase (0 – 6 = Perdió – 7 – 10 = Aprobó).


        double nota = 10.0;

        if (nota > 0 && nota < 7){
            System.out.println("El alumno perdio");
        } else if (nota > 6 && nota < 11) {
            System.out.println("El alumno aprobo");
        }





    }
}
