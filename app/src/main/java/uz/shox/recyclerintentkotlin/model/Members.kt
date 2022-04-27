package uz.shox.recyclerintentkotlin.model

import java.io.Serializable

data class Members(val name:String,val lastName:String) : Serializable{
    override fun toString(): String {
        return "$name $lastName"
    }
}
