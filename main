import java.awt.*;
import java.util.Scanner;
import java.util.Random;

// Nome: Kaik Eduardo Pereira de Freitas
// Matricula: 433, GES


public class Main {
    public static void main(String[] args) {
        int escolha = 0;
        Scanner scanner = new Scanner(System.in);

        Cliente cliente = new Cliente();
        cliente.nome = "Kaik";
        cliente.cpf = 11122233344L;

        // Computador 1
        Computador PC1 = new Computador();
        PC1.marca = "Apple";
        PC1.sistema.nome = "Linux Ubuntu";
        PC1.sistema.tipo = 32;
        PC1.preco = 433;
        HardwareBasico hard_1 = new HardwareBasico();
        PC1.hardware[0] = hard_1;
        PC1.hardware[0].nome = "Pentium core i3";
        PC1.hardware[0].capacidade = 2200;
        HardwareBasico hard_2 = new HardwareBasico();
        PC1.hardware[1] = hard_2;
        PC1.hardware[1].nome = "8 Gb de Memória RAM";
        PC1.hardware[1].capacidade = 8000;
        HardwareBasico hard_3 = new HardwareBasico();
        PC1.hardware[2] = hard_3;
        PC1.hardware[2].nome = "500 Gb de HD";
        PC1.hardware[2].capacidade = 500;
        MemoriaUSB USB1 = new MemoriaUSB();
        USB1.nome = "Pen-drive";
        USB1.capacidade = 16;
        PC1.addMemoriaUSB(USB1);

        // Computador 2
        Computador PC2 = new Computador();
        PC2.marca = "Samsung";
        PC2.preco = 433 + 1234;
        PC2.sistema.tipo = 64;
        PC2.sistema.nome = "Windows 8";
        HardwareBasico hard2_1 = new HardwareBasico();
        PC2.hardware[0] = hard2_1;
        PC2.hardware[0].nome = "Pentium core i5";
        PC2.hardware[0].capacidade = 3370;
        HardwareBasico hard2_2 = new HardwareBasico();
        PC2.hardware[1] = hard2_2;
        PC2.hardware[1].nome = "16 Gb de Memória RAM";
        PC2.hardware[1].capacidade = 16000;
        HardwareBasico hard2_3 = new HardwareBasico();
        PC2.hardware[2] = hard2_3;
        PC2.hardware[2].nome = "1 Tb de HD";
        PC2.hardware[2].capacidade = 1000;
        MemoriaUSB USB2 = new MemoriaUSB();
        USB2.nome = "Pen-drive";
        USB2.capacidade = 32;
        PC2.addMemoriaUSB(USB2);

        // Computador 3
        Computador PC3 = new Computador();
        PC3.marca = "Dell";
        PC3.sistema.nome = "Windows 10";
        PC3.preco = 433+ 5678;
        PC3.sistema.tipo = 64;
        HardwareBasico hard3_1 = new HardwareBasico();
        PC3.hardware[0] = hard3_1;
        PC3.hardware[0].nome = "Pentium core i7";
        PC3.hardware[0].capacidade = 4500;
        HardwareBasico hard3_2 = new HardwareBasico();
        PC3.hardware[1] = hard3_2;
        PC3.hardware[1].nome = "32 Gb de Memória RAM";
        PC3.hardware[1].capacidade = 32000;
        HardwareBasico hard3_3 = new HardwareBasico();
        PC3.hardware[2] = hard3_3;
        PC3.hardware[2].nome = "2 Tb de HD";
        PC3.hardware[2].capacidade = 2000;
        MemoriaUSB USB3 = new MemoriaUSB();
        USB3.nome = "HD externo";
        USB3.capacidade = 1000;
        PC3.addMemoriaUSB(USB3);

        System.out.printf("Qual promoção deseja escolher? (1, 2, 3) ou 0 para sair:");
        do {
            escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    cliente.newPC(PC1);
                    break;
                case 2:
                    cliente.newPC(PC2);
                    break;
                case 3:
                    cliente.newPC(PC3);
                    break;
                case 0:
                    System.out.println("Compras Finalizadas! Aproveite seus produtos!");
                    break;
                default:
                    System.out.println("inválido!.");
            }
            if (escolha != 0) {
                System.out.printf("Deseja mais alguma promoção? (1, 2, 3) ou 0 para sair: ");
            }
        } while (escolha != 0);

        cliente.Compras();
        cliente.Total();
        scanner.close();
    }
}
