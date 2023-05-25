package arrays;
import java.util.Scanner;
public class A01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leitor = new Scanner(System.in);
int[] array = new int[5];
int j = 0;
for (int i = 0; i < 5; i++) {
	System.out.println("Digite um número");
	array[i] = leitor.nextInt();
}while (j <5) {
	System.out.println(array[j]);
	j++;
}
	}

}
