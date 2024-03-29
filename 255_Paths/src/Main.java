import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
        printFile(path);

        System.out.println();

//        Path filePath = FileSystems.getDefault().getPath("files","SubdirectoryFile.txt");
//        printFile(filePath);

        Path filePath = Paths.get(".","files","SubdirectoryFile.txt");
        printFile(filePath);

        System.out.println();

        filePath = Paths.get("C:\\Users\\Armando PaPa\\Desktop\\MaM+10M\\Udemy\\" +
                "JAVA MasterClass\\254_FileSystem_Paths_OutTHERE.txt");
        printFile(filePath);


        filePath = Paths.get(".");
        System.out.println(filePath.toAbsolutePath());

        Path path2 = FileSystems.getDefault().getPath(".", "files", "..", "files",
                "SubdirectoryFile.txt");

        System.out.println(path2.normalize().toAbsolutePath());
        printFile(path2.normalize());

    }

    private static void printFile(Path path) {
        try (BufferedReader fileReader = Files.newBufferedReader(path)) {
            String line;
            while ((line = fileReader.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}