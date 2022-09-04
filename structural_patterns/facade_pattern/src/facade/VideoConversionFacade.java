package facade;

import java.io.File;

public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {
        System.out.println("facade.VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec = switch (format) {
            case "mp4" -> new MPEG4CompressionCodec();
            case "ogg" -> new OggCompressionCodec();
            default -> throw new IllegalArgumentException(
                    "Unsupported format: " + format);
        };

        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer(destinationCodec)).fix(intermediateResult);
        System.out.println("facade.VideoConversionFacade: conversion completed.");
        return result;
    }
}
