package github.com.githubuser.ui.fragment

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import github.com.githubuser.R
import kotlin.Int
import kotlin.String

class DetailsFragmentDirections private constructor() {
  private data class ActionDetailsFragmentToHomeFragment(
    val name: String = "None",
    val website: String = "None",
    val bio: String = "None",
    val image: String = "None"
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_detailsFragment_to_homeFragment

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
    fun actionDetailsFragmentToHomeFragment(
      name: String = "None",
      website: String = "None",
      bio: String = "None",
      image: String = "None"
    ): NavDirections = ActionDetailsFragmentToHomeFragment(name, website, bio, image)

    fun actionDetailsFragmentToReposListFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_detailsFragment_to_reposListFragment)
  }
}
