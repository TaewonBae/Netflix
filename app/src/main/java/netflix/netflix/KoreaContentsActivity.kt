package netflix.netflix

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import kotlinx.android.synthetic.main.activity_korea_contents.*
import netflix.netflix.Database.Database
import netflix.netflix.Database.RecyclerViewAdapter1
import netflix.netflix.Database.RecyclerViewAdapterDrama1
import netflix.netflix.Database.RecyclerViewAdapterDrama2

class KoreaContentsActivity :  YouTubeBaseActivity(), YouTubePlayer.OnInitializedListener {

    //recyclerview layout, adpater, database세팅 변수
    var adapterDrama1: RecyclerViewAdapterDrama1? = null
    var adapterDrama2: RecyclerViewAdapterDrama2? = null
    var database: Database? = null

    var youtube_url : String = ""
    var youtube_api_key : String = "AIzaSyA5F7QZW2wAqnHukiaDpOSoNriS2KuYMIM"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_korea_contents)


        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );


        val position = intent.getIntExtra("position", 0)

        //init DB
        database = Database(this)


        //youtube url : v="0000"
        youtube_url = RecyclerViewAdapter1.netflixList.get(position).Netflix_youtube


        youtube_view.initialize(youtube_api_key, this)


        kc_name.setText(RecyclerViewAdapter1.netflixList.get(position).Netflix_name)
        kc_text1.setText(RecyclerViewAdapter1.netflixList.get(position).Netflix_text1)
        kc_text2.setText(RecyclerViewAdapter1.netflixList.get(position).Netflix_text2)
        kc_text3.setText(RecyclerViewAdapter1.netflixList.get(position).Netflix_text3)
        kc_text4.setText(RecyclerViewAdapter1.netflixList.get(position).Netflix_text4)


        //position 조건문 : recyclerview 세팅(다른 테이블에 있는 데이터 불러옴) + 3번째 컨텐츠부터는 데이터가 없기에 첫 번째, 두 번째 까지만 VISIBLE, 나머진 GONE처리
        if(position==0){
            adapterDrama1 = RecyclerViewAdapterDrama1(this, database!!.get_Netflix_List_Drama1())
            korea_contents_recyclerview.adapter = adapterDrama1
            korea_contents_recyclerview.visibility = View.VISIBLE
        }else if (position==1){
            adapterDrama2 = RecyclerViewAdapterDrama2(this, database!!.get_Netflix_List_Drama2())
            korea_contents_recyclerview.adapter = adapterDrama2
            korea_contents_recyclerview.visibility = View.VISIBLE
        }else{
            korea_contents_recyclerview.visibility = View.GONE
        }



        //닫기버튼 이벤트
        kc_close_btn.setOnClickListener {
            finish()
            overridePendingTransition(R.anim.nothing, R.anim.exit_to_down)
        }

        //배우 정보 더 보기 이벤트
        kc_sub_plus.setOnClickListener {
            val intent = Intent(this, KoreaContentsActorActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.enter_from_down, R.anim.nothing)
        }


    }

    override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, youtubePlayer: YouTubePlayer?, isReady: Boolean) {

        if (!isReady){
            youtubePlayer!!.loadVideo(youtube_url)
        }
    }

    override fun onInitializationFailure(p0: YouTubePlayer.Provider?, youTubeInitializationResult: YouTubeInitializationResult?) {

    }



}