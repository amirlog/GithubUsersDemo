package github.com.githubuser.ui.fragment

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

data class HomeFragmentArgs(
  val name: String = "None",
  val website: String = "None",
  val bio: String = "None",
  val image: String = "None"
) : NavArgs {
  fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("name", this.name)
    result.putString("website", this.website)
    result.putString("bio", this.bio)
    result.putString("image", this.image)
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): HomeFragmentArgs {
      bundle.setClassLoader(HomeFragmentArgs::class.java.classLoader)
      val __name : String?
      if (bundle.containsKey("name")) {
        __name = bundle.getString("name")
        if (__name == null) {
          throw IllegalArgumentException("Argument \"name\" is marked as non-null but was passed a null value.")
        }
      } else {
        __name = "None"
      }
      val __website : String?
      if (bundle.containsKey("website")) {
        __website = bundle.getString("website")
        if (__website == null) {
          throw IllegalArgumentException("Argument \"website\" is marked as non-null but was passed a null value.")
        }
      } else {
        __website = "None"
      }
      val __bio : String?
      if (bundle.containsKey("bio")) {
        __bio = bundle.getString("bio")
        if (__bio == null) {
          throw IllegalArgumentException("Argument \"bio\" is marked as non-null but was passed a null value.")
        }
      } else {
        __bio = "None"
      }
      val __image : String?
      if (bundle.containsKey("image")) {
        __image = bundle.getString("image")
        if (__image == null) {
          throw IllegalArgumentException("Argument \"image\" is marked as non-null but was passed a null value.")
        }
      } else {
        __image = "None"
      }
      return HomeFragmentArgs(__name, __website, __bio, __image)
    }
  }
}
