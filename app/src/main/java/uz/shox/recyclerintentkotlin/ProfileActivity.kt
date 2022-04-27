package uz.shox.recyclerintentkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val textActivity = findViewById<TextView>(R.id.textActivity)

        val members = intent.getSerializableExtra("mem")

        textActivity.text = members.toString()
    }
}