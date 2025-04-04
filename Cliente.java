import java.util.Random;

public class Cliente {
    String nome;
    long cpf;
    Computador[] computadores = new Computador[3]; // Limite de 3 computadores (promoções)
    int PCComprados = 0;
    public void newPC(Computador computador) {
        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] == null) {
                computadores[i] = computador;
                PCComprados ++;
                break;
            }
        }
    }
    public void Compras() {
        System.out.println("Comprador: " + nome);
        String cpfStr = String.valueOf(cpf); //
        String cpfOculto = ocultarCPF(cpfStr);
        System.out.println("CPF: " + cpfOculto);

        System.out.println("Quantidade de Computadores comprados: " + PCComprados);
        float total = 0;
        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] != null) {
                System.out.println( (i+1) + "° Compra:");
                computadores[i].mostraPCConfigs();
                total += computadores[i].preco;
                System.out.println();
            }
        }
    }
    // Função para ocultar 4 números aleatórios do CPF
    public String ocultarCPF(String cpf) {
        Random random = new Random();
        char[] cpfArray = cpf.toCharArray();

        for (int i = 0; i < 4; i++) {
            int posicao = random.nextInt(cpf.length());
            cpfArray[posicao] = '*';
        }
        return new String(cpfArray);
    }
    public float CalculaTotalCompra() {
        float total = 0;
        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] != null) {
                total += computadores[i].preco;
            }
        }
        return total;
    }
}
