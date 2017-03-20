# shuffleme

Prerequisites: Java Installed preferably 8. Gradle installed preferable >3.
Build process:

1. go to the source directory, run: gradle build. this will build the jar file. You will need to put the gradle in the path environment variable if not there.
2. goto sourcedir/build/libs : you can run the jar by using the follwoing command:
    a. Algorithm = hand-shuffle: java -jar -Dalgo=hand-shuffle shuffler-1.0.jar
    b. Algorithm = random: java -jar shuffler-1.0.jar
    
Update: Please refer to v2.0 branches for modification to existing API:
    1. Cards to be represented by a String - return a list of String
    2. Update to the hand -shuffle algorithm.
