package www.smktelkommlg.sound

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import www.smktelkommlg.sound.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var mediaPlayer: MediaPlayer

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val kobokanaer = binding.kobokanaer
        mediaPlayer = MediaPlayer.create(this,R.raw.kobokanaer)

        kobokanaer.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.kobokanaer -> {
                val moveIntent = Intent(this@MainActivity, kobokanaer::class.java)
                mediaPlayer.start()
                startActivity(moveIntent)
            }
        }
    }
}