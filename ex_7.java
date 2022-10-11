//Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área
// para o usuário.

package ex_7;

import java.util.Scanner;

public class ex_7 {

    public static void main(String[] args) {
        int i = 0;
        int area = 0;
        int dobro_area = 0;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Digite o tamanho do lado do quadrado: ");
        i = sc1.nextInt();
        area = i * i;
        dobro_area = 2 * area;
        System.out.println("A area do quadrado é: " + area);
        System.out.println("O dobro da area do quadrado: " + dobro_area);
    }
}
