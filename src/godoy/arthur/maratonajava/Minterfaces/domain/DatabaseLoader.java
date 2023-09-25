package godoy.arthur.maratonajava.Minterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover {
    // private -> default -> protected -> public
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("removendo dados do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissoes no banco de dados");
    }
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retriveMaxDataSize na interface");
    }
}
