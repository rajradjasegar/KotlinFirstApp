package raj.home.kotlinfirstapp.contract

interface MainContract {

    interface MainView {
        //fun onTextModifed(textModified: String)
    }

    interface MainPresenter {
        fun modifyText(methodToReturn : (String) -> Unit)
        fun setListener(listener: MainPresenterListener)
        interface MainPresenterListener {
            fun onTextModifed(textModified: String)
        }
    }

    interface MainRepository{

    }
}