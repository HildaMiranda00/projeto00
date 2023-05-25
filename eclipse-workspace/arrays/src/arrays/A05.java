package arrays;
import java.util.Scanner;
public class A05 {

	public static void main(String[] args) {
		Scanner leitor =  new Scanner(System.in);
double[] array = new double[5];
double maior = 0;

for (int i = 0; i < array.length; i++) {
	System.out.println("Digite um número");
	array[i] = leitor.nextDouble();
	if (array[i] > maior) {
		maior = array[i];
	}
}
leitor.close();
int i = 0;
while (i < array.length) {
	array[i] = array[i] / maior; 
	System.out.println(array[i]);
	i++;
}
	}

}
