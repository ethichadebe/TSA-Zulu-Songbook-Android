package com.example.tsazulusongbook

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tsazulusongbook.model.Song
import com.example.tsazulusongbook.ui.theme.TSAZuluSongBookTheme

class SongActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TSAZuluSongBookTheme {
                DisplaySong(intent.getSerializableExtra("chosenSong") as Song)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyUI(group: String) {
    val context = LocalContext.current
    context.applicationContext

    Surface(shadowElevation = 3.dp) {
        CenterAlignedTopAppBar(title = {
            Text(
                text = group,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
                textAlign = TextAlign.Center,
                color = Black
            )
        },
            colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = White),
            navigationIcon = {
                IconButton(onClick = {
                    val intent = Intent(context, MainActivity::class.java)
                    intent.putExtra("backPressed", true)
                    context.startActivity(intent)
                }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Menu",
                        tint = Black
                    )
                }
            })
    }
}


@Composable
fun DisplaySong(song: Song) {
    Column(
        modifier = Modifier
            .background(White)
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.Start,
    ) {
        //Song Group
        MyUI(song.group)

        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.Start,
        ) {

            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 20.dp, top = 20.dp, end = 20.dp),
            ) {
                Text(
                    fontSize = 26.sp, text = "${song.number}", //"${song.group}",
                    color = Black, fontWeight = FontWeight.Bold, fontFamily = FontFamily.Serif
                )

                Text(
                    text = song.title, //"${song.group}",
                    modifier = Modifier.padding(start = 20.dp),
                    color = Black,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Serif
                )
            }

            Row(
                modifier = Modifier
                    .padding(20.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Text(
                    text = "Tune: ",
                    modifier = Modifier.padding(start = 40.dp),
                    color = Black,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif
                )
                Text(
                    text = song.bandTunes.joinToString(" "),
                    modifier = Modifier
                        .padding(start = 20.dp, end = 10.dp)
                        .width(200.dp),
                    color = Black,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    fontFamily = FontFamily.Serif
                )
                Text(
                    text = song.englishSongNumber,
                    color = Black,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif
                )
            }

            for (i in song.verses.indices) {
                if ((i == 1) && (song.chorus.isNotEmpty())) {
                    Text(
                        text = song.chorus, //"${song.group}",
                        color = Black,
                        modifier = Modifier.padding(start = 40.dp, top = 20.dp, bottom = 20.dp),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Normal,
                        fontFamily = FontFamily.Serif
                    )
                }
                Row {
                    Text(
                        text = "${i + 1}. ", //"${song.group}",
                        color = Black,
                        modifier = Modifier.padding(start = 40.dp, top = 20.dp),
                        fontWeight = FontWeight.Normal,
                        fontFamily = FontFamily.Serif
                    )
                    Text(
                        text = song.verses[i],
                        modifier = Modifier.padding(start = 10.dp, top = 20.dp),
                        color = Black,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Normal,
                        fontFamily = FontFamily.Serif
                    )
                }
            }
        }
    }
}