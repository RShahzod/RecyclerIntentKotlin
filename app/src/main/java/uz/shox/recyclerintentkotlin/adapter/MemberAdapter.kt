package uz.shox.recyclerintentkotlin.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.shox.recyclerintentkotlin.ProfileActivity
import uz.shox.recyclerintentkotlin.R
import uz.shox.recyclerintentkotlin.model.Members

class MemberAdapter(private val context:Context, private val members: ArrayList<Members>) : RecyclerView.Adapter<MemberAdapter.MemberViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemberViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_view,parent,false)
        return MemberViewHolder(view)
    }

    override fun onBindViewHolder(holder: MemberViewHolder, position: Int) {
        val member = members[position]
        holder.name.text = member.name
        holder.lastName.text = member.lastName

        holder.layoutItem.setOnClickListener {
            val intent = Intent(context,ProfileActivity::class.java)
            intent.putExtra("mem",member)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return members.size
    }

    class MemberViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val name = itemView.findViewById<TextView>(R.id.name)
        val lastName = itemView.findViewById<TextView>(R.id.lastName)
        val layoutItem = itemView.findViewById<LinearLayout>(R.id.layout)
    }
}