package bode.cesar.udemy_s01_c11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btDontClick = findViewById<Button>(R.id.btDontClick)
        val txInfo = findViewById<TextView>(R.id.txInfo)
        var counter = 0

        btDontClick.setOnClickListener() {
            counter += 1
            if (counter == 10) {
                txInfo.text = "CLICOU TANTO QUE GOZEI"
                return@setOnClickListener
            }
            txInfo.text = counter.toString()
        }

        btDontClick.setOnLongClickListener {
            counter -= 1
            if(counter == 0) {
                txInfo.text = "Olá Bode Jacó22"
                return@setOnLongClickListener true
            }
            txInfo.text = counter.toString()
            return@setOnLongClickListener true
        }
    }
}
