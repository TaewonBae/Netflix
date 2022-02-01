package netflix.netflix

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.fragment_home2.*
import netflix.netflix.Database.Database
import netflix.netflix.Database.RecyclerViewAdapterMenu1
import netflix.netflix.Database.RecyclerViewAdapterMenu2
import netflix.netflix.Database.RecyclerViewAdapterMenu3


class HomeFragment2 : Fragment() {
    var adapter_menu1: RecyclerViewAdapterMenu1? = null
    var adapter_menu2: RecyclerViewAdapterMenu2? = null
    var adapter_menu3: RecyclerViewAdapterMenu3? = null

    var database: Database? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        database = Database(context)
        adapter_menu1 = RecyclerViewAdapterMenu1(context, database!!.get_Netflix_Home2_menu1())

        home2_recyclerview.adapter = (adapter_menu1)

        //공개 예정
        home2_btn1.setOnClickListener {
            home2_btn1.setBackgroundResource(R.drawable.corner_radius_home2_white)
            home2_btn1.setTextColor(resources.getColor(R.color.black))
            home2_btn2.setBackgroundResource(R.drawable.corner_radius_home2_black)
            home2_btn2.setTextColor(resources.getColor(R.color.white))
            home2_btn3.setBackgroundResource(R.drawable.corner_radius_home2_black)
            home2_btn3.setTextColor(resources.getColor(R.color.white))

            database = Database(context)
            adapter_menu1 = RecyclerViewAdapterMenu1(context, database!!.get_Netflix_Home2_menu1())

            home2_recyclerview.adapter = (adapter_menu1)

        }

        //모두가 주목하는 콘텐츠
        home2_btn2.setOnClickListener {
            home2_btn1.setBackgroundResource(R.drawable.corner_radius_home2_black)
            home2_btn1.setTextColor(resources.getColor(R.color.white))
            home2_btn2.setBackgroundResource(R.drawable.corner_radius_home2_white)
            home2_btn2.setTextColor(resources.getColor(R.color.black))
            home2_btn3.setBackgroundResource(R.drawable.corner_radius_home2_black)
            home2_btn3.setTextColor(resources.getColor(R.color.white))

            database = Database(context)
            adapter_menu2 = RecyclerViewAdapterMenu2(context, database!!.get_Netflix_Home2_menu2())

            home2_recyclerview.adapter = (adapter_menu2)
        }

        // 톱 10
        home2_btn3.setOnClickListener {
            home2_btn1.setBackgroundResource(R.drawable.corner_radius_home2_black)
            home2_btn1.setTextColor(resources.getColor(R.color.white))
            home2_btn2.setBackgroundResource(R.drawable.corner_radius_home2_black)
            home2_btn2.setTextColor(resources.getColor(R.color.white))
            home2_btn3.setBackgroundResource(R.drawable.corner_radius_home2_white)
            home2_btn3.setTextColor(resources.getColor(R.color.black))

            database = Database(context)
            adapter_menu3 = RecyclerViewAdapterMenu3(context, database!!.get_Netflix_Home2_menu3())

            home2_recyclerview.adapter = (adapter_menu3)
        }
    }
}
