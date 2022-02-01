package netflix.netflix

import android.os.Bundle
import android.view.WindowManager
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import kotlinx.android.synthetic.main.activity_korea_contents_youtube2.*
import netflix.netflix.Database.Database
import netflix.netflix.Database.RecyclerViewAdapterDrama2

class KoreaContentsYoutubeActivity2 : YouTubeBaseActivity(), YouTubePlayer.OnInitializedListener {

    var youtube_url: String = ""
    var youtube_api_key: String = "AIzaSyA5F7QZW2wAqnHukiaDpOSoNriS2KuYMIM"
    var database: Database? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_korea_contents_youtube2)

        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        val position_youtube = intent.getIntExtra("position_youtube", 0)

        //init DB
        database = Database(this)

        //youtube url : v="0000"
        youtube_url = RecyclerViewAdapterDrama2.netflixList.get(position_youtube).Netflix_youtube
        kcy_youtube_view2.initialize(youtube_api_key, this)
    }

    override fun onInitializationSuccess(
        p0: YouTubePlayer.Provider?,
        youtubePlayer: YouTubePlayer?,
        isReady: Boolean
    ) {

        if (!isReady) {
            youtubePlayer!!.loadVideo(youtube_url)
        }
    }

    override fun onInitializationFailure(
        p0: YouTubePlayer.Provider?,
        youTubeInitializationResult: YouTubeInitializationResult?
    ) {

    }
}