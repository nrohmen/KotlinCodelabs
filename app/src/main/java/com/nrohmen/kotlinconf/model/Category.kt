package com.nrohmen.kotlinconf.model

data class Category(
	val id: Int? = null,
	val sort: Int? = null,
	val title: String? = null,
	val items: List<CategoryItem?>? = null
)
