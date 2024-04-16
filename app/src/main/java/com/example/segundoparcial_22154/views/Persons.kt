package com.example.segundoparcial_22154.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.segundoparcial_22154.R
import com.example.segundoparcial_22154.models.Person

@Composable
fun PersonCard(person: Person){
    Card(modifier = Modifier.padding(8.dp)){

        Row(modifier = Modifier.fillMaxWidth()){
            Image(
                modifier = Modifier
                    .height(150.dp)
                    .width(120.dp),
                painter = painterResource(id = person.image),
                contentDescription = "Student Image",
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(
                    text = person.profesion,
                    modifier = Modifier.padding(top = 8.dp),
                    color = Color(0xFF000000)
                )

                Text(
                    text = person.genero,
                    modifier = Modifier.padding(top = 8.dp),
                    color = Color(0xFF000000)
                )
                Text(
                    text = person.edad.toString() + "años",
                    modifier = Modifier.padding(top = 8.dp),
                    color = Color(0xFF000000)
                )

                //StudentDataView(student.console, student.price)


            }

        }
    }
}