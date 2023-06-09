package com.chauret.api.request

import com.chauret.model.recipe.IngredientType
import kotlinx.serialization.Serializable

@Serializable
data class IngredientRequest(
    val name: String,
    val liked: Boolean = false,
    val type: IngredientType? = null,
    val image: ImageRequest? = null
)

@Serializable
data class BulkIngredientRequest(
    val ingredients: List<IngredientRequest>
)
