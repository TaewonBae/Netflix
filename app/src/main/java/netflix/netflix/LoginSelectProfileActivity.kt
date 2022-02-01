package netflix.netflix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_login_select_profile.*

class LoginSelectProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_select_profile)

        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        sp_profile1.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("profile", 1)
            startActivity(intent)
            finish()
        }
        sp_profile2.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("profile", 2)
            startActivity(intent)
            finish()
        }
        sp_profile3.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("profile", 3)
            startActivity(intent)
            finish()
        }
        sp_profile3.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("profile", 4)
            startActivity(intent)
            finish()
        }
    }
}