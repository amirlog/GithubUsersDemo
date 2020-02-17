package github.com.githubuser.ui.fragment

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

data class DetailsFragmentArgs(
  val login: String = "None"
) : NavArgs {
  fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("login", this.login)
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): DetailsFragmentArgs {
      bundle.setClassLoader(DetailsFragmentArgs::class.java.classLoader)
      val __login : String?
      if (bundle.containsKey("login")) {
        __login = bundle.getString("login")
        if (__login == null) {
          throw IllegalArgumentException("Argument \"login\" is marked as non-null but was passed a null value.")
        }
      } else {
        __login = "None"
      }
      return DetailsFragmentArgs(__login)
    }
  }
}
