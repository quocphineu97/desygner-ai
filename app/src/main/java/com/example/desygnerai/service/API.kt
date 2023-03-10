package com.example.desygnerai.service

import com.example.desygnerai.chat.model.Message
import com.example.desygnerai.chat.model.Prompt
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST


interface API {
    @Headers("Content-Type: application/json", "Accept: */*")
    @POST("/generate_completion")
    fun createQuestion(@Body dataModal: Prompt): Call<Message>
}