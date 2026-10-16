package privado;

public class TestaCelular {
    public static void main(String[] args) {
        Celular apple = new Celular("Apple", "Iphone 16 plus", 2026);
        //apple.setMarca("Apple");
        //apple.setModelo("Iphone 16 plus");
        //apple.setAno(2026);

        System.out.println("Marca...:" + apple.getMarca());
        System.out.println("Modelo...:" + apple.getModelo());
        System.out.println("Produzido...:" + apple.getAno());

    }
}
