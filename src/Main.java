import complementaryPairs.ServiceComplementaryPairs;
import palindromo.Service;

public class Main {

    public static void main(String[] args) {
        /**
         * Algoritimo responsável por válidar se uma palavra é um palindromo.
         * Complexidade Assintótica
         *
         * Big O(n*2)
         * n = palavra.length
         * @param args
         */
        Service service = new Service();
        service.start();
        service.isPalindromo();


        /**
         * Escreva um algoritmo eficiente, para encontrar “K-
         * Complementary Pairs”. Dado um array A, e um inteiro K, o
         * par (i, j) é um K-Complementary se K = A[i] + A[J]. Um plus
         * será informar o Big-O do algoritmo;
         *
         * Big O(log n)
         *
         * @param args
         */
        ServiceComplementaryPairs serviceComplementaryPairs = new ServiceComplementaryPairs();
        serviceComplementaryPairs.findComplementariesInArray(new int[]{1, 2, 2, 3, 23, 3, 4, 2, 5, 36, 3, 3, 3, 4, 5, 6, 7}, 6);
        serviceComplementaryPairs.findComplementariesInArray(new int[]{1, 2, 3, 4, 4, 4, 4, 5, 6, 6, 7, 7, 8, 6, 5, 3, 4}, 8);

    }
}
