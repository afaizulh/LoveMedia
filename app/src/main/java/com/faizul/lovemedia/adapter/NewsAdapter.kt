package com.faizul.lovemedia.adapter

import android.content.Intent
import android.icu.text.SimpleDateFormat
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.faizul.lovemedia.R
import com.faizul.lovemedia.data.model.PostsItem
import com.faizul.lovemedia.databinding.ItemBeritaBinding
import com.faizul.lovemedia.ui.detail.DetailActivity
import com.squareup.picasso.Picasso
import java.util.Locale

class NewsAdapter: RecyclerView.Adapter<NewsAdapter.MyViewHolder>() {
    private val listNews = ArrayList<PostsItem>()

    fun setData(list: List<PostsItem>){
        listNews.clear()
        if (list != null) {
            listNews.addAll(list)
        }
        notifyItemRangeChanged(0, listNews.size)
    }

    class MyViewHolder(val binding: ItemBeritaBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ItemBeritaBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int = listNews.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val dataNews = listNews[position]

        val dateTimeString = dataNews.pubDate
        val dateTimeFormat = SimpleDateFormat("yyyy-mm-hh'T'HH:mm:ss.SSS'Z'", Locale.getDefault())
        val date = dateTimeFormat.parse(dateTimeString)
        val myDateFormat = SimpleDateFormat("EEE, dd MMMM | HH:mm", Locale.getDefault())

        val myDate = myDateFormat.format(date!!)

        holder.binding.apply {
            tvTitle.text = dataNews.title
            tvDate.text = myDate

            Picasso.get()
                .load(dataNews.thumbnail)
                .fit()
                .centerInside()
                .placeholder(R.drawable.ic_news_load)
                .into(imgNews)
        }

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)
            intent.putExtra(DetailActivity.DATA_NEWS, dataNews)
            intent.putExtra(DetailActivity.DATE_NEWS, myDate)

            holder.itemView.context.startActivity(intent)
        }
    }
}