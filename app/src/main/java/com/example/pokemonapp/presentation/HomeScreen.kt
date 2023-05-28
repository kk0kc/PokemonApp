package com.example.pokemonapp.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.pokedex.R

import com.example.pokemonapp.domain.dtos.pokemonList.PokedexListEntry
import com.example.pokemonapp.navigation.Screen
import com.example.pokemonapp.ui.theme.bold

@Composable
fun HomeScreen(navController: NavHostController) {
    val viewModel = hiltViewModel<HomeScreenViewModel>()
    Surface(
        modifier = Modifier
            .fillMaxSize(),

        color = MaterialTheme.colors.background
    ) {
        var hideKeyboard by remember { mutableStateOf(false) }
        Column(
            modifier = Modifier.clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null,
            ) { hideKeyboard = true },
        ) {
            Spacer(modifier = Modifier.height(16.dp))
            Image(
                painter = painterResource(id = R.drawable.ic_international_pok_mon_logo),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .align(CenterHorizontally)
            )
            PokemonList(navController)
        }

    }
}


@Composable
fun PokemonList(
    navController: NavHostController,
    viewModel: HomeScreenViewModel = hiltViewModel(),
) {
    var data = viewModel.pokemonList
    val endReached = viewModel.endReached
    val loadError = viewModel.loadError
    val isLoading = viewModel.isLoading

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(16.dp)
    ) {
        val itemCount = data.size
        items(itemCount) { index ->
            PokemonItem(entry = data[index], navController = navController)
            if (index >= itemCount - 1 && !endReached && !isLoading) {
                viewModel.getPokemonList()
            }
        }
    }

    Box(
        contentAlignment = Center,
        modifier = Modifier.fillMaxSize()
    ) {
        if (isLoading) {
            CircularProgressIndicator(color = MaterialTheme.colors.primary)
        }
        if (loadError.isNotEmpty()) {
            RetrySection(error = loadError) {
                viewModel.getPokemonList()
            }
        }
    }

}

@Composable
fun RetrySection(
    error: String,
    onRetry: () -> Unit
) {
    Column {
        Text(error, color = Color.Red, fontSize = 18.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Button(
            onClick = { onRetry() },
            modifier = Modifier.align(CenterHorizontally)
        ) {
            Text(text = "Retry")
        }
    }
}

@Composable
fun PokemonItem(
    entry: PokedexListEntry,
    navController: NavHostController,
    viewModel: HomeScreenViewModel = hiltViewModel()
) {
    val defaultDominantColor = MaterialTheme.colors.background
    var dominantColor by remember { mutableStateOf(defaultDominantColor) }


    Card(
        elevation = 0.dp,
        backgroundColor = MaterialTheme.colors.background
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AsyncImage(
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(50.dp))
                    .aspectRatio(1f)
                    .background(dominantColor)
                    .clickable {
                        navController.navigate(
                            Screen.Detail.withArgs(
                                "${dominantColor.toArgb()}", entry.pokemonName
                            )
                        )
                    }
                    .padding(8.dp),
                model = ImageRequest.Builder(LocalContext.current)
                    .data(entry.imgUrl)
                    .crossfade(true)
                    .build(),
                contentDescription = null,
                onSuccess = { success ->
                    val drawable = success.result.drawable
                    viewModel.calculateDominateColor(drawable) { color ->
                        dominantColor = color
                    }
                }
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = entry.pokemonName,
                fontSize = 20.sp,
                fontFamily = bold,
                fontWeight = FontWeight.Light,
                letterSpacing = 1.sp,
                color = MaterialTheme.colors.secondary,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PokemonItemPreview() {
    PokemonItem(
        entry = PokedexListEntry("moo", "", 1),
        navController = rememberNavController()
    )
}

