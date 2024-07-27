package MainPrimitivos.TIPOS;

public class Operadores {
    public static void main(String[] args) {
        int number1 = 20;
        int number2 = 30;

        int result = number1 + number2;
        int resultDivision = number2 / number1;
        int resultSubitracion = number2 - number1;
        int numberMultiplicacion = number1 * number2;

        System.out.println("adição: "+ result);
        System.out.println("Subitração: "+ resultSubitracion);
        System.out.println("Multiplicação: "+numberMultiplicacion);
        System.out.println("divisão: "+resultDivision);

        System.out.println("===============");
        // Operador %



        int restoOperador = 20 % 2;
        System.out.println("O operador de resto retornou: "+ restoOperador);


        /*
        Operadores Lógicos:
        <> maior e menor
        <= menor igual
        >= maior igual
        == igual
        != diferente de ou não é igual
        */
        System.out.println("-------------------------");
        int n1 = 20;
        int n2 = 30;
        int igualdadeDeValor = 21;

        boolean resultComparacion = n1 > n2;
        boolean resultComparacionMaior = n1 < n2;
        boolean resultIgualdadeDeValor = n1 == igualdadeDeValor;
        boolean resultMenorIgual= n1 <= igualdadeDeValor;
        boolean resultMaiorIgual= n1 >= igualdadeDeValor;
        System.out.println("O valor "+n1+ " é maior que "+ n2+ "?: "+ resultComparacion);
        System.out.println("O valor "+n1+ " é menor que "+ n2+ "?: "+ resultComparacionMaior);
        System.out.println("O valor "+n1+ " é Menor igual a "+ igualdadeDeValor+ "?: "+ resultMenorIgual);
        System.out.println("O valor "+n1+ " é Maior igual a "+ igualdadeDeValor+ "?: "+ resultMaiorIgual);
        System.out.println("O valor "+n1+ " é igual a "+ igualdadeDeValor+ "?: "+ resultIgualdadeDeValor);
        /*

        && == (AND);
        || == (OR);
        !  == (NOT);

        */
        System.out.println("================");

        /*
        Sálario Noroega

         */

        int age = 40;
        float salario = 5000;
        boolean salarioCorretoLei = age > 35 && salario >= 5000;
        boolean salarioCorretoPelaLeiMenor = age < 35 && salario >= 5000;


        System.out.println("O retorno do salário foi: "+ salarioCorretoLei );
        System.out.println("A segunda verificação de salário teve como return: "+ salarioCorretoPelaLeiMenor);


        System.out.println("============================");

        boolean verAidadeDoCLT = age < 35 || age > 35;
        System.out.println("A idade do CLT teve como return : " + verAidadeDoCLT);
    }
}
