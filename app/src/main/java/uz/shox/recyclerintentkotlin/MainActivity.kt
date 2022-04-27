package uz.shox.recyclerintentkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.shox.recyclerintentkotlin.adapter.MemberAdapter
import uz.shox.recyclerintentkotlin.model.Members

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager = GridLayoutManager(this,1)

        val members:ArrayList<Members> = ArrayList()
        members.add(Members("Shahzod","Ro'zimboyev"))
        members.add(Members("Shohrux","Ro'zimboyev"))
        members.add(Members("Bekzod","Ro'zimboyev"))
        members.add(Members("Asadbek","Ro'zimboyev"))
        members.add(Members("Kamronbek","Ro'zimboyev"))


        val memberAdapter = MemberAdapter(this,members)
        recyclerView.adapter = memberAdapter


    }
}