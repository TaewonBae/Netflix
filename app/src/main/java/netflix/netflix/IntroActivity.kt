package netflix.netflix

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_intro.*


class IntroActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        //ViewPager2설정
        val viewPager: ViewPager2 = findViewById(R.id.intro_viewPager)
        val viewpagerFragmentAdapter = ViewPagerFragmentAdapter(this)
        viewPager.adapter = viewpagerFragmentAdapter

        //Tablayout을 통해 indicator 설정(dot 4개)
        val tabLayout = findViewById<TabLayout>(R.id.tab_layout)
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            //Some implementation
        }.attach()

        //고객센터 및 개인정보 클릭이벤트 >> BottomSheetDialogFragment
        intro_customer_center.setOnClickListener {
            val customerService = IntroCustomerService(this)
            customerService.show(supportFragmentManager, customerService.tag)
        }
        intro_my_information.setOnClickListener {
            val myInformation = IntroMyInformation(this)
            myInformation.show(supportFragmentManager, myInformation.tag)
        }

        //Intro 로그인버튼 : IntroActivity >> LoginActivity
        intro_login_btn.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_left,R.anim.nothing)

        }
    }


    class ViewPagerFragmentAdapter(fm: FragmentActivity) : FragmentStateAdapter(fm) {
        val fragmentList =
            listOf<Fragment>(IntroFragment1(), IntroFragment2(), IntroFragment3(), IntroFragment4())

        override fun getItemCount(): Int {
            return fragmentList.size
        }

        override fun createFragment(position: Int): Fragment {
            return fragmentList[position]
        }

    }


}