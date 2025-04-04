public class Computador {
    String marca;
    float preco;
    SistemaOperacional sistema;
    MemoriaUSB memoria;
    HardwareBasico[] hardware;

    public Computador() {

        sistema = new SistemaOperacional();
        hardware = new HardwareBasico[3];

    }

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        for (int i = 0; i < hardware.length ; i++) {
            if (hardware[i] != null)
                System.out.println(hardware[i].nome + hardware[i].capacidade);
        }
        System.out.println("Sistema Operacional: " + sistema.nome + " - " + sistema.tipo);
        if (memoria != null) {
            System.out.println("Memória USB: " + memoria.nome + " - " + memoria.capacidade + " GB");
        }
        System.out.println("Preço: R$ " + preco);
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoria = musb;

    }
}
