This simple java program draws your images using ASCII characters.

After you compile it with java run the .class file and enter the file path of an image file.
This program will give you a text file it looks like your photo. In java file you can change 
static newH and newW variables to increase or decrease the resolution.

Programmed by Oğuzhan Özavcı.

Here is an Example
<p style='font-size:50%; font-family:monospace;line-height:120%; background:white; color:black; text-align:left'>
,..........,.,,,,,...,,.,,,,,,;++,;+@00@@WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW@W0WWWWW@Wo+++,;+;,,;,,;;,;;;;,;;;;;+;;++;++<br>
.........,...,,..,,..,,,,..,,o,++W0Wo@WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW@oWWWWWWWW0+o;,,,,,+,;;,,;;;;,,,,;;;;+;++++;<br>
......................,;;+++WW@WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW@WW00+,;;;+;,;,;;;;;,,,,;;;;;;;+;;;;+<br>
....................o0+;+WW@@ooo@WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWoo;;;,;;+,,,,,,,,,;;;;;;;;;;;;;;;<br>
..................,o+,+o@WW0+WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWo,o0+;0+;+;,;,,,,,;;;;;;;;;;;;;;<br>
.................,@@@o0ooW@@@W@WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW@W+0oWW00oo;;,,,;,,,;;;;;,;;;;;;;<br>
...............;+;oWW@0+WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW@ooWW@o+o+,;;,,,,,;,;,,;;;;;;+;;<br>
.............,+,,+,0@oWWWW@WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW@W@@@00@+;,+;;;,,,,;,;;;;,;;;;;;<br>
.............,,++;+0WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW@+o;0;+;;;,;,;;;,;;;;;;;;;;<br>
............;++W,;;oWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW@0+++oo;;;,,,,,,;;;;;;;;;;;;<br>
...........,;+,o0+;o0WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW0@o;++;,,,,,,,,;;;;;;;;;;;<br>
..........,,.,;;0@@W@WWWWWWWWWWWWWWWWWWWWWWWWWW@WWWWWW@WWWWWWWWWWWWWW@WWWW@WWWWWWWWWWWWWWWWWWW@o++o;;+;,,,,,,;,;,;;;;+;;<br>
............,+;0@+@W@WWWWWWWWWWWWWWWWWWWWWWWWW@0@oWW0o0WW@0@@0WWWWWW@WWWWW@WWWWWWWWWWWWWWWWWWWWo+o0;+++,,,,;,;;;;;;;;;;;<br>
..........;,o+;o+0WWW@WWWWWWWWWWWWWWWWWWWWWWo+00W+o@W0@o+o0o+@W@WWWWWWWWWW@WWWWWWWWWWWWWWWWWWW@W@0@0oo+;,,,,,;;;;,;;;;;;<br>
.........,,..;;+0o@W@@WWWWWWWWWWWWWWWWWWWWo+;;,..,0o000+;,;,..,o0@WW@@@@@W@WWW@WWWWWWWWWWWWWWWWWW@@@@o0;+,;,;;;;;;;;;;,;<br>
...........,...,@0W@W@@W@WW@WWWWWWWWWWWWW0o,,.....,;,...........;o0@@@@@@W@WWWWWWWWWWWWWWWWWWWW00oW0@@oo;+,;;;,;;,;,,;,,<br>
..........,.,0@oW@@@@@@WWWWW@WWWWWWWWWWW@+;......,,,.........;+Woo,;@W@WWWWWW@WWWWWWWWWWWWWWWWWW@0oWW@++;,;;;;;;,;,;;,,;<br>
..........,+@@0W@@@@WWWW@@@@@WW@@WWWWWWo+W@@@WWWWWWWo;;,,,;oWWWWWWWWWWWWWWWWWWW@@@WWWWWWW@WWWWWW@@WW@W@;++;;;,,;,,,;,,,,<br>
..........,o@@@@@@@@@@@W@WWW@WWWWWWWWW@+o;......+@WWW@,.,0WWWWW+,.,+@WWWWWWWWWWWWWWWWWWWWWWWWWWWW@W0@0o+,;;;,,,,,,,,,;;,<br>
.........;;0@W@@@@W@@@@WWWWWWWWWWWWWWW0;,...;+0WWW@0+....,0W@;.,;;,,;0WWWWWWWWWWWWWWWWWWWWWWWWWW@@@0W@++,;,,;,,,,,,,,,,,<br>
........,,+++0@@@WW@WW@WWWWWWWWWWWWWWW0o+@,0WWWWWWo.......,W,;oW@WWW@WWWWWWWWWWWWWWWWWWWWWWWWWWWW@@@@0+;;;;,,,,,;,,;;,,;<br>
........,+W@o0WWW@WWWWW@WW@@W@@WWWWWW@+@WWWWWWW@o+.........,+,,.0WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW@@@o;,,,,,,,,,,,,,,,;;<br>
........+WW@@o@WWW@@@@@@WWWW@W@@@WWWW0,,,;o@Wo,............+@+...+@WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW0W++,,,,,,,,;,,,;,;;;<br>
........o,+.;o@@@@@@W@@@W@@@@@@W@@WWW+,...................,;+W,....,,+0@WWWWWWWWWWWWWWWWW@@WWWWWW@Woo+,,,,,,,,,;;;;;,,;;<br>
........,;;;00@@@@o@@@@W@WW@@@@@W@@W@,...............,;;oWWW,,o......,,+@@@@@WWWWWWWWWWWWWWWWWWWWWW0o+,,,,,,,,;;;;;;,;;;<br>
..........oo+@@@@@@@W@W@@@WW@W@W@W@@0;,...........+WWWWWWWWWWWW,....,;+0@WWWWWWWWWWWWW@WW@WWWWWW@WW@+;,,,,,,;;;;;;;;;,,;<br>
..........;o@o@@@@@@@@W@WWW@W@@@@W@@@+;,..........,WW0o00WWWWWWW,.,,+o@@@@W@WW@WWW@WWW@@WW@WWWWW@W@@+,,,;,;,;;;+;;;;;,;;<br>
...........,.,W+W0@@@W@WW@@@WW@@@@@@W@o+;;,...........,;.,+o0@WWo,;o@@W@W@W@@@@W@WWW@@WWWWWWWWWWWW0Wo+;;+;;;;;+;;;+;,;;;<br>
.............,,@oo@@W@@@@@@@@@@@@W@@@@@0o+;,......+;;......,+@W@++;0WW@WW@WWW@@@@@WW@@W@W@WWWWWWW@0W+++;;;;;;;;;+;+;;;;;<br>
...............,+@W@@WW@@WW@@@@@W@@WW@@@0+,,....W0.,+oo@o@WW@WWWWW@WWW@@@@W@@W@W@@@WWWW@WW@WWW@@o@@0+o;;+;;+;+++++;;;;+;<br>
................,,;@+@@@W@@@@@@@@@W@@@0o0;,,,.;0+oWWWWWWWWWWWWWWWWWWW@WWW@WWWWWW@WWWWW@WWWWWWW@o0oo0o+;++;+;++++++++;+++<br>
.................,.;+0@@@@@W@@@W@@@W@@oo+;,;;;@WWW+;.,..,;;;+0WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW0oo+;++++++;oo++++++++++;++<br>
.....................+o0@@@@@@@@@WWWWW@+++o++@W;....o+,,;;;oWWW@W@WWWWWWWWWWWWWW@W@WW@WW@0+0@0o+++++++o++++++++++++;++++<br>
...................,,,;@o@@@@@@WW@@WWW@o++0o;o@,,;++@WWWWWWWWWWWWWWWW@@W@@@@@W@WWW@WW@@@W00@0oo+++++++++++++++++o+++o+++<br>
..................;,;+o+o@@@@@@@@@@W@W@0o0oo0@@@@WWWWWWWWWWWWWW@WWWWWWW@@@@@@W@@@@@W@@@@00ooooo+++ooooo+oooo+o++++++++++<br>
......................+o@@@@@0@@@@@@@W@W@0000@@@@@@@@0++00WWWWWWW@WW@@@@@@@@@@@@@@@@0+++oooooooooooooooooo+o+++++o++++++<br>
......................;.;+,,,0o@@@@@@@@WWW@@00o;,.........,o0@@@@@WW@@@@@@@@@@@@@@@0ooooooooooooooooooooooooooo++oo+++++<br>
.............................;,.,W@@@@@W@W@WW@0+,,,;;,;+0oo@@@@@@@@@@@@@@@@@@@0@@00oo0oooooooooooooooooooooooooo+o+o+o+o<br>
..............................,++0@@@@@@@W@WW@@@@oo00@WW@@@WWWW@@@@W@@@@@@@@ooooooo0oo00o0oo00000o0o0oooooooooooooooooo+<br>
..............................@+,o@@@@@o++0@@@@W@@@@@@@@@@@@@@@@@@@@@@0@00000o00000000000000o00oo0oooooo0ooooooooooooooo<br>
.............................+@0+@@@@@0+,;;+o@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@00000000000000000000000000000oooooooooooooooo<br>
........................,@@.,,0.@@@@@@+,,..,,;o00@@@@@@@@@@@@@0@@@@@@@@@@@@@+.o@@00000@000000000000000000o000ooooooo0o0o<br>
.......................+0@.+@o+@@@@@o@+,....,,;+oo00@@@@@0@0@@@@00@0000@@00@@@0,o@@00@00@000000000000000000o0000o0o0000o<br>
.....................,@oo0oo+.;,,;+0@0;,....,,ooo0000@@@@000@000000@@000@@@@0@@@;.,+@@@@0000000000000@000000000o0o000000<br>
....................+@@WW@@+0......0@o+,......,oo00@0000@@000@00@0000000@@@0+o000+,...@@0@000000000000000000000000000@00<br>
....................0@@@@@@@;,.....+@+,,,....,,+oo0@0@000000000000000000000000..,+o.....o000000000000@00000@0o000000000o<br>
....................@@@@@@@@@......0;o+,.,,,,,,,+o00@0000000000000000000000o+@....++.....o000000000000000000@o0000000000<br>
...................,o@@00o,.o0.....@0,+,.,;;;,,+o0000000000000000000000000@0+;....+......;00000000000000000000000000000o<br>
....................0+....,@0@@0...0+0;o....,,.,;o000000000000000000000000@0o+...........00000000000000000000000000000oo<br>
.........................@@.0o;0,0.o,..0++o..,...;+000oooo0000000000000000000,..........,..+00000000000000000o000o00oooo<br> 
</p>
