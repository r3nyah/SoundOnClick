package www.smktelkommlg.sound

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton


class MainActivity : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val kobokanaer = findViewById<ImageButton>(R.id.kobokanaer)
        mediaPlayer = MediaPlayer.create(this, R.raw.kobokanaer)
        //Toast.makeText(this,"media playing", Toast.LENGTH_SHORT).show()

        //kobokanaer.setOnClickListener{
        //mediaPlayer.start()
        //}
        kobokanaer.setOnClickListener{
        mediaPlayer.start()
        startActivity(Intent(this@MainActivity, kobokanaer::class.java))
        }
    }

}