cd Temp_Java_Folder
rm error.txt
rm spotbugs.xml 
export SPOTBUGS_HOME='/Users/lsiddiqsunny/Documents/Notre_Dame/Research/spotbugs-4.7.3'
javac temp.java  2> error.txt
class=$(find . -name "*.class" -type f | sed 's/.\///g')

java -jar $SPOTBUGS_HOME/lib/spotbugs.jar -textui -xml:withMessages $class>spotbugs.xml 
rm $class
cd ..