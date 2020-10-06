package complementaryPairs;

public class ServiceComplementaryPairs {

    public void findComplementariesInArray(int[] numeros, int k) {
        System.out.println("-------------" + k + "--------------------");
        for(int i =0; i < numeros.length - 1; i++) {
            if (numeros[i] + numeros[i+1] == k) {
                System.out.println(numeros[i] + " + " +  numeros[i+1]);
            }
        }
    }
}
