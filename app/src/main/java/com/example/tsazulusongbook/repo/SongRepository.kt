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
            "USINDISO", 2,
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
            "Nake nayizwa lendaba\nHave you ever heard the story",
            listOf(
                "Gospel bells, 253",
                "Meet me at the fountain, 440."
            ),
            "(E 96)",
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
            "USINDISO",
            6,
            "Nkosi wazi konke kithi\nOur suffering, Lord to Thee are known",
            listOf(
                "Boston, 13.", "Retreat, 41.", "Clements, 44."
            ),
            "(E )",
            listOf(
                "Nkosi wazi konke ngathi,\nWalingwa njengathi lapha,\nSingabakho usisize,\nWabethelwa ngenxa yethu.",
                "Walinyazwa ngenxa yethu,\nNgenxa yethu wabethelwa,\nNgokufa wasisindisa,\nNathi sesiyakuthanda.",
                "Awuhlangene nabantu?\nAwunawo umusa na?\nAwazi usizi lwethu?\nNgubani ongasizwela?",
                "Nkosi unawo umusa,\nNgeke wasishiya sodwa,\nUngaguqula ububi,\nWenze kube ngukulunga.",
                "Ukulunga kwakho ngeke\nKushiye abaswelayo,\nVela langa lokulunga,\nUsilethele impilo.\n\n",
            ),
            ""
        ),

        Song(
            "USINDISO",
            7,
            "Ngitshel' indab' endala\nTell me the old, old story",
            listOf(
                "Tell me the old, old story, 265.", "Hosanna, 255."
            ),
            "(E 98)",
            listOf(
                "Ngitshel' indab' endala\nEbeyifihliwe,\nNgoJesu nobukhosi,\nKanye nomusa wakhe,\nAkungitshelisise\n" +
                        "Kungathi ngiy'ngane,\nNgiphele amandla mina,\nNgimubi ngonile.",
                "Yilandisis' indaba\nNgize ngiyiqonde,\nIyangimangalisa,\nNgisize ngibambe,\nYiphinde futhi futhi,\n" +
                        "Ngoba ngiyakholwa,\nNjengamazolo'okusa\nAshesha ukoma.",
                "Ngitshel' indaba kahle,\nKhumbula ukuthi\nNginguye lowo moni,\nUJesu am'zela,\nPhinda, ngitshel' indaba,\n" +
                        "Uzongisiza ke,\nNxa ngehlelw' ubunzima,\nNgilingwa, ngihlushwa.",
                "Ngitshel' indaba leyo,\nLapha wesabayo,\nUkuthi okomhlaba,\nKubamb' inhliziyo,\nUngitshele ngemfuyo\n" +
                        "Ekhon' eZulwini,\nNgize ngidel' okunye,\nNgethab' eNkosini.\n\n",
            ),
            "Ngitshel' indab' endala (3)\nNgoJesu nothando."
        ),

        Song(
            "USINDISO",
            8,
            "Hawu! Nkosi wangifela\nAlas! And did my Saviour bleed",
            listOf(
                "Remember me, 122.", "Irish, 99."
            ),
            "(E 105)",
            listOf(
                "Hawu! Nkosi wangifela,\nWafa uMsindisi,\nWabethelwa ngenxa yami,\nMina bengiyini.",
                "Ngenxa yami engonile,\nWahlushwa emthini.\nYeka umusa ongaka!\nUthando lukhulu.",
                "Ilanga lasithibala,\nLapho ubethelwa,\nWena Khrestu Nkosi yami\nWafa ngenxa yami.",
                "Angikwazi ukukhokha,\nLolo thando Iwakho,\nManje ngiyazinikela,\nNgingenza lokho nje.\n\n",
            ),
            "Ngikhumbule, ngikhumbule\nNkosi, ngikhumbule\nEmbusweni waphezulu,\nUz' ungikhumbule. "
        ),

        Song(
            "USINDISO",
            9,
            "Uyadlula na?\nAll ye that pass by",
            listOf(
                "Harwich New, 532"
            ),
            "(E )",
            listOf(
                "Uyadlula na?\nNcika kuJesu!\nUthini ngokufa koMsindisi?\nNguye uMhlengi,\nWoza ubone,\nKakho okuhawukela njengaye.",
                "Wazonihlenga,\nEngenasono, Wahlawulela amacala enu\nNingafumana\nUkuphunyuzwa\nKowanicelela intethelelo.",
                "Ngawe nangami,\nWakhuleka bo!,\nKwamukeleka lokho ngenxa yezoni,\nYimi isoni\nNgithemba uJesu\nNgiza ngaye ekuthethelelweni.",
                "Ngithethelelwe,\nNgoba ngiyisoni,\nIsoni esesikholwa kuJesu\nNgenxa yomusa\nSengingowakhe\nO! Baba uyazi ukuthi wangifela.\n\n",
            ),
            ""
        ),

        Song(
            "USINDISO",
            10,
            "Vuka moya wami\nArise my soul arise",
            listOf(
                "St John, 228.", "Hollingsworth, 224.", "Darswells, 221"
            ),
            "(E 106)",
            listOf(
                "Vuka moya wami\nPhaphama kusile,\nNanku umhlatshelo\nOwenzelwe mina Phambi kwesihlalo sakhe,\nIgama lami lalotshwa.",
                "Wayese Zulwini\nEnxusela mina,\nLukhulu uthando\nLokuhlenga thina,\nSathengwa ngegazi lakhe\nNgalesihlalo somusa.",
                "Kopha amanxeba\nAmahlanu kuye,\nEngikhulekela,\nEnxusa kakhulu:\n\"Baba, Ubathethelele\nAbazi abakwenzayo.\"",
                "Uyise wayizwa,\nIndodana yakhe,\nAkanakuziba\nOngumntwana wakhe\nSeyabuya impendulo,\nNgingumntwana kaJehova.",
                "Sewangibuyisa\nSengathethelelwa,\nNgingumntwana wakhe,\nAngesabi lutho,\nNgiza kuye ngimethemba,\nNgithi kuye: \"Abba! Baba.\"\n\n",
            ),
            ""
        ),

        Song(
            "USINDISO",
            11,
            "uJesu wehla washiya konke\nBehold the Lamb",
            listOf(
                "What's the News, 337.", "Behold the Lamb, 330.", "We're traveling home, 336."
            ),
            "(E )",
            listOf(
                "UJesu wehla washiya konke\nUkusifel' esiphambanwen;\nWafel' umhlaba, wafela nawe,\n'Siphambanweni, siphambanwen'.\n" +
                        "Bamhlupha kabi, sebemmukula,\nBamthwesa ngomqhele wameva\nLacishw' ilanga kwavul' umhlaba,\nNgasemthini, ngasemthini.",
                "Wathweswa ngazo izono zethu,\n'Siphambanweni, 'siphambanwen'.\nWafela bonke, wahleng' abantu\n'Siphambanweni, 'siphambanwen'.\n" +
                        "Zinyawo zakhe kanye nezandla\nZahlatshwa ngaz' izipikili,\nKwaphum' umthombo ohlangothini,\n'Siphambanweni, 'siphambanwen'.",
                "Umthombo lowo usampompoza, 'Siphambanweni, 'siphambanwen' Umpompozela thina sonkana, 'Siphambanweni, 'siphambanwen'.\nIgazi lelo elachitheka,\n" +
                        "Selinamandl' ukusindisa,\nLaphalazela aboni bonke.\n'Siphambanweni, 'siphambanwen'.",
                "Aboni bonke mabeze kuye,\nSiphambanweni, 'siphambanwen'.\nBayokhululwa, bahlaleleni?\n'Siphambanweni, 'siphambanwen'.\n" +
                        "Bohlambuluka, bahlaleleni?\nKuyisikhathi sokusinda,\nWe! moni vuka uvum' izono\n'Siphambanweni, 'Siphambanweni'.\n\n",
            ),
            ""
        ),

        Song(
            "USINDISO",
            12,
            "Akenibheke emthini\nBehold Him now on yonder tree",
            listOf(
                "He wipes the tear, 63","Sweet hour of prayer, 66."
            ),
            "(E 108)",
            listOf(
                "Akenibheke emthini,\nOyiNkosi yokuthula,\nWenze siphosiso sini,\nAze ajeziswe kanje?\nAbethelwe nabaphangi,\nBenamacala amabi,\n" +
                        "Pho, uJesu woneni na?\nEyinkosi engcwele nje? ",
                "Moni kwaba ngenxa yethu,\nUJesu wazohlupheka,\nBheka efela emthini,\nEsegobisa ikhanda,\nEngenasono yena, cha,\nKodwa wasihlawulela,\n" +
                        "Igazi lakhe lachithwa,\nEthweswa izono zethu.",
                "O! Msindisi ungithathe,\nAngisehlukani nawe,\nNgishiya konke okubi,\nNgizinikela kuwena,\nNgidonswa wuthando lwakho,\nNgamukele Nkosi yami,\n" +
                        "Ngolalela nxa ngibizwa,\nNgikusebenzele njalo.\n\n",
            ),
            "Kwakungenxa yami nawe,\nuJesu wafa emthini,\nUkuze asikhulule,\nSithole intethelelo."
        ),

        Song(
            "USINDISO",
            13,
            "Umsindisi wezwe lonke\nBehold the Saviour of mankind",
            listOf(
                "Behold the Saviour, 75","Arnolds..., 71.","Martrydom, 113."
            ),
            "(E )",
            listOf(
                "uMsindisi wezwe lonke\nWafela emthini,\nYek' uthando olungaka\nAsifela ngalo.",
                "Wabethelwa kabuhlungu,\nIzwe lanyakaza\nNesihenqo se\nThempeli Naso sadabuka.",
                "Esenzile isihlengo,\nWagoba ikhanda,\nWanikela umphefumulo,\nEfela emthini.",
                "Wakwahlula konk'ukufa,\nWabuya wavuka, O!\nNkosi nami ngivume\nNgikuthande njalo.\n\n",
            ),
            ""
        ),

        Song(
            "USINDISO",
            14,
            "Kumnyama eGetsemane\nDark was the hour Gethsemane ",
            listOf(
                "Down in the garden, 84."
            ),
            "(E )",
            listOf(
                "Kumnyam' eGetsemane\nNgenxa yethu sonke,\nNgob'uJesu ekhuleka,\nKuye uSomandla.",
                "Osizini wabayedwa,\nNgenxa yethu sonke,\nWezwa ubuhlungu kabi,\nEjuluk' igazi.",
                "iNdodana kaJehova\nYalal' ethuneni,\nYamemeza yathi: \"Baba,\nNgenzi' ntando yakho.\"",
                "Ngezwa engikhulekela\nUzongamukela,\nJesu sus' izono zami\nNgiyakholwa kuwe.",
                "Ngingekhohlwe lelo gazi,\nElachithekayo,\nLiyahlambulula futhi\nLitholwa ngesihle.\n\n",
            ),
            "Esensimini,\nWasikhalela,\nuMsindisi ekhuleka,\nLapho kwakumakhaza."
        ),

        Song(
            "USINDISO",
            15,
            "Bayehe Jesu Msindisi Hail,\nThou once despised Jesus",
            listOf(
                "Bethany, 429.","Hyfrydol, 438."
            ),
            "(E )",
            listOf(
                "Bayethe, Jesu Msindisi,\nNkosi yaseGalile,\nWena wazosikhulula\nWasipha usindiso,\n" +
                        "Bayede, Msindisi wezweni\nWathwal' izono zethu,\nSisizwa ngomusa wakho\nUsiphile impilo.",
                "iWundlu likaJehova\nLazithwala izono,\nNgothando olunamandla,\nSonke sesingahlengwa,\n" +
                        "Abantu bathethelelwe,\nNgegazi likaJesus\nOwavula amasango,\nSingene eZulwini.",
                "Udumo nokuhlonishwa Nkosi, kukufanele,\nSikubonge singaphezi\nNgoba sikufanele,\n" +
                        "Sihlangane nez'ngilosi,\nSidumise uJesu\nuNkulunkulu onathi,\nSibone oyiNkosi.\n\n",
            ),
            ""
        ),

        Song(
            "USINDISO",
            16,
            "Wathint' umphetho wengubo yakhe,\nShe only touched the hem",
            listOf(
                "O touch the hem, 759."
            ),
            "(E )",
            listOf(
                "Wathint' umphetho wengubo yakhe,\nEvela ngemuva,\nEsesixukwini esikhulu,\nMasisha waphila.",
                "Weza phambi kwakhe enovalo\nEbona uJesu,\nWazi amandla avela kuye,\nWaphila ngempela.",
                "uJesu wathi: \"Ndodakazi,\nUphile ngokholo.\"\nOwesifazane wajabula,\nNgenxa yokukholwa.\n\n",
            ),
            "Thinta ingubo kaJesu,\nNawe uzophila,\nWophiliswa ngamandl' akhe,\nUzalwe kabusha."
        ),

        Song(
            "USINDISO",
            17,
            "Jes' igazi nokulunga\nJesus Thy Blood and Righteousness",
            listOf(
                "Deep Harmony, 16.","Arizona, 7."
            ),
            "(E 116)",
            listOf(
                "Jes' igazi nokulunga\nKwakho kimi kuyingubo,\nNxa ngilingwa ngikwambathe\nNgizohamba ngenjabulo.",
                "Ngizokuma ngesibindi,\nNgingenawo amahloni,\nNgokuba ngashiy' izono,\nNgakho angesabi lutho.",
                "Ngikholwa igazi lakho,\nEsihlalweni somusa,\nLiyasinxusela sonke,\nLachitheka ngenxa yethu.",
                "Nxa ngivuka ekufeni,\nNgifikile eZulwini,\nNgizocula njalo ngithi,\nJesu Nkosi wangifela.\n\n",
            ),
            ""
        ),

        Song(
            "USINDISO",
            18,
            "Indodana yeNkosi\nMan of sorrows! What a name",
            listOf(
                "Man of Sorrows! 731."
            ),
            "(E )",
            listOf(
                "iNdodana yeNkosi,\nNgumuntu wezinsizi,\nYasindisa izoni\nHaleluya nguMsindisi!",
                "Bayethwesa ihlazo,\nYangimela ngimubi,\nNgaxolelwa ngegazi,\nHaleluya nguMsindisi!",
                "Thina sasinezono,\nYona ingenacala,\nYasihlenga saphila,\nHaleluya nguMsindisi!",
                "Yabethelwa emthini,\nYathi \"sekufeziwe\"\nManje iseZulwini,\nHaleluya nguMsindisi!",
                "Uzobuya uJesu,\nAbayise ekhaya,\nBadumise kabusha,\nHaleluya nguMsindisi! \n\n",
            ),
            ""
        ),

        Song(
            "USINDISO",
            19,
            "Akulon' igazi lezilwane\nNot all the blood of beasts",
            listOf(
                "Dennis, 165.","No sorrow there, 173."
            ),
            "(E 120)",
            listOf(
                "Akulon igazi\nLezilwane nani,\nElisipha ukuthula,\nLigeze nezono.",
                "NguJesu kuphela\nOsusa izono,\nUngumhlatshelo omkhulu,\nWegazi elihle.",
                "Sengikholwa kuye\nOngithandileyo,\nNgizishiyile izono,\nNgazivuma kuye.",
                "Nkosi sengibona\nWazofela mina,\nUfa eSiphambanweni,\nUkuze ngisinde.",
                "Sijabule manje\nSesingasindiswa,\nSesidumisa imvana\nSihuba ngothando.\n\n",
            ),
            ""
        ),

        Song(
            "USINDISO",
            20,
            "Akenize nizombona\nO come and look a while on Him ",
            listOf(
                "Warrington, 56.","Hursley, 26."
            ),
            "(E 121)",
            listOf(
                "Akenize nizombona\nOwagwazwa ngenxa yethu\nHlanganani masikhale,\nJesu Nkosi wabethelwa.",
                "Eboshiwe ezandleni,\nNomlomo wakhe womile,\nNamehlo ayenosizi,\nJesu Nkosi, wabethelwa.",
                "Sinqaba ukumuzwa na?\nAsimlaleli oNgcwele?\nWathwala izono zethu,\nJesu Nkosi, wabethelwa.",
                "Ithemba yiSiphambano,\nKwavulwa ngaye umthombo,\nOngageza zonk'izono,\nJesu Nkosi, wabethelwa.",
                "Uthando lukaJehova,\nLwaboniswa ngobunzima,\nWanqoba ngalo uthando,\nJesu Nkosi wabethelwa.",
                "Inhliziyo enesihe\nAkakho ongemukelwe,\nInhliziyo emvumayo\nUJesu wohlala kuyo.\n\n",
            ),
            ""
        ),

        Song(
            "USINDISO",
            21,
            "Entaben' ekude\nOn a hill far away",
            listOf(
                "The old rugged Cross, 585."
            ),
            "(E 124)",
            listOf(
                "Entaben' ekude kwam' iSiphambano, Uphawu\nlokuhlupheka,\nNgisithanda sona ngoba uMsindisi\nWafa kuso ngenxa yezoni.",
                "Leso Siphambano sadelwa ngumhlaba,\nSiyamangalisa kimi.\nNgoba oyiNkosi washiy' ubukhosi\nWazongifela eKhalvari.",
                "Esiphambanweni ngoba neqiniso,\nNgithwale ihlazo laso,\nNgobizwa ekhaya lelo elikude,\nLapho ngobusa khona njalo.\n\n",
            ),
            "Ngobambelel' eSiphambanweni,\nNgize ngibeke phans' umthwalo,\nNgonamathel' impela kuso,\nNgize ngifumane umqhele."
        ),

        Song(
            "USINDISO",
            22,
            "eKhalvari wangifela\nOn Calvary's brow my Saviour died",
            listOf(
                "It was on the Cross, 28.","Calvary, 14.","On Calvary's brow, 39."
            ),
            "(E 125)",
            listOf(
                "Ekhalvari wangifela\nUmsindisi wabethelwa,\nOyiNkosi wabulawa,\nWangithenga ngosindiso.",
                "Kwahlw' emini kwabamnyama,\nuMsindisi engifela,\nNesihenqo se Thempeli\nSadabuka ngasindiswa. ",
                "O! Msindisi kwenzekile\nWangifela mina soni,\nWathweswa neSiphambano,\nWangifela eKhalvari.\n\n",
            ),
            "Igazi lakhe lachitheka,\nWafa eSiphambanweni,\nKodwa wavuka, usephila kimi,\nNginoxolo ngiyamthanda."
        ),

        Song(
            "USINDISO",
            23,
            "Emthini weKhalvari\nn the Cross of Calvary",
            listOf(
                "On the Cross of Calvary, 326.","Maidstone, 325."
            ),
            "(E 128)",
            listOf(
                "Emthini weKhalvari,\nUJesu wasifela;\nLachitheka igazi\n'Kusikhulula thina,\nNamhlanje lisihlanza\n" +
                        "Sibemhlophe! Ngaphakathi,\nUJesu wasifela.\nEmthini weKhalvari.",
                "Lwalukhulu uthando, Lwangiletha kuJesu;\nNgiyancengwa uthando,\nNgiyathela impela,\nJesu, ngizinikela,\n" +
                        "Umzimba nomphefumlo,\nNgenxa yami Jesu wafa\nKuso isiphambano.",
                "Ngamkele, ngingowakho,\nUngowami, Msindisi,\nWoza, uhlale njalo\nEnhliz❜yweni yam' Nkosi;\nMayihlanzwe, igcinwe,\n" +
                        "Imhlophe ngaphakathi,\nNgegazi elichithwe\nEmthini weKhalvari.\n\n",
            ),
            "eKhalvari, eKhalvari,\nUJesu wasifela.\nEmthini eKhalvari."
        ),

        Song(
            "USINDISO",
            24,
            "Kukhon' umthombo wegazi\nThere is a fountain filled with blood",
            listOf(
                "Fountain, 87.","Martrydom, 113."
            ),
            "(E 132)",
            listOf(
                "Kukhon' umthombo wegazi\nOvela kuJesu,\nNezon' ezigezwa\nkuwo Ziyakuhlanzeka.",
                "Umphangi owaf' emthini,\nWaphil' emthonjeni,\nNoma ngimubi ke nami,\nNgingahlanzwa ngawo.",
                "Selokhu ngathemb' uJesu\nNgipheth' indab'enhle\nNgiyobabaza iNkosi\nLapha ngize ngife.",
                "Nxa ngiselibeni lami\nUlimi lufile,\nNgohuba khon' eZulwini,\nNxa ngifikile le. ",
                "Amandla alelogazi\nAngeke aphela,\nSize sihlangane,\nNkosi, Nawe ekhaya le.\n\n",
            ),
            "Ngiyakholwa, ngiykholwa,\n'Jesu wangifela\nIgazi lakhe lachithwa,\nUkungikhulula."
        ),

        Song(
            "USINDISO",
            25,
            "Entabeni yeKhalvari\nThere is a green hill far away",
            listOf(
                "Behold the Saviour, 75.","Horsley, 95.","Lloyd, 107.","Sinner see yon light, 788.","Sawley, 132."
            ),
            "(E 133)",
            listOf(
                "Entabeni yeKhalvari,\nBon' isiphambano,\nUJesu wafela kuso\nEthweswa izono.",
                "Asinakho ukuqonda\nUbuhlungu bakhe,\nKanti nokho siyakholwa,\nWasifela sonke.",
                "Wafa ukusisindisa\nSize sibe ngcwele,\nIzulu libe yikhaya\nNgal' igazi lakhe.",
                "Nguye yedwa onamandla\nOkuhlanz' izono:\nIzulu wasivulela,\nSingangena kulo.\n\n",
            ),
            "Uthando analo;\nMasimthande nathi,\nSithembe-ke loluthando,\nSiyomkhonza futhi\n\n" +
                    "Uthando luka\nJesu Uthando\nluka Jesu,\nWabethelwa ngenxa yethu;\nUthando luka Jesu"
        ),

        Song(
            "USINDISO",
            26,
            "Nxa ngibhek' iSiphambano\nWhen I Survey the Wondrous Cross",
            listOf(
                "Rockingham, 43.","Silver Hill 48.","Rimington, 42.","Deep Harmony, 16.","Accrington, 3."
            ),
            "(E 136)",
            listOf(
                "Nxa ngibhek' iSiphambano,\nOwafa kus' uMsindisi,\nImfuyo yam' ayilutho,\nNginengw' ukuzindla kwami.",
                "Ngisize ngingaziqhenyi,\nKuphela ngokufa kwakho.\nIzint' ezazingi khangalu\nNgazidela ngexa yakho.",
                "Nxa ngibon' ubuso bakhe,\n'Zandla zakhe, nezinyawo;\nNgikhalisw' usizi Iwakhe,\nNgimangaliswa uthando.",
                "Uma nginguy' umninizo\nIzinto zonke zelizwe,\nZingenele ukumbonga;\nMin' uqobo ngob' owakhe.\n\n",
            ),
            "Jabula, singahlanzwa ngegazi,\nJabula, singahlanzwa ngegazi,\nJabula, singahlanzwa,\nJabula, singahlanzwa,\nNgegazi lika Jesu 'Nkosi."
        ),

        Song(
            "USINDISO",
            27,
            "Ukhathele, udiniwe\nArt thou weary, art thou languid",
            listOf(
                "Bullinger, 342.","Stephanos, 343"
            ),
            "(E 228)",
            listOf(
                "Ukhathele, udiniwe,\nUyahlushwa na?\nWoza kimi, ush'uJesu,\nPhumula.",
                "Ngingamazi kanjani na,\nUnal' uphawu?\nBheka izandla nohlangothi\nNez'nyawo.",
                "Unomqhele, wobukhosi,\nAwuthwele na?\nYebo, unomqhele, kodwa\nNameva.",
                "Uma ngimlandela lapha,\nNgizozuzani?\nUbunzima, nobuhlungu,\nNosizi.",
                "Nxa ngibambelela kuye\nNgotholani na?\nWothokoza, uphumule\nLaphaya.",
                "Nxa ngizama ukumkhonza,\nNgobusiswa na?\nOfakazi bonke basho\nWobusa.\n\n",
            ),
            ""
        ),

        Song(
            "USINDISO",
            28,
            "Masikhuleke kuJesu\nJesus comes; let all adore Him",
            listOf(
                "Ottawa. 462."
            ),
            "(E 159)",
            listOf(
                "Masikhuleke kuJesu,\nINkosi enomusa,\nMlungiseleni nendlela,\nNenze kubeyithafa,\nNasehlane nivule\nNihlelele iNkosi.",
                "UJesu uza nomvuzo,\nUsesandleni sakhe,\nuJehova unomusa,\nUvelile kithina\nSukumani nibonge,\nNibonge kuSomandla.",
                "UJesu uza ngamandla,\nUhamba yonk' indawo,\nWandisa umbuso wakhe,\nNakhona ekoneni,\nKojabula nehlane,\nLihlotshiswe ngobuhle.",
                "UJesu esefikile\nUgwadule lohluma,\nLumiliswa nguJehova,\nLuthele nezithelo,\nNamagatsha enabe\nEzindaweni zonke.",
                "Ujesu esefikile \nKovela nemifula, \nAyivule igobhoze,\nUkunisela bonke;\nNdawo zonke wofika\nAmis' uMbuso wakhe.\n\n",
            ),
            ""
        ),

        Song(
            "USINDISO",
            29,
            "Bheka ngimi ngasemnyango \nBehold Me standing at the door",
            listOf(
                "Behold me standing, 10","Calvary 14."
            ),
            "(E 229)",
            listOf(
                "Bheka ngimi ngasemnyango,\nYizwa uma nginggongqotha,\nVula wena inhliziyo,\nNgingene na? ngingene na?",
                "Bona ngahlatshwa ngameva,\nNgenxa yosindiso Iwakho,\nWena ohlushwa yizono,\nNgingene na? ngingene na?",
                "Angikuceli ngelize,\nKhumbula ngangihlupheka,\nNgafelo ukuhlenga wena,\nNgingene na? ngingene na?",
                "Nansi intokozo yakho,\nIvela le eZulwini;\nUkuthula nalo uthando,\nNgingene na? ngingene na?\n\n",
            ),
            "Bheka Ngimi Ngasemnyango\nWenhliziyo ngingqongqotha,\nWena ohlushwa yizono,\nNgingene na? ngingene na?"
        ),

        Song(
            "USINDISO",
            30,
            "Ungamukisi iNkosi\nO do no let Thy Lord depart",
            listOf(
                "Confidence, 15.","Why not tonight, 59.","Duke Street, 17."
            ),
            "(E 251)",
            listOf(
                "Ungamukisi iNkosi\nUzivalel' ukukhanya,\nNxa ufile ulahliwe,\nUngavuswa yisono na?",
                "Uzothol' eliny' ilanga,\nUbuy' ubenenhlanhla na?\nHlakanipha bamb' ithuba,\nUsafuna, sinda phela.",
                "Uphethw' uJesu ngomusa\nWen'usamala ngani na?\nUzithobe phambi kwakhe,\nUsafuna, sinda phela.",
                "Akalahli noyedwa qha!\nOfun' uk'hlangana naye\nKhetha manje usindiswe,\nUsafuna, sinda phela.\n\n",
            ),
            ""
        ),

        Song(
            "USINDISO",
            31,
            "Ungamnik' indaw uJesu?\nHave you any room for Jesus?",
            listOf(
                "Room for Jesus, 395.","Let the lower lights be burning, 386.","Bethany, 429. "
            ),
            "(E 241)",
            listOf(
                "Ungamnik' indaw uJesu?\nWathwal' izono zethu.\nUyacela ukungena\nWomvumel' angene na?",
                "Konk' okwakho kunendawo,\nKodw' uKhrest' obethelwe\nAngengene, kanandawo,\nEnhliziywen' ayifela!",
                "Ungamnik' uJes' ithuba,\nNxa ngomus' esabiza?\nYisikhath' esihle namhla\nFun' athule kusasa.",
                "Ungamnik uJesu manje\nIndawo nal' ithuba.\nFuna lithul' izwi lakhe,\nNawe ungasanaki.\n\n",
            ),
            "Uyacela ukungena\nEnhliz'yweni yakho nje.\nShesha ke ukumvulela\nYisho, \"Nkosi, ngena ke\"."
        ),

        Song(
            "USINDISO",
            32,
            "Umbonil' obethelwe?\nHave you seen the Crucified?",
            listOf(
                "There is a Happy Land, 235."
            ),
            "(E )",
            listOf(
                "Umbonil' obethelwe?\nUnothando!\nWafela bonk' abantu,\nNgal' uthando.\nEnomqhele wameva,\n" +
                        "Igazi lachitheka,\nEzosindisa bonke,\nNgal' uthando.",
                "Sewathethelelwa na?\nUnothando!\nIzulu ngelakho na?\nNal' uthando.\nAlusekho uvalo,\nLuphelile nosizi,\nWanqoba ngezwi lakhe,\nUnothando.",
                "Unakh'ukujabula?\nUnothando?\nUnakho ukuthula?\nUnothando!\nUsindiso lukhulu,\nLwalethwa kubo bonke\nNasemhlabeni wonke,\nNgal'uthando.",
                "Emagumbini wonke,\nNal' uthando!\nKubo abangakezwa,\nNal' uthando!\nAbawile kakhulu,\nuJesu wabafela,\nKubizwa izwe lonke,\nNal' uthando.\n\n",
            ),
            ""
        ),

        Song(
            "USINDISO",
            33,
            "We, nina enomileyo Ho,\nEvery one that thirsts",
            listOf(
                "Wareham, 55.","Morning Hymn, 35."
            ),
            "(E )",
            listOf(
                "We, nina enomileyo,\nNibizwa nguNkulunkulu,\nManithathe usindiso,\nNevangeli ngelesihle.",
                "",
                "",
                "",
                "\n\n",
            ),
            ""
        ),

        Song(
            "USINDISO",
            34,
            "",
            listOf(
                ""
            ),
            "(E )",
            listOf(
                "",
                "Kakh' omunye ongakusiza,\nNgumhlobo oshesha ezwe,\nUmthwalo wakho ungethulwa,\nUma ukhuleka kuJesu.",
                "Woza manje ungalibali,\nUyancengwa ngobubele,\nUngesabi ukuphoxeka,\nWoz' eSihlalweni soMusa.\n\n",
            ),
            ""
        ),

        Song(
            "USINDISO",
            35,
            "Injabulo nezibusiso\nJoy, Freedom, Peace",
            listOf(
                "Old folks at home, (D)"
            ),
            "(E )",
            listOf(
                "Injabulo nezibusiso\nKungokwakho,\nNxa unezono uzivume,\nBalekela KuJesu. ",
                "Injabulo edlula konke,\nUngay'thola\nUJes' ukupha ngaphezulu,\nUma ukholwa kuye.",
                "Uzokhululwa ezonweni,\nKobanjalo,\nNguJesu ongakukhulula\nUbenenkululeko.",
                "Umusa uza njengomfula,\nUza kuwe,\nIzinkathazo zophela nya,\nUma uncika kuye.\n\n",
            ),
            "Izwe ngeke lakusiza,\nNgeke wename,\nNguJesu yedwa osizayo,\nAqede lonk' usizi."
        ),

        Song(
            "USINDISO",
            36,
            "",
            listOf(
                ""
            ),
            "(E )",
            listOf(
                "",
                "",
                "",
                "",
                "\n\n",
            ),
            ""
        ),

        Song(
            "USINDISO",
            37,
            "Uyibangana kuye\nOnly a step to Jesus",
            listOf(
                "Only a step, 764."
            ),
            "(E 255)",
            listOf(
                "Uyibangana kuye,\nAwuzi ngani na?\nWoza uvum' izono,\nUdondelani na?",
                "Uyibangana kuye,\nKholwa bo! uphile,\nWoza uthethelelwe,\nJes' ukulindele.",
                "Uyibangana kuye\nUJesu' unomusa.\n'Mkhethe ke ngenhliziyo,\nUsenal' ithuba. ",
                "Uyibangana kuye,\nWoza, usho uthi,\n\"Ngenjabulo, Msindisi,\nNgiyazinikela\"\n\n",
            ),
            "Libangana, libangana\nWoza ke kuye.\nWoza uvum'izono,\nUthol' isibusiso.\nUngali cha! umusa,\nUnikwa ngesihle"
        ),

        Song(
            "USINDISO",
            38,
            "Phinda ngiculele njalo\nSing them over again to me",
            listOf(
                "Wonderful words of life, 867."
            ),
            "(E 258)",
            listOf(
                "Phinda ngiculele njalo,\nAmazw' okuphila;\nNgibone ubuhle bawo,\nAmazw' okuphila.\nAyamangalisa,\nAyangifundisa.",
                "UKhrestu ubapha bonke.\nAmazw' okuphila,\nMoni, yiza uyabizwa\nNgamazw' okuphila.\nAphiwa ngesihle\nAngawaphezulu.",
                "Alubizo loMsindisi,\nAmazw' okuphila,\nAletha intethelelo,\nAmazw' okuphila.\nNguJesu uMhlengi,\nUsindisa njalo.\n\n",
            ),
            "Lawamazwi anobuhle\nAyamangalisa"
        ),

        Song(
            "USINDISO",
            39,
            "Izigidi zem'phefumi'fo\nTen thousand souls",
            listOf(
                "Ten thousand souls, 158.","The judgement day, 138."
            ),
            "(E 266)",
            listOf(
                "Izigidi zem'phefum'lo,\nZingene ngomnyango,\nNoma sebebaningi nje,\nIsekhon' indawo.",
                "Kuyindawo yabo bonke,\nNawe futhi moni,\nuJesu wasivulela,\nNgokufa emthini.",
                "Nabonile kakhulu nje,\nUma bephenduka\nUJesu wobasindisa,\nNomphangi wasinda.",
                "Nabakhathazekile nje,\nBefun' injabulo,\nAbaziyo ukuthi nje,\nBosinda ngoJesu.",
                "Ngiyazi nami nginendlu,\n  Noma ngangimubi,\nNgomdumisa ngamahubo,\nNgoba ngasindiswa.\n\n",
            ),
            "Woza, woza masihambe,\nSiy' ekuphileni,\nSakuphiwa umqhele,\nUbuse phezulu."
        ),

        Song(
            "USINDISO",
            40,
            "Ngomusa uJesu uyakubiza\nSoftly and Tenderly",
            listOf(
                "Come home, 631."
            ),
            "(E 264)",
            listOf(
                "Ngomusa uJesu uyakubiza,\nUbiza wena nami,\nNgesihawu uJesu ulindele,\nUlinde wena nami.",
                "Sihlaleleni uJesu encenga,\nEncenga wena nami,\nAsimlaleli ngani ngalomusa,\nEsihawukela nje.",
                "Wethembisile ngothando analo,\nEnzela wena nami,\nNoma sonile wosithethelela,\nNxa sibuyela kuye.\n\n",
            ),
            "Woza kuye,\nWen' okhathele, woza,\nUbizwa nguJesu ngesihawu,\nWoza kuye we moni."
        ),

        Song(
            "USINDISO",
            41,
            "Obhekayo kuye owabethelwayo\nThere is life for a look at the Crucified",
            listOf(
                "Life for a look, 583."
            ),
            "(E 271)",
            listOf(
                "Obhekayo kuye owabethelwayo\nUzosindiswa masinyane;\nBheka, moni, kuye khona wosindiswa,\nBheka owabethelw' emthini.",
                "Kwaba ngenxa yethu athwale izono,\nKanti kwakuyizono zethu,\nKwakungani ophe igazi emthini?\nNxa engakhokhanga icala?",
                "Izinyembezi ngeke zikusize, cha,\nYigazi elingakuhlenga,\nKulowo owachitha igazi lakhe,\nLetha imithwalo yezono.",
                "Thatha-ke ngenjabulo, kuye uJesu\nUkuphila okuphakade,\nYazi ukuthi akudingeki ufe,\nNgoba uJesu usaphila.\n\n",
            ),
            ""
        ),

        Song(
            "USINDISO",
            42,
            "Ngubani ohamba noJesu\nWho'll be the next",
            listOf(
                "Who'll be the next, 859."
            ),
            "(E 278)",
            listOf(
                "Ngubani ohamba noJesu\nAthwale isiphambano?\nna yini olindeleyo\nOzokuthwesa umqhele?",
                "Ngubani olandel' uJesu\nWoza uzoguqa kuye,\nKoba ngubani ozakubeka\nUmthwalo wakhe kuJesu.",
                "Ngubani olandel' uJesu\nNgubani ozomdumisa?\nOzakumbonga ngenkululeko,\nMakadunyiswe uJesu",
                "Ngubani olandel' uJesu\nEmfuleni weJordane?\nKoba ngubani ozakuhlengwa\nAwelele ngaphesheya?\n\n",
            ),
            "Ngubani na, ngubani na?\nOzokumlandela uJesu na?\nUzokumlandela uJesu na?\nMlandele manje.",
        ),

        Song(
            "USINDISO",
            43,
            "Nobani ozwayo makamemeze\nWhosoever heareth, shout, shout the sound",
            listOf(
                "Whosoever heareth, 551.","Shout the sound, 550."
            ),
            "(E 279)",
            listOf(
                "Nobani ozwayo makamemeze!\nAqhube indaba yal' usindiso,\nKuwo wonk' umhlaba nakub 'abantu,\n\"Othandayo makeze!\"",
                "Nobani ozwayo makasheshise,\nUmnyang' uvuliwe, yilo ithuba,\nUJesu yindlela nal' iqiniso,\n\"Othandayo makeze!\"",
                "Nakubani nasi isethembiso,\nNakubani kuze kube phakade,\nNakubani impilo engapheli,\n\"Othandayo makeze!\"\n\n",
            ),
            "Yen' othandayo\nYen othandayo\nMakaqhub' izwi kuwo wonk' umhlaba,\nuBab' ubiza' abalahlekile,\n\"Othandayo makeze!\""
        ),

        Song(
            "USINDISO",
            44,
            "Wokhululwa sisuke isono?\nWould you be free",
            listOf(
                "Wonder working power, 868"
            ),
            "(E 281)",
            listOf(
                "Wokhululwa sisuke isono?\nKukhon' amandla egazini\nUyokwahlula konke okubi?\nAmandl' akhona ngegazi.",
                "Inhliziy' ibemhlophe kune qhwa?\nKukhon' amandla egazini,\nAmabala esono asuswe\nAgezwe ngalo igazi.",
                "Wokhonz' uJesu iNkosi yakho?\nKukhon' amandla egazini,\nWomdumisa imihla ngemihla\nAkhon' amandla egazini\n\n",
            ),
            "Linamandla amangalisayo\nIgazi leMvana,\nLinamandla asebenzayo\nLon' igazi leMvana",
        ),

        Song(
            "USINDISO",
            45,
            "Yimina na engathola injabulo kumsindisi?\nAnd can it be so that I should gain",
            listOf(
                "Sagina, 498.","Cardiff, 488.","Credo,490.","Saved by grace, 47."
            ),
            "(E 283)",
            listOf(
                "Yimina na engathola\nInjabulo kuMsindisi?\nOngifele kabuhlungu\nNgenxa yami abethelwe?\nIsimanga, ngenxa yami\nWena Nkosi wabethelwa.",
                "Washiy'ubukhosi bakho,\nWeza lapha ngaw' umusa,\nNgenxa yalo loluthando\nWafa ngenxa yami ngedwa..\nUnomusa omkhulu kimi;\nNkosi yami wangithola.",
                "Ngangiboshwe emoyeni\nNgibanjiwe ezonweni,\nNgaze ngakhululwa nguwe\nEmoyeni ngaphiliswa;\nIzibopho zagqatshulwa\nNgeza kuwe ngasindiswa.",
                "Ukulahlwa akusekh\nuJesu usengowami\nNgiphilile ngenxa yakhe\nNgimbathiswe ukulunga\nManje mina ngiphikelele\nUkuthol' umqhele wami.\n\n",
            ),
            ""
        ),

        Song(
            "USINDISO",
            46,
            "Njengokuba wazalwa\nBy Thy Birth and Thy Tears",
            listOf(
                "Rouseau, 314"
            ),
            "",
            listOf(
                "Njengokuba wazalwa\nNanjengobuntu bakho,\nNgesikhathi wanqoba,\nWamehlula umlingi\nJesu ngihawukele,\nNgisize ngingakafi",
                "Nkosi unobulele,\nWakhalela abantu\nNgezinyembezi zakho\nWakhalela nomuzi,\nJesu ngihawukele,\nNgisize ngingakafi",
                "Wawusebuhlungwini\nWakhulekela thina,\nNgesiphambano sakho\nWawenza umhlatshelo\nJesu ngihawukele\nNgisize ngingakafi.",
                "Wavuka ethuneni,\nNgamandla wasindisa,\nWenyukela phezulu\nSewusesihlalweni,\nJesu ngihawukele\nNgisize ngingakafi\n\n",
            ),
            ""
        ),

        Song(
            "USINDISO",
            47,
            "Jesu Nkosi ngiyakhala\nJesus my Lord, to Thee I Cry",
            listOf(
                "Take me as I am, 479.","Take all my sins away, 487"
            ),
            "(E 291)",
            listOf(
                "Jesu Nkosi ngiyakhala\nNxa ungangisizi ngofa\nWoza Mhlengi ngisindiswe,\nUngithathe nginje",
                "Ngingesizwe muntu\nlapha Wena wafa ngenxa yami\nNgenze ngifanele wena\nUngithathe nginje.",
                "Ngingezilungise mina\nNgizinikela kuwena\nNgenze ngifanele wena\nUngithathe nginje.",
                "Ngibheke Jesu ngikuwe\nNgenze njengoba ubona\nNgihlambulule ngilunge\nUngithathe nginje.\n\n",
            ),
            "Ungithathe nginje\nUngithathe nginje\nJesu Nkosi wangifela,\nUngithathe nginje"
        ),

        Song(
            "USINDISO",
            48,
            "Njengokuba nginje, Jesu\nJust as I am without one plea",
            listOf(
                "Just as Thou art, 474.","Wareham, 55.","Horsley, 95.","Beethoven, 9.","St Clements, 44.","Misericordia, 475."
            ),
            "(E 293)",
            listOf(
                "Njengokuba nginje, Jesu\nNgingenalutho, ngingenazwi;\nKodwa ngoba wangifela\nJesu Mvana, ngize kuwe.",
                "Njengokuba nginje,\nJesu Ngingenakuzisindisa\nSal' usungihlanza wena\nJesu Mvana, ngize kuwe.",
                "Njengokuba nginje, Jesu\nNginovalo ngiyesaba\nNgingenaso isibindi\nJesu Mvana, ngize kuwe.",
                "Njengokuba nginje, Jesu\nNgingaboni, ngihamba ze:\nNjengokuba ngidangele\nJesu Mvana, ngize kuwe.",
                "Njengokuba nginje, Jesu\nNgithembel' ezwini lakho\nHlambulula inhliziyo\nJesu Mvana, ngize kuwe.",
                "Njengokuba nginje, Jesu\nNgemukel' uthando Iwakho;\nNgithanda ngibe ngowakho'\nJesu Mvana, ngize kuwe.\n\n",
            ),
            ""
        ),

        Song(
            "USINDISO",
            49,
            "Nxa ubabusis' abanye\nLord, I hear showers of blessing",
            listOf(
                "Even me, 369,","Precious name, 394"
            ),
            "(E 295)",
            listOf(
                "Nxa ubabusis' abanye,\nMusa ukungidlula;\nInhliziyo yam' yomile,\nSeyomele umusa.",
                "Baba mus' ukungidlula,\nGez' umphefumlo wami,\nNgihawukele, Nkulunkulu\nSus' ubumnyama kimi.",
                "Nawe moya oyiNgcwele,\nOnamandla, nesihe,\nNgiyaphuphutheka; siza\nNgokungivul amehlo.",
                "Ngangozeliswa yizono,\nNgiphambukile njalo,\nInhliziyo yonakele.\nNkosi, mayilungiswe.",
                "Ithobise inhliziyo,\nIbengaphansi kwakho:\nNxa uwakhuphul' amafu,\nYehlis' imvula yakho.\n\n",
            ),
            "Nkosi yam' Nkosi yam'\nNgibusise, Nkosi yam'"
        ),

        Song(
            "USINDISO",
            50,
            "Mus' ukungidlula, Nkosi\nPass me not, o loving Saviour",
            listOf(
                "Pass me not, 347.","My humble cry, 346."
            ),
            "(E 301)",
            listOf(
                "Mus' ukungidlula, Nkosi\nNgikhala kuwe,\nNxa ubabusis abanye,\nUngangidluli",
                "",
                "",
                "",
                "\n\n",
            ),
            ""
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