package com.rt.kotlinhandson

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rt.kotlinhandson.network.API
import com.rt.kotlinhandson.responses.Topics
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class TopicsViewModel : ViewModel() {

    val topics : LiveData<List<Topics>?> = MutableLiveData()

    init {
        Log.d("TopicsViewModel","init")

        viewModelScope.launch {
            Log.d("TopicsViewModel","launch")
            topics as MutableLiveData
            topics.value = getTopics()
//            topics.value = async { getTopics() }.await()
//            topics.value =
//                withContext(Dispatchers.Default) { getTopics() }
        }
    }

    private suspend fun getTopics(): List<Topics>? {
        Log.d("TopicsViewModel","getTopics")
       return withContext(Dispatchers.IO) {
            API().getTopics().body()
        }
    }
}
