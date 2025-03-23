package com.example.skill_snap

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.skill_snap.Adapter.CourseAdapter
import com.example.skill_snap.Domain.CourseDomain
import java.util.ArrayList

class HomeFragment : Fragment() {

    private lateinit var adapter: CourseAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var courseArrayList: ArrayList<CourseDomain>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // Initialize the RecyclerView
        recyclerView = view.findViewById(R.id.popularView)
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        // Initialize the list of courses
        courseArrayList = ArrayList()

        // Add courses to the list
        courseArrayList.add(CourseDomain("Quick Learn C# Language", "Jamie Young", 123.0, 4.5, "pic1"))
        courseArrayList.add(CourseDomain("Advanced Java Programming", "John Doe", 150.0, 4.7, "pic2"))
        courseArrayList.add(CourseDomain("Python for Beginners", "Jane Smith", 99.0, 4.3, "pic3"))
        courseArrayList.add(CourseDomain("Web Development with HTML/CSS", "Alice Johnson", 89.0, 4.6, "pic4"))

        // Initialize the adapter and set it to the RecyclerView
        adapter = CourseAdapter(courseArrayList)
        recyclerView.adapter = adapter

        return view
    }
}