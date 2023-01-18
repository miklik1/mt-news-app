package com.example.newsapp

import java.util.*

object MockData {
    val topNewsList = listOf<NewsData>(
        NewsData(
            1,
            R.drawable.breaking_news,
            author = "Namita Singh",
            title = "Cleo Smith news — live: Kidnap suspect 'in hospital again' as 'hard police grind' credited for breakthrough - The Independent",
            description = "The suspected kidnapper of four-year-old Cleo Smith has been treated in hospital for a second time amid reports he was “attacked” while in custody.",
            publishedAt = "2021-11-04T04:42:40Z"
        )
    )

    fun getNews(newsId: Int?):NewsData {
        return topNewsList.first{it.id == newsId}
    }
}