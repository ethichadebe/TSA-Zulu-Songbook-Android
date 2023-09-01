package com.example.tsazulusongbook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tsazulusongbook.model.TableOfContentsItem
import com.example.tsazulusongbook.repo.SongGroupRepository
import com.example.tsazulusongbook.ui.theme.TSAZuluSongBookTheme
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TSAZuluSongBookTheme {
                Navigation()
            }
        }
    }
}

@Composable
fun SplashScreen(navController: NavController) {
    LaunchedEffect(key1 = true) {
        delay(3000L)
        navController.navigate("main_screen")
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.blue)),
        contentAlignment = Alignment.Center
    ) {
        Card(
            border = BorderStroke(5.dp, colorResource(R.color.gold)),
            shape = RoundedCornerShape(0), // = 50% percent,
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            colors = CardDefaults.cardColors(containerColor = colorResource(R.color.blue))
        ) {
            Card(
                border = BorderStroke(5.dp, colorResource(R.color.gold)),
                shape = RoundedCornerShape(0), // = 50% percent,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp),
                colors = CardDefaults.cardColors(containerColor = colorResource(R.color.blue)),
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        fontSize = 24.sp,
                        text = "INCWADI\n" + "YAMACULO \n" + "EMPI YOSINDISO", //"${song.group}",
                        color = colorResource(R.color.gold),
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif
                    )

                    Image(
                        painter = painterResource(id = R.drawable.tsa_crest),
                        contentDescription = "Crest"
                    )

                    Text(
                        fontSize = 24.sp,
                        modifier = Modifier.padding(10.dp),
                        textAlign = TextAlign.Center,
                        text = "THE SONG BOOK OF\n" + "THE SALVATION ARMY", //"${song.group}",
                        color = colorResource(R.color.gold),
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif
                    )

                    Text(
                        fontSize = 24.sp,
                        text = "ISIZULU", //"${song.group}",
                        color = colorResource(R.color.gold),
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif
                    )
                }

            }
        }
    }
}

@Composable
fun TableOfContentsPage() {
    LazyColumn(
        modifier = Modifier
            .padding(6.dp),
    ) {
        val songGroupRepo = SongGroupRepository()
        item {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, top = 50.dp, end = 10.dp, bottom = 20.dp),
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                text = "ISIZULU\nAMACULO-SONGS", //"${song.group}",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Serif
            )
        }

        items(items = songGroupRepo.getSongGroup(1)) { songGroup ->
            TableOfContentsItem(songGroup)
        }

        item {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                text = "AMACULWANA-CHORUSESQUIU", //"${song.group}",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Serif
            )
        }

        items(items = songGroupRepo.getSongGroup(2)) { songGroup ->
            TableOfContentsItem(songGroup)
        }
    }
}


@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "splash_screen") {
        composable("splash_screen") {
            SplashScreen(navController)
        }
        composable("main_screen") {
            Column(
            ) {
                TableOfContentsPage()
            }
        }
    }
}