# dat250-jpa-examples

This repository contains two maven projects which should be used as a starting point for experiment 1 and 2 of assignment 2.


# Experience with the project


## Technical problems that you encountered during installation and use of Java Persistence Architecture (JPA) and how you resolved them

The installation with maven and IntelliJ went quite smooth with no big issues. The use of the JPA was at times challenging with figuring out the correct specifications with the @-notations above each class, and making it correspond correctly to the prospected database structure. It took some trial and error to find this, but it worked out in the end by using web resources, supplied pdf documents and discussing with fellow students.

## A link to your code for experiment 2 above. Make sure the included test case passes!

Recursion, or: https://github.com/trenod/dat250-jpa-example (the test passes).

## An explanation of how you inspected the database tables and what tables were created. For the latter, you may provide screenshots.

I used the database link to the far right in IntelliJ, selected visualization and visualize diagram for the database. The screenshot is supplied in the repo, or, directly at this link: https://github.com/trenod/dat250-jpa-example/blob/master/Skjermbilde%202022-09-14%20110824.png

## Any pending issues with this assignment that you did not manage to solve

There are no pending, unresolved issues with this assignment that I didn't solve.

UPDATE: There WAS apparently an unrecognized error which was not discovered in my own testing, but found by the grader after my first submission. The test passed on all tries on my computer, but apparently if I deleted the database, the test failed on the first try and passed on all subsequent attempts. It seems that on the first try it failed because the creditcards weren't added correctly to the bank object. Then with subsequent tests it passed because the creditcards were then implicitly added to the database through other objects. At least that's my hypothesis. 

Anyway, correcting the setOwnedCards method in Bank, and adding them correctly in Main fixed this as far as I can tell. The test now runs on the first try also after deleting the database, which it didn't before.

