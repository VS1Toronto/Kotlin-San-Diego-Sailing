package com.core.data_02.api

import com.core.data_02.models.ProductList
import retrofit2.Call
import retrofit2.http.GET

/**
 *  This Interface defines our REST API
 *
 */
interface ProductAPI {
    @GET("/core_data/2_San_Diego_Sailing_Core/json/sailing_kotlin_menu_items.json")
    fun getProducts() : Call<ProductList>
}




