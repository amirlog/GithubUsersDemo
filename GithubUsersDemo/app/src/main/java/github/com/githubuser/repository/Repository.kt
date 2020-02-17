package github.com.githubuser.repository


import android.app.Application
import android.content.Context
import android.widget.Toast
import androidx.lifecycle.LiveData
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import github.com.githubuser.api.ApiService
import github.com.githubuser.api.RetrofitClient
import github.com.githubuser.model.Repo
import github.com.githubuser.model.User
import github.com.githubuser.ui.fragment.HomeFragment

object Repository {
    var job: CompletableJob? = null

    fun getUser(username: String): LiveData<User> {
        job = Job()

        return object : LiveData<User>() {
            override fun onActive() {
                super.onActive()
                job?.let { theJob ->
                    CoroutineScope(IO + theJob).launch {

                        android.util.Log.i("amir","fetch")
                        //fetch data from web service here

                        try {
                            val user = RetrofitClient.createWebAPI<ApiService>().getUser(username)
                            withContext(Main) {
                                value = user
                                theJob.complete()
                            }
                        } catch (e: Exception) {
                            android.util.Log.i("amir","ex2")

                            //HomeFragment.showError()



                        }

                    }
                }
            }

        }


    }
    fun getRepoes(username: String): LiveData<List<Repo>> {
        job = Job()

        return object : LiveData<List<Repo>>() {
            override fun onActive() {
                super.onActive()
                job?.let { theJob ->
                    CoroutineScope(IO + theJob).launch {

                        //fetch data from web service here
                        val repoes = RetrofitClient.createWebAPI<ApiService>().getRepoes(username)
                        withContext(Main) {
                            value = repoes
                            theJob.complete()
                        }
                    }
                }
            }
        }


    }


    //cancel the job
    fun cancelJob() {
        job?.cancel()
    }
}