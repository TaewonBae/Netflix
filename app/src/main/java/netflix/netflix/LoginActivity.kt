package netflix.netflix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    lateinit var login_email2: EditText
    lateinit var login_password2: EditText
    lateinit var login_btn: ImageView
    lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        //파이어베이스 설정
        auth = FirebaseAuth.getInstance()

        login_email2 = findViewById(R.id.login_email2)
        login_password2 = findViewById(R.id.login_password2)
        login_btn = findViewById(R.id.login_login_btn)


        //고객센터 클릭시
        login_customer_center.setOnClickListener {
            val customerService = IntroCustomerService(this)
            customerService.show(supportFragmentManager, customerService.tag)
        }

        //백버튼
        login_back_btn.setOnClickListener {
            finish()
            overridePendingTransition(R.anim.nothing,R.anim.slide_left_exit)

        }

        //로그인버튼 클릭이벤트
        login_btn.setOnClickListener {
            var email = login_email2.text.toString()
            var password = login_password2.text.toString()
            login(email,password)
        }

        //회원가입버튼 클릭이벤트
        login_register_btn.setOnClickListener {
            val intent = Intent(this, LoginRegisterActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun login(email:String,password:String){
        auth.signInWithEmailAndPassword(email,password) // 로그인
            .addOnCompleteListener {
                    result->
                if(result.isSuccessful){
                    Toast.makeText(this, "로그인에 성공했습니다.", Toast.LENGTH_SHORT).show()
                    var intent = Intent(this, LoginSelectProfileActivity::class.java)
                    startActivity(intent)
                }else{
                    Toast.makeText(this, "이메일과 비밀번호를 확인해주세요.", Toast.LENGTH_SHORT).show()
                }
            }
    }
}