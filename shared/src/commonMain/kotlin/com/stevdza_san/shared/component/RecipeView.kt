package com.stevdza_san.shared.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.skydoves.landscapist.ImageOptions
import com.skydoves.landscapist.coil3.CoilImage
import com.stevdza_san.shared.domain.Recipe

@Composable
fun RecipeView(
    recipe: Recipe,
    onClick: (Int) -> Unit
) {
    Column(
        modifier = Modifier
            .clip(RoundedCornerShape(size = 12.dp))
            .clickable { onClick(recipe.id) }
            .fillMaxWidth()
    ) {
        CoilImage(
            modifier = Modifier
                .clip(RoundedCornerShape(size = 12.dp))
                .height(150.dp)
                .fillMaxWidth(),
            imageModel = { recipe.image },
            imageOptions = ImageOptions(
                contentScale = ContentScale.Crop,
                alignment = Alignment.Center
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            modifier = Modifier.alpha(0.5f),
            text = recipe.category,
            fontSize = MaterialTheme.typography.bodySmall.fontSize
        )
        Text(
            text = recipe.title,
            fontSize = MaterialTheme.typography.titleLarge.fontSize,
            fontWeight = FontWeight.Bold,
            maxLines = 2
        )
        SuggestionChip(
            onClick = {},
            label = {
                Text(
                    text = "${recipe.preparationTime} mins",
                    fontSize = MaterialTheme.typography.bodySmall.fontSize
                )
            },
            shape = CircleShape
        )
    }
}