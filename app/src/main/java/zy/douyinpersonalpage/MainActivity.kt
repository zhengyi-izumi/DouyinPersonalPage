package zy.douyinpersonalpage


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*
import zy.douyinpersonalpage.fragment.LikeFragment
import zy.douyinpersonalpage.fragment.PrivateFragment
import zy.douyinpersonalpage.fragment.WorksFragment

private const val VIEW_PAGER2_COUNT = 3

class MainActivity : AppCompatActivity() {

    private inner class MyViewPager2Adapter(activity: FragmentActivity) : FragmentStateAdapter(activity){
        override fun getItemCount(): Int  = VIEW_PAGER2_COUNT

        override fun createFragment(position: Int): Fragment {
            when(position){
                0 -> return WorksFragment()
                1 -> return PrivateFragment()
                else -> return LikeFragment()
            }
        }
    }

    private lateinit var viewPager2: ViewPager2


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * 隐藏最上面的ActionBar
         */
        supportActionBar?.hide()

        viewPager2 = bottomViewPager

        viewPager2.adapter = MyViewPager2Adapter(this)


    }


}