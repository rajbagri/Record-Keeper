package com.rajbagri.recordkeeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.rajbagri.recordkeeper.databinding.ActivityEditRunningRecordBinding

class EditRunningRecordActivity : AppCompatActivity() {

    private lateinit var binding : ActivityEditRunningRecordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditRunningRecordBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "my new toolbar title"

    }
}