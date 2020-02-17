package github.com.githubuser.ui.fragment

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import github.com.githubuser.R
import kotlin.Int
import kotlin.String

class HomeFragmentDirections private constructor() {
  private data class ActionHomeFragmentToDetailsFragment(
    val login: String = "None"
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_homeFragment_to_detailsFragment

    override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("login", this.login)
      return result
    }
  }

  companion object {
    fun actionHomeFragmentToDetailsFragment(login: String = "None"): NavDirections =
        ActionHomeFragmentToDetailsFragment(login)

    fun actionHomeFragmentToNetworkFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_networkFragment)
  }
}
