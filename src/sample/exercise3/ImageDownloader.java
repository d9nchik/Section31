package sample.exercise3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;

public class ImageDownloader {
    public static void main(String[] args) {
        try {
            for (int i = 1; i <= 54; i++) {
                new FileOutputStream("src/image/card/" + i + ".png").getChannel().transferFrom(
                        Channels.newChannel(new URL("https://raw.githubusercontent.com/d9nchik/" +
                                "Section14/master/src/image/card/" + i + ".png")
                                .openStream()), 0, Long.MAX_VALUE);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
