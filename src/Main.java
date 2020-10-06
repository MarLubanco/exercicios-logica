import service.Service;

public class Main {

    /**
     * Programa responsável por válidar se uma palavra é um palindromo.
     * Complexidade Assintótica
     *
     * BigO(n*2)
     * n = palavra.length
     * @param args
     */
    public static void main(String[] args) {
        Service service = new Service();
        service.start();
        service.isPalindromo();
    }
}
