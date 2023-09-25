package godoy.arthur.maratonajava.Minterfaces.test;

import godoy.arthur.maratonajava.Minterfaces.domain.DataLoader;
import godoy.arthur.maratonajava.Minterfaces.domain.DatabaseLoader;
import godoy.arthur.maratonajava.Minterfaces.domain.FileLoader;

public class DataLoaderTest {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();
        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DatabaseLoader.retrieveMaxDataSize();
        DataLoader.retrieveMaxDataSize();
    }
}
