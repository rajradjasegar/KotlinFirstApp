package raj.home.kotlinfirstapp.view

import android.content.Context
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import raj.home.kotlinfirstapp.presenter.MainPresenterImpl
import kotlinx.android.synthetic.main.activity_main.rajTextView
import raj.home.kotlinfirstapp.R
import raj.home.kotlinfirstapp.contract.MainContract


class MainViewManagerImpl (val context: Context, val appCompatActivity : AppCompatActivity) : MainContract.MainView {
    lateinit var showTextView: TextView
    private var TAG: String = "MainViewManagerImpl"

    /**
     * WARNING
     * il faut que la définition de la méthode lambda soit faite avant l'appel de celle ci sinon il y aura
     * un pointeur null
     */
    val onTextModified: (String) -> Unit = {
            text ->  Log.d(TAG, " on textmodified $text");
            showTextView.text = text
    }

    var mainPresenterImpl: MainPresenterImpl = MainPresenterImpl(context)

    init {
        //mainPresenterImpl.setListener(this)
        modifyTextViewValue("Hello from Main View Manager")

        // setting method lambda for callback instead of using interface
        mainPresenterImpl.modifyText { text -> onTextModified(text) }
        //onTextModified("")
    }


    //creating method to make it look simpler
    /**
     * cette définition de méthode au lieu de lamba plus haut marche également très bien
     */
    // Defining a method
   /* fun onTextModified(text :String ) {
        //do things related to activity
        showTextView.text = text
        //modifyTextViewValue("one time again modified by view")
    }*/
    // WARNING the callback lambda function doesn't work if it is stored in val or var, it only work in local here



    fun modifyTextViewValue(text: String){
        showTextView = appCompatActivity.findViewById(R.id.rajTextView) as TextView
        showTextView.text = text
    }


}