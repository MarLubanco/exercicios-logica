package palindromo;

import java.util.Scanner;

public class Service {

    Scanner scanner = new Scanner(System.in);
    private String palavra;
    private String isSensitive;
    private String isValidSpaceBlank;

    /**
     * Criação do menu e entrada de dados
     */
    public void start() {
        System.out.println("Palavra: ");
        palavra = scanner.nextLine();
        System.out.println("Case sensitive (S/N): ");
        isSensitive = scanner.next();
        System.out.println("Validar espaços em branco (S/N): ");
        isValidSpaceBlank = scanner.next();
    }

    /**
     * Verifica se a palavra é um palindromo
     */
    public void isPalindromo() {
        if(!palavra.isEmpty()) {
            palavra = isValidSpaceBlank.equalsIgnoreCase("N") ? palavra.replaceAll(" ", "") : palavra;
            String palavraInvertida = inverterPalavra(palavra);

            if(isSensitive.equalsIgnoreCase("S")) {
                if(palavraInvertida.equals(palavra)) {
                    System.out.println("É palindromo");
                } else{
                    System.out.println("Não é palindromo");
                }
            } else {
                if(palavraInvertida.equalsIgnoreCase(palavra)) {
                    System.out.println("É palindromo");
                } else{
                    System.out.println("Não é palindromo");
                }
            }
        }
    }

    /**
     * Inverter qualquer String
     * @param palavra
     * @return
     */
    public String inverterPalavra(String palavra) {
        String palavraInvertida = "";
        char[] letras = new char[palavra.length()];
        for (int i = 0; i < palavra.length(); i++) {
            letras[i] = palavra.charAt(i);
        }
        for (int i = letras.length-1; i >= 0; i--) {
            palavraInvertida += letras[i];
        }
        return palavraInvertida;
    }
}
