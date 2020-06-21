package raj.home.kotlinfirstapp.presenter

import android.content.Context
import android.util.Log
import raj.home.kotlinfirstapp.contract.MainContract

class MainPresenterImpl (var context: Context) : MainContract.MainPresenter {
    private lateinit var listener : MainContract.MainPresenter.MainPresenterListener
    private val TAG: String = "MainPresenterImpl"

    init {
        Log.d(TAG, " Yeah we are in MainPresenterImpl")
    }

    override fun setListener(listener: MainContract.MainPresenter.MainPresenterListener) {
        this.listener = listener
    }

    override fun modifyText(methodToReturn: (String) -> Unit ) {
        Log.d(TAG, " Yeah in modifyText method")
        var modifiedText : String = " text modified from presenter"
        methodToReturn(modifiedText)
        }



}