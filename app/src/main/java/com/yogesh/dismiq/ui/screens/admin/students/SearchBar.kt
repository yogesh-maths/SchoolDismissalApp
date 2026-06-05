package com.yogesh.dismiq.ui.screens.admin.students

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun StudentSearchBar() {

    OutlinedTextField(

        value = "",

        onValueChange = {},

        modifier = Modifier.fillMaxWidth(),

        shape = RoundedCornerShape(20.dp),

        placeholder = {

            Text(
                text = "Search by name, class, roll no..."
            )
        },

        leadingIcon = {

            Icon(
                imageVector = Icons.Default.Search,

                contentDescription = null,

                tint = Color.Gray
            )
        },

        singleLine = true
    )
}