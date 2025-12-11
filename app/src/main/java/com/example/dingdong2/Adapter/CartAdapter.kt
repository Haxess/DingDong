package com.example.dingdong2.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dingdong2.databinding.CartItemBinding

class CartAdapter ( private val cartitems: MutableList<String> ,
                    private val cartitemprice: MutableList<String>,
                    private var foodimage:MutableList<Int> ) : RecyclerView.Adapter<CartAdapter.CartViewHolder>(){


    private val itemquantities = IntArray(cartitems.size){1}

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CartViewHolder {
        val binding = CartItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CartViewHolder(binding)
    }
    override fun onBindViewHolder(
        holder: CartViewHolder,
        position: Int
    ) {
        holder.bind(position)
    }

    override fun getItemCount(): Int = cartitems.size

    inner class CartViewHolder(private val binding: CartItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(position: Int){
            binding.apply{
                cartname.text = cartitems[position]
                cartprice.text = cartitemprice[position]
                cartimage.setImageResource(foodimage[position])
                quantity.text = itemquantities[position].toString()

                minusbutton.setOnClickListener{

                }
                plusbutton.setOnClickListener{

                }
                deletebutton.setOnClickListener{

                }
            }
        }
    }
}
