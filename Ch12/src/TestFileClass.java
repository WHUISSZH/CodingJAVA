import java.io.File;

public class TestFileClass {
    static void printResult(){
        File file = new File("C:\\Users\\callmezh\\Desktop\\ae.jpg");
        System.out.println("Does it exits? " + file.exists());
        System.out.printf("The file has %d bytes\n", file.length());
        System.out.println("Absolute path is " + file.getAbsolutePath());
    }
}
