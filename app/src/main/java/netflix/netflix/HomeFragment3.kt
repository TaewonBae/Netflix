package netflix.netflix

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mancj.materialsearchbar.MaterialSearchBar.OnSearchActionListener
import kotlinx.android.synthetic.main.fragment_home3.*
import netflix.netflix.Database.Database
import netflix.netflix.Database.RecyclerViewAdapterSearch
import java.util.*

class HomeFragment3 : Fragment() {
    var layoutManager: RecyclerView.LayoutManager? = null
    var adapter_search: RecyclerViewAdapterSearch? = null
    var database: Database? = null
    var suggestList: List<String> = ArrayList() //ArrayList


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        //init DB
        database = Database(context)


        adapter_search = RecyclerViewAdapterSearch(context, database!!.get_Netflix_Search())
        home3_search_recyclerview.adapter = (adapter_search)

        //region material search bar 세팅
        loadSuggestList()
        searchBar.addTextChangeListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                val suggest: MutableList<String> = ArrayList()
                for (search in suggestList) {
                    if (search.toLowerCase().contains(searchBar.getText().toLowerCase())
                    ) suggest.add(search)
                }
                searchBar.setLastSuggestions(suggest)
            }
            override fun afterTextChanged(s: Editable) {}
        })
        searchBar.setOnSearchActionListener(object : OnSearchActionListener {
            override fun onSearchStateChanged(enabled: Boolean) {
                if (!enabled) {
                    //If close Search, just restore default
                    adapter_search = RecyclerViewAdapterSearch(activity!!.applicationContext, database!!.get_Netflix_Search())
                    home3_search_recyclerview.adapter = (adapter_search)




                }
            }

            override fun onSearchConfirmed(text: CharSequence) {
                startSearch(text.toString())
            }

            override fun onButtonClicked(buttonCode: Int) {}
        })
        //endregion

    }

    //search bar 관련 함수1
    private fun loadSuggestList() {
        suggestList = database!!.getSearchName() //Database클래스로 가서 돈다.
        searchBar.setLastSuggestions(suggestList) //위의 suggestList 어레이값을 materialSearchBar의 setLastSuggestions함수 실행
    }
    //search bar 관련 함수2
    private fun startSearch(text: String) {
        //If close Search, just restore default
        adapter_search = RecyclerViewAdapterSearch(context, database!!.getSearchByName(text))
        home3_search_recyclerview.adapter = (adapter_search)
    }
}


