package com.example.tsazulusongbook.repo

import com.example.tsazulusongbook.model.Song

class SongRepository {
    private val songs = listOf(
        Song(
            "USINDISO-SALVATION\nICULO LOMQALI- THE FOUNDER'S SONG", 1,
            "Lwandle loSindiso, thand' olukhulu O,\n Boundless Salvation",
            listOf(
                "My Jesus, I love thee, Cossar, 556.", " St Denio, 569,"
            ), "(E 256)",
            listOf(
                "Lwandle loSindiso! thand' olukhulu\nMusa owehla noJesu phezulu:\nUhlenga izwe, uphiwe ngesihle, \n" +
                        "Umpompozel' abantu, umpopozel' abantu Umpompozel' abantu, woz'ungihlanze.",
                "Izono ziningi, zinamabala, \nNezinyembezi zami ziyashisa; \nKodwa akusizi luth' ukukhala, \n" +
                        "Woza, ungihlanze; woza, ungihlanze; \nWoza, ungihlanze; ungangihlanza.",
                "Ngikulangazela Iwandle lomusa, \nOgwini ngibhek' amanz' okuphila. \n" +
                        "Namhla ngifikile, bheka ngikhona, \nAngiyikubuya, angiyikubuya, \n" +
                        "Angiyikubuya, ngingakahlanzwa,",
                "Ayahamb'amanzi, sengiyangena, \nNgizwa uSomandla, wongisindisa. \n" +
                        "Manje ngiyakholwa, ngikhululwa nguye,\nNgicwilil' emanzini, ngicwilil' emanzini,\n" +
                        "Ngicwilil' emanzini, sengihlanziwe.",
                "Manje Haleluya! kuphila kwami\nKunikwe ukusebenzel' iNkosi,\nKwavel' ohlangothini lwayo ulwandle,\n" +
                        "Ulwandle lokuhlanza; ulwandle lokuhlanza,\nUlwandle lokuhlanza thina sonke.\n\n"
            ), ""
        ),

        Song(
            "USINDISO",
            2,
            "Owelapha inhliziyo\nThe Great Physician",
            listOf(
                "The Great Physician 357.\nDominus regit me, 353.\nI've found a friend, 359."
            ),
            "(E 67)",
            listOf(
                "Owelapha inhliziyo,\nUmile phambi kwethu\nIgama lakhe uJesu;\nYizwa ilizwi lakhe.",
                "Zono zingathethelelwa,\nYizwa izwi leNkosi;\nUngathol' ukusindiswa,\nUbuse ezulwini.",
                "Ubukhosi buy' fanele,\nImvana evukile;\nNgithanda igama layo;\nManje ngikholwa yiyo.",
                "Luphelile lonk' uvalo,\nSenginakh' ukuthula,\nSenginayo nenjabulo,\nNgenxa yaleligama.\n\n",
            ),
            "Gam' elihle eZulwini.\nGam' elihle emhlabeni.\nAlikh' igam' elidlula\nLeli elika Jesu."
        ),

        Song(
            "USINDISO",
            3,
            "Lihle! lihl' igama likaJesu\nThere is beauty in the Name of Jesus",
            listOf(
                "The name of names, 822"
            ),
            "(E 70)",
            listOf(
                "Lihle! lihl' igama likaJesu,\nLophakanyiswa njalo,\nLinenkazimulo ekhanyayo,\nEngasoze yaphela.",
                "Linokusindisa leligama,\nThembani lona lodwa,\nKothi nxa sesiphelelisiwe\nSihlale eZulwini!",
                "Linokududuza leligama,\nNxa sihlupheka lapha,\nNjengamazolo eswakamisa,\nuJesu' uyaphilisa.",
                "Liyajabulisa leligama,\nLiphakamisa bonke,\nNengcebo yonke yaseZulwini,\nSiyakuy' phiwa ngalo.\n\n",
            ),
            "Enhliziyweni yami ngiyadumisa.\nNgithaba ngicula kanye nezingelosi,\n" +
                    "UJesu ngimbabaza ngothando Iwakhe,\nLihle igama lakhe."
        ),

        Song(
            "USINDISO",
            4,
            "Kwafika ukukhanya\nA Light came out of Darkness",
            listOf(
                "Shall you shall I, 263.",
                "Ewing 249.",
                "A light came out of darkness, 244.",
                "Gospel bells, 253."
            ),
            "(E 94)",
            listOf(
                "Kwafika ukukhanya\nSasingenathemba.\nKwaze kwafik'uJesu\nWabangukukhanya.\nNxa ngifunda lendaba,\n" +
                        "Yokuphila kwakhe,\nNgiyafisa kakhulu,\nUkuhlala naye.",
                "Yek'isihawu sakhed\nEbiza ngothando\nEbiza ngokuncenga,\nKuzo zonk' izoni,\nWazibizela kuye,\nNgakho ngiyafisa\n" +
                        "Ukumfuza uJesu.\nNgihlangane naye.\nNgibheka ngokujula,\nKus' iSiphambano,\nKuyisimangaliso,\n" +
                        "Wazofela mina,",
                "Ngingamkhonza kanjani\nOyiNkosi yethu?\nMangimthande ngimkhonze,\nNgihlangane naye.\n\n"
            ),
            "Wena nami siya kuJesu na?\nNxa sifika eZulwini,\nSizocula nezingelosi,\nWena nami siya kuJesu na?"
        ),

        Song(
            "USINDISO",
            5,
            "",
            listOf(
                "Gospel bells, 253",
                "Meet me at the fountain, 440."
            ),
            "(E )",
            listOf(
                "Nake nayizwa lendaba\nYomntwana owazalwa,\nWakhonzwa yizingelosi,\nNabantu abangcwele?" +
                        "\nWafundis' izazimthetho\nKhona eThempelini\nYizwani-ke nginitshele,\nUkuthi usenjalo.",
                "Nake nayizwa lendaba\nYokuhamba olwandle,\nAbafundi bethukile\nNgamagagasi alo,\nUlwandle IwaseGalile,\n" +
                        "Lwathuliswa lwathi nya!;\nYizwani-ke nginitshele\nUkuthi usenjalo.",
                "Senike nezwa ngoJesu,\nEkhulek' ensimini\nKwabayisimangaliso\nWabethelwa emthini,\nWahlatshwa ngameva kabi,\n" +
                        "NgeSiphambano wafa,\nUkuze anisindise,\nNamanje usenjalo.\n\n",
            ),
            "Unjalo, unjalo,\nUJesu usenjalo."
        ),

        Song(
            "ULWAZI NOBUFAKAZI",
            79,
            "Ngasinda ngigeziwe ngegazi\n I am saved, blessedly saved by the Blood",
            listOf(
                " Blessedly saved, 622."
            ),
            "(E 321)",
            listOf(
                "Ngasinda ngigeziwe ngegazi\nNgigeziwe ngamandla egazi,\nNgihamba ngikhuluma ngoJesu manje,\nNgijabula ngomyalo wakhe",
                "Ngasinda ngathol' ukubusiswa,\nLapho kade ngangihlupheka,\nSengiphendukile kwafika uMoya,\nWangigeza zonke izono.",
                "Manje ngilwela uNkulunkulu,\nNgikuyo iMpi yoSindiso,\nNgomlalela noma ethi ngiye kuphi\nUkuze izoni zisinde.",
                "Ngiyalwa ngilibutho eMpini,\nNgilungele ukusebenza,\nNgitshele izoni ngolak' oluzayo,\nZigezwe ngegazi leWundlu.\n\n",
            ),
            "Ngasindiswa ngabusiswa,\nNgasindiswa ngegazi leWundlu,\nNgakhululwa nginoJesu\nNgasindiswa ngegazi leWundlu."
        ),

        Song(
            "ULWAZI NOBUFAKAZI",
            80,
            "Ngasinda, ngasinda\nI am saved, I am saved",
            listOf(
                "I am Saved, 595."
            ),
            "(E 322)",
            listOf(
                "Ngasinda, ngasinda,\nNgahlengwa ngu Jesu,\nNgathengwa ngenani\nMina lo uqobo..",
                "Uthando, uthando,\nNgithole isipho,\nNgikholwe yizwi,\nNgikholwa kuJesu.",
                "Ngagezwa ngegazi\nLangenza ngamhlophe,\nNgasinda ngamandla,\nNgiyakwazi lokho.",
                "Ngangingenamandla,\nNgawaphiwa nguye,\nNgingenakuthula\nNgakuphiwa nguye.\n\n",
            ),
            "Haleluya makabongwe.\nMakabongwe uMsindisi,\nMakabongwe Haleluya,\nMakabongwe njalo."
        ),

        Song(
            "ULWAZI NOBUFAKAZI", 81,
            "Msindisi ngingelunge\nI could not do without Thee",
            listOf(
                "Aurelia, 246", "Tutherford, 260", "Thou art a mighty", "298. Rutherford, 607. F"
            ), "(E 325)",
            listOf(
                "Msindisi ngingelunge\nNxa ungekho kimi,\nWangihlenga ngegazi,\nNgentengo enkulu.\n" +
                        "Ngomusa nokulunga,\nNgithemba igazi,\nElingangiduduza,\n,Injabulo yami.",
                "Msindisi ngingelunge\nNgeke ngime ngedwa,\nAnginawo amandla;\nNokuhlakanipha,\n" +
                        "Kodwa wena Msindisi,\nWazi konke ngami,\nWongenzela amandla\nNxa ngithemba kuwe.",
                "Msindisi ngingelunge\nAkakho omunye,\nOwazi inhliziyo,\nNezinswelo zayo.\n" +
                        "Akakho ongabona\nIsidingo sami,\nAze angiduduze,\nNguwe wedwa Nkosi.",
                "Msindisi ngingelunge\nNgoba nginovalo,\nNxa ngiwela umfula,\nNkosi, ube nami\n" +
                        "Uze ungangishiyi\nPhakathi komsinga,\nUbeseduze kwami,\nUngibambe njalo.\n\n"
            ), ""
        ),

        Song(
            "ULWAZI NOBUFAKAZI", 82,
            "Ngithanda ukucula nje\nI feel like singing all the time",
            listOf(
                " I feel like singing, 96.", "Around the throne, 72."
            ), "(E 326)",
            listOf(
                "Ngithanda ukucula nje,\nAnginalusizi,\nuJesu nguMhlobo wami,\nNgizomkhonza njalo.",
                "Wabasesiphambanweni,\nNgoba ngonile,\nKwabuhlungu,kodwa manje \nNgiyacula njalo.",
                "Nxa ngilingwa kabuhlungu,\nNgicula ngoJesu,\nNoma kufika usizi,\nNgimane ngicule.",
                "Indaba kaJesu yinhle\nNawe yidumise,\nNabanye bathole iculo,\nKuculwe njalo nje.",
                "Ezulwini kuyaculwa\nElinye ihubo,\nNami ng'yongena ngeneme\nNgicula njalo nje.\n\n"
            ), "Ngizocula njalo,\nUdumo kuSomandla."
        ),

        Song(
            "ULWAZI NOBUFAKAZI",
            83,
            "Ngabona ubuso bakhe\nI have seen His face in blessing",
            listOf(
                "Let the lower lights, 386.\nThe Vacant Chair, 449.\nMeet me at the fountain, 440.\nFace to Face, 370."
            ),
            "(E 330)",
            listOf(
                "Ngabona ubuso baKhe\nKade ngisosizini,\nNgasizwa ngesandla saKhe,\nLapho kade ngikhala.\n" +
                        "Ngase ngimbozwe ngamafu,\nNgingaboni indlela,\nKhona Kwafika uKhrestu,\nWazongikhanyisela.",
                "Ngalahleka wangithola,\nNgakhishwa ezonweni,\nNgilimele wangithoba,\nNgigula wangelapha,\nWapholisa amanxeba,\n" +
                        "Kwathi ngikhandlekile\nWangisekela ngamandla,\nNgavuswa ekufeni.\n\n"
            ),
            "Nginqobile izilingo,\nNgathola injabulo,\nNgohlala osindisweni,\nNgihlangene noJesu."
        ),

        Song(
            "ULWAZI NOBUFAKAZI",
            84,
            "Ngezw' uJesu ethi kimi\nI heard the voice of Jesus say",
            listOf(
                "St Matthew, 157.",
                "Vox Dilecti, 160.",
                "The voice of Jesus, 159.",
                "Ellacombe, 147."
            ),
            "(E 322)",
            listOf(
                "Ngezw' uJesu ethi kimi\n\"Woza uphumule!\nWen' odiniweyo ncika\nUphumule kimi\".",
                "Ngaya kuJesu nginjalo,\nNgidinwe ngiphansi;\nNgafuman' ukuphumula,\nKuy' uMthokozisi.",
                "Ngezw' uJesu ethi kimi,\n\"Ngiyawanika nje\nAmanz' okuphila thoba,\nUphuze, uphile\".",
                "Ngaya kuJesu ngaphuza\nKulawo amanzi,\nNgaphila ke kwaphela nya,\nKonk' ukoma kwami.",
                "Ngezw' uJesu ethi kimi,\n\"Ngiwukukhanya kwezwe,\nNxa nawe ubheka kimi,\nKosa uz' ubone.\"",
                "Ngambheka ke ngamfumana,\nElilanga lami,\nImihla yam' yophelela\nYonk'ekukhanyeni.\n\n"
            ),
            "Ilizw' elinothando\nLizwakal' endlebeni;\nUyahlahlameliswa\nLow' okhonz'uMsindisi."
        ),

        Song(
            "AWOKUNGCWABA", 275,
            "Ngisesandleni sakhel\nSafe in the arms of Jesus",
            listOf(
                "Safe in the arms of Jesus, 261."
            ), "(E 889)",
            listOf(
                "Ngisesandleni sakhe,\nOngumgcini wami,\nUsaphumula kuye,\nUmphefumlo wami.\n" +
                        "nNgeke ngithintwe lutho,\nNgigcinwe esandleni,\nAngisenal' uvalo; Angisenal' usizi.",
                "Ngisenqabeni mina,\nNgimi edwaleni.\nuJesu ngiyamthemba,\nWangifel' emthini;\n" +
                        "Mangihlaliswe khona,\nNgize ngiphumule,\nLize liphum' ilanga\nElingayikushona.",
                "Ngisez' ngalweni zakhe,\nNgiphumula khona,\nNgisithw' uthando Iwakhe,\nKusemnandi kimi,\n" +
                        "Yizwa ilizw' elihle, Kungathi iculo,\nLivel' ebukhosini, Ekhaya lothando.\n" +
                        "\n",
            ), "Ngisesandleni sakhe,\nNasesifubeni,\nNgizwa uthando Iwakhe\nYek' ukuphumula!"
        )
    )

    fun getAllData(): List<Song> {
        return songs
    }

    fun getSong(songNumber: Int): Song {
        return songs.single { it.number == songNumber }
    }

    fun getSongsInGroup(songGroup: String): List<Song> {
        return songs.filter { song -> song.group.contains(songGroup) }
    }
}