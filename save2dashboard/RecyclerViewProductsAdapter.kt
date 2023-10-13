package com.example.save2dashboard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewProductsAdapter constructor(private val getActivity: Products, private val productList:List<ForProductCards>) :
    RecyclerView.Adapter<RecyclerViewProductsAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_layout,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.product_name.text = productList[position].productName
        holder.product_price.text = productList[position].productPrice
        holder.product_image.setImageResource(productList[position].productImage)

        /*holder.product_ConstraintLayout.setOnClickListener{
            Toast.makeText(getActivity, productList[position].productName, Toast.LENGTH_LONG).show()
        }*/
    }

    override fun getItemCount(): Int {
        return productList.size
    }
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val product_image : ImageView = itemView.findViewById(R.id.product_image)
        val product_name : TextView = itemView.findViewById(R.id.product_name)
        val product_price : TextView = itemView.findViewById(R.id.product_price)
        val product_ConstraintLayout : ConstraintLayout = itemView.findViewById(R.id.product_ConstraintLayout)


    }
}
