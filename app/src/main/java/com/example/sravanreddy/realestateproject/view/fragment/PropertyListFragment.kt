package com.example.sravanreddy.realestateproject.view.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import com.example.sravanreddy.realestateproject.R
import com.example.sravanreddy.realestateproject.adapters.PropertyAdapter
import com.example.sravanreddy.realestateproject.models.Property

class PropertyListFragment : Fragment(), OnClickListener{
    override fun onClick(v: View?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d("PropertyListFragment", "Creating List Fragment")
        val mView = inflater.inflate(R.layout.fragment_property_list, container, false)
        Log.d("PropertyListFragment", "Inflated");
        val recyclerView:RecyclerView? = mView?.findViewById(R.id.propertyList_recycler)
        var imgs:Array<String> = context!!.resources.getStringArray(R.array.dummy_pics)
        var propertyList:MutableList<Property> = mutableListOf()
        for(i in 0 until imgs.size){
            val property = Property(i.toString(), "123", imgs[i])
            propertyList.add(property)
        }
        var propertyAdapter = PropertyAdapter(propertyList, this, context!!)
        recyclerView!!.adapter =propertyAdapter
        recyclerView!!.layoutManager = LinearLayoutManager(context!!)
        return mView
    }

}