package com.example.dingdong2.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel
import com.example.dingdong2.Adapter.PopularAdapter
import com.example.dingdong2.R
import com.example.dingdong2.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding : FragmentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater , container ,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel(R.drawable.banner1, ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.banner2, ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.banner3, ScaleTypes.FIT))

        val imageSlider = binding.imageSlider
        imageSlider.setImageList(imageList, ScaleTypes.FIT)

        imageSlider.setItemClickListener(object : ItemClickListener{
            override fun doubleClick(position: Int) {
            }

            override fun onItemSelected(position: Int){
                val itemMessage = "Selected Image $position"
                Toast.makeText(requireContext(), itemMessage,Toast.LENGTH_SHORT).show()
            }
        })

        val foodName = listOf("Burger" , "Pizza" , "Chineese" , "Dosa" )
        val Prices = listOf("$5","$7","$8","$12")
        val Foodimages = listOf(R.drawable.menu1 , R.drawable.menu2 , R.drawable.menu3 , R.drawable.menu4  , R.drawable.menu5 , R.drawable.menu6 , R.drawable.menu7)
        val adapter = PopularAdapter(foodName , Prices , Foodimages)
        binding.popularitemlist.layoutManager = LinearLayoutManager(requireContext())
        binding.popularitemlist.adapter = adapter


    }

    companion object {

    }
}