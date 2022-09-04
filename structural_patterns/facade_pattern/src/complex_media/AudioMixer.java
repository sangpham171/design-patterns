package complex_media;

import java.io.File;

public class AudioMixer {
    private Codec sourceCodec;

    public AudioMixer(Codec sourceCodec) {
        this.sourceCodec = sourceCodec;
    }

    public File fix(VideoFile result) {
        System.out.println("complex_media.AudioMixer: fixing audio...");
        String name = result.getName();
        return new File(name.substring(0, name.indexOf(".")) + "." + result.getCodecType());
    }
}
