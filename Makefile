# Clean binaries
SRC_PATH=./src
LABS=src/lab*
DOC_PATH=doc/
JC=javac
JI=java

#JFLAGS
V=-VERBOSE
all:

._: clean

clean:
	echo "Cleaning up binaries"
	rm -r -v $(LABS)/*.class
	
doc:
	javadoc -d $(DOC_PATH) $(LABS)/*.java