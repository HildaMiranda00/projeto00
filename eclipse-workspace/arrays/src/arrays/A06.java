package arrays;
import java.util.Scanner;

public class A06 {

public static void main(String[] args) {

Scanner leitor = new Scanner(System.in);

int dias_do_mes = 30;

int[] carros_por_dia = new int[dias_do_mes];

for (int dia = 1; dia <= dias_do_mes; dia++) {

System.out.println("Digite o número de carros que passaram no dia " + dia + " de Setembro:");

int carros = leitor.nextInt();

carros_por_dia[dia-1] = carros;

}

int maior_volume = 0;

int dia_maior_volume = 0;

for (int dia = 1; dia <= dias_do_mes; dia++) {

if (carros_por_dia[dia-1] > maior_volume) {

maior_volume = carros_por_dia[dia-1];

dia_maior_volume = dia;

}

}

System.out.println("O maior volume de carros que passou em um único dia foi " + maior_volume + " no dia " + dia_maior_volume + " de Setembro.");

}

}