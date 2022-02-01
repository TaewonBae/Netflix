package netflix.netflix

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_intro.*
import kotlinx.android.synthetic.main.fragment_home1.*
import netflix.netflix.Database.*


class HomeFragment1 : Fragment() {

    var layoutManager: RecyclerView.LayoutManager? = null
    var adapter1: RecyclerViewAdapter1? = null
    var adapter2: RecyclerViewAdapter2? = null
    var adapter3: RecyclerViewAdapter3? = null
    var adapter4: RecyclerViewAdapter4? = null
    var adapter5: RecyclerViewAdapter5? = null
    var adapter6: RecyclerViewAdapter6? = null
    var adapter7: RecyclerViewAdapterGame? = null
    var database: Database? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_home1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Category 다이얼로그
        home_top_menu3.setOnClickListener {
            val dialogCategoryFragment = DialogCategoryFragment()
            dialogCategoryFragment.show(childFragmentManager, dialogCategoryFragment.tag)
        }
        //고객센터 및 개인정보 클릭이벤트 >> BottomSheetDialogFragment
        home1_device.setOnClickListener {
            val homeDeviceFragment = HomeDeviceFragment(requireContext())
            homeDeviceFragment.show(childFragmentManager, homeDeviceFragment.tag)
        }

        layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        //init DB
        database = Database(context)




        adapter1 = RecyclerViewAdapter1(context, database!!.get_Netflix_List1())
        adapter2 = RecyclerViewAdapter2(context, database!!.get_Netflix_List2())
        adapter3 = RecyclerViewAdapter3(context, database!!.get_Netflix_List3())
        adapter4 = RecyclerViewAdapter4(context, database!!.get_Netflix_List4())
        adapter5 = RecyclerViewAdapter5(context, database!!.get_Netflix_List5())
        adapter6 = RecyclerViewAdapter6(context, database!!.get_Netflix_List6())
        adapter7 = RecyclerViewAdapterGame(context, database!!.get_Netflix_List_Game())


        home_recycler_contents1.adapter = (adapter1)
        home_recycler_contents2.adapter = (adapter2)
        home_recycler_contents3.adapter = (adapter3)
        home_recycler_contents4.adapter = (adapter4)
        home_recycler_contents5.adapter = (adapter5)
        home_recycler_contents6.adapter = (adapter6)
        home_recycler_contents7.adapter = (adapter7)


    }
}