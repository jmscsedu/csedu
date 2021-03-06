#!/bin/bash
# Simple bash script for generating the file structure for a new lab.
prefix="labs/$1"

# Create the directory structure:

mkdir $prefix
mkdir "$prefix/exemplars"
mkdir "$prefix/files"

# Create symbolic links to the `includes` and `graphics` folders:

# Following lines are required for MacOS ('brew install coreutils' for grealpath):

# relative=$(grealpath --relative-to="$prefix" templates/)
# ln -s "$relative/includes" "$prefix/includes"
# ln -s "$relative/graphics" "$prefix/graphics"

# Following lines are used for linux:
ln -rs templates/includes "$prefix/includes"
ln -rs templates/graphics "$prefix/graphics"

# Create a copy of the template.tex file with the lab name:
cp templates/lab_template.tex "$prefix/lab_$1.tex"
