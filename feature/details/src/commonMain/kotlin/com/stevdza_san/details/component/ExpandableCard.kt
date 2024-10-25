package com.stevdza_san.details.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.unit.dp

@Composable
fun ExpandableCard(
    expanded: Boolean,
    title: String,
    description: String,
    onClick: () -> Unit
) {
    val rotateAnimation by animateFloatAsState(
        targetValue = if (expanded) 45f else 0f
    )
    Column(
        modifier = Modifier
            .clip(RoundedCornerShape(size = 12.dp))
            .background(MaterialTheme.colorScheme.surfaceColorAtElevation(2.dp))
            .clickable { onClick() }
            .fillMaxWidth()
            .padding(
                vertical = 6.dp,
                horizontal = 24.dp
            )
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = title,
                fontSize = MaterialTheme.typography.titleMedium.fontSize
            )
            IconButton(
                modifier = Modifier.rotate(degrees = rotateAnimation),
                onClick = onClick
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add icon"
                )
            }
        }
        AnimatedVisibility(visible = expanded) {
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = description)
        }
    }
}