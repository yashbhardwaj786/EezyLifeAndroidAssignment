package com.example.eezylife.ui

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import com.example.eezylife.R
import com.example.eezylife.databinding.ActivityMainBinding
import com.example.eezylife.modelfactory.MainViewModelFactory
import com.example.eezylife.utils.DateFormat
import com.example.eezylife.utils.getSimpleDateFormat
import com.example.eezylife.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*
import org.kodein.di.KodeinAware
import org.kodein.di.android.kodein
import org.kodein.di.generic.instance
import java.util.*


class MainActivity : BaseActivity(), KodeinAware {

    override val kodein by kodein()
    private val factory: MainViewModelFactory by instance()
    private lateinit var mainViewModel: MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        mainViewModel =
            ViewModelProvider(this, factory).get(MainViewModel::class.java)

        binding.viewModel = mainViewModel

        setToolBar("My Plans")

        val date: Date = Calendar.getInstance().time

        val df = getSimpleDateFormat(DateFormat.USER_READABLE_WITH_DAY)
        df?.let {
            mainViewModel.selectedDate.set(it.format(date))
        }

        horizontal.setDatePickedListener {
            val dateFacDB = getSimpleDateFormat(DateFormat.USER_READABLE_WITH_DAY)?.format(it)
            mainViewModel.selectedDate.set(dateFacDB)
        }

        mainViewModel.buttonClicked.observe(this, androidx.lifecycle.Observer {
            if (it == "bar-Accepted") {
                accept.visibility = View.GONE
                accepted.visibility = View.VISIBLE
                decline.visibility = View.GONE
                declined.visibility = View.GONE
            } else if (it == "bar-Declined") {
                accept.visibility = View.GONE
                accepted.visibility = View.GONE
                decline.visibility = View.GONE
                declined.visibility = View.VISIBLE
            } else if (it == "rest-Accepted") {
                accept_bottom.visibility = View.GONE
                accepted_bottom.visibility = View.VISIBLE
                decline_bottom.visibility = View.GONE
                declined_bottom.visibility = View.GONE
            } else if (it == "rest-Declined") {
                accept_bottom.visibility = View.GONE
                accepted_bottom.visibility = View.GONE
                decline_bottom.visibility = View.GONE
                declined_bottom.visibility = View.VISIBLE
            }
        })
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) onBackPressed()
        return super.onOptionsItemSelected(item)
    }

}
