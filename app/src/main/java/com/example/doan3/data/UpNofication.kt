package com.example.doan3.data

data class UpNofication(
    val idNofication: String? = null,
    val idUserReceive: String? = null,
    val idUserSend: String? = null,
    val message: String? = null,
    val status: Boolean?=false,
    val type : String?=null,
    val dateCreate: MutableMap<String, String>? = null,
    val dateUpdate: MutableMap<String, String>? = null

)
