package com.emmanuel_rono.potterpedia

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.emmanuel_rono.potterpedia.databinding.ActivityMainBinding
import kotlinx.coroutines.launch
import retrofit2.HttpException
import java.io.IOException
class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    var data = ArrayList<PotterDataItem>()
    private lateinit var todoAdapter:HarryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycleScope.launch {
                lifecycle.repeatOnLifecycle(Lifecycle.State.CREATED) {
                    val response = try {
                        RetrofitInstance.api.getCharacters()
                    } catch(e: IOException) {
                        Log.e(TAG, "Internet exception")
                        return@repeatOnLifecycle
                    } catch (e: HttpException) {
                        Log.e(TAG, "HttpException")
                        return@repeatOnLifecycle
                    }
                    if(response.isSuccessful && response.body() != null) {
                        todoAdapter.potterData= response.body()!!
                    } else {
                        Log.e(TAG, "Response not successful")
                    }
                }
        }}}