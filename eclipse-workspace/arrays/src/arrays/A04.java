package arrays;
import java.util.Scanner;
public class A04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leitor = new Scanner(System.in);
int[] array = new int[5];
for (int i = 0; i < 5; i++) {
	System.out.println("Digite um número");
	array[i] = leitor.nextInt();
	array[i] *= array[i];
}
int i = 0;
while(i < 5) {
	System.out.println(array[i]);
	i++;
}
	}

}
