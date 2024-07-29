package utils

import android.app.Activity

object ActivityCollector {

    private val activitys = arrayListOf<Activity>()

    fun addActivity(activity: Activity){
         activitys.add(activity)
    }

    fun removeActivity(activity: Activity){
        activitys.remove(activity)
    }

    fun finishAll(){
        activitys.forEach {
            if(!it.isFinishing){
                it.finish()
            }
        }
        activitys.clear()
    }
}