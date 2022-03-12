package by.mikhalevich.pattern.structural.facade;

import java.io.File;

public class Runner {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}
