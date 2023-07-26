public class FirstProgram {

    public static void main(String[] args){
        // Comentários em JAVA
        // Indentar código em JAVA: Ctrl+Alt+I
        // Tipos de Dados
        // tipo nomeDaReferencia = 'valor';
        int num1 = 2;
        int num2 = 4;
        double num3 = 2.5;
        var num5 = 0;
        var variable = "o valor recebido define o tipo";
        boolean bool = true;
        String text = "Olá\t";
        int[] array = {10, 20, 30, 40};
        // "\\S" remove todos os espaços em branco
        text += "Mundo";
        text += "!";

        System.out.println(text);
        System.out.println(num1 * num2);
        System.out.println(num3);
        System.out.println(variable);
        System.out.println(bool);

        // 2 TIPOS DE ERROS
        // ERRO DE COMPILAÇÃO
        System.out.println(text);
        // ERRO DE EXECUÇÃO (Exception)
        System.out.println(num2 / num1); //Se dividido por 0(zero) resulta em erro de exceção
        for (int i = 0; i < array.length; i++){
            System.out.printf("Valor do array (%d): %d \n", i, array[i]); //printf serve para concatenar
        }
        calc(11, 4); // x, y: argumentos
        calc(5, 7);
        calc(8, 4);
        calc(6, 9);
    }
    static void calc(int x, int y){ // x, y: parâmetros
        System.out.println("\n-----------------");
        System.out.println( x + y);
        System.out.println( x - y);
        System.out.println( x / y);
        System.out.println( x * y);
        System.out.println("\n-----------------");
    }
}