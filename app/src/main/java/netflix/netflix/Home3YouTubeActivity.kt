package netflix.netflix

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import kotlinx.android.synthetic.main.activity_home3_youtube.*
import netflix.netflix.Database.RecyclerViewAdapterSearch

class Home3YouTubeActivity : YouTubeBaseActivity(), YouTubePlayer.OnInitializedListener  {
    var youtube_home3_url: String = ""
    var youtube_api_key: String = "AIzaSyA5F7QZW2wAqnHukiaDpOSoNriS2KuYMIM"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home3_youtube)

        val position = intent.getIntExtra("home3_position", 10)
        youtube_home3_url = RecyclerViewAdapterSearch.netflixList.get(position).Netflix_youtube
        home3_youtube_view.initialize(youtube_api_key, this)

    }
    override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, youtubePlayer: YouTubePlayer?, isReady: Boolean) {
        if (!isReady) {
            youtubePlayer!!.loadVideo(youtube_home3_url)
        }
    }

    override fun onInitializationFailure(p0: YouTubePlayer.Provider?, youTubeInitializationResult: YouTubeInitializationResult?) {

    }
}