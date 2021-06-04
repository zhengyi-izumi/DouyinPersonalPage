package zy.douyinpersonalpage.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.fragment_works.*
import zy.douyinpersonalpage.R
import zy.douyinpersonalpage.Video
import zy.douyinpersonalpage.VideoAdapter

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [WorksFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class WorksFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_works, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.workRecyclerView)

        Log.d("MainActivity","null?${recyclerView == null}")

        val layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = layoutManager
        val adapter = VideoAdapter(initVideoList())
        recyclerView.adapter = adapter
        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment WorksFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            WorksFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    private fun initVideoList():ArrayList<Video>{
        val arrayList = ArrayList<Video>().apply {
            add(Video(R.mipmap.izumisakai))
            add(Video(R.mipmap.portrait))
            add(Video(R.mipmap.izumisakai))
            add(Video(R.mipmap.portrait))
            add(Video(R.mipmap.izumisakai))
            add(Video(R.mipmap.portrait))
            add(Video(R.mipmap.izumisakai))
            add(Video(R.mipmap.portrait))
            add(Video(R.mipmap.izumisakai))
            add(Video(R.mipmap.portrait))
            add(Video(R.mipmap.izumisakai))
            add(Video(R.mipmap.portrait))
            add(Video(R.mipmap.izumisakai))
            add(Video(R.mipmap.portrait))
            add(Video(R.mipmap.izumisakai))
            add(Video(R.mipmap.portrait))
            add(Video(R.mipmap.izumisakai))
            add(Video(R.mipmap.portrait))
        }
        return arrayList
    }
}