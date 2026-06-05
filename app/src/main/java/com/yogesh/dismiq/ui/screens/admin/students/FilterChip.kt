package com.yogesh.dismiq.ui.screens.admin.students

import androidx.compose.material3.FilterChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun StudentFilterChip(
    title: String,
    selected: Boolean,
    onClick: () -> Unit
)
{

    FilterChip(
        selected = selected,
        onClick = onClick,
        label = {
            Text(text = title)
        }
    )
}