package complex_media;

public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        switch (type) {
            case "mp4" -> {
                System.out.println(
                        "complex_media.CodecFactory: extracting mpeg audio...");
                return new MPEG4CompressionCodec();
            }
            case "ogg" -> {
                System.out.println(
                        "complex_media.CodecFactory: extracting ogg audio...");
                return new OggCompressionCodec();
            }
            default -> throw new IllegalArgumentException(
                    "complex_media.CodecFactory: unknown format " + type);
        }
    }
}
