package utils

import android.util.Log
import com.example.base.BuildConfig

object LogUtil {

    fun d(tag: String, content: String) {
        if (BuildConfig.DEBUG) {
            Log.d(tag, content)
        }
    }

    fun e(tag: String, content: String) {
        if (BuildConfig.DEBUG) {
            Log.e(tag, content)
        }
    }

}