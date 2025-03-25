package com.example.marsphotos.network

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * نموذج بيانات لصورة المريخ مع تغيير اسم المفتاح "imgSrc" إلى "img_src" عند التسلسل.
 */
@Serializable
data class MarsPhoto(val id: String, @SerialName(value = "img_src") val imgSrc: String)