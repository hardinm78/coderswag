package com.mikehardinapps.coderswag.Services

import com.mikehardinapps.coderswag.Model.Category
import com.mikehardinapps.coderswag.Model.Product

/**
 * Created by michaelhardin on 11/28/17.
 */
object DataService {

    val categories = listOf(
            Category("Shirts","shirtimage"),
            Category("Hoodies","hoodieimage"),
            Category("Hats","hatimage"),
            Category("Digital","digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie","$18","hat01"),
            Product("Devslopes Hat Black","$20","hat02"),
            Product("Devslopes Hat White","$20","hat03"),
            Product("Devslopes Hat Snapback","$18","hat04")

    )

    val hoodies = listOf(
            Product("Hoodie 1","$35","hoodie1"),
            Product("Hoodie 2","$38","hoodie2"),
            Product("Hoodie 3","$36","hoodie3"),
            Product("Hoodie 4","$37","hoodie4")
    )

    val shirts = listOf(
            Product("Shirt 1","$25","shirt1"),
            Product("Shirt 2","$27","shirt2"),
            Product("Shirt 3","$22","shirt3"),
            Product("Shirt 4","$28","shirt4")
    )
}