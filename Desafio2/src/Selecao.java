import java.util.Scanner;

public class Selecao {
    public static void main(String[] args) throws Exception {
        String [] candidatos= {"João", "Maria", "José", "Pedro", "Ana", "Carlos", "Mariana", "Francisco", "Paula", "Marcos"};
        String[] selecionados = selecionarCandidatos(candidatos);
        for (String selecionado : selecionados) {
            System.out.println(selecionado);
        }
    }

    public static String[] selecionarCandidatos(String[] candidatos) {
        Scanner scanner = new Scanner(System.in);
        String [] selecionados= new String[5];
        int count= 0;

        for (String candidato : candidatos) {
            if (count == 5) {
                break;
            }
            System.out.println("Pretenção do candidato " + candidato + ": ");
            double pretencao = scanner.nextDouble();
            if (pretencao < 2000) {
                selecionados[count] = candidato;
                count++;
            }
        }

        return selecionados;
    }
}
