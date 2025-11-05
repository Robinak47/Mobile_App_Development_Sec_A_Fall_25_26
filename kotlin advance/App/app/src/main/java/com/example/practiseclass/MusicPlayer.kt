package com.example.practiseclass

class MusicPlayer: IMusicPlayer {
    override fun play()
    {
        println("Playing Music")
    }

    override fun pause()
    {
        println("Paused")
    }

    companion object
    {
        fun next()
        {
            println("Playing Next Song")
        }


    }
}

fun main()
{
    var musicPlayer: MusicPlayer= MusicPlayer()
    musicPlayer.play()
    musicPlayer.pause()
    MusicPlayer.next()

}