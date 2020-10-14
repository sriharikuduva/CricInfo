# CricInfo

We will focus on the following set of requirements while designing Cricinfo:

1) The system should keep track of all cricket-playing teams and their matches.

2) The system should show live ball-by-ball commentary of cricket matches.

3) All international cricket rules should be followed.

4) Any team playing a tournament will announce a squad (a set of players) for the tournament.

5) For each match, both teams will announce their playing-eleven from the tournament squad.

6) The system should be able to record stats about players, matches, and tournaments.

7) The system should be able to answer global stats queries like, “Who is the highest wicket taker of all time?”, “Who has scored maximum numbers of 100s in test matches?”, etc.

8) The system should keep track of all ODI, Test and T20 matches.

We have two main Actors in our system:

Admin: An Admin will be able to add/modify players, teams, tournaments, and matches, and will also record ball-by-ball details of each match.

Commentator: Commentators will be responsible for adding ball-by-ball commentary for matches.

Here are the top use cases of our system:

Add/modify teams and players: An Admin will add players to teams and keeps up-to-date information about them in the system.

Add tournaments and matches: Admins will add tournaments and matches in the system.

Add ball: Admins will record ball-by-ball details of a match.

Add stadium, umpire, and referee: The system will keep track of stadiums as well as of the umpires and referees managing the matches.

Add/update stats: Admins will add stats about matches and tournaments. The system will generate certain stats.

Add commentary: Add ball-by-ball commentary of matches.
