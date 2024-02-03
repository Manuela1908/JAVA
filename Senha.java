import java.util.Scanner;

public class Senha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha;
        String resultado = "";

        do {
            System.out.println("Digite a sua senha: ");
            senha = sc.next();
            try {
                resultado = exigencias(senha);
            } catch (SenhaInvalidaException e) {
                System.out.println(e.getMessage());
                resultado = "";
            }
        } while (!resultado.equals("Token gerado com sucesso!"));
    }    

    public static String criptografia(String a) {
        String encript = "";

        for (int i = 0; i < a.length(); i++) {
            int dec_ascii = a.charAt(i);
            char chave = (char) (dec_ascii + 1);
            encript = encript + dec_ascii + chave;
        }

        return encript;
    }

    public static String exigencias(String a) throws SenhaInvalidaException {

        boolean tamanho = a.length() >= 8;
        boolean num = false;
        boolean especialchar = false;
        boolean maiuscula = false;
        String resultado = "";

        for (int i = 0; i < a.length(); i++) {
            if (Character.isDigit(a.charAt(i))) {
                num = true;
            }
        }

        for (int i = 0; i < a.length(); i++) {
            if (!Character.isLetterOrDigit(a.charAt(i))) {
                especialchar = true;
            }
        }

        for (int i = 0; i < a.length(); i++) {
            if (Character.isUpperCase(a.charAt(i))) {
                maiuscula = true;
            }
        }

        if (tamanho && num && especialchar && maiuscula) {
            resultado = "Token gerado com sucesso!";
            String encript = criptografia(a);
            System.out.println("\n---------------------------------------------------------------");
            System.out.println(encript);
            System.out.println("---------------------------------------------------------------\nToken gerado com sucesso!\n");

        } else {
            StringBuilder mensagem = new StringBuilder("\nA senha não cumpre os requisitos:\n");
            if (!tamanho) {
                mensagem.append("Deve ter pelo menos 8 caracteres.\n");
            }
            if (!num) {
                mensagem.append("Deve conter pelo menos um numero.\n");
            }
            if (!especialchar) {
                mensagem.append("Deve conter pelo menos um caractere especial.\n");
            }
            if (!maiuscula){
                mensagem.append("Deve conter pelo menos uma letra maiuscula.\n");
            }
            throw new SenhaInvalidaException(mensagem.toString());
        }

        return resultado;
    }
}



