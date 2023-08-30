package com.example.tsazulusongbook

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.isTraversalGroup
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.traversalIndex
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
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
    LocalContext.current.applicationContext

    Surface(shadowElevation = 3.dp) {
        CenterAlignedTopAppBar(
            title = {
                Text(
                    text = group,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center,
                    color = Black
                )
            }, colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = White),
            navigationIcon = {
                val context = LocalContext.current
                IconButton(onClick = {
                    val intent = Intent(context, MainActivity::class.java)
                    context.startActivity(intent)
                }
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Menu", tint = Black
                    )
                }
            }
        )
    }
}


@Composable
fun DisplaySong(song: Song) {
    Column {
        //Song Group
        MyUI(song.group)

        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .background(White)
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.Start,
        ) {

            Row(
                modifier = Modifier
                    .padding(start = 20.dp, top = 20.dp, end = 20.dp),
            ) {
                Text(
                    fontSize = 26.sp,
                    text = "${song.number}", //"${song.group}",
                    color = Black,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Serif
                )

                Text(
                    text = song.title, //"${song.group}",
                    modifier = Modifier
                        .padding(start = 20.dp),
                    color = Black,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Serif
                )
            }

            Row(
                modifier = Modifier
                    .padding(20.dp),
            ) {
                Text(
                    text = "Tune: ",
                    modifier = Modifier
                        .padding(start = 40.dp),
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
                        modifier = Modifier
                            .padding(start = 40.dp, top = 20.dp, bottom = 20.dp),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Normal,
                        fontFamily = FontFamily.Serif
                    )
                }
                Row {
                    Text(
                        text = "${i + 1}. ", //"${song.group}",
                        color = Black,
                        modifier = Modifier
                            .padding(start = 40.dp, top = 20.dp),
                        fontWeight = FontWeight.Normal,
                        fontFamily = FontFamily.Serif
                    )
                    Text(
                        text = song.verses[i],
                        modifier = Modifier
                            .padding(start = 10.dp, top = 20.dp),
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

@Preview(showBackground = true)
@Composable
fun DisplaySongPreview() {
    TSAZuluSongBookTheme {
        DisplaySong(
            Song(
                "USINDISO-SALVATION\nICULO LOMQALI- THE FOUNDER'S SONG", 1,
                "Lwandle loSindiso, thand' olukhulu O,\n Boundless Salvation",
                listOf(
                    "My Jesus, I love thee, Cossar, 556.", " St Denio, 569,"
                ), "(E 256)", listOf(
                    "Lwandle loSindiso! thand' olukhulu\n" +
                            "Musa owehla noJesu phezulu:\n" +
                            "Uhlenga izwe, uphiwe ngesihle, \n" +
                            "Umpompozel' abantu, umpopozel' abantu Umpompozel' abantu, woz'ungihlanze.",
                    "Izono ziningi, zinamabala, \n" +
                            "Nezinyembezi zami ziyashisa; \n" +
                            "Kodwa akusizi luth' ukukhala, \n" +
                            "Woza, ungihlanze; woza, ungihlanze; \n" +
                            "Woza, ungihlanze; ungangihlanza.",
                    "Ngikulangazela Iwandle lomusa, \n" +
                            "Ogwini ngibhek' amanz' okuphila. \n" +
                            "Namhla ngifikile, bheka ngikhona, \n" +
                            "Angiyikubuya, angiyikubuya, \n" +
                            "Angiyikubuya, ngingakahlanzwa,",
                    "Ayahamb'amanzi, sengiyangena, \n" +
                            "Ngizwa uSomandla, wongisindisa. \n" +
                            "Manje ngiyakholwa, ngikhululwa nguye, Ngicwilil' emanzini, ngicwilil' emanzini, Ngicwilil' emanzini, sengihlanziwe."
                ), ""
            )
        )
    }
}