INSTRUCTOR COMMENTS
===================

This is a nice little program that does an excellent job of 
conducting a game of craps. It's got a great user experience
when the user rolls the dice: "rolling...rolling...rolling"!
That's such a nice touch. You have good indications of what's
happening at each step: "8 is now your point! Try to roll
again to win!" Really good work on that.

It would have been nice to see the "Y/N" inputs managed with
default values in mind. There was a section in the assignment
that asked you to implement default yes/no values, with the
default reply indicated as a capital letter in the prompt:

    Would you like to play again (Y/n)?

Hitting the [Enter] key for that response would indicate a
Yes reply, and the program could proceed accordingly. There's
information on how to do that in the handout. Definitely
consider incorporating that strategy in future assignments, 
where appropriate.

Finally, I'll just mention that your structure of the game
is a little longer than that written by some students, but I
like it better. You clearly distinguish the two phases of 
the rolling in those two separate sections, which makes your
code (to my mind) easier to follow and understand. The 
shorter, more complex code submitted by others may be marginally
more efficient in some way, but when it comes to writing code
that is being read by people, I far prefer your design choice.
Well done!

Oh, and one more thing. You should include all those .class and
.ctxt files in your `.gitignore` file. It looks like you mistakenly
created an `ignore` file with the wrong name. That's pretty easy
to fix at some point. Not critical now, just thought I'd mention
it. Come to think of it, maybe I'll just fix it for you and 
include it in my pull request! ;)

SCORE: 48/50
