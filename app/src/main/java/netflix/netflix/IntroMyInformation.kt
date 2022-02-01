package netflix.netflix

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.fragment_intro_customer_service.*
import kotlinx.android.synthetic.main.fragment_intro_customer_service.intro_customer_flayout
import kotlinx.android.synthetic.main.fragment_intro_my_information.*

class IntroMyInformation(context: Context) : BottomSheetDialogFragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_intro_my_information, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //BottomSheetFragmentDialog 위에서 어느정도 떨어져있는지 조정
        val offsetFromTop = 130
        (dialog as? BottomSheetDialog)?.behavior?.apply {
            isFitToContents = false
            setExpandedOffset(offsetFromTop)
            state = BottomSheetBehavior.STATE_EXPANDED
            setStyle(BottomSheetDialogFragment.STYLE_NORMAL, R.style.AppBottomSheetDialogTheme);//백그라운드설정 >> 안됐음 ..
        }
    }

    //style에 BottomSheetDialogFragment 백그라운드 설정 추가해주고 밑에 getTheme 메소드까지 설정해야 적용됨.
    override fun getTheme(): Int = R.style.AppBottomSheetDialogTheme

}