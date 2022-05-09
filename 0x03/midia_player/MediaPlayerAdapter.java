public class MediaPlayerAdapter implements MediaPlayer{
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(TipoMedia tipoMedia) {

        if(!tipoMedia.equals(TipoMedia.MP3)){
            advancedMediaPlayer = new VideoMediaPlayer();
        }
    }

    @Override
    public void reproduzir(TipoMedia tipoMedia, String nomeMedia) {
        switch (tipoMedia) {
            case MP4: advancedMediaPlayer.reproduzirMp4(nomeMedia);break;
            case VLC: advancedMediaPlayer.reproduzirVlc(nomeMedia);break;

        }
    }
}
