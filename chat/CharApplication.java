import java.io.IOException;
import java.net.Socket;

public class CharApplication {
    public static void main(String[] args) {
        new Thread(() -> {
            try {
                new Socket("localhost", 8554);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        new Thread(() -> {
            try {
                new Socket("localhost", 8554);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        new Thread(() -> {
            try {
                new Socket("localhost", 8554);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        new Thread(() -> {
            try {
                new Socket("localhost", 8554);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
