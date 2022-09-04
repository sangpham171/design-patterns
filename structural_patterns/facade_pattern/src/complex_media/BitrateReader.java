package complex_media;

public class BitrateReader {
    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("complex_media.BitrateReader: reading file...");
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("complex_media.BitrateReader: writing file...");
        buffer.setCodecType(codec.getType());
        return buffer;
    }
}
