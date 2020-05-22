import java.util.Scanner;

class Q6 {
	public static void main(String[] args) {

  	    // votre code ici
        System.out.println("Entrez dix numeros");
        Scanner sc = new Scanner(System.in);

        double[] nums = new double[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextDouble();
        }

        double moyenne = calculateAverage(nums);
        double mediane = calculateMedian(nums);
        int echou = calculateNumberFailed(nums);
        int passe = calculateNumberPassed(nums);

        System.out.println(moyenne + " " + mediane + " " + echou + " " + passe);

	}

	public static double calculateAverage(double[] notes) {
        // votre code ici
        double moyenne = 0;
        for (int i = 0; i < notes.length; i++) {
            moyenne += notes[i];
        }

        moyenne /= notes.length;

        return moyenne;
	}

	public static double calculateMedian(double[] notes) {
        // votre code ici
        if (notes.length % 2 != 0) {
            return notes[notes.length / 2];
        } else {
            return (notes[(notes.length - 1) / 2] + notes[notes.length / 2]) / 2.0;
        }
	}

	public static int calculateNumberFailed(double[] notes) {
        // votre code ici
        int num = 0;
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] < 50) {
                num++;
            }
        }

        return num;
	}

	public static int calculateNumberPassed(double[] notes) {
        // votre code ici
        int num = 0;
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] >= 50) {
                num++;
            }
        }

        return num;
	}

}
