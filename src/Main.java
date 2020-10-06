import complementaryPairs.ServiceComplementaryPairs;
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

        ServiceComplementaryPairs serviceComplementaryPairs = new ServiceComplementaryPairs();
        serviceComplementaryPairs.findComplementariesInArray(new int[]{1, 2, 2, 3, 23, 3, 4, 2, 5, 36, 3, 3, 3, 4, 5, 6, 7}, 6);
        serviceComplementaryPairs.findComplementariesInArray(new int[]{1, 2, 3, 4, 4, 4, 4, 5, 6, 6, 7, 7, 8, 6, 5, 3, 4}, 8);

    }
}
