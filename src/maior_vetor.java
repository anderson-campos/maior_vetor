public class maior_vetor {
    public static int multiplicador(int[] numeros){
        int maior = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            int num = numeros[i];

            if (num > maior){
                maior = num;
            }
        }

        return maior;
    }
}
