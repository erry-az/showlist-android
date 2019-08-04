package com.eaz.myshowlist.utils

import com.eaz.myshowlist.R
import com.eaz.myshowlist.vo.Show
import com.eaz.myshowlist.vo.ShowType

class FakeDummy {
    companion object {
        fun generateDummyShow() : List<Show> {
            return listOf(
                Show(0,
                    "Avengers: Infinity War",
                    "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                    4.2,
                    ShowType.MOVIE,
                    "April 27, 2018",
                    R.drawable.movie_aiw
                ),
                Show(1,
                    "Bohemian Rhapsody",
                    "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                    4.1,
                    ShowType.MOVIE,
                    "November 2, 2018",
                    R.drawable.movie_br

                ),
                Show(2,
                    "Spider-Man: Into the Spider-Verse",
                    "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
                    4.2,
                    ShowType.MOVIE,
                    "December 14, 2018",
                    R.drawable.movie_sm
                ),
                Show(3,
                    "Black Panther",
                    "King T'Challa returns home from America to the reclusive, technologically advanced African nation of Wakanda to serve as his country's new leader. However, T'Challa soon finds that he is challenged for the throne by factions within his own country as well as without. Using powers reserved to Wakandan kings, T'Challa assumes the Black Panther mantel to join with girlfriend Nakia, the queen-mother, his princess-kid sister, members of the Dora Milaje (the Wakandan 'special forces') and an American secret agent, to prevent Wakanda from being dragged into a world war.",
                    3.7,
                    ShowType.MOVIE,
                    "February 16, 2018",
                    R.drawable.movie_bp
                ),
                Show(4,
                    "Bumblebee",
                    "On the run in the year 1987, Bumblebee finds refuge in a junkyard in a small Californian beach town. Charlie, on the cusp of turning 18 and trying to find her place in the world, discovers Bumblebee, battle-scarred and broken. When Charlie revives him, she quickly learns this is no ordinary yellow VW bug.",
                    3.2,
                    ShowType.MOVIE,
                    "December 21, 2018",
                    R.drawable.movie_bumblebee
                ),
                Show(5,
                    "Ant-Man and the Wasp",
                    "Just when his time under house arrest is about to end, Scott Lang once again puts his freedom at risk to help Hope van Dyne and Dr. Hank Pym dive into the quantum realm and try to accomplish, against time and any chance of success, a very dangerous rescue mission.",
                    3.5,
                    ShowType.MOVIE,
                    "July 6, 2018",
                    R.drawable.movie_anw
                ),
                Show(6,
                    "Ralph Breaks the Internet",
                    "Video game bad guy Ralph and fellow misfit Vanellope von Schweetz must risk it all by traveling to the World Wide Web in search of a replacement part to save Vanellope's video game, \"Sugar Rush.\" In way over their heads, Ralph and Vanellope rely on the citizens of the internet -- the netizens -- to help navigate their way, including an entrepreneur named Yesss, who is the head algorithm and the heart and soul of trend-making site BuzzzTube.",
                    3.6,
                    ShowType.MOVIE,
                    "November 21, 2018",
                    R.drawable.movie_rbti
                ),
                Show(7,
                    "Solo: A Star Wars Story",
                    "Through a series of daring escapades deep within a dark and dangerous criminal underworld, Han Solo meets his mighty future copilot Chewbacca and encounters the notorious gambler Lando Calrissian.",
                    3.3,
                    ShowType.MOVIE,
                    "May 25, 2018",
                    R.drawable.movie_ssw
                ),
                Show(8,
                    "Venom",
                    "Investigative journalist Eddie Brock attempts a comeback following a scandal, but accidentally becomes the host of Venom, a violent, super powerful alien symbiote. Soon, he must rely on his newfound powers to protect the world from a shadowy organization looking for a symbiote of their own.",
                    3.3,
                    ShowType.MOVIE,
                    "October 5, 2018",
                    R.drawable.movie_venom
                ),
                Show(9,
                    "Fantastic Beasts: The Crimes of Grindelwald",
                    "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.\n",
                    3.45,
                    ShowType.MOVIE,
                    "November 16, 2018",
                    R.drawable.movie_fbg
                ),
                Show(10,
                    "Breaking Bad",
                    "When Walter White, a New Mexico chemistry teacher, is diagnosed with Stage III cancer and given a prognosis of only two years left to live. He becomes filled with a sense of fearlessness and an unrelenting desire to secure his family's financial future at any cost as he enters the dangerous world of drugs and crime.",
                    4.2,
                    ShowType.SERIES,
                    "January 20, 2008",
                    R.drawable.tv_bb
                ),
                Show(11,
                    "Mr. Robot",
                    "A contemporary and culturally resonant drama about a young programmer, Elliot, who suffers from a debilitating anti-social disorder and decides that he can only connect to people by hacking them. He wields his skills as a weapon to protect the people that he cares about. Elliot will find himself in the intersection between a cybersecurity firm he works for and the underworld organizations that are recruiting him to bring down corporate America.",
                    3.45,
                    ShowType.SERIES,
                    "May 27, 2015",
                    R.drawable.tv_mr
                ),
                Show(12,
                    "Marvel's Daredevil",
                    "Lawyer-by-day Matt Murdock uses his heightened senses from being blinded as a young boy to fight crime at night on the streets of Hell’s Kitchen as Daredevil.",
                    3.9,
                    ShowType.SERIES,
                    "April 10, 2015",
                    R.drawable.tv_dd
                ),
                Show(13,
                    "Marvel's The Punisher",
                    "A former Marine out to punish the criminals responsible for his family's murder finds himself ensnared in a military conspiracy.",
                    4.0,
                    ShowType.SERIES,
                    "November 17, 2017",
                    R.drawable.tv_punisher
                ),
                Show(14,
                    "The Boys",
                    "A group of vigilantes known informally as “The Boys” set out to take down corrupt superheroes with no more than blue-collar grit and a willingness to fight dirty.",
                    4.25,
                    ShowType.SERIES,
                    "July 25, 2019",
                    R.drawable.tv_tb4
                ),
                Show(15,
                    "Arrow",
                    "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                    2.9,
                    ShowType.SERIES,
                    "October 10, 2012",
                    R.drawable.tv_arrow
                ),
                Show(16,
                    "The Flash",
                    "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                    3.35,
                    ShowType.SERIES,
                    "October 7, 2014",
                    R.drawable.tv_tf
                ),
                Show(17,
                    "Legion",
                    "David Haller, AKA Legion, is a troubled young man who may be more than human. Diagnosed as schizophrenic, David has been in and out of psychiatric hospitals for years. But after a strange encounter with a fellow patient, he’s confronted with the possibility that the voices he hears and the visions he sees might be real.",
                    3.8,
                    ShowType.SERIES,
                    "February 8, 2017",
                    R.drawable.tv_legion
                ),
                Show(18,
                    "Tokyo Ghoul",
                    "Ken Kaneki is a bookworm college student who meets a girl names Rize at a cafe he frequents. They're the same age and have the same interests, so they quickly become close. Little does Kaneki know that Rize is a ghoul - a kind of monster that lives by hunting and devouring human flesh. When part of her special organ - \"the red child\" - is transplanted into Kaneki, he becomes a ghoul himself, trapped in a warped world where humans are not the top of the food chain.",
                    3.6,
                    ShowType.SERIES,
                    "July 4, 2014",
                    R.drawable.tv_tg
                ),
                Show(19,
                    "Bleach",
                    "For as long as he can remember, Ichigo Kurosaki has been able to see ghosts. But when he meets Rukia, a Soul Reaper who battles evil spirits known as Hollows, he finds his life is changed forever. Now, with a newfound wealth of spiritual energy, Ichigo discovers his true calling: to protect the living and the dead from evil.",
                    3.9,
                    ShowType.SERIES,
                    "October 5, 2004",
                    R.drawable.tv_bleach
                )
            )
        }

        fun getDummyByID(showID: Int) : Show {
            return generateDummyShow().first { it.id == showID }
        }
    }
}