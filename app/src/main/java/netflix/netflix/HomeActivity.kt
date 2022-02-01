package netflix.netflix

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.fragment_home1.*

class HomeActivity : AppCompatActivity() {

    private val HomeFragment1 = HomeFragment1()
    private val HomeFragment2 = HomeFragment2()
    private val HomeFragment3 = HomeFragment3()
    private val HomeFragment4 = HomeFragment4()
    var profile_num : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //state bar 색상 적용하기위한 코드
        val window = window
        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)



        //Bottom Navigation Bar
        initNavigationBar()

//        //프로필 변경경
//        if (intent.hasExtra("profile")) {
//            profile_num = intent.getIntExtra("profile",10)
//            if (profile_num == 2){
//                home_top_profile.setImageResource(R.drawable.profile2)
//            }else if(profile_num == 3){
//                home_top_profile.setImageResource(R.drawable.profile3)
//            }else if(profile_num == 4){
//                home_top_profile.setImageResource(R.drawable.profile4)
//            }else{
//                home_top_profile.setImageResource(R.drawable.profile1)
//            }
//        } else {
//            home_top_profile.resources.getDrawable(R.drawable.profile1)
//        }
    }

    private fun initNavigationBar() {
        bottom_nav.run {
            setOnNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.nav_first -> {
                        changeFragment(HomeFragment1)
                    }
                    R.id.nav_second -> {
                        changeFragment(HomeFragment2)
                    }
                    R.id.nav_third -> {
                        changeFragment(HomeFragment3)
                    }
                    R.id.nav_fourth -> {
                        changeFragment(HomeFragment4)
                    }
                }
                true
            }
            selectedItemId = R.id.nav_first
        }
    }

    private fun changeFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right).replace(R.id.framelayout_container, fragment).commit()
    }
}