package top.rechinx.meow.core.network

import android.content.Context
import okhttp3.OkHttpClient

class NetworkHelper(context: Context) {

    val client = OkHttpClient.Builder().build()
}