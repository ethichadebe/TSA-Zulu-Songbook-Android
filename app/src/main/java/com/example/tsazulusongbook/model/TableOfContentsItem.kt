package com.example.tsazulusongbook.model

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tsazulusongbook.repo.SongRepository
import com.example.tsazulusongbook.ui.theme.TSAZuluSongBookTheme

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun TableOfContentsItem(songGroup: SongGroup) {
    var showSongs by remember { mutableStateOf(false) }
    Column {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(start = 20.dp, end = 10.dp, bottom = 10.dp, top = 10.dp)
                .fillMaxWidth()
                .clickable(onClick = {
                    showSongs = !showSongs
                }),
        ) {
            Column {
                Text(
                    text = songGroup.zuluName,
                    color = Color.Black,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    fontFamily = FontFamily.Serif
                )
                Text(
                    text = songGroup.englishName, //"${song.group}",
                    color = Color.Black,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    fontFamily = FontFamily.Serif
                )
            }

            Text(
                text = "${songGroup.songsFrom}-${songGroup.songsTo}",
                color = Color.Black,
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = FontFamily.Serif
            )
        }
    }

    AnimatedVisibility(showSongs) {
        val songRepo = SongRepository()

        FlowColumn(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            songRepo.getSongsInGroup(songGroup.zuluName).forEach {
                SongItemTableOfContents(it)
            }
        }
    }
    Divider(
        color = Color.Blue, thickness = 1.dp, modifier = Modifier
            .padding(start = 30.dp, end = 30.dp, top = 10.dp, bottom = 10.dp)
    )
}


@Preview(showBackground = true)
@Composable
fun TableOfContentsItemPreview() {
    TSAZuluSongBookTheme {
        SongItemTableOfContents(
            Song(
                "USINDISO-SALVATION\nICULO LOMQALI- THE FOUNDER'S SONG", 1,
                "Lwandle loSindiso, thand' olukhulu O,\nBoundless Salvation",
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