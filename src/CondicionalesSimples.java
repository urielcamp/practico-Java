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



    }
}
