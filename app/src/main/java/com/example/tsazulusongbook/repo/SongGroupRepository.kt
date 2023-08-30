package com.example.tsazulusongbook.repo

import com.example.tsazulusongbook.model.SongGroup

class SongGroupRepository {
    private val songGroups = listOf(
        SongGroup(1, "USINDISO", "SALVATION", 1, 66),
        SongGroup(1, "ULWAZI NOBUFAKAZI", "EXPERIENCE AND TESTIMONY", 67, 102),
        SongGroup(1, "UKUDUMISA", "PRAISE", 103, 126),
        SongGroup(1, "UBUNGCWELE", "HOLINESS", 127, 166),
        SongGroup(1, "UMTHANDAZO", "PRAYER", 167, 176),
        SongGroup(1, "UKULWA", "WAR", 177, 194),
        SongGroup(1, "AKHULUMA NGEZULU", "HEAVEN", 207, 211),
        SongGroup(1, "AWOKUKHONZA EMAKHAYA", "FAMILY WORSHIP", 212, 226),
        SongGroup(1, "AWABASHA", "YOUNG PEOPLE", 227, 242),
        SongGroup(1, "AWESIVUNO", "HARVEST", 243, 244),
        SongGroup(1, "AWONYAKA OMUSHA", "NEW YEAR", 245, 245),
        SongGroup(1, "AWOKUVUKA KWENKOSI", "CHRISTMAS", 253, 264),
        SongGroup(1, "AWEMISHADO", "WEDDINGS", 265, 267),
        SongGroup(1, "AWOKWAMUKELA ABANTWANA", "DEDICATION OF CHILDREN", 268, 272),
        SongGroup(1, "AWOKUNGCWABA", "FUNERALS", 273, 276),
        SongGroup(1, "AWOKUVALELISA", "FAREWELLS", 277, 278),
        SongGroup(1, "AWEZIZWE ZONKE", "ALL NATIONS", 279, 284),
        SongGroup(1, "AWOKUVULWA KWEZAKHIWO\nEZINTSHA", "NEW BUILDINGS", 285, 287),
        SongGroup(2, "USINDISO NESIMEMO", "SALVATION & INVITATION", 1, 20),
        SongGroup(2, "UMTHANDAZO", "PRAYER", 21, 47),
        SongGroup(
            2,
            "UKUZINIKELA NOKUHLANZEKA\nNGOKUPHELELE",
            "CONSECRATION AND SANCTIFICATION",
            48, 59
        ),
        SongGroup(2, "UKUKHOLWA NOKWETHEMBA", "FAITH AND TRUST", 60, 65),
        SongGroup(2, "UKUDUMISA NOKUFAKAZA", "PRAISE AND TESTIMONY", 66, 90),
        SongGroup(2, "AKHULUMA NGEZULU", "HEAVEN", 91, 94),
        SongGroup(2, "UKULWA", "WAR", 95, 100),
        SongGroup(2, "ABASHA", "YOUNG PEOPLE", 101, 106),
    )

    fun getSongGroup(groupNum: Int): List<SongGroup> {
        return songGroups.filter { songGroup -> songGroup.groupNum == groupNum }
    }
}   