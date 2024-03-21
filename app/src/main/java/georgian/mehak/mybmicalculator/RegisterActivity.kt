package georgian.mehak.mybmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import georgian.mehak.mybmicalculator.databinding.ActivityMainBinding
import georgian.mehak.mybmicalculator.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }
}