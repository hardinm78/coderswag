package com.mikehardinapps.coderswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.mikehardinapps.coderswag.Model.Category
import com.mikehardinapps.coderswag.R

/**
 * Created by michaelhardin on 12/1/17.
 */
class CategoryRecycleAdapter(val context:Context,val categories:List<Category>,val itemClick:(Category) -> Unit) : Adapter<CategoryRecycleAdapter.Holder>() {


    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: Holder?, position: Int) {
        holder?.bindCategory(categories[position],context)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Holder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.category_list_item,parent,false)
        return Holder(view, itemClick)
    }



    inner class Holder(itemView: View?, val itemClick:(Category)->Unit) : RecyclerView.ViewHolder(itemView) {
        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)
        val categoryName = itemView?.findViewById<TextView>(R.id.categoryName)

        fun bindCategory(category:Category,context: Context){
            val resourceId = context.resources.getIdentifier(category.image,"drawable",context.packageName)

            categoryImage?.setImageResource(resourceId)
            categoryName?.text = category.title
            itemView.setOnClickListener{itemClick(category)}
        }

    }



}