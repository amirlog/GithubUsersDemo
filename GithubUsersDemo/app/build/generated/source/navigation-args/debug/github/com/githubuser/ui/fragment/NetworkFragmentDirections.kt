package github.com.githubuser.ui.fragment

import android.os.Bundle
import androidx.navigation.NavDirections
import github.com.githubuser.R
import kotlin.Int
import kotlin.String

class NetworkFragmentDirections private constructor() {
  private data class ActionNetworkFragmentToHomeFragment2(
    val name: String = "None",
    val website: String = "None",
    val bio: String = "None",
    val image: String = "None"
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_networkFragment_to_homeFragment2

    override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("name", this.name)
      result.putString("website", this.website)
      result.putString("bio", this.bio)
      result.putString("image", this.image)
      return result
    }
  }

  companion object {
    fun actionNetworkFragmentToHomeFragment2(
      name: String = "None",
      website: String = "None",
      bio: String = "None",
      image: String = "None"
    ): NavDirections = ActionNetworkFragmentToHomeFragment2(name, website, bio, image)
  }
}
