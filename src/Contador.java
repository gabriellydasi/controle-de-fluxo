import java.util.Scanner;

// Exceção personalizada
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int parametro1 = sc.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametro2 = sc.nextInt();

        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametro1, parametro2);

        } catch (ParametrosInvalidosException e) {
            // Imprimir a mensagem de erro se os parâmetros forem inválidos
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        sc.close();
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        // Validar se parametro1 é menor que parametro2 e lançar a exceção
        if (parametro1 >= parametro2) {
            throw new ParametrosInvalidosException("Parâmetros inválidos: o segundo parâmetro deve ser maior que o primeiro.");
        }

        int contagem = parametro2 - parametro1;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
