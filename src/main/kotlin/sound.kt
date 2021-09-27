fun main ()
{
    var mediaPlayer: MediaPlayer = MediaPlayer.create(context, R.raw.music)

    image4!!.setOnClickListener() {

        if(mediaPlayer.isPlaying()){
            mediaPlayer.pause();
        } else {
            mediaPlayer.start();
        }
    }



}