package com.example.doadandzikirapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.doadandzikirapp.R
import com.example.doadandzikirapp.DzikirDoaAdapter
import com.example.doadandzikirapp.DataDzikirDoa
import com.example.doadandzikirapp.DzikirDoa

class DzikirPagiActivity : AppCompatActivity() {

    private lateinit var rvDzikirPagi: RecyclerView

    private var listDzikirPagi: ArrayList<DzikirDoa> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_dzikir_pagi)

        rvDzikirPagi = findViewById(R.id.rv_dzikir_pagi)

        listDzikirPagi.clear()
        listDzikirPagi.addAll(DataDzikirDoa.listDzikirPagi)

        rvDzikirPagi.layoutManager = LinearLayoutManager(this)
        rvDzikirPagi.adapter = DzikirDoaAdapter(listDzikirPagi)
        rvDzikirPagi.setHasFixedSize(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}