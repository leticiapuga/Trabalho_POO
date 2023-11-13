package View;

import java.util.Scanner;

public class Login {
    private static final Scanner scanner = new Scanner(System.in);

    public static boolean login() {
        System.out.println("Digite seu nome de usuário:");
        String username = scanner.nextLine();

        System.out.println("Digite sua senha:");
        String password = scanner.nextLine();

        System.out.println("Login bem-sucedido para o usuário: " + username);
        return true;
    }

    // Você pode adicionar um método para fechar o Scanner se necessário
    public static void fecharScanner() {
        scanner.close();
    }
}
