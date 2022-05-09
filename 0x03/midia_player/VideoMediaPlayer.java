public class VideoMediaPlayer implements AdvancedMediaPlayer{
    @Override
    public void reproduzirVlc(String nomeVideo) {
        System.out.print("Reproduzindo VLC: " + nomeVideo);
    }

    public void reproduzirMp4(String nomeVideo) {
        System.out.print("Reproduzindo MP4: " + nomeVideo);

    }
}
