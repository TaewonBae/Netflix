package netflix.netflix

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import kotlinx.android.synthetic.main.activity_home2_youtube.*
import netflix.netflix.Database.RecyclerViewAdapterMenu1
import netflix.netflix.Database.RecyclerViewAdapterMenu2
import netflix.netflix.Database.RecyclerViewAdapterMenu3

class Home2YouTubeActivity : YouTubeBaseActivity(), YouTubePlayer.OnInitializedListener {

    var youtube_home2_url: String = ""
    var youtube_api_key: String = "AIzaSyA5F7QZW2wAqnHukiaDpOSoNriS2KuYMIM"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2_youtube)

        val position1 = intent.getIntExtra("home2_position1", 10)
        val position2 = intent.getIntExtra("home2_position2", 10)
        val position3 = intent.getIntExtra("home2_position3", 10)

        if (position2==10 && position3==10){
            youtube_home2_url = RecyclerViewAdapterMenu1.netflixList.get(position1).Netflix_youtube
        }else if(position1==10 && position3==10){
            youtube_home2_url = RecyclerViewAdapterMenu2.netflixList.get(position2).Netflix_youtube
        }else if(position1==10 && position2==10){
            youtube_home2_url = RecyclerViewAdapterMenu3.netflixList.get(position3).Netflix_youtube
        }else{
            youtube_home2_url = RecyclerViewAdapterMenu1.netflixList.get(position1).Netflix_youtube

        }
//        //youtube url : v="0000"
//        youtube_home2_url = RecyclerViewAdapterMenu1.netflixList.get(position1).Netflix_youtube
        home2_youtube_view.initialize(youtube_api_key, this)
    }

    override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, youtubePlayer: YouTubePlayer?, isReady: Boolean) {
        if (!isReady) {
            youtubePlayer!!.loadVideo(youtube_home2_url)
        }
    }

    override fun onInitializationFailure(p0: YouTubePlayer.Provider?, youTubeInitializationResult: YouTubeInitializationResult?) {

    }
}