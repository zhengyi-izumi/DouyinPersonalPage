package zy.douyinpersonalpage.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import zy.douyinpersonalpage.Video

class WorksFragmentViewModelFactory(private val list: MutableList<Video>?):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return WorksFragmentViewModel(list) as T
    }
}