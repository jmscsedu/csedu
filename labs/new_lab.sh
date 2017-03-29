#!/bin/bash
# Simple bash script for generating the file structure for a new lab.

# Create the directory:
mkdir "$1"

# Create symbolic links to the `includes` and `graphics` folders:
ln -s ../includes "$1/includes"
ln -s ../graphics "$1/graphics"

# Create a copy of the template.tex file with the lab name:
cp template.tex "$1/LAB_$1.tex"

