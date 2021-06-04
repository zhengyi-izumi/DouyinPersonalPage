package zy.douyinpersonalpage.viewmodel


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import zy.douyinpersonalpage.R
import zy.douyinpersonalpage.Video

class WorksFragmentViewModel(list: MutableList<Video>?): ViewModel() {

    private var _videoList = MutableLiveData<MutableList<Video>>()

    init {
        if (list != null){
            _videoList.value = list
        }else{
            _videoList.value = ArrayList<Video>().apply {
                add(Video(R.mipmap.izumisakai, R.color.red))
                add(Video(R.mipmap.portrait, R.color.red))
                add(Video(R.mipmap.izumisakai, R.color.red))
            }
        }
    }

    val videoList: LiveData<MutableList<Video>>
        get() = _videoList

    fun add(video: Video){
        val list = _videoList.value
        list?.add(video)
        _videoList.value = list
    }

}