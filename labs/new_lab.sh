#!/bin/bash
# Simple bash script for generating the file structure for a new lab.

# Create the directory structure:
mkdir "$1"
mkdir "$1/exemplars"
mkdir "$1/files"

# Create symbolic links to the `includes` and `graphics` folders:
ln -s ../includes "$1/includes"
ln -s ../graphics "$1/graphics"

# Create a copy of the template.tex file with the lab name:
cp template.tex "$1/lab_$1.tex"

