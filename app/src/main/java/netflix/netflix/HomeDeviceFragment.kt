package netflix.netflix

import android.content.Context
import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.fragment_dialog_category.*
import kotlinx.android.synthetic.main.fragment_dialog_category.category_close_btn
import kotlinx.android.synthetic.main.fragment_home_device.*


class HomeDeviceFragment(context: Context) : BottomSheetDialogFragment() {
    val dialog2 = BottomSheetDialog(context)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_home_device, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //BottomSheetFragmentDialog 위에서 어느정도 떨어져있는지 조정
        val offsetFromTop = 520
        (dialog as? BottomSheetDialog)?.behavior?.apply {
            isFitToContents = false
            setExpandedOffset(offsetFromTop)
            state = BottomSheetBehavior.STATE_EXPANDED
        }

       
    }



    override fun getTheme(): Int = R.style.AppBottomSheetDialogTheme2
}