package com.lucasmathews.myapplication.fragment

import android.os.AsyncTask
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.lucasmathews.myapplication.databinding.FragmentCarActivityBinding
import org.json.JSONArray
import org.json.JSONObject
import org.json.JSONTokener
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

class FragmentCar: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentCarActivityBinding.inflate(inflater,container,false)

        configurarView(binding)
        return binding.root

    }

    private fun configurarView(binding: FragmentCarActivityBinding) {
        binding.floatingActionButton.setOnClickListener {
            GetCar().execute("https://igorbag.github.io/cars-api/cars.json")
        }
    }

    inner class GetCar:AsyncTask<String,String,String>(){
        override fun onPreExecute() {
            super.onPreExecute()
            Log.d ("my task","iniciado...")
        }

        override fun doInBackground(vararg url: String?): String {
            var urlConnection:HttpURLConnection? =null
            try {
                val urlBase = URL(url[0])
            urlConnection = urlBase.openConnection() as HttpURLConnection
                urlConnection.connectTimeout =60000
                urlConnection.readTimeout = 60000
                var response = urlConnection.inputStream.bufferedReader().use { it.readText() }
                publishProgress(response)
            }catch (e:Exception){
                Log.e("Erro","erro ao parcelar uma stream")
            }finally {
                urlConnection?.disconnect()
            }
        return ""}

        override fun onProgressUpdate(vararg values: String?) {
            try {
                val jsonArray=JSONTokener(values[0]).nextValue() as JSONArray

        for(i in 0 until jsonArray.length()){

        }
            }catch (ex:Exception){

            }
        }


}



}
