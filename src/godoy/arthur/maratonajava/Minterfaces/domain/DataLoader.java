package godoy.arthur.maratonajava.Minterfaces.domain;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    void load();
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissoes");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retriveMaxDataSize na interface");
    }
}
