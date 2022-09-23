
# Technical problems that you encountered during installation and use of MongoDB and how you resolved

Due to just having installed Windows 11 on a new laptop and being inexperienced with it, I had some problems with setting the PATH settings correctly. I solved the problem temporarily by just running mongosh from the terminal within the folder. Otherwise there were no problems with the installation and settings.

## Screenshots for:

The correct validation of the installation package (https://docs.mongodb.com/manual/tutorial/verify-mongodb-packages/):

        
Relevant results obtained during Experiment 1 (it is not necessary to put a single screenshot on each substep, but at least one significant from each CRUD operation):






        
Experiment 2 example working and the additional Map-reduce operation (and its result) developed by each of you:

        
        
        
## Reason about why your implemented Map-reduce operation in Experiment 2 is useful and interpret the collection obtained.

The operation that I implemented adds a new database field in the map reduce function for the first letter of each id. This can be useful for sorting different elements into groups by the first letter, especially if the list of words would be really large. 

## Any pending issues with this assignment which you did not manage to solve

The PATH settings in Windows was not a priority and has not been fully resolved yet.
