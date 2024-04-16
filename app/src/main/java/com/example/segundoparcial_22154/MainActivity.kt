package com.example.segundoparcial_22154

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.segundoparcial_22154.models.Person
import com.example.segundoparcial_22154.models.Pokemon
import com.example.segundoparcial_22154.ui.theme.SegundoParcial_22154Theme
import com.example.segundoparcial_22154.viewmodels.PersonViewModel
import com.example.segundoparcial_22154.viewmodels.PokemonViewModel
import com.example.segundoparcial_22154.views.PersonCard
import com.example.segundoparcial_22154.views.PokemonCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SegundoParcial_22154Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainView()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainView(){
    val personviewmodel = PersonViewModel()


    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ){
        Column(){
            Row(modifier = Modifier.fillMaxSize()){
                Text(text = "¿Eres Chico o Chica?")
                Image(modifier = Modifier.size(50.dp).clip(CircleShape),
                    painter = painterResource(id = R.drawable.oak),
                    contentDescription = "Img"

                )
            }

        }
        Spacer(modifier = Modifier.width(16.dp))
        LazyColumn{

            items(personviewmodel.getPersonList()){person->
                PersonCard(person)
            }
        }

    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun SecondView(){
    val pokemonviewmodel = PokemonViewModel()
    Column(modifier = Modifier.fillMaxSize()) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TextField(
                    value = "nombre",
                    onValueChange = {},
                    leadingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.female01),
                            contentDescription = "Person"
                        )
                    },
                    label = { Text(text = "¿Cuál es tu nombre?") },
                    modifier = Modifier.fillMaxWidth()
                )
                LazyRow {
                    items(pokemonviewmodel.getPokemonList()) { pokemon ->
                        PokemonCard(pokemon)
                    }
                }
            }
        }
    }
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SegundoParcial_22154Theme {
        MainView()
    }
}