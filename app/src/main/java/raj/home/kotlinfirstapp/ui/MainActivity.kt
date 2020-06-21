package raj.home.kotlinfirstapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import raj.home.kotlinfirstapp.R
import raj.home.kotlinfirstapp.view.MainViewManagerImpl

class MainActivity : AppCompatActivity() {

    lateinit var mainViewManagerImpl: MainViewManagerImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewManagerImpl = MainViewManagerImpl(this, this)
    }
}
