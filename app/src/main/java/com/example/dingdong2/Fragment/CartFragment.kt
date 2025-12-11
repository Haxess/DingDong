package com.example.dingdong2.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dingdong2.Adapter.CartAdapter
import com.example.dingdong2.R
import com.example.dingdong2.databinding.FragmentCartBinding

class CartFragment : Fragment() {
    private lateinit var binding: FragmentCartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCartBinding.inflate(inflater, container, false)
        val CartFoodName = listOf<String>("Veg-Rolls" , "Salad" , "Ice-Cream" , "Soup")
        val CartItemPrice = listOf<String>("$2" , "$5" , "$4" , "$3")
        val CartFoodimage = listOf<Int>(R.drawable.menu1 , R.drawable.menu2 , R.drawable.menu3 , R.drawable.menu4)
        val adapter = CartAdapter(ArrayList(CartFoodName),ArrayList(CartItemPrice),ArrayList(CartFoodimage))
        binding.cartrecylerview.layoutManager = LinearLayoutManager(requireContext())
        binding.cartrecylerview.adapter = adapter
        return binding.root
    }

    companion object {

    }
}