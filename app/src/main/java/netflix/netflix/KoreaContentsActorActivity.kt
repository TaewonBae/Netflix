package netflix.netflix

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_korea_contents_actor.*

class KoreaContentsActorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_korea_contents_actor)

        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        korea_contents_actor_close_btn.setOnClickListener {
            finish()
            overridePendingTransition(R.anim.nothing, R.anim.exit_to_down)
        }
    }
}