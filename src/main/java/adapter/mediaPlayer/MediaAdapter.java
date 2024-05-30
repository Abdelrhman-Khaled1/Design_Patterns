package adapter.mediaPlayer;

import adapter.advancedMediaPlayer.AdvancedMediaPlayer;
import adapter.advancedMediaPlayer.Mp4Player;
import adapter.advancedMediaPlayer.VlcPlayer;

public class MediaAdapter implements MediaPlayer{
    private AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();
        }
        else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVLC(fileName);
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
