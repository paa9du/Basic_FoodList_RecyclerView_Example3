package com.example.recyclerview_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import androidx.recyclerview.widget.RecyclerView.Recycler

class MainActivity : AppCompatActivity() {
    private var recyclerView:RecyclerView?=null
    private var recyclerViewMovieAdapter:RecyclerViewMovieAdapter?=null
    private var movieList= mutableListOf<Movie>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        movieList=ArrayList()
        recyclerView =findViewById<View>(R.id.rvMovieList) as RecyclerView
        recyclerViewMovieAdapter=RecyclerViewMovieAdapter(this@MainActivity,movieList)
        val LayoutManager:RecyclerView.LayoutManager=GridLayoutManager(this,2)

        recyclerView!!.layoutManager =LayoutManager
        recyclerView!!.adapter=recyclerViewMovieAdapter
        prepareMovieListData()

    }

    private fun prepareMovieListData(){
        var movie=Movie("Avatar",R.drawable.burger)
        movieList.add(movie)
        movie=Movie("Batman",R.drawable.cake)
        movieList.add(movie)
        movie=Movie("End Game",R.drawable.fries)
        movieList.add(movie)
        movie=Movie("End Game",R.drawable.maggi)
        movieList.add(movie)
        movie=Movie("End Game",R.drawable.ocean)
        movieList.add(movie)
        movie=Movie("End Game",R.drawable.pancake)
        movieList.add(movie)
        movie=Movie("End Game",R.drawable.pasta)
        movieList.add(movie)
        movie=Movie("End Game",R.drawable.pizza)
        movieList.add(movie)


    }


}