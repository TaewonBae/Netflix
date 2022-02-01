package netflix.netflix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class LoginRegisterActivity : AppCompatActivity() {

    lateinit var register_email2: EditText
    lateinit var register_password2: EditText
    lateinit var register_btn: ImageView

    lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_register)

        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        auth = FirebaseAuth.getInstance()

        register_email2 = findViewById(R.id.register_email2)
        register_password2 = findViewById(R.id.register_password2)
        register_btn = findViewById(R.id.register_btn)

        register_btn.setOnClickListener {
            var email = register_email2.text.toString()
            var password = register_password2.text.toString()
            //이메일과 패스워드가 공백이 아닌경우
            if (email != "" && password != "") {
                auth.createUserWithEmailAndPassword(email, password) // 회원 가입
                    .addOnCompleteListener { result ->
                        if (result.isSuccessful) {
                            Toast.makeText(this, "회원가입이 완료되었습니다.", Toast.LENGTH_SHORT).show()
                            if (auth.currentUser != null) {
                                var intent = Intent(this, LoginActivity::class.java)
                                startActivity(intent)
                                finish()
                            }
                        } else if (result.exception?.message.isNullOrEmpty()) {
                            Toast.makeText(this, "회원가입에 실패했습니다.\n이메일과 비밀번호를 확인해주세요.", Toast.LENGTH_SHORT).show()
                        } else {
                            Toast.makeText(this, "회원가입에 실패했습니다.\n이메일과 비밀번호를 확인해주세요.", Toast.LENGTH_SHORT).show()
                        }

                    }
            } else {
                Toast.makeText(this, "공백없이 입력해주세요.", Toast.LENGTH_SHORT).show()
            }

        }
    }

}