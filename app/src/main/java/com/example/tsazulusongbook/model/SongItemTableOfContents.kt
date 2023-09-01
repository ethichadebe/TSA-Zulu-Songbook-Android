package com.example.tsazulusongbook.model

import android.content.Intent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tsazulusongbook.SongActivity
import com.example.tsazulusongbook.ui.theme.TSAZuluSongBookTheme

@Composable
fun SongItemTableOfContents(song: Song) {
        val context = LocalContext.current
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(start = 30.dp)
            .fillMaxWidth()
            .padding(top = 15.dp)
            .clickable(onClick = {
                val intent = Intent(context, SongActivity::class.java)
                intent.putExtra("chosenSong", song)
                context.startActivity(intent)
            }),
    ) {
        Text(
            text = song.title,
            color = Color.Black,
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = FontFamily.Serif
        )
        Text(
            text = song.number.toString(), //"${song.group}",
            color = Color.Black,
            fontSize = 12.sp,
            modifier = Modifier
                .padding(start = 10.dp, end = 20.dp),
            fontWeight = FontWeight.Normal,
            fontFamily = FontFamily.Serif,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SongPreview() {
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