public class AudioPlayer implements MediaPlayer{
    @Override
    public void reproduzir(TipoMedia tipo, String nome){
        if(tipo.equals(TipoMedia.MP3)){
            System.out.println("Reproduzindo MP3: " + nome);
        }else
            if(tipo.equals(TipoMedia.VLC)){
                new VideoMediaPlayer().reproduzirVlc(nome);
            }

        else {
            new MediaPlayerAdapter(tipo);
        }
    }
}
