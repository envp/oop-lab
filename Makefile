# Clean binaries
SRC_PATH=./src
LABS=src/lab*
DOC_PATH=doc/

JC=javac
JI=java

#JFLAGS
V=-VERBOSE

#JAVADOC FLAGS
SET_DIR=-d

all:

._: clean

.__: clean_docs

clean:
	echo "Cleaning up binaries"
	rm -r -v $(LABS)/*.class

clean_doc:
	# Clean up old docs
	echo "[info] Cleaning up old docs"
	rm -r -v $(DOC_PATH)	

doc: clean_doc
	# new docs
	echo "[info] Generating updated documentation"
	javadoc $(SET_DIR) $(DOC_PATH) $(LABS)/*.java

generate:
	# Compile everything