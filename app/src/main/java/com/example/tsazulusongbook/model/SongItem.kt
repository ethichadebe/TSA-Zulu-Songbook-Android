package com.example.tsazulusongbook.model

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tsazulusongbook.ui.theme.TSAZuluSongBookTheme

@Composable
fun SongItem(song: Song) {
    Row(
        modifier = Modifier
            .background(androidx.compose.ui.graphics.Color.White)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        Column {
            //Song Group
            Text(

                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, top = 20.dp, end = 10.dp),
                fontSize = 14.sp,
                textAlign = TextAlign.Center,
                text = song.group, //"${song.group}",
                color = androidx.compose.ui.graphics.Color.Black,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Serif
            )

            Row(
                modifier = Modifier
                    .padding(start = 20.dp, top = 20.dp, end = 20.dp),
            ) {
                Text(
                    fontSize = 26.sp,
                    text = "${song.number}", //"${song.group}",
                    color = androidx.compose.ui.graphics.Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Serif
                )

                Text(
                    text = song.title, //"${song.group}",
                    modifier = Modifier
                        .padding(start = 20.dp),
                    color = androidx.compose.ui.graphics.Color.Black,
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
                    color = androidx.compose.ui.graphics.Color.Black,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif
                )
                Text(
                    text = song.bandTunes.joinToString(" "),
                    modifier = Modifier
                        .padding(start = 20.dp, end = 10.dp)
                        .width(200.dp),
                    color = androidx.compose.ui.graphics.Color.Black,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    fontFamily = FontFamily.Serif
                )
                Text(
                    text = song.englishSongNumber,
                    color = androidx.compose.ui.graphics.Color.Black,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif
                )
            }

            for (i in song.verses.indices) {
                if ((i == 1) && song.chorus.isNotEmpty()) {
                    Text(
                        text = song.chorus, //"${song.group}",
                        fontSize = 14.sp,
                        color = androidx.compose.ui.graphics.Color.Black,
                        modifier = Modifier
                            .padding(40.dp),
                        fontWeight = FontWeight.Normal,
                        fontFamily = FontFamily.Serif
                    )
                }
                Row {
                    Text(
                        text = "${i + 1}. ", //"${song.group}",
                        color = androidx.compose.ui.graphics.Color.Black,
                        modifier = Modifier
                            .padding(start = 40.dp, top = 20.dp),
                        fontWeight = FontWeight.Normal,
                        fontFamily = FontFamily.Serif
                    )

                    Text(
                        text = song.verses[i],
                        modifier = Modifier
                            .padding(start = 10.dp, top = 20.dp),
                        color = androidx.compose.ui.graphics.Color.Black,
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
fun GreetingPreview() {
    TSAZuluSongBookTheme {
        SongItem(
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
                ), "Ayahamb'amanzi, sengiyangena,\n" +
                        "Ngizwa uSomandla, wongisindisa.\n" +
                        "Manje ngiyakholwa, ngikhululwa nguye, Ngicwilil' emanzini, ngicwilil' emanzini, Ngicwilil' emanzini, sengihlanziwe."
            )
        )
    }
}