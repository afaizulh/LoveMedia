package com.faizul.lovemedia.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class NewsResponse(

	@field:SerializedName("data")
	val data: DataNews,

	@field:SerializedName("success")
	val success: Boolean? = null,

//	@field:SerializedName("message")
//	val message: Any? = null
) : Parcelable

@Parcelize
data class DataNews(

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("link")
	val link: String? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("posts")
	val posts: List<PostsItem>,
) : Parcelable

@Parcelize
data class PostsItem(

	@field:SerializedName("thumbnail")
	val thumbnail: String? = null,

	@field:SerializedName("link")
	val link: String? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("pubDate")
	val pubDate: String? = null
) : Parcelable
